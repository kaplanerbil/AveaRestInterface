package com.erbil.mps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.slf4j.LoggerFactory;

import com.erbil.mps.constant.BrandEnum;
import com.erbil.mps.constant.CgroupEnum;
import com.erbil.mps.constant.CtypeEnum;
import com.erbil.mps.constant.OnlineTransactionsConstants;
import com.erbil.mps.constant.StatusEnum;
import com.erbil.mps.model.MpsError;
import com.erbil.mps.model.SubscriberVO;


public class FormUtils {

	/*
	 * this is for getting an instance of category which helps us log messages errors
	 */
	private final static org.slf4j.Logger log_ = LoggerFactory.getLogger(FormUtils.class);

	public static final String ARIA_AREA = "055";
	public static final String AYCELL_AREA = "050";
	public static final String TURKCELL_AREA = "053";
	public static final String TELSIM_AREA = "054";
	public static final int TELEPHONE_ADDRESS_SIZE = 10;
	public static final String INTERNATIONAL_PREFIX_1 = "+";
	public static final String TURKEY_COUNTRY_CODE = "90";
	public static final String TEST_AREA_CODE = "075";

	public static String checkMsisdnFormat(String msisdn) {
		return checkMsisdnFormat(msisdn, false);
	}

	public static String checkMsisdnFormat(String msisdn, boolean checkOperatorPrefix) {
		log_.debug("*** Checking if it is correct MSISDN number ******");
		// return msisdn;
		if (msisdn == null || msisdn.length() < 10 || msisdn.length() > 13) {
			return null;
		}
		StringBuffer sb = new StringBuffer(msisdn);
		String internationalPrefix1 = msisdn.substring(0, 1);
		log_.debug("*** internationalPrefix1 = " + internationalPrefix1);
		if (internationalPrefix1.equals(INTERNATIONAL_PREFIX_1)) // +
		{
			/*
			 * * Remove the '+'.
			 */
			sb = sb.deleteCharAt(0);
		}
		if (msisdn.length() == TELEPHONE_ADDRESS_SIZE) {
			/*
			 * * This is a swiss MSISDN.
			 * * Delete the leading '0' and add '90' in front.
			 */
			sb = sb.replace(0, 0, TURKEY_COUNTRY_CODE);
		} else {
			if (msisdn.length() == TELEPHONE_ADDRESS_SIZE + 1)
				sb = sb.replace(0, 0, "9");
		}
		String operatorAreaCode = sb.toString().substring(1, 4);
		log_.debug("*** operatorAreaCode = " + operatorAreaCode);
		if (!operatorAreaCode.equals(TURKCELL_AREA) && !operatorAreaCode.equals(TELSIM_AREA) && !operatorAreaCode.equals(ARIA_AREA)
				&& !operatorAreaCode.equals(AYCELL_AREA) && !operatorAreaCode.equals(TEST_AREA_CODE)) {
			return null;
		}
		if (checkOperatorPrefix) {
			if (!InfoBus.isMsisdnAvea(sb.toString()))
				return null;
		}
		if (!checkDigits(sb.toString()))
			return null;
		return sb.toString();
	}

	public static boolean checkDigits(String msg) {
		boolean retVal = true;
		for (int i = 0; i < msg.length(); i++) {
			if (Character.isDigit(msg.charAt(i)) == false) {
				retVal = false;
				break;
			} // if
		} // for
		return retVal;
	} // checkDigits

	public static boolean isMsisdnAvea(String msisdn) {
		return InfoBus.isMsisdnAvea(msisdn);
	}

	public static int isMsisdnAveaCUDB(String msisdn) {
		return InfoBus.isMsisdnAveaCUDB(msisdn);
	}

	public static int isMsisdnAveaMNP(String msisdn) {
		return InfoBus.isMsisdnAveaMNP(msisdn);
	}

	public static Object returnSubscriber(String msisdn) {
		if (checkMsisdnFormat(msisdn) == null) {
			return new MpsError(1, "Geçersiz msisdn!");
		}
		if (!isMsisdnAvea(msisdn)) {
			return new MpsError(2, "Abone Bulunamadi");
		}
		String combinedDetailedResult = null;
		try {
			combinedDetailedResult = InfoBus.combinedDetailedQuery(msisdn, true, OnlineTransactionsConstants.COMBINED_DETAIL_QUERY_WITH_DETAIL);
		} catch (Exception e) {
			log_.error(e.getMessage(), e);
			return new MpsError(3, "Hata Olustu!" + e.getMessage());
		}
		return InfoBus.returnSubscriber(msisdn, combinedDetailedResult);
	}

	public static <T> Iterable<T> emptyIfNull(Iterable<T> iterable) {
	    return iterable == null ? Collections.<T>emptyList() : iterable;
	}
	
	public static String returnAveaForUnsubscribedBrand(String brandcode) {
		return OnlineTransactionsConstants.POCELL_BRANDCODE.equals(brandcode) || OnlineTransactionsConstants.KARTALCELL_BRANDCODE.equals(brandcode) ? OnlineTransactionsConstants.AVEA_BRANDCODE
				: brandcode;
	}

	public static String parseTag(String resultXML, String tag) {
		String transactionId = null;
		int pos1 = -1;
		int pos2 = -2;
		if (resultXML != null) {
			pos1 = resultXML.indexOf("<" + tag + ">");
			pos2 = resultXML.indexOf("</" + tag + ">");
			if (pos1 != -1 && pos2 != -1) {
				transactionId = resultXML.substring(pos1 + tag.length() + 2, pos2).trim();
			}
		}
		return transactionId;
	}

	public static String generateHtmlTableRow(int index, SubscriberVO subscriberVO) {
		String htmlRow =  "<tr><td  nowrap=\"nowrap\">"+ index 
				+ "</td><td  nowrap=\"nowrap\">"+ subscriberVO.getMsisdn() 
				+ "</td><td  nowrap=\"nowrap\">" + subscriberVO.getPassword() 
				+ "</td><td  nowrap=\"nowrap\">" + subscriberVO.getLog().getOperationDate() 
				+ "</td><td  nowrap=\"nowrap\">" + StatusEnum.findByAbbr(subscriberVO.getLineStatus()).value()
				+ "</td><td  nowrap=\"nowrap\">" + CtypeEnum.findByAbbr(subscriberVO.getCustomerType()).value()
				+ "</td><td  nowrap=\"nowrap\">" + CgroupEnum.findByAbbr(subscriberVO.getCustomerGroup()).value()
				+ "</td><td  nowrap=\"nowrap\">" + subscriberVO.getBrandName()
				+ "</td><td  nowrap=\"nowrap\">";
		
		if (BrandEnum.AVEA.code().toString().equals(subscriberVO.getBrandCode())
				&& CgroupEnum.MASS.code().toString().equals(subscriberVO.getCustomerGroup())
				&& (subscriberVO.getTariffCode().matches("844|948|949|1571|1573") || "PL".equals(subscriberVO.getSegment())) ) {
			htmlRow += "true";
		}else{
			htmlRow += "false";
		}
		htmlRow += "</td><td  nowrap=\"nowrap\">" + subscriberVO.getCoRep();
		htmlRow += "</td><td  nowrap=\"nowrap\">" + subscriberVO.getBillAmount();
		htmlRow += "</td><td  nowrap=\"nowrap\">";
		
		for (PaymentInfoVO payment : emptyIfNull(subscriberVO.getInvoices())) {
			htmlRow += " Bill id=" + payment.getBillNo() + " - Bill amount=" + payment.getBillAmount();
		}
		
		htmlRow += "</td> </tr> ";
		
//		htmlRow += " <div id=\"divPopup\" onclick=\"createPopup();\">Create popup</div>";
		
		return htmlRow;
	}
	
	public static boolean isFaturaStop(String tariffId) {
		ArrayList faturaStopList = new ArrayList(
				Arrays.asList(OnlineTransactionsConstants.FATURA_STOP_TARIFF_LIST));
		if (faturaStopList.contains(tariffId)) {
			return true;
		}
		return false;
	}
	
	public static String returnSubscriberBillingPeriod(String combinedDetailResult,String cType){
	    String billingPeriod="";
	    
	    try {
	        if (cType != null && !cType.equals("0")) {
		        if (cType.equals(CtypeEnum.POSTPAID)){
			        billingPeriod= InfoBus.parseTag(combinedDetailResult,InfoBus.INFOBUS_POSTPAID_BILLING_PERIOD_TAG);
					if (billingPeriod==null) billingPeriod="";
					if (billingPeriod!=null && !billingPeriod.equals(""))
					    billingPeriod =  FormUtils.returnBillingPeriodDay(billingPeriod);
				    if (billingPeriod==null) billingPeriod="";
					log_.debug("billingPeriod >>>> " + billingPeriod);
		        }else{
		            billingPeriod=InfoBus.INFOBUS_BILLING_PERIOD_PREPAID;
			    }   
	        }else{
	            billingPeriod=InfoBus.INFOBUS_BILLING_PERIOD_UNKNOWN;
	        }    
	    } catch (Exception e) {
            log_.error("returnSubscriber Query Failed " + e.getMessage());
	    }    
	    return billingPeriod;
	}
	
	public static String returnBillingPeriodDay(String billingPeriod){
	    String billingPeriodDay="";
	    
	    try {
	    	if (billingPeriod!=null && !billingPeriod.equals("")){
	    	    if (billingPeriod.equals(InfoBus.INFOBUS_BILLING_PERIOD_1))
	    	        billingPeriodDay = InfoBus.INFOBUS_BILLING_PERIOD_1_DAY;
	    	    else if(billingPeriod.equals(InfoBus.INFOBUS_BILLING_PERIOD_2))
	    	        billingPeriodDay = InfoBus.INFOBUS_BILLING_PERIOD_2_DAY;
	    	    else if(billingPeriod.equals(InfoBus.INFOBUS_BILLING_PERIOD_3))   
	    	        billingPeriodDay = InfoBus.INFOBUS_BILLING_PERIOD_3_DAY;
	    	    else if(billingPeriod.equals(InfoBus.INFOBUS_BILLING_PERIOD_4))
	    	    	billingPeriodDay = InfoBus.INFOBUS_BILLING_PERIOD_4_DAY;
	    	}
			log_.debug("billingPeriodDay >>>> " + billingPeriodDay);
	    } catch (Exception e) {
            log_.error("returnBillingPeriodDay Failed " + e.getMessage());
	    }    
	    if (billingPeriodDay==null) billingPeriodDay="";
	    return billingPeriodDay;
	}

} // class