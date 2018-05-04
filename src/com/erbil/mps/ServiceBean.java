package com.erbil.mps;

import java.util.ArrayList;
import java.util.List;

import com.erbil.mps.constant.CgroupEnum;
import com.erbil.mps.constant.CtypeEnum;
import com.erbil.mps.dao.ServiceDAO;
import com.erbil.mps.model.MpsError;
import com.erbil.mps.model.SubscriberVO;

public class ServiceBean {

	static List<SubscriberVO> allLogs = new ArrayList<SubscriberVO>();
	static List<String> records = new ArrayList<>();

	
public static void main(String[] args) {
	int x = 0;
	giveMeATen (x);
	System.out.println (x);

}
	static void giveMeATen (int y)
	{
	    y = 10;
	}
	public static List<String> allLogsMock() {
		List<String> logs = new ArrayList<String>();
		logs.add("2017-03-01 16:46:36  05012631549  123456");
		logs.add("2017-03-01 16:17:34  05012631548  123456");
		logs.add("2017-03-01 16:46:36  05012631549  123456");
		logs.add("2017-03-01 16:17:34  05012631548  123456");
		logs.add("2017-03-01 16:46:36  05012631549  123456");
		logs.add("2017-03-01 16:17:34  05012631548  123456");
		return logs;
	}

	public static Object getLogs(int fromIndex, int toIndex) {
		if (toIndex - fromIndex > 50) {
			return new MpsError(4, "search range is too large! max range=" + allLogs.size() + 50);
		}
		if (allLogs.size() < fromIndex + toIndex) {
			fillData(allLogs.size(), toIndex);
			
		}
		return records.subList(fromIndex, toIndex);
	}

	public static void fillData(int fromIndex, int toIndex) {
		List<SubscriberVO> list = ServiceDAO.getLogs(fromIndex, toIndex);
		List<String> preRecordsList = new ArrayList<String>();
		for (SubscriberVO subscriberVO : list) {
			Object o = FormUtils.returnSubscriber(subscriberVO.getMsisdn());
			
			if (o instanceof MpsError) {
				preRecordsList.add("<tr><td>" + fromIndex++  
						+ "</td><td>" + subscriberVO.getMsisdn() 
						+ "</td><td colspan=\"3\">" + ((MpsError) o).getErrorString() 
						+ "</td> </tr> ");
			} else {
				
				SubscriberVO subscriberVOInfoBus = (SubscriberVO) o;
//				if(!"a".equalsIgnoreCase(subscriberVOInfoBus.getLineStatus())){   // don't show if subscriber is not active
//					continue;
//				}
				// kapatildi cunku index yapisini bozuyor!
				
				if (CtypeEnum.POSTPAID.code().toString().equals(subscriberVOInfoBus.getCustomerType())  
					|| FormUtils.isFaturaStop(subscriberVOInfoBus.getTariffCode())) {	
					fillPostpaidInvoices(subscriberVOInfoBus);
				}
				
				subscriberVOInfoBus.setPassword(subscriberVO.getPassword());
				subscriberVOInfoBus.setLog(subscriberVO.getLog());
				
				boolean isRepresentative = isCorpRepresantative(subscriberVOInfoBus.getMsisdn(), subscriberVOInfoBus.getCustomerGroup());
				subscriberVOInfoBus.setCoRep(String.valueOf(isRepresentative));
				
				preRecordsList.add(FormUtils.generateHtmlTableRow(fromIndex++, subscriberVOInfoBus));
				
			}
		}
		records.addAll(preRecordsList);
		allLogs.addAll(list);
	}
	


	private static void fillPostpaidInvoices(SubscriberVO subscriberVO) {
		String billAmount = "";
		try {
			billAmount = Billinfo.getGuncelInfo(subscriberVO.getMsisdn().substring(1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		List<PaymentInfoVO> invoices =null;
		if("a".equalsIgnoreCase(subscriberVO.getLineStatus())){
			try {
				invoices = Billinfo.getInvoices(subscriberVO.getMsisdn() , subscriberVO.getCustomerGroup());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		
		subscriberVO.setBillAmount(billAmount);
		subscriberVO.setInvoices(invoices);
	}
	

	public static boolean isCorpRepresantative(String msisdn, String cGroup) {
		 
		  if ( CgroupEnum.CORPORATE.code().toString().equals(cGroup)
				   || CgroupEnum.SME.code().toString().equals(cGroup)){

			  String result=null;
			try {
				result = InfoBus.getCustCodeListByMsisdn(msisdn);
			} catch (Exception e) {
				e.printStackTrace();
			} 
  
			  if (result!=null && !result.equals("")){
		        String iwisReturnCode =  InfoBus.parseTag(result,InfoBus.IWIS_IWIS_RETURN_CODE_TAG);
		        String iwisDetailCode =  InfoBus.parseTag(result,InfoBus.IWIS_DETAIL_CODE_TAG);
		        if (iwisReturnCode!=null && iwisReturnCode.equals(InfoBus.INFOBUS_SUCCESS_RET_CODE) && iwisDetailCode!=null && iwisDetailCode.equals(InfoBus.INFOBUS_SUCCESS_RET_CODE)) {
		            String custCodeTag = InfoBus.parseTag(result,"CUSTCODE");
		            if (custCodeTag!=null && !custCodeTag.equals("")){
		            	return true;
//		                profile.setCoRep(InfoBus.INFOBUS_COREP_REPRESENTATIVE);
//		                StringTokenizer strToken = new StringTokenizer(custCodeTag,"|");
//		                custCodeList = OnlineTransactionsConstants.GENERAL_COMPANY_CUSTCODE_XML_STARTTAG;
//						while (strToken.hasMoreTokens()) {
//							String token = strToken.nextToken();
//							if (isValidCustCode(token)) {
//								custCodeList = custCodeList +  "<cust-code>" + token + "</cust-code>";
//							}
//						}
//						custCodeList =  custCodeList + OnlineTransactionsConstants.GENERAL_COMPANY_CUSTCODE_XML_ENDTAG;
		            }
		        }
			  }
		}
		  
		  return false;
		  
	  }

//	private static String generateRow(SubscriberVO subscriberVO) {
//		return subscriberVO.getMsisdn() + " " + subscriberVO.getPassword() + " " + subscriberVO.getLog().getOperationDate() + " lineStatus="
//				+ subscriberVO.getLineStatus() + " cType=" + subscriberVO.getCustomerType() + " brandName=" + subscriberVO.getBrandName() + " <br/> ";
//	}
	



}
