package com.erbil.mps;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.slf4j.LoggerFactory;

import com.erbil.mps.config.GetConfigForGeneral;
import com.erbil.mps.constant.MPSConstants;


public class Billinfo {

	private final static org.slf4j.Logger log_ = LoggerFactory.getLogger(InfoBus.class);
	private static GetConfigForGeneral configForGeneral = GetConfigForGeneral.getInstance();

	String sourceUrl = "";

	public static final String GUNCEL_QUERY_STATUS_IN_BILL_PERIOD = "-4";
	public static final String GUNCEL_QUERY_STATUS_ERROR_GENERAL = "-3";
	public static final String GUNCEL_QUERY_STATUS_ERROR_NOT_APPROPRIATE_TARIFF = "-2";
	public static final String GUNCEL_QUERY_STATUS_ERROR_NO_RECORD = "-1";
	public static final String GUNCEL_QUERY_STATUS_SUCCESS = "1";

	public static String getGuncelInfo(String msisdn) throws Exception {

		String guncelQueryResult ="-";
		try {
			NumberFormat formatter = new DecimalFormat("000000");
			formatter = new DecimalFormat("#.######");
			
			String rXML = InfoBus.getCurrentInvoiceBillAmount(msisdn);
			// String rXML
			// ="<?xml version='1.0' encoding='UTF-8'?><IWIS_OUT_DATA_UNIT><IWIS_OUT_HEADER version='1.0'><IWIS_RETURN_CODE>0</IWIS_RETURN_CODE><IWIS_DETAIL_CODE>0</IWIS_DETAIL_CODE><TID>334ED5674F38385E6DB4B605</TID></IWIS_OUT_HEADER><IWIS_SERVICE_RETURN><AMOUNT>2642</AMOUNT></IWIS_SERVICE_RETURN></IWIS_OUT_DATA_UNIT>";
			String iwisReturnCode = InfoBus.parseTag(rXML, InfoBus.IWIS_IWIS_RETURN_CODE_TAG);
			if (iwisReturnCode != null && iwisReturnCode.equals(InfoBus.INFOBUS_SUCCESS_RET_CODE)) {

				String resultValue = InfoBus.parseTag(rXML, "RESULT");
				String resultDescValue = InfoBus.parseTag(rXML, "RESULT_DESC");
				String smsTextValue = InfoBus.parseTag(rXML, "SMS_TEXT");

				if (smsTextValue == null || "".equals(smsTextValue)) {

					int result = Integer.parseInt(resultValue);
					switch (result) {
					case -1:
						guncelQueryResult=GUNCEL_QUERY_STATUS_ERROR_NO_RECORD;
						break;
					case -2:
						guncelQueryResult=GUNCEL_QUERY_STATUS_ERROR_NOT_APPROPRIATE_TARIFF;
						break;
					case -3:
						guncelQueryResult=GUNCEL_QUERY_STATUS_ERROR_GENERAL;
						break;
					default:
						double i = (double) result / 100;
						String amount = formatter.format(i);
						guncelQueryResult="tutar="+amount;
//						guncelQueryResult.setQueryStatus(GUNCEL_QUERY_STATUS_SUCCESS);
						break;
					}

				} else {
//					guncelQueryResult.setQueryStatus(GUNCEL_QUERY_STATUS_SUCCESS);
//					guncelQueryResult.setBillAmount(smsTextValue);
					log_.debug("smsTextValue is null!!!!!!!!!!!!!!1");

				}

			}
		} catch (Exception e) {
			log_.error(e.getMessage(), e);
		}
		return guncelQueryResult;
	}
	
	private static String getCostatus(String msisdn) throws Exception {
		if (msisdn==null) return null;
		String getContractDbResult = InfoBus.postpaidGetContractDb(msisdn);
		String retcode =  InfoBus.parseTag(getContractDbResult,InfoBus.IWIS_IWIS_RETURN_CODE_TAG);
		
		if (retcode!=null && retcode.equals(InfoBus.INFOBUS_SUCCESS_RET_CODE)) {  
		    String coStatus = InfoBus.parseTag(getContractDbResult,"COSTATUS");
		    return coStatus;
		}
		return null;
	}
	
	public static String getPaymentPeriod(){
	    String paymentPeriod="";
	    Calendar cal1 = Calendar.getInstance();
	    cal1.add(Calendar.MONTH,-5);
	    String month = String.valueOf(cal1.get(Calendar.MONTH));
	    if (month!=null && !month.equals("") && month.length()==1){
	        month = "0" + month;
	    }
	    paymentPeriod = cal1.get(Calendar.YEAR) + month ;
	    //paymentPeriod ="200101";
	    return paymentPeriod;
	}
	
	public static String getFormattedPeriod(String period){
	    String formattedPeriod = period;
	    try{
		    Locale locale = new Locale("Tr");
		    String year = period.substring(0,4);
		    String month = period.substring(4); 
			SimpleDateFormat df= new SimpleDateFormat("MMMM",locale);
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.MONTH,Integer.parseInt(month));
			cal.add(Calendar.MONTH,-1);
			String monthName = df.format(cal.getTime());
			formattedPeriod = monthName + " " + year; 
	    }catch (Exception e) {
	        e.printStackTrace();
        }
	    return formattedPeriod;
	}
	
	private static String formatDate(String d) {
		// YYYYMMDD -> DD.MM.YYYY
		if (d==null) return "";
		if (d.length()==8) {
			return d.substring(6, 8) + "." + d.substring(4, 6) + "." + d.substring(0, 4);
		} else {
			return d;
		}
	}
	
	public static List<PaymentInfoVO> getInvoices(String msisdn, String customerGroup) throws Exception{
        
		ArrayList<PaymentInfoVO> paymentArray = new ArrayList<PaymentInfoVO>();
	    String coStatus =  getCostatus("90"+msisdn);

	    String paymentInfoTransactionResult ="";
	    boolean isDeactive = false;
	    if ("d".equals(coStatus)) { // hat deaktifse baska servis kullanmak gerekiyor.
	    	paymentInfoTransactionResult = InfoBus.bppsUnpaidBillQuery(msisdn, MPSConstants.PAYMENT_INFO_UNPAID_STATUS, MPSConstants.PAYMENT_INFO_NUMBER_OF_RECORDS, getPaymentPeriod());
	    	isDeactive = true;
	    } else {
	    	paymentInfoTransactionResult = InfoBus.paymentInfoTransactionQuery(msisdn, MPSConstants.PAYMENT_INFO_UNPAID_STATUS, MPSConstants.PAYMENT_INFO_NUMBER_OF_RECORDS, getPaymentPeriod(), customerGroup);
	    }
	    
	    String iwisReturnCode =  InfoBus.parseTag(paymentInfoTransactionResult,InfoBus.IWIS_IWIS_RETURN_CODE_TAG);

		if (iwisReturnCode!=null && iwisReturnCode.equals(InfoBus.INFOBUS_SUCCESS_RET_CODE)) {
		    PaymentInfoParser paymentParser = PaymentInfoParser.getInstance();  
		    if (isDeactive) {
		    	paymentArray = (ArrayList) paymentParser.getPaymentsForDeactiveLines(paymentInfoTransactionResult);
		    } else {
		    	paymentArray = (ArrayList) paymentParser.getPayments(paymentInfoTransactionResult);
		    }
		    return paymentArray;
		    
		}else if(iwisReturnCode!=null &&  iwisReturnCode.equals(InfoBus.INFOBUS_FAIL_RET_CODE)){
			log_.debug("iwisReturnCode="+iwisReturnCode);
		}else{
		    log_.debug("iwisReturnCode="+iwisReturnCode);
		}
		
		return paymentArray;
			
	}


}
// Billinfo
