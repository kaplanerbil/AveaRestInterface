package com.erbil.mps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.LoggerFactory;

import com.erbil.mps.config.GetConfigForGeneral;
import com.erbil.mps.constant.CgroupEnum;
import com.erbil.mps.constant.CtypeEnum;
import com.erbil.mps.constant.MPSConstants;
import com.erbil.mps.constant.OnlineTransactionsConstants;
import com.erbil.mps.constant.StatusEnum;
import com.erbil.mps.model.IwisLogVO;
import com.erbil.mps.model.SubscriberVO;

/*
 * Created on May 11, 2004
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
/**
 * @author 000842
 *
 *         To change the template for this generated type comment go to
 *         Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class InfoBus {

	private final static org.slf4j.Logger log_ = LoggerFactory.getLogger(InfoBus.class);
	private static GetConfigForGeneral configForGeneral = GetConfigForGeneral.getInstance();
	// production
	
    public static final String INFOBUS_TOTAL_CREDIT_TAG = "STH_TOTAL";
    public static final String INFOBUS_CTYPE_TAG = "CTYPE";
    public static final String INFOBUS_POSTPAID_STATUS_TAG = "STATUS";
    public static final String INFOBUS_TARIFFID_TAG = "TARIFFID";
    public static final String INFOBUS_TARIFFLEVEL_TAG = "TARIFF_LEVEL";
    public static final String INFOBUS_PREPAID_STATE_TAG = "STATE";
    public static final String INFOBUS_PREPAID_STATE_NO_F_CALL = "0";
    public static final String INFOBUS_PREPAID_STATE_NORMAL = "1";
    public static final String INFOBUS_PREPAID_STATE_TEARDOWN = "2";
    public static final String INFOBUS_PREPAID_STATE_SUSPENDED = "3";
    public static final String INFOBUS_PREPAID_STATE_STOLEN = "7";

    public static final String INFOBUS_PRICEGROUP_IS_EMPLOYEE = "03";
    public static final String IWIS_IWIS_RETURN_CODE_TAG = "IWIS_RETURN_CODE";
    public static final String IWIS_DETAIL_CODE_TAG = "IWIS_DETAIL_CODE";
    public static final String IWIS_RETURN_CODE_TAG = "RETURNCODE";
    public static final String IWIS_RETURN_CODE__TAG = "RETURN_CODE";
    public static final String IWIS_RETURN_MESSAGE_TAG = "RETURNMESSAGE";
    public static final String IWIS_RETURN_MESSAGE__TAG = "RETURN_MESSAGE";
    public static final String IWIS_RESULT_MESSAGE_TAG = "RESULT";
    public static final String IWIS_IMSI_TAG = "IMSI";
    public static final String INFOBUS_SUCCESS_RET_CODE = "0";
    public static final String INFOBUS_FAIL_RET_CODE = "3";
    public static final String INFOBUS_FAIL_DETAIL_CODE = "-27001";
    public static final String INFOBUS_RETURN_CODE_INTERNAL_ERROR = "99999";
    public static final String IWIS_PAYMENT_INFO_STAN_TAG = "STAN";
	public static final String INFOBUS_CUSTCODE_TAG = "COREPCUSTCODE";
    public static final String IWIS_CORPORATE_MSISDN_LIST_TAG = "DATA";
    public static final String INFOBUS_ALLREADY_SUBSCRIBE = "105";
    public static final String IWIS_CORPORATE_CUSTCODES_LIST_TAG = "CUSTCODES";
    public static final String IWIS_CORPORATE_CUSTCODE_TAG = "CUSTCODE";
    public static final String IWIS_CORPORATE_ACTIVE_MSISDN_LIST_TAG = "MSISDNLIST";
    public static final String IWIS_CORPORATE_TOTALPAGENUMBER_TAG = "TOTALPAGENUMBER";
    public static final String IWIS_MASS_CORP_RESULT_TAG = "RESULT";
    public static final String IWIS_RETURN_TAG = "RETURN";
    public static final String IWIS_RESULT_TAG = "RESULT";
    public static final String INFOBUS_BRANDCODE_TAG = "BRANDCODE";
	public static final String INFOBUS_BRANDNAME_TAG = "BRANDNAME";
	public static final String INFOBUS_3G_TAG = "TG";
    public static final String IWIS_TID_TAG = "TID";
	public static final String INFOBUS_COMBINED_QUERY_REASONCODE_TAG = "REASONCODE";
	public static final String INFOBUS_COMBINED_QUERY_SERVICECODE_TAG = "SERVICECODE";
    public static final String IWIS_RESULT_DEFINITION = "RESULT_DEFINITION";
    public static final String INFOBUS_SHADOWDATE_TAG = "SHADOWDATE";
    public static final String IWIS_CONSENT_TAG = "CONSENT";
    public static final String IWIS_MSISDN_BY_TC_ID_RESULT_TAG = "TC_ID_MSISDN_LIST";
    public static final String INFOBUS_GETSTATE_FALSE_RET_CODE = "0";
    public static final String INFOBUS_GETSTATE_TRUE_RET_CODE = "1";
    public static final String INFOBUS_PREPAID_STATE_STOLEN_OR_LOST = "7";
    
	public static final String INFOBUS_BILLING_PERIOD_UNKNOWN = "Unknown";
	public static final String INFOBUS_BILLING_PERIOD_PREPAID = "Prepaid";
	public static final String INFOBUS_POSTPAID_BILLING_PERIOD_TAG = "BILLINGPERIOD";
	public static final String INFOBUS_BILLING_PERIOD_1 = "1";
	public static final String INFOBUS_BILLING_PERIOD_2 = "2";
	public static final String INFOBUS_BILLING_PERIOD_3 = "3";
	public static final String INFOBUS_BILLING_PERIOD_4 = "4";

	public static final String INFOBUS_BILLING_PERIOD_1_DAY = "22";
	public static final String INFOBUS_BILLING_PERIOD_2_DAY = "26";
	public static final String INFOBUS_BILLING_PERIOD_3_DAY = "31";
	public static final String INFOBUS_BILLING_PERIOD_4_DAY = "09";
	
    public static final String INFOBUS_CGROUP_TAG = "CGROUP";
    public static final String INFOBUS_COID_TAG = "COID";
    public static final String INFOBUS_TCID_TAG = "TCID";
    public static final String INFOBUS_LIST_TAG = "LIST";
    public static final int    SNCODE_EGM = 405;
    public static final String INFOBUS_INFO_TEXT = "INFO_TEXT";
    public static final String NONSEGMENT = "N";
    public static final String BRONZSEGMENT = "BR";
    public static final String SILVERSEGMENT = "SI";
    public static final String PLATINIUMSEGMENT = "PL";
    public static final String GOLDSEGMENT = "GO";
	public static final String INFOBUS_FOUND_RET_CODE = "0";
	public static final String INFOBUS_FOUND_DETAIL_CODE = "0";
	public static final String INFOBUS_POSTPAID_EMPLOYEE_TARIFFID1 = "421";
	public static final String INFOBUS_POSTPAID_EMPLOYEE_TARIFFID2 = "422";
	public static final String INFOBUS_POSTPAID_EMPLOYEE_TARIFFID3 = "423";
	public static final String INFOBUS_PREPAID_EMPLOYEE_TARIFFID = "11";
	
	
	public static final String INFOBUS_FAIL_RET_CODE_25 = "25";
	public static final String INFOBUS_FAIL_RET_CODE_26 = "26";
	public static final String INFOBUS_FAIL_RET_CODE_27 = "27";
	public static final String INFOBUS_FAIL_RET_CODE_30 = "30";
	public static final String INFOBUS_FAIL_RET_CODE_36 = "36";
	public static final String INFOBUS_FAIL_RET_CODE_56 = "56";
	public static final String INFOBUS_FAIL_RET_CODE_66 = "66";
	public static final String INFOBUS_FAIL_RET_CODE_77 = "77";
	public static final String INFOBUS_FAIL_RET_CODE_78 = "78";
	public static final String INFOBUS_FAIL_RET_CODE_9998 = "9998";
	public static final String INFOBUS_FAIL_RET_CODE_9999 = "9999";
	
	
	
	private static ArrayList<String> SEGMENT_CODES = new ArrayList<String>(Arrays.asList("GO", "BR", "PL", "SI")); // Gold, bronz, platinium, silver

	/**
	 * MNP icin eklendi
	 */
	public static boolean isMsisdnAvea(String msisdn) {
		String isMsisdnAveaResult = "";
		boolean isMsisdnAvea = true;
		try {
			isMsisdnAveaResult = isMsisdnAveaQuery(msisdn.substring(2), true);
			String iwisReturnCode = parseTag(isMsisdnAveaResult, IWIS_IWIS_RETURN_CODE_TAG);
			String iwisDetailCode = parseTag(isMsisdnAveaResult, IWIS_DETAIL_CODE_TAG);
			if ((iwisReturnCode != null) && (iwisDetailCode != null)) {
				if (iwisReturnCode.equals(INFOBUS_FAIL_RET_CODE) && iwisDetailCode.equals(INFOBUS_FAIL_DETAIL_CODE)) {
					isMsisdnAvea = false;
				}
			} else {
				isMsisdnAvea = false;
			}
		} catch (Exception e) {
			isMsisdnAvea = false;
		}
		return isMsisdnAvea;
	}

	public static int isMsisdnAveaCUDB(String msisdn) {
		// MNPdb de verilen msisdn aranir.
		String isMsisdnAveaResult = "";
		// isMsisdnAvea -2 ise sorun var 1 ise bulundu -1 ise bulunamadi
		int isMsisdnAvea = -2;
		try {
			isMsisdnAveaResult = isMsisdnAveaQuery(msisdn.substring(2), true);
			String iwisReturnCode = parseTag(isMsisdnAveaResult, IWIS_IWIS_RETURN_CODE_TAG);
			String iwisDetailCode = parseTag(isMsisdnAveaResult, IWIS_DETAIL_CODE_TAG);
			if ((iwisReturnCode != null) && (iwisDetailCode != null)) {
				if (iwisReturnCode.equals(INFOBUS_FAIL_RET_CODE) && iwisDetailCode.equals(INFOBUS_FAIL_DETAIL_CODE)) {
					isMsisdnAvea = -1;
				} else if (iwisReturnCode.equals(INFOBUS_FOUND_RET_CODE) && iwisDetailCode.equals(INFOBUS_FOUND_DETAIL_CODE)) {
					isMsisdnAvea = 1;
				}
			} else {
				isMsisdnAvea = -2;
			}
		} catch (Exception e) {
			isMsisdnAvea = -2;
		}
		return isMsisdnAvea;
	}

	public static int isMsisdnAveaMNP(String msisdn) {
		// MNPdb de verilen msisdn aranir.
		String isMsisdnAveaResult = "";
		// isMsisdnAvea -2 ise sorun var 1 ise bulundu -1 ise bulunamadi
		int isMsisdnAvea = -2;
		try {
			isMsisdnAveaResult = isMsisdnAveaQueryMNP(msisdn, true);
			String iwisReturnCode = parseTag(isMsisdnAveaResult, IWIS_IWIS_RETURN_CODE_TAG);
			String iwisDetailCode = parseTag(isMsisdnAveaResult, IWIS_DETAIL_CODE_TAG);
			if ((iwisReturnCode != null) && (iwisDetailCode != null)) {
				if (iwisReturnCode.equals(INFOBUS_FAIL_RET_CODE) && iwisDetailCode.equals(INFOBUS_FAIL_DETAIL_CODE)) {
					isMsisdnAvea = -1;
				} else if (iwisReturnCode.equals(INFOBUS_FOUND_RET_CODE) && iwisDetailCode.equals(INFOBUS_FOUND_DETAIL_CODE)) {
					isMsisdnAvea = 1;
				}
			} else {
				isMsisdnAvea = -2;
			}
		} catch (Exception e) {
			isMsisdnAvea = -2;
		}
		return isMsisdnAvea;
	}

	public static int isMsisdnAveaOrError(String msisdn) {
		String isMsisdnAveaResult = "";
		// isMsisdnAvea -2 ise sorun var 1 ise bulundu -1 ise bulunamadi
		int isMsisdnAvea = -2;
		try {
			isMsisdnAveaResult = isMsisdnAveaQuery(msisdn.substring(2), true);
			String iwisReturnCode = parseTag(isMsisdnAveaResult, IWIS_IWIS_RETURN_CODE_TAG);
			String iwisDetailCode = parseTag(isMsisdnAveaResult, IWIS_DETAIL_CODE_TAG);
			if ((iwisReturnCode != null) && (iwisDetailCode != null)) {
				if (iwisReturnCode.equals(INFOBUS_FAIL_RET_CODE) && iwisDetailCode.equals(INFOBUS_FAIL_DETAIL_CODE)) {
					isMsisdnAvea = -1;
				} else if (iwisReturnCode.equals(INFOBUS_FOUND_RET_CODE) && iwisDetailCode.equals(INFOBUS_FOUND_DETAIL_CODE)) {
					isMsisdnAvea = 1;
				}
			} else {
				isMsisdnAvea = -2;
			}
		} catch (Exception e) {
			isMsisdnAvea = -2;
		}
		return isMsisdnAvea;
	}

	public static String isMsisdnAveaQuery(String msisdn, boolean log) throws Exception {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version='1.0'?>");
		buffer.append("<IWIS_IN_DATA_UNIT>");
		buffer.append("<IWIS_IN_HEADER version='1.0'>");
		buffer.append("<SYSTEM>VAS_PORTAL</SYSTEM>");
		buffer.append("<SERVICE>LDAPCDB_QUERY</SERVICE>");
		buffer.append("</IWIS_IN_HEADER>");
		buffer.append("<IWIS_SERVICE_PARAMS>");
		buffer.append("<MSISDN>" + msisdn + "</MSISDN>");
		buffer.append("</IWIS_SERVICE_PARAMS>");
		buffer.append("</IWIS_IN_DATA_UNIT>");
		try {
			String result = sendCommand(buffer.toString());
			return result;
		} catch (Exception e) {
			throw new Exception("Infobus error :" + e);
		}
	}

	private static String isMsisdnAveaQueryMNP(String msisdn, boolean log) throws Exception {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version='1.0' encoding='ISO-8859-9'?>");
		buffer.append("<IWIS_IN_DATA_UNIT>");
		buffer.append("<IWIS_IN_HEADER version='1.0'>");
		buffer.append("<SYSTEM>VAS_PORTAL</SYSTEM>");
		buffer.append("<SERVICE>LDAPMNP_QUERY</SERVICE>");
		buffer.append("</IWIS_IN_HEADER>");
		buffer.append("<IWIS_SERVICE_PARAMS>");
		buffer.append("<MSISDN>" + msisdn + "</MSISDN>");
		buffer.append("</IWIS_SERVICE_PARAMS>");
		buffer.append("</IWIS_IN_DATA_UNIT>");
		try {
			String result = sendCommand(buffer.toString());
			return result;
		} catch (Exception e) {
			throw new Exception("Infobus error :" + e);
		}
	}

	public static String isMsisdnPrepaidQuery(String msisdn, boolean log) throws Exception {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version=\"1.0\" encoding=\"ISO-8859-9\" standalone=\"yes\"?>");
		buffer.append("<IWIS_IN_DATA_UNIT>");
		buffer.append("<IWIS_IN_HEADER version='1.0'>");
		buffer.append("<SYSTEM>" + MPSConstants.INFOBUS_OTHER_SYSTEM_NAME + "</SYSTEM>");
		buffer.append("<SERVICE>PREPAID_QUERY</SERVICE>");
		buffer.append("<TID></TID>");
		buffer.append("</IWIS_IN_HEADER>");
		buffer.append("<IWIS_SERVICE_PARAMS>");
		buffer.append("<MSISDN>" + msisdn + "</MSISDN>");
		buffer.append("</IWIS_SERVICE_PARAMS>");
		buffer.append("</IWIS_IN_DATA_UNIT>");
		try {
			String result = sendCommand(buffer.toString());
			return result;
		} catch (Exception e) {
			throw new Exception("Infobus error :" + e);
		}
	}
	
	public static String getCustCodeListByMsisdn(String msisdn) throws Exception
    {   
        StringBuffer buffer = new StringBuffer();
        
        buffer.append("<?xml version='1.0' encoding='ISO-8859-9'?>");
        buffer.append("<IWIS_IN_DATA_UNIT>");        
        buffer.append("<IWIS_IN_HEADER version='1.0'>");
        buffer.append("<SYSTEM>" + MPSConstants.INFOBUS_OTHER_SYSTEM_NAME + "</SYSTEM>");
        buffer.append("<SERVICE>POSTPAID_GET_CUSTCODE_FROM_RESPONSIBLE</SERVICE>");        
        buffer.append("</IWIS_IN_HEADER>");        
        buffer.append("<IWIS_SERVICE_PARAMS>");
        buffer.append("<MSISDN>"+ msisdn +"</MSISDN>");
        buffer.append("</IWIS_SERVICE_PARAMS>");    
        buffer.append("</IWIS_IN_DATA_UNIT>");
    
        try {
            return sendCommand(buffer.toString());
        } catch (Exception e) {
            throw new Exception("Infobus error :" + e);
        }
    }
	
	public static String getCurrentInvoiceBillAmount(String msisdn) throws Exception{
	    StringBuffer buffer = new StringBuffer();
	    buffer.append("<?xml version='1.0' encoding='ISO-8859-9'?>");
	    buffer.append("<IWIS_IN_DATA_UNIT>");
	    buffer.append("<IWIS_IN_HEADER version='1.0'>");
	    buffer.append("<SYSTEM>"+MPSConstants.INFOBUS_OTHER_SYSTEM_NAME+"</SYSTEM>");
	    buffer.append("<SERVICE>POSTPAID_GET_GUNCEL_FATURA_TUTARI</SERVICE>");
	    buffer.append("</IWIS_IN_HEADER>");
	    buffer.append("<IWIS_SERVICE_PARAMS>");
	    buffer.append("<MSISDN>"+ msisdn +"</MSISDN>");
	    buffer.append("</IWIS_SERVICE_PARAMS>");
	    buffer.append("</IWIS_IN_DATA_UNIT>");

        String result = sendCommand(buffer.toString());
        return result;
	}

	public static IwisLogVO returnLogValueObject(String processCode, String input, String output, IwisLogVO logVO) {
		String iwisReturnCode = InfoBus.parseTag(output, InfoBus.IWIS_IWIS_RETURN_CODE_TAG);
		String returnCode = InfoBus.parseTag(output, InfoBus.IWIS_RETURN_CODE_TAG);
		if (iwisReturnCode == null)
			iwisReturnCode = "";
		if (returnCode == null)
			returnCode = "";
		if (processCode != null
				&& (processCode.equals(OnlineTransactionsConstants.BROADCAST_SMS_ACTIVATION_TRANSACTION) || processCode
						.equals(OnlineTransactionsConstants.BROADCAST_SMS_DEACTIVATION_TRANSACTION))) {
			iwisReturnCode = "0";
			returnCode = "0";
		}
		/*
		 * if (returnCode!=null && returnCode.equals(OnlineTransactionsConstants.GENERAL_NOT_MASS_TARIFF_ERROR)) {
		 * customerGroup = OnlineTransactionsConstants.GENERAL_CUSTOMER_TYPE_CORPORATE;
		 * }
		 */
		// String chargingAmount = "";
		// try{
		// chargingAmount = OnlineTransactionsUtils.returnOnlineTransactionsChargingAmount(processCode, logVO.getCustomerGroup());
		// if(chargingAmount == null)
		// chargingAmount = "";
		// }catch(Exception e){
		// chargingAmount = "";
		// }
		logVO.setOperation(processCode);
		logVO.setInput(input);
		logVO.setOutput(output);
		logVO.setIwisReturnCode(iwisReturnCode);
		logVO.setReturnCode(returnCode);
		// logVO.setChargingInfo(chargingAmount);
		return logVO;
	}

	public static String isMsisdnRoaming(IwisLogVO logVO) throws Exception {
		String msisdn = returnMsisdnForCGroupCheck(logVO);
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version='1.0'?>");
		buffer.append("<IWIS_IN_DATA_UNIT>");
		buffer.append("<IWIS_IN_HEADER version='1.0'>");
		buffer.append("<SYSTEM>VAS_PORTAL</SYSTEM>");
		buffer.append("<SERVICE>LDAPCDB_QUERY</SERVICE>");
		buffer.append("</IWIS_IN_HEADER>");
		buffer.append("<IWIS_SERVICE_PARAMS>");
		buffer.append("<MSISDN>" + msisdn + "</MSISDN>");
		buffer.append("</IWIS_SERVICE_PARAMS>");
		buffer.append("</IWIS_IN_DATA_UNIT>");
		try {
			String result = sendCommand(buffer.toString());
			return result;
		} catch (Exception e) {
			throw new Exception("Infobus error :" + e);
		}
	}

	public static String returnMsisdnForCGroupCheck(IwisLogVO logVO) {
		String msisdn = logVO.getCorporateMsisdn();
		if (msisdn == null || msisdn.equals(""))
			msisdn = logVO.getMsisdn();
		return msisdn;
	}

	public static boolean isNumberEmployee(String msisdn) {
		boolean isEmployee = false;
		try {
			if (msisdn != null && ((msisdn.substring(0, 8).equals("90555255")) || (msisdn.substring(0, 8).equals("90505505")))) {
				String combinedDetailedResult = InfoBus.combinedDetailedQuery(msisdn.substring(2), true,
						OnlineTransactionsConstants.COMBINED_DETAIL_QUERY_WITHOUT_DETAIL);
				String tariffCode = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_TARIFFID_TAG);
				if (tariffCode != null
						&& (tariffCode.equals(INFOBUS_POSTPAID_EMPLOYEE_TARIFFID1) || tariffCode.equals(INFOBUS_POSTPAID_EMPLOYEE_TARIFFID2)
								|| tariffCode.equals(INFOBUS_POSTPAID_EMPLOYEE_TARIFFID3) || tariffCode.equals(INFOBUS_PREPAID_EMPLOYEE_TARIFFID))) {
					isEmployee = true;
				}
				return isEmployee;
			}
		} catch (Exception e) {
			log_.error("Infobus error :" + e);
			return false;
		}
		return isEmployee;
	}

	// detailExist parameter added to get CGROUP and COREP tags. If these tags needed, send parameter as 'Y' otherwise 'N'
	public static String combinedDetailedQuery(String msisdn, boolean log, String detailExist) throws Exception {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version='1.0'?>");
		buffer.append("<IWIS_IN_DATA_UNIT>");
		buffer.append("<IWIS_IN_HEADER version='1.0'>");
		buffer.append("<SYSTEM>" + MPSConstants.INFOBUS_OTHER_SYSTEM_NAME + "</SYSTEM>");
		buffer.append("<SERVICE>COMBINED_QUERY_IN_DETAIL</SERVICE>");
		buffer.append("</IWIS_IN_HEADER>");
		buffer.append("<IWIS_SERVICE_PARAMS>");
		buffer.append("<MSISDN>" + msisdn + "</MSISDN>");
		buffer.append("<DETAIL>" + detailExist + "</DETAIL>");
		buffer.append("</IWIS_SERVICE_PARAMS>");
		buffer.append("</IWIS_IN_DATA_UNIT>");
		log_.debug("Commend XML :");
		log_.debug(buffer.toString());
		try {
			String result = sendCommand(buffer.toString());
			return result;
		} catch (Exception e) {
			throw new Exception("Infobus error :" + e);
		}
	}

	private static String sendCommand(String w_in_buffer) throws Exception {
		return sendCommand(w_in_buffer, MPSConstants.HTTP_CONNECTION_TIMEOUT, MPSConstants.HTTP_READ_TIMEOUT, "WEB/IWIS", "ISO-8859-9");
	}

	private static String sendCommand(String w_in_buffer, int connectionTimeout, int readTimeout, String processName, String encoding)
			throws Exception {
		log_.debug("INFOBUS started");
		String infoBusAddress = configForGeneral.getValue("INFOBUS_URL") + processName;
		String result = "";

		try {
			result = postFromHttpWithContentTypeEncoding(infoBusAddress, w_in_buffer, encoding, "text/xml", connectionTimeout, readTimeout);
			log_.debug("Infobus result:" + result);
		} catch (IOException e) {
			log_.error(e.getMessage(), e);
		}
		// Logging
		// ServiceLoggingUtil.prepareLogForIwisServices(w_in_buffer, result);
		return (result);
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

	public static String postFromHttpWithContentTypeEncoding(String url, String XML, String encoding, String contentType) throws IOException {
		return postFromHttpWithContentTypeEncoding(url, XML, encoding, contentType, MPSConstants.HTTP_CONNECTION_TIMEOUT,
				MPSConstants.HTTP_READ_TIMEOUT);
	}

	public static String postFromHttpWithContentTypeEncoding(String url, String XML, String encoding, String contentType, int connectionTimeout,
			int readTimeout) throws IOException {
		StringBuffer resultStr = new StringBuffer();
		MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
		connectionManager.getParams().setDefaultMaxConnectionsPerHost(2);
		connectionManager.getParams().setMaxTotalConnections(20);
		HttpClient client = new HttpClient(connectionManager);
		client.getHttpConnectionManager().getParams().setConnectionTimeout(connectionTimeout);
		client.getHttpConnectionManager().getParams().setSoTimeout(readTimeout);
		PostMethod method = new PostMethod(url);
		method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler(0, false));
		if (encoding != null && encoding.equalsIgnoreCase("utf-8"))
			method.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
		try {
			method.setRequestEntity(new StringRequestEntity(XML, contentType, encoding));
			client.executeMethod(method);
			InputStream in = null;
			InputStreamReader is = null;
			if (method.getStatusCode() == HttpStatus.SC_OK) {
				in = method.getResponseBodyAsStream();
				is = new InputStreamReader(in, encoding);
				BufferedReader resultPage = new BufferedReader(is);
				String resultCode;
				resultCode = resultPage.readLine();
				while (resultCode != null) {
					if ((resultCode.length() != 0)) {
						resultStr.append(resultCode.trim());
					}
					resultCode = resultPage.readLine();
				}
				resultPage.close();
			}
		} catch (Exception e) {
			log_.error("HTTPMultiThreaded :postFromHttpWithContentTypeEncoding(String url : " + url + ",String XML:" + XML
					+ ",String encoding,int connectionTimeout,int readTimeout)" + e, e);
		} finally {
			method.releaseConnection();
		}
		return resultStr.toString();
	}
	
	// overloaded by orhan to inject combineDetailedResult String
	public static SubscriberVO returnSubscriber(String msisdn, String combinedDetailedResult) {
		log_.error("returnSubscriber started  msisdn : " + msisdn);
		SubscriberVO svo = new SubscriberVO();
		String cType = "0";
		String status = StatusEnum.ACTIVE.code();
		String customerGroup = CgroupEnum.MASS.code();
		String custCode = "";
		String tariffName = "";
		String billingPeriod ="";
		String is3G = "";
		String brandCode = "";
		String brandName = "";
		String tariffCode = "";
		try {
			if (combinedDetailedResult != null && !combinedDetailedResult.equals("")) {
				log_.debug("COMBINED QUERY RESULT: " + combinedDetailedResult);
				
				cType = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_CTYPE_TAG);

				customerGroup = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_CGROUP_TAG);
				custCode = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_CUSTCODE_TAG);
				billingPeriod = FormUtils.returnSubscriberBillingPeriod(combinedDetailedResult,cType);
				tariffCode = InfoBus.parseTag(combinedDetailedResult,InfoBus.INFOBUS_TARIFFID_TAG);
				brandCode = FormUtils.returnAveaForUnsubscribedBrand(InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_BRANDCODE_TAG));
				brandName = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_BRANDNAME_TAG);
				is3G = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_3G_TAG);

				if (customerGroup == null || customerGroup.equals(""))
					customerGroup = CgroupEnum.MASS.code();
				if (custCode == null)
					custCode = "";
				if (tariffName == null)
					tariffName = "";
				if (billingPeriod==null) billingPeriod="";
				if (brandCode == null)
					brandCode = "0";
				if (brandName == null)
					brandName = "Avea";
				if (is3G == null || is3G.trim().equals(""))
					is3G = "N";
				if (tariffCode == null)
					tariffCode = "";
				if (cType == null)
					cType = "0";
				
				log_.debug("cType >>>> " + cType);
				
				svo = new SubscriberVO();
				svo.setCustomerType(cType);
				
				status = parseStatusTag(combinedDetailedResult, svo);
				
				svo.setMsisdn(msisdn);
				svo.setLineStatus(status);
				svo.setCustomerGroup(customerGroup);
				svo.setCustCode(custCode);
				svo.setTariffName(tariffName);
				svo.setBillingPeriod(billingPeriod);
				svo.setTariffCode(tariffCode);
				svo.setBrandCode(brandCode);
				svo.setBrandName(brandName);
				svo.setIs3G(is3G);
				
				try {
					String segment = "";
					String isMsisdnAveaResult = InfoBus.isMsisdnAveaQuery(msisdn, true);
					log_.debug("LDAP RESULT: " + isMsisdnAveaResult);
					
					segment = parseSegmentTag(svo, isMsisdnAveaResult);
					svo.setSegment(segment);
					
					String imsi = parseTag(isMsisdnAveaResult, "IMSI");
					svo.setImsi(imsi);
					
				} catch (Exception e) {
					log_.error("returnSubscriber try Iwis " + e.getMessage() + " MSISDN:" + msisdn);
					log_.error(e.getMessage(), e);
				}
				log_.debug("SubscriberVo : " + svo.toXML());
			} else {
				log_.debug("temporary error" + " MSISDN:" + msisdn);
				svo = new SubscriberVO();
				svo.setMsisdn(msisdn);
				svo.setLineStatus(StatusEnum.TEMPORARY_ERROR.code());
			}
			// }
		} catch (Exception e) {
			log_.error("returnSubscriber Query Failed " + e.getMessage() + " MSISDN:" + msisdn);
			log_.error(e.getMessage(), e);
			try {
				log_.error(svo.toString());
			} catch (Exception e2) {
				log_.error("Error while writing user to log...");
			}
		}
		log_.debug("returnSubscriber finished  msisdn : " + msisdn);
		return svo;
	}
	
    public static String postpaidGetContractDb(String msisdn) throws Exception
    {
        StringBuffer buffer = new StringBuffer();
        
        buffer.append("<?xml version='1.0' encoding='ISO-8859-9'?>");
        buffer.append("<IWIS_IN_DATA_UNIT>");        
        buffer.append("<IWIS_IN_HEADER version='1.0'>");
        buffer.append("<SYSTEM>"+MPSConstants.INFOBUS_OTHER_SYSTEM_NAME+"</SYSTEM>");
        buffer.append("<SERVICE>POSTPAID_GET_CONTRACT_DB</SERVICE>");        
        buffer.append("</IWIS_IN_HEADER>");        
        buffer.append("<IWIS_SERVICE_PARAMS>");
        buffer.append("<MSISDN>"+ msisdn +"</MSISDN>");
        buffer.append("</IWIS_SERVICE_PARAMS>");    
        buffer.append("</IWIS_IN_DATA_UNIT>");
    
        try {
            return sendCommand(buffer.toString());
        } catch (Exception e) {
            throw new Exception("Infobus error :" + e);
        }
    }
    
	public static String returnTransactionDate(){
		Date processDate = new Date(); 
		SimpleDateFormat df1= new SimpleDateFormat("yyyyMMdd");
		return df1.format(processDate);
	}
	
	public static String returnTransactionTime(){
		Date processDate = new Date(); 
		SimpleDateFormat df1= new SimpleDateFormat("HHmmss");
		return df1.format(processDate);
	}
    
	public static final String BPPS_OPERATION_SOURCE_WEB = "31";
	
	public static String  paymentInfoTransactionQuery(String msisdn, String status, String numberOfRecords, String paymentPeriod, String customerGroup ) throws Exception
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version='1.0'?>");
		buffer.append("<IWIS_IN_DATA_UNIT>");
		buffer.append("<IWIS_IN_HEADER version='1.0'>");
		buffer.append("<SYSTEM>" + MPSConstants.INFOBUS_OTHER_SYSTEM_NAME + "</SYSTEM>");
		buffer.append("<SERVICE>BPM_POST_GET_BILLS</SERVICE>");
		buffer.append("<TID></TID>");
		buffer.append("</IWIS_IN_HEADER>");
		buffer.append("<IWIS_SERVICE_PARAMS>");
		buffer.append("<XML>");
		buffer.append("<sch:PostpaidGetBillsProcessRequest xmlns:sch=\"avea/bpm/schemas\">");
		buffer.append("<PAYMENTHEADER xmlns=\"\">");
		buffer.append("<OPERATIONSOURCE>" + BPPS_OPERATION_SOURCE_WEB + "</OPERATIONSOURCE>");
		buffer.append("<INSTITUTIONID>" + OnlineTransactionsConstants.BPPS_INSTITUTION_ID +"</INSTITUTIONID>");
		buffer.append("<BILLERID>555</BILLERID>");
		buffer.append("<ORIGINATORINFO>");
		buffer.append("<CITYID>034</CITYID>");
		buffer.append("<BRANCHID>AVEA</BRANCHID>");
		buffer.append("<TELLERID>AVEA</TELLERID>");
		buffer.append("<USERID>AVEA</USERID>");
		buffer.append("</ORIGINATORINFO>");
		buffer.append("</PAYMENTHEADER>");
		buffer.append("<MSISDN>" + msisdn + "</MSISDN>");
		buffer.append("<STATUS>" + status + "</STATUS>");
		buffer.append("<NUMBEROFRECORDS>" + numberOfRecords + "</NUMBEROFRECORDS>");
		buffer.append("<STARTINGPAYMENTPERIOD>" + paymentPeriod + "</STARTINGPAYMENTPERIOD>");
		buffer.append("<TARIFF_TYPE>" + customerGroup + "</TARIFF_TYPE>");
		buffer.append("</sch:PostpaidGetBillsProcessRequest>");
		buffer.append("</XML>");
		buffer.append("</IWIS_SERVICE_PARAMS>");	
		buffer.append("</IWIS_IN_DATA_UNIT>");
	
		log_.debug("Commend XML :");
		log_.debug(buffer.toString());
		try {
			String result = sendCommand(buffer.toString());
			return result;
		} catch (Exception e) {
			throw new Exception("Infobus error :" + e);
		}
	}
	
	public static String  bppsUnpaidBillQuery(String msisdn, String status, String numberOfRecords, String paymentPeriod) throws Exception
	{
	    SimpleDateFormat dateFormatter = new SimpleDateFormat ("HHmmss");
		String stan = String.valueOf(dateFormatter.format(new Date()));
		
		if(msisdn.length()==12)
			msisdn = msisdn.substring(2);
		else if(msisdn.length() == 11)
			msisdn = msisdn.substring(1);
	    
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version='1.0'?>");
		buffer.append("<IWIS_IN_DATA_UNIT>");
		buffer.append("<IWIS_IN_HEADER version='1.0'>");
		buffer.append("<SYSTEM>" + MPSConstants.INFOBUS_OTHER_SYSTEM_NAME + "</SYSTEM>");
		buffer.append("<SERVICE>BPPS_UNPAID_BILL_QUERY</SERVICE>");
		buffer.append("<TID></TID>");
		buffer.append("</IWIS_IN_HEADER>");
		buffer.append("<IWIS_SERVICE_PARAMS>");
		buffer.append("<XML>");
		buffer.append("<MESSAGE VER=\"1.1\" PC=\"091\" MT=\"200\">");
		buffer.append("<HEADER>");
		buffer.append("<OPERATIONSOURCE>" + BPPS_OPERATION_SOURCE_WEB + "</OPERATIONSOURCE>");
		buffer.append("<STAN>" + stan + "</STAN>");
		buffer.append("<INSTITUTIONID>" + OnlineTransactionsConstants.BPPS_INSTITUTION_ID +"</INSTITUTIONID>");
		buffer.append("<BILLERID>555</BILLERID>");
		buffer.append("<TRANSACTIONDATE>" +  returnTransactionDate()  + "</TRANSACTIONDATE>");
		buffer.append("<TRANSACTIONTIME>" + returnTransactionTime() + "</TRANSACTIONTIME>");
		buffer.append("<ORIGINATORINFO>");
		buffer.append("<CITYID>34</CITYID>");
		buffer.append("<BRANCHID>AVEA</BRANCHID>");
		buffer.append("<TELLERID>AVEA</TELLERID>");
		buffer.append("<USERID>AVEA</USERID>");
		buffer.append("</ORIGINATORINFO>");
		buffer.append("<CURRENCY>949</CURRENCY>");
		buffer.append("</HEADER>");
		buffer.append("<DATA>");
		buffer.append("<SUN NUMBER=\"" + msisdn + "\" TYPE=\"1\"/>");
		buffer.append("<NOR>" + numberOfRecords + "</NOR>");
		buffer.append("<PAYMENTPERIOD>" + paymentPeriod + "</PAYMENTPERIOD>");
		buffer.append("</DATA>");
		buffer.append("</MESSAGE>");
		buffer.append("</XML>");
		buffer.append("</IWIS_SERVICE_PARAMS>");
		buffer.append("</IWIS_IN_DATA_UNIT>");
	
		log_.debug("Commend XML :");
		log_.debug(buffer.toString());
		try {
			String result = sendCommand(buffer.toString());
			return result;
		} catch (Exception e) {
			throw new Exception("Infobus error :" + e);
		}
	}

	private static String parseSegmentTag(SubscriberVO svo, String isMsisdnAveaResult) {
		String iwisReturnCode;
		String segment="";
		iwisReturnCode = parseTag(isMsisdnAveaResult, InfoBus.IWIS_IWIS_RETURN_CODE_TAG);
		String iwisDetailCode = parseTag(isMsisdnAveaResult, InfoBus.IWIS_DETAIL_CODE_TAG);
		if (iwisReturnCode != null && iwisReturnCode.equals(InfoBus.INFOBUS_SUCCESS_RET_CODE) && iwisDetailCode != null
				&& iwisDetailCode.equals(InfoBus.INFOBUS_SUCCESS_RET_CODE)) {
			String segments = parseTag(isMsisdnAveaResult, "SEGMENTS");
			while (segments.indexOf("SEGMENT") >= 0) {
				String key = parseTag(segments, "SEGMENT");
				if (SEGMENT_CODES.contains(key)) {
					segment = key;
					break;
				}
				segments = segments.substring("<SEGMENT>".length() + "</SEGMENT>".length() + key.length());
			}
		}
		return segment;
	}

	private static String parseStatusTag(String combinedDetailedResult, SubscriberVO svo) {
		String status;
		if ( svo.getCustomerType().equals(CtypeEnum.POSTPAID.code())) {
			status = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_POSTPAID_STATUS_TAG);
			if (status == null)
				status = StatusEnum.TEMPORARY_ERROR.code();
		} else if (svo.getCustomerType().equals(CtypeEnum.PREPAID.code())) {
			String state = InfoBus.parseTag(combinedDetailedResult, InfoBus.INFOBUS_PREPAID_STATE_TAG);
			if (state != null
					&& (state.equals(InfoBus.INFOBUS_PREPAID_STATE_NORMAL) || state.equals(InfoBus.INFOBUS_PREPAID_STATE_NO_F_CALL) || state
							.equals(InfoBus.INFOBUS_PREPAID_STATE_TEARDOWN))) {
				status = StatusEnum.ACTIVE.code();
			} else if (state != null
					&& (state.equals(InfoBus.INFOBUS_PREPAID_STATE_SUSPENDED) || state.equals(InfoBus.INFOBUS_PREPAID_STATE_STOLEN_OR_LOST))) {
				status = StatusEnum.SUSPENDED.code();
			} else {
				status = StatusEnum.DEACTIVE.code();
			}
		} else {
			status = StatusEnum.TEMPORARY_ERROR.code();
		}
		log_.debug("status >>>> " + status);
		return status;
	}

}
