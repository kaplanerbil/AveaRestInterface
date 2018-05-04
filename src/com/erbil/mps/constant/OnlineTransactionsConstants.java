package com.erbil.mps.constant;

import com.erbil.mps.config.GetConfigForGeneral;


public class OnlineTransactionsConstants {

	/** Online transactions */
	static GetConfigForGeneral configForGeneral = GetConfigForGeneral.getInstance();

	/** General */
	public static final int GENERAL_YES = 1;
	public static final int GENERAL_NO = 0;
	public static final String GENERAL_ONLINE_PWD = "otpwd";
	public static final String GENERAL_CONTACT1 = "contact1";
	public static final String GENERAL_CONTACT2 = "contact2";
	public static final String GENERAL_CONTACT1_AREA = "contact1Area";
	public static final String GENERAL_CONTACT2_AREA = "contact2Area";
	public static final String GENERAL_LINE_TYPE_PARAMETER = "lineType";
	public static final String GENERAL_SUSPICIOUS_CONTACTS_CMD = "contactInfo";
	public static final String GENERAL_CREDIT_CARD_ENTRY_CMD = "creditCardEntry";
	public static final String GENERAL_REFERER_ACTION = "refererAction";
	public static final String GENERAL_RESULT = "result";
	public static final String GENERAL_INFO = "info";
	public static final String GENERAL_TRUE = "true";
	public static final String GENERAL_FALSE = "false";
	public static final String GENERAL_MSISDN_NOT_POSTPAID_ERROR = "1";
	public static final String GENERAL_MSISDN_NOT_PREPAID_ERROR = "2";
	public static final String GENERAL_CONTRACT_NOT_ACTIVE_ERROR = "3";
	public static final String GENERAL_NOT_MASS_TARIFF_ERROR = "9";
	public static final String GENERAL_HIGH_TRAFFIC_ERROR = "10";
	public static final String GENERAL_NOT_CORPORATE_TARIFF_ERROR = "62";
	public static final String GENERAL_NOT_SME_TARIFF_ERROR = "63";
	public static final String GENERAL_UNABLE_CHANGE_CORPORATE_TARIFF_ERROR = "64";
	public static final String GENERAL_INVALID_TARIFF_TYPE_ERROR = "65";
	public static final String COMBINED_DETAIL_QUERY_WITH_DETAIL = "Y";
	public static final String COMBINED_DETAIL_QUERY_WITHOUT_DETAIL = "N";
	public static final String GENERAL_CUSTOMER_TYPE_MASS = "MASS";
	public static final String GENERAL_CUSTOMER_TYPE_CORPORATE = "CORPORATE";
	public static final String GENERAL_CUSTOMER_TYPE_SME = "SME";
	public static final String GENERAL_CUSTOMER_TYPE_UNDEFINED = "UNDEFINED";
	public static final String GENERAL_CGROUP_XML_STARTTAG = "<customer-group>";
	public static final String GENERAL_CGROUP_XML_ENDTAG = "</customer-group>";
	public static final String GENERAL_COMPANY_MSISDN_XML_STARTTAG = "<companyMsisdns>";
	public static final String GENERAL_COMPANY_MSISDN_XML_ENDTAG = "</companyMsisdns>";
	public static final String GENERAL_COMPANY_CUSTCODE_XML_STARTTAG = "<custCodes>";
	public static final String GENERAL_COMPANY_CUSTCODE_XML_ENDTAG = "</custCodes>";
	public static final String GENERAL_COMPANY_MSISDN_HIGH_TRAFFIC = "companyMsisdnHighTraffic";
	public static final String GENERAL_SHOW_MSISDN_LIST_PARAM = "showMsisdns";
	public static final String GENERAL_CHARGING_AMOUNT = "chargingAmount";
	public static final String GENERAL_SELECTED_MSISDN = "selMsisdn";
	public final String GENERAL_COUNTER_YTL_PRICE = "counterUsage.COUNTER_YTL_PRICE";
	public static final String GENERAL_VALIDATE_RETCODE = "onlineTrans.common.validate.retCode";
	public static final String GENERAL_VALIDATE_CORPORATE_RETCODE = "onlineTrans.common.validate.corporate.retCode";
	public static final String GENERAL_SMS_VALIDATE_RETCODE = "onlineTrans.common.smsvalidate.retCode";
	public static final String GENERAL_ONLINE_PWD_LOCKED_ERROR = "onlineTrans.common.MESSAGE_ONLINE_PWD_LOCKED";
	public static final String GENERAL_INVALID_ONLINE_PWD_ERROR = "onlineTrans.common.MESSAGE_ONLINE_PWD_FAILED";
	public static final String GENERAL_INVALID_COMPANY_MSISDN = "onlineTrans.common.MESSAGE_COMPANY_MSISDN_FAILED";
	public static final String GENERAL_MESSAGE_FAILED = "onlineTrans.common.MESSAGE_FAILED";
	public static final String GENERAL_MESSAGE_SUCCESS = "onlineTrans.common.MESSAGE_SUCCESS";
	public static final String GENERAL_MESSAGE_SUCCESS_NO_CREDIT = "onlineTrans.common.MESSAGE_SUCCESS_NO_CREDIT";
	public static final String GENERAL_SMS_MESSAGE_FAILED = "onlineTrans.common.sms.MESSAGE_FAILED";
	public static final String GENERAL_MSISDN_INFO_MESSAGE = "onlineTrans.common.GENERAL_MSISDN_INFO_MESSAGE";
	public static final String GENERAL_CUSTCODE_INFO_MESSAGE = "onlineTrans.common.GENERAL_CUSTCODE_INFO_MESSAGE";
	public static final String GENERAL_STATUS_ERROR = "onlineTrans.common.STATUS_ERROR";
	public static final String GENERAL_NOT_FIRST_CALL_ERROR = "onlineTrans.common.NOT_FIRST_CALL_ERROR";
	public static final String GENERAL_NOT_AUTHORIZED_ERROR = "onlineTrans.common.AUTHORIZE_ERROR";
	public static final String GENERAL_MSISDN_NOT_IN_COMPANY_ERROR = "onlineTrans.common.MSISDN_NOT_EXIST_IN_COSTCODE_LIST_ERROR";
	public static final String GENERAL_OPENLINE_BLOCK_MESSAGE1_ERROR = "onlineTrans.common.OPENLINE_BLOCK_MESSAGE1";
	public static final String GENERAL_OPENLINE_BLOCK_MESSAGE2_ERROR = "onlineTrans.common.OPENLINE_BLOCK_MESSAGE2";
	public static final String GENERAL_MESSAGE_REQUEST_ACCEPTED = "onlineTrans.common.MESSAGE_REQUEST_ACCEPTED";
	public static final String GENERAL_MESSAGE_SMS_RETURN = "onlineTrans.common.MESSAGE_SMS_RETURN";
	public static final String GENERAL_ACTIVATION_PROCESS = "1";
	public static final String GENERAL_DEACTIVATION_PROCESS = "0";
	public static final String ONLINE_TRANS_GENERAL_RESOURCE = "onlineTrans";
	public static final String USER_GENERAL_RESOURCE = "user";
	public static final String COMMON_LAYOUT_SUCCESS_SMS_RESULT = "common-layout.success_SMS_Result";
	public static final String GENERAL_STATUS_ACTIVE = "aktif";
	public static final String GENERAL_STATUS_DEACTIVE = "deaktif";
	public static final String GENERAL_STATUS_PENDING = "pending";
	public static final String GENERAL_MAIN_CMD_PARAM = "mainPage";
	public static final String GENERAL_SUB_CMD_PARAM = "subcmd";
	public static final String GENERAL_ACTIVATABLE = "activatable";
	public static final String GENERAL_DEACTIVATABLE = "deactivatable";
	public static final String GENERAL_MESSAGE_TURIST_HATTI_NOTAUTHENTICATED = "onlineTrans.common.GENERAL_MESSAGE_TURIST_HATTI_NOTAUTHENTICATED";
	public static final String GENERAL_KURUMSAL_LOGIN_INFO = "onlineTrans.common.kurumsalnumarasecim.logininfo";

	/*************************** Phase 1 **************************************************************/
	/** Online Transactions Home */
	public static final String ONLINE_TRANSACTIONS_HOME_RESOURCE = "oi_home";
	public static final String ONLINE_TRANSACTIONS_HOME_CMD = "onlineTransactionsHome";
	public static final String ONLINE_TRANSACTIONS_HOME_MSG1 = "onlineTransactionsHome.message1";
	public static final String ONLINE_TRANSACTIONS_HOME_MSG2 = "onlineTransactionsHome.message2";
	public static final String ONLINE_TRANSACTIONS_HOME_FAILED_LOGIN_COUNT = "failedLoginCount";
	public static final String ONLINE_TRANSACTIONS_CAMPAIGNS_RESOURCE = "campaigns";

	/** Bill Detail */
	public static final String BILL_DETAIL_RESOURCE = "billdetail";
	public static final String BILL_DETAIL_CMD = "billDetail";
	public static final String BILL_DETAIL_MAIN_CMD_PARAM = "mainPage";
	public static final String BILL_DETAIL_SUB_CMD_PARAM = "billdetailsubcmd";
	public static final String BILL_DETAIL_SERVICE_STATUS = "serviceStatus";
	public static final String BILL_DETAIL_SERVICE_ACTIVATABLE = "activatable";
	public static final String BILL_DETAIL_SERVICE_DEACTIVATABLE = "deactivatable";
	public static final String BILL_DETAIL_ACTIVATE_PARAM = "activate";
	public static final String BILL_DETAIL_DEACTIVATE_PARAM = "deactivate";
	public static final String BILL_DETAIL_SUCCESS_PARAM = "success";
	public static final String BILL_DETAIL_ALREADY_HAVE_ITEMIZED_BILL_ERROR = "44";
	public static final String BILL_DETAIL_DOES_NOT_HAVE_ITEMIZED_BILL_ERROR = "45";
	public static final String BILL_DETAIL_VALIDATION_ERROR_MESSAGE = "billdetail.validate.retCode";
	public static final String BILL_DETAIL_SMS_VALIDATION_ERROR_MESSAGE = "billdetail.smsvalidate.retCode";

	/** Bill Info **/
	public static final String BILL_INFO_AMOUNT_MESSAGE = "billinfo.current.amount.message";

	/** Contact Detail Constants */
	public static final String CONTACT_DETAILS_RESOURCE = "changeContactDet";
	public static final String CONTACT_DETAILS_CMD = "changeContactDetails";
	public static final String CONTACT_DETAILS_TRIGGER_INPUT = "INPUT";
	public static final String CONTACT_DETAILS_TRIGGER_OUTPUT = "OUTPUT";
	public static final String CONTACT_DETAILS_EMAIL = "email";
	public static final String CONTACT_DETAILS_AREA_CODE = "areaCode";
	public static final String CONTACT_DETAILS_PHONE = "phone";
	public static final String CONTACT_DETAILS_STREET_NAME = "streetName";
	public static final String CONTACT_DETAILS_HOUSE_NUMBER = "houseNum";
	public static final String CONTACT_DETAILS_ZIPCODE = "zipCode";
	public static final String CONTACT_DETAILS_DISTRICT = "district";
	public static final String CONTACT_DETAILS_TOWN = "town";
	public static final String CONTACT_DETAILS_CITY = "city";
	public static final String CONTACT_DETAILS_TOWN_DESC = "townDesc";
	public static final String CONTACT_DETAILS_CITY_DESC = "cityDesc";
	public static final String CONTACT_DETAILS_ACTION_TYPE_PARAMETER = "actionType";
	public static final String CONTACT_DETAILS_ACTION_TYPE_HOMEPAGE = "0";
	public static final String CONTACT_DETAILS_ACTION_TYPE_EMAIL = "1";
	public static final String CONTACT_DETAILS_ACTION_TYPE_PHONE = "2";
	public static final String CONTACT_DETAILS_ACTION_TYPE_ADDRESS = "3";
	public static final String CONTACT_DETAILS_FORM_MSISDN = "msisdn";
	public static final String CONTACT_DETAILS_FORM_CSID = "csId";
	public static final String CONTACT_DETAILS_FORM_ADRSTREET = "AdrStreet";
	public static final String CONTACT_DETAILS_FORM_ADRZIP = "AdrZip";
	public static final String CONTACT_DETAILS_FORM_ADRCITY = "AdrCity";
	public static final String CONTACT_DETAILS_FORM_ADRCNTRCODE = "AdrCntrCode";
	public static final String CONTACT_DETAILS_FORM_ADRNOTE1 = "AdrNote1";
	public static final String CONTACT_DETAILS_FORM_ADRNOTE2 = "AdrNote2";
	public static final String CONTACT_DETAILS_FORM_ADRLOCATION2 = "AdrLocation2";
	public static final String CONTACT_DETAILS_FORM_ADRLNGCODE = "AdrLngCode";
	public static final String CONTACT_DETAILS_FORM_ADRPHNAREA = "AdrPhnArea";
	public static final String CONTACT_DETAILS_FORM_ADRPHN1 = "AdrPhn1";
	public static final String CONTACT_DETAILS_FORM_ADREMAIL = "AdrEmail";
	public static final String CONTACT_DETAILS_CITY_XML_STARTTAG = "<city-list>";
	public static final String CONTACT_DETAILS_CITY_XML_ENDTAG = "</city-list>";
	public static final String CONTACT_DETAILS_PROVINCE_XML_STARTTAG = "<province-list>";
	public static final String CONTACT_DETAILS_PROVINCE_XML_ENDTAG = "</province-list>";
	public static final String CONTACT_DETAILS_MUNICIPALITY_XML_STARTTAG = "<municipality-list>";
	public static final String CONTACT_DETAILS_MUNICIPALITY_XML_ENDTAG = "</municipality-list>";
	public static final String CONTACT_DETAILS_DISTRICT_XML_STARTTAG = "<district-list>";
	public static final String CONTACT_DETAILS_DISTRICT_XML_ENDTAG = "</district-list>";
	public static final String CONTACT_DETAILS_INVALID_AREA_CODE_LENGTH = "changeContactDet.validate.areaCodeLength";
	public static final String CONTACT_DETAILS_INVALID_PHONE = "changeContactDet.validate.phoneLength";
	public static final String CONTACT_DETAILS_INVALID_CITY = "changeContactDet.validate.city";
	public static final String CONTACT_DETAILS_INVALID_TOWN = "changeContactDet.validate.town";
	public static final String CONTACT_DETAILS_INVALID_STREET = "changeContactDet.validate.street";
	public static final String CONTACT_DETAILS_INVALID_VALIDSTREET = "changeContactDet.validate.validStreet";
	public static final String CONTACT_DETAILS_INVALID_STREETNO = "changeContactDet.validate.streetNo";
	public static final String CONTACT_DETAILS_INVALID_DISTRICT = "changeContactDet.validate.district";
	public static final String CONTACT_DETAILS_INVALID_VALIDDISTRICT = "changeContactDet.validate.validdistrict";
	public static final String CONTACT_DETAILS_INVALID_ZIP = "changeContactDet.validate.zip";
	public static final String CONTACT_DETAILS_INVALID_ZIP_NUMBER = "changeContactDet.validate.zip.number";
	public static final String CONTACT_DETAILS_INVALID_ZIP_VALIDNUMBER = "changeContactDet.validate.zip.validnumber";
	public static final String CONTACT_DETAILS_INVALID_PHONE_NUMERIC = "changeContactDet.validate.phone.numeric";
	public static final String CONTACT_DETAILS_VALIDATION_ERROR_MESSAGE = "changeContactDet.validate.retCode";
	public static final String CONTACT_DETAILS_INVALID_ADDRESS_TYPE_ERROR = "87";
	public static final String CONTACT_DETAILS_SMS_SUCCESS_MESSAGE = "changeContactDet.sms.change.success.message";
	public static final String CONTACT_NAME_ENTER = "enter.contactName";
	public static final String CONTACT_SURNAME_ENTER = "enter.contactSurname";
	public static final String CONTACT_PHONE_ENTER = "enter.contactPhone";
	/** Change Language */
	public static final String CHANGE_LANGUAGE_RESOURCE = "changeLanguage";
	public static final String CHANGE_LANGUAGE_CMD = "changeLanguage";
	public static final String LANGUAGE_PARAMETER_NAME = "clanguage";
	public static final String CHANGE_LANGUAGE_RESULT = "resultCode";
	public static final String CHANGE_LANGUAGE_SUCCESS_RESULT = "0";
	public static final String CHANGE_LANGUAGE_POSTPAID_LANG_TAG = "ADR_LNG_CODE";
	public static final String CHANGE_LANGUAGE_PREPAID_LANG_TAG = "LANGUAGEID";
	public static final String CHANGE_LANGUAGE_VALIDATION_ERROR_MESSAGE = "changeLanguage.validate.retCode";
	public static final String CHANGE_LANGUAGE_FIRST_CALL_ERROR = "22";
	public static final String CHANGE_LANGUAGE_INVALID_ADDRESS_TYPE_ERROR = "87";
	public static final String CHANGE_LANGUAGE_INVALID_LANGUAGE_ID_ERROR = "93";
	public static final String CHANGE_LANGUAGE_SAME_LANGUAGE_ID_ERROR = "94";

	/** International */
	public static final String ROAMING_SERVICES_RESOURCE = "roamingservices";
	public static final String ROAMING_SERVICES_CMD = "yurtdisiServisleri";
	public static final String ROAMING_SERVICES_INTERNATIONAL_ALREADY_RECEIVE_ERROR = "46";
	public static final String ROAMING_SERVICES_INTERNATIONAL_ALREADY_DOESNT_RECEIVE_ERROR = "47";
	public static final String ROAMING_SERVICES_INTERNATIONAL_NO_FIRST_BILL_ERROR = "49";
	public static final String ROAMING_SERVICES_INTERNATIONAL_FIRST_BILL_NOT_PAID_ERROR = "50";
	public static final String ROAMING_SERVICES_INTERNATIONAL_NOT_VALID_CONTRACT_ERROR = "61";
	public static final String ROAMING_SERVICES_INTERNATIONAL_NOT_ACTIVE_STATUS_ON_BSCS_ERROR = "69";
	public static final String ROAMING_SERVICES_INTERNATIONAL_NO_INVOICE_PRODUCED_ERROR = "24";
	public static final String ROAMING_SERVICES_INTERNATIONAL_BILL_NOT_PAID_ERROR = "29";
	public static final String ROAMING_SERVICES_INTERNATIONAL_BLACKLISTCUSTOMER_ERROR = "26";
	public static final String ROAMING_SERVICES_INTERNATIONAL_INSTITUTION_ID = "2703";
	public static final String ROAMING_SERVICES_INTERNATIONAL_BRANCH_ID = "907";
	public static final String ROAMING_SERVICES_INTERNATIONAL_TELLER_ID = "907";
	public static final String ROAMING_SERVICES_INTERNATIONAL_USER_ID = "C050595";
	public static final String ROAMING_SERVICES_INTERNATIONAL_DEALERCODE = "907";
	public static final String ROAMING_SERVICES_PREPAID_INSTRUCTION_NOT_EXIST_ERROR = "25";

	public static final String ROAMING_SERVICES_INTERNATIONAL_SMS_VALIDATION_ERROR_MESSAGE = "roamingservices.international.smsvalidate.retCode";
	public static final String ROAMING_SERVICES_INTERNATIONAL_PREPAID_ACTIVATION_MESSAGE = "roamingservices.international.prepaid.activation.message";
	public static final String ROAMING_SERVICES_INTERNATIONAL_VALIDATION_ERROR_MESSAGE = "roamingservices.international.validate.retCode";
	public static final String ROAMING_SERVICES_INTERNATIONAL_VALIDATION_ERROR_MESSAGE_CORPORATE = "roamingservices.international.validate.corporate.retCode";
	public static final String ROAMING_SERVICES_INTERNATIONAL_INVALID_MESSAGE = "roamingservices.international.smsvalidate.invalidkeyword";
	public static final String ROAMING_SERVICES_INTERNATIONAL_SERVICE_STATUS_PARAM = "internationalServiceStatus";
	public static final String ROAMING_SERVICES_INTERNATIONAL_LTE_SERVICE_STATUS_PARAM = "internationalLTEServiceStatus";
	public static final String ROAMING_SERVICES_INTERNATIONAL_CALL_SERVICE_STATUS_PARAM = "internationalCallServiceStatus";
	public static final String ROAMING_SERVICES_TUMDUNYA_PACKAGE_STATUS_PARAM = "tumdunyaPackageStatus";
	public static final String ROAMING_SERVICES_INTERNATIONAL_SMS_PACKAGE_STATUS_PARAM = "internationalSmsPackageStatus";
	public static final String ROAMING_SERVICES_INTERNATIONAL_CALL_SUB_CMD_PARAM = "internationalcallsubcmd";
	public static final String ROAMING_SERVICES_INTERNATIONAL_CALL_ALREADY_RECEIVE_ERROR = "70";
	public static final String ROAMING_SERVICES_INTERNATIONAL_CALL_ALREADY_DOESNT_RECEIVE_ERROR = "71";
	public static final String ROAMING_SERVICES_INTERNATIONAL_CALL_VALIDATION_ERROR_MESSAGE = "roamingservices.internationalCall.validate.retCode";
	public static final String ROAMING_SERVICES_INTERNATIONAL_RESULT = "internationalresult";
	public static final String ROAMING_SERVICES_INTERNATIONAL_LTE_RESULT = "internationalLTEresult";
	public static final String ROAMING_SERVICES_INTERNATIONAL_CALL_RESULT = "internationalcallresult";
	public static final String ROAMING_SERVICES_TUMDUNYA_RESULT = "tumdunyaresult";
	public static final String ROAMING_SERVICES_OPERATION_TYPE_GETALL = "1";
	public static final String ROAMING_SERVICES_OPERATION_TYPE_ACTIVATION = "2";
	public static final String ROAMING_SERVICES_OPERATION_TYPE_DEACTIVATION = "3";
	public static final String ROAMING_SERVICES_INTERNATIONAL_SMS_PACKAGE_RULEID = "110502";
	public static final String ROAMING_SERVICES_ULUSLARARASI_SMS_PAKETI_SNCODE = "831";
	public static final String ROAMING_SERVICES_ULUSLARARASI_SMS_PAKETI_PACK_ID = "963";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_ALREADY_HAVE_FREE_UNIT_ERROR = "169";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_ALREADY_HAVE_SMS_PACKAGE_ERROR = "259";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_KARMA_SMS_PACKAGE_TARIFF_ERROR = "412";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_ALREADY_HAVE_HERYONE180 = "423";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_ALREADY_HAVE_INTERNATIONALSMS = "426";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_HOTLINE_ERROR = "427";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_CANCEL_KARMA_PACKAGE_ERROR = "445";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_TARIFF_ERROR1 = "384";
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_TARIFF_ERROR2 = "123";
	public static final String[] ROAMING_SERVICES_SMS_PACKAGE_PROMO_OTHER_ERROR_LIST = {
			"1", "346", "3", "347", "355", "342", "343", "384", "392", "393",
			"259", "135", "291", "123" };
	public static final String[] ROAMING_SERVICES_SMS_PACKAGE_PROMO_OTHER_ERROR_DEACTIVATION_LIST = {
			"10", "356" };
	public static final String ROAMING_SERVICES_SMS_PACKAGE_PROMO_VALIDATION_ERROR_MESSAGE = "roamingservices.internationalSMS.validate.retCode";

	public static final String ROAMING_SERVICES_ALODUNYA_PACKAGE_STATUS_PARAM = "alodunyaPackageStatus";
	public static final String ROAMING_SERVICES_ALOALMANYA_PACKAGE_STATUS_PARAM = "aloalmanyaPackageStatus";
	public static final String ROAMING_SERVICES_ALOAVRUPA_PACKAGE_STATUS_PARAM = "aloavrupaPackageStatus";
	public static final String ROAMING_SERVICES_ALOAVRUPA_MINI_PACKAGE_STATUS_PARAM = "aloavrupaMiniPackageStatus";
	public static final String ROAMING_SERVICES_ALOAMERIKA_PACKAGE_STATUS_PARAM = "aloamerikaPackageStatus";
	public static final String FREE_UNIT_KIBRIS_PACKAGE_STATUS_PARAM = "kibrisPackageStatus";
	public static final String ROAMING_SERVICES_ALOORTADOGU_STATUS_PARAM = "aloortadoguPackageStatus";
	public static final String ROAMING_SERVICES_ALOORTADOGU_MINI_STATUS_PARAM = "aloortadoguMiniPackageStatus";
	public static final String ROAMING_SERVICES_UMRE360_STATUS_PARAM = "umre360Status";
	public static final String ROAMING_SERVICES_UMRE180_STATUS_PARAM = "umre180Status";
	public static final String ROAMING_SERVICES_UMRE30_STATUS_PARAM = "umre30Status"; // TODO

	/** Lost Stolen */
	public static final String LOST_STOLEN_CMD = "lostStolen";
	public static final String LOST_STOLEN_RESOURCE = "loststolen";
	public static final String LOST_STOLEN_SUB_CMD_PARAM = "loststolensubcmd";
	public static final String LOST_STOLEN_CLOSE_REASON_PARAM = "reason";
	public static final String LOST_STOLEN_ACTIVATE_CMD_PARAM = "activate";
	public static final String LOST_STOLEN_DEACTIVATE_CMD_PARAM = "deactivate";
	public static final String LOST_STOLEN_STATUS = "status";
	public static final String LOST_STOLEN_ACTIVATABLE_PARAM = "activatable";
	public static final String LOST_STOLEN_DEACTIVATABLE_PARAM = "deactivatable";
	public static final String LOST_STOLEN_SUCCESS_PARAM = "success";
	public static final String LOST_STOLEN_MAIN_CMD_PARAM = "mainPage";
	public static final String LOST_STOLEN_LOSTSTOLEN_LOCK_REASON = "0";
	public static final String LOST_STOLEN_REASON_NOT_PROPER_ERROR = "41";
	public static final String LOST_STOLEN_CONTRACT_NOT_SUSPENDED_ERROR = "42";
	public static final String LOST_STOLEN_LINE_NOT_LOCKED_ERROR = "43";
	public static final String LOST_STOLEN_PENDING_ERROR = "51";
	public static final String LOST_STOLEN_ALREADY_DONE_ERROR = "90";
	public static final String LOST_STOLEN_VALIDATION_ERROR_MESSAGE = "loststolen.validate.retCode";

	/** Open Cancel */
	public static final String OPEN_CANCEL_RESOURCE = "opencancel";
	public static final String OPEN_CANCEL_CMD = "openCancelMsisdn";
	public static final String OPEN_CANCEL_SUB_CMD = "opencancelsubcmd";
	public static final String OPEN_CANCEL_SUB_CMD_ACTIVATE = "activate";
	public static final String OPEN_CANCEL_SUB_CMD_DEACTIVATE = "deactivate";
	public static final String OPEN_CANCEL_SUCCESS = "success";
	public static final String OPEN_CANCEL_CMD_MAIN = "mainPage";
	public static final String OPEN_CANCEL_LOST_REASON_CODE = "8";
	public static final String OPEN_CANCEL_STOLEN_REASON_CODE = "9";
	public static final String OPEN_CANCEL_SUSPENSIONFORCANCELLATION_REASON_CODE = "60";
	public static final String OPEN_CANCEL_SUSPENSIONFORCANCELLATION_LOCK_REASON = "1";
	public static final String OPEN_CANCEL_SUSPENSIONFORHIGHTRAFFIC_LOCK_REASON = "2";
	public static final String OPEN_CANCEL_BY_CUSTOMER_REQUEST_LOCK_REASON = "5";
	public static final String OPEN_CANCEL_BY_CUSTOMER_REQUEST_LOCK_REASON_LOCK = "1";
	public static final String OPEN_CANCEL_BY_CUSTOMER_REQUEST_LOCK_REASON_UNLOCK = "3";
	public static final String OPEN_CANCEL_OPENABLE = "openable";
	public static final String OPEN_CANCEL_OPENABLE_VALUE = "1";
	public static final String OPEN_CANCEL_CLOSEABLE_VALUE = "2";
	public static final String OPEN_CANCEL_REASON_NOT_PROPER_ERROR = "41";
	public static final String OPEN_CANCEL_CONTRACT_NOT_SUSPENDED_ERROR = "42";
	public static final String OPEN_CANCEL_LINE_NOT_LOCKED_ERROR = "43";
	public static final String OPEN_CANCEL_PENDING_ERROR = "51";
	public static final String OPEN_CANCEL_ALREADY_DONE_ERROR = "90";
	public static final String OPEN_CANCEL_VALIDATION_ERROR_MESSAGE = "opencancel.validate.retCode";
	public static final String OPEN_CANCEL_LINE_STATUS_ERROR_MESSAGE = "opencancel.info.deactivation_for_suspended";
	public static final String OPEN_CANCEL_CREATE_SIEBEL_SR_SERVICE = "com.avea.asb.VT.providerCC2/ProxyServices/CreateSRRetention_PS";

	/** PUK INFO */
	public static final String PUK_RESOURCE = "puk";
	public static final String PUK_CMD = "showPuk";
	public static final String PUK_PUK1_TAG = "PUK";
	public static final String PUK_PUK2_TAG = "PUK2";
	public static final String PUK_FORM_PUK1 = "puk1";
	public static final String PUK_FORM_PUK2 = "puk2";
	public static final String PUK_SHOW_PWD = "showPwd";
	/************************************************************************************************/

	/*************************** Phase 2 **************************************************************/
	/** RoamingEnabling */

	public static final String ROAMING_ENABLING_SMS_FAIL_MESSAGE = "roamingEnabling.smsvalidate.failed";
	public static final String ROAMING_ENABLING_NOTPREPAID = "2";
	public static final String ROAMING_ENABLING_NOTPREPAID_MESSAGE = "roamingEnabling.smsvalidate.notprepaid";
	public static final String ROAMING_ENABLING_NOTPOSTPAID = "1";
	public static final String ROAMING_ENABLING_NOTPOSTPAID_MESSAGE = "roamingEnabling.smsvalidate.notpostpaid";
	public static final String ROAMING_ENABLING_NOTACTIVESTATUS = "3";
	public static final String ROAMING_ENABLING_NOTACTIVESTATUS_MESSAGE = "roamingEnabling.smsvalidate.notactivestatus";
	public static final String ROAMING_ENABLING_INTERNATIONALCALL = "70";
	public static final String ROAMING_ENABLING_INTERNATIONALCALL_MESSAGE = "roamingEnabling.smsvalidate.internationalcall";
	public static final String ROAMING_ENABLING_UNDEFINEDERROR = "9999";
	public static final String ROAMING_ENABLING_VALIDATIONCALL = "9998";
	public static final String ROAMING_ENABLING_NOTMASSTARIFF = "9";
	public static final String ROAMING_ENABLING_NOTMASSTARIFF_MESSAGE = "roamingEnabling.smsvalidate.notmasstariff";
	public static final String ROAMING_ENABLING_HIGHTRAFFICUSAGE = "10";
	public static final String ROAMING_ENABLING_NOTCORPORATETARIFF = "62";
	public static final String ROAMING_ENABLING_NOTCORPORATETARIFF_MESSAGE = "roamingEnabling.smsvalidate.notcorporatetariff";
	public static final String ROAMING_ENABLING_NOTSMETARIFF = "63";
	public static final String ROAMING_ENABLING_NOTSMETARIFF_MESSAGE = "roamingEnabling.smsvalidate.notsmetariff";
	public static final String ROAMING_ENABLING_INVALIDTARIFFTYPE = "65";
	public static final String ROAMING_ENABLING_INTERNATIONALCALL_INVALID_MESSAGE = "roamingEnabling.smsvalidate.invalidkeyword";
	public static final String ROAMING_ENABLING_JURIDICAL_MESSAGE = "roamingEnabling.smsvalidate.juridical";
	public static final String ROAMING_ENABLING_NOTAUTH_BIMCELL = "610";
	public static final String ROAMING_ENABLING_NOTAUTH_BIMCELL_MESSAGE = "roamingEnabling.smsvalidate.NotAuthBimcell";

	/** Change Tariff */
	public static final String CHANGE_TARIFF_RESOURCE = "changeTariff";
	public static final String CHANGE_TARIFF_CMD = "changeTariff";
	public static final String CHANGE_TARIFF_INVALID_PERIOD_ERROR_PREPAID = "4";
	public static final String CHANGE_TARIFF_UNABLE_TO_CHANGE_TARIFF_ERROR_PREPAID = "14";
	public static final String CHANGE_TARIFF_NOT_ENOUGH_CREDIT_ERROR = "15";
	public static final String CHANGE_TARIFF_NOT_FIRST_CALL_ERROR = "22";
	public static final String CHANGE_TARIFF_INVALID_CHANGE_TYPE_ERROR = "40";
	public static final String CHANGE_TARIFF_NOT_FIRST_BILL_ERROR_PREPAID = "49";
	public static final String CHANGE_TARIFF_INVALID_RATE_PLAN_CODE_ERROR = "84";
	public static final String CHANGE_TARIFF_SAME_TARIFF_ID_ERROR_PREPAID = "96";

	public static final String CHANGE_TARIFF_UNABLE_TO_CHANGE_TARIFF_ERROR = "500";
	public static final String CHANGE_TARIFF_ONLY_PREPAID_ERROR = "501";
	public static final String CHANGE_TARIFF_ONLY_ACTIVE_ERROR = "502";
	public static final String CHANGE_TARIFF_SAME_TARIFF_ID_ERROR = "503";
	public static final String CHANGE_TARIFF_HIGH_TRAFFIC_ERROR = "504";
	public static final String CHANGE_TARIFF_NOT_FIRST_BILL_ERROR = "505";
	public static final String CHANGE_TARIFF_KAMU_DOCUMENT_ERROR = "506";
	public static final String CHANGE_TARIFF_ONLY_MASS_ERROR = "507";
	public static final String CHANGE_TARIFF_ONLY_CORP_ERROR = "508";
	public static final String CHANGE_TARIFF_PLATINUM_ERROR = "509";
	public static final String CHANGE_TARIFF_NOT_PLATINUM_ERROR = "510";
	public static final String CHANGE_TARIFF_CORP_ERROR = "511";
	public static final String CHANGE_TARIFF_SME_ERROR = "512";
	public static final String CHANGE_TARIFF_NOT_GPO_ERROR = "513";
	public static final String CHANGE_TARIFF_NOT_DATA_LINE_ERROR = "514";
	public static final String CHANGE_TARIFF_NOT_VOICE_LINE_ERROR = "515";
	public static final String CHANGE_TARIFF_INVALID_PERIOD_ERROR = "516";
	public static final String CHANGE_TARIFF_HIGH_TRAFFIC_ERROR2 = "517";
	public static final String CHANGE_TARIFF_UNABLE_TO_CHANGE_TARIFF_ERROR2 = "518";
	public static final String CHANGE_TARIFF_INVALID_CAMPAIGN_ERROR2 = "519";
	public static final String CHANGE_TARIFF_FREE_UNIT_ERROR = "520";
	public static final String CHANGE_TARIFF_INVALID_SERVICES_ERROR = "521";
	public static final String CHANGE_TARIFF_INVALID_PRICE_GROUP_ERROR = "522";
	public static final String CHANGE_TARIFF_DELETED_SERVICES_ERROR = "523";
	public static final String CHANGE_TARIFF_INVALID_TARIFF_PROCEGROUP_ERROR = "524";
	public static final String CHANGE_TARIFF_INVALID_TARIFF_FOR_KAMU_CHANGE_ERROR = "525";
	public static final String CHANGE_TARIFF_INVALID_PERIOD_PREPAID_ERROR = "16";
	public static final String CHANGE_TARIFF_IWIS_CHANGE_COST_TAG = "CHANGECOST";
	public static final String CHANGE_TARIFF_TARIFFID = "newTariff";
	public static final String CHANGE_TARIFF_CURRENT_TARIFFID = "currentTariffId";
	public static final String CHANGE_TARIFF_CHARGE_DATE = "chargeDate";
	public static final String CHANGE_TARIFF_CHANGE_COST = "changeCost";
	public static final String CHANGE_TARIFF_CHANGE_COST_EXIST = "changeCostExist";
	public static final String CHANGE_TARIFF_SHOW_PWD = "showPwd";
	public static final String CHANGE_TARIFF_GROUP_MSISDN = "groupMsisdn";
	public static final String CHANGE_TARIFF_TYPE = "type";
	public static final String CHANGE_TARIFF_TYPE_REQUEST = "changeRequest";
	public static final String CHANGE_TARIFF_TYPE_CHANGE = "changeTariff";
	public static final String CHANGE_TARIFF_CURRENT_TARIFFNAME = "currentTariffName";
	public static final String CHANGE_TARIFF_TOPLANGEL_TARIFF = "ToplanGel";
	public static final String CHANGE_TARIFF_INVALID_TARIFF_ID = "changeTariff.validate.tariffID";
	public static final String CHANGE_TARIFF_VALIDATION_ERROR_MESSAGE = "changeTariff.validate.retCode";
	public static final String CHANGE_TARIFF_SMS_VALIDATION_ERROR_MESSAGE = "changeTariff.smsvalidate.retCode";
	public static final String CHANGE_TARIFF_SMS_CHECK_SMS_TEXT_MESSAGE = "changeTariff.smsvalidate.check.sms.text";
	public static final String CHANGE_TARIFF_POSTPAID_INFO = "changeTariff.TARIFF_CHANGE_INFO_POSTPAID";
	public static final String CHANGE_TARIFF_CORPORATE_INFO = "changeTariff.TARIFF_CHANGE_INFO_CORPORATE";
	public static final String CHANGE_TARIFF_PREPAID_INFO = "changeTariff.TARIFF_CHANGE_INFO_PREPAID";
	public static final String CHANGE_TARIFF_FREE_MSG = "changeTariff.TARIFF_CHANGE_INFO_FREE";
	public static final String CHANGE_TARIFF_REQUEST_ACCEPTED = "changeTariff.TARIFF_CHANGE_REQUEST_ACCEPTED";
	public static final String CHANGE_TARIFF_REQUEST_ERROR = "changeTariff.TARIFF_CHANGE_REQUEST_ERROR";
	public static final String CHANGE_TARIFF_HERYONESINIRSIZ_INFO_MESSAGE = "changeTariff.CHANGE_TARIFF_HERYONESINIRSIZ_INFO_MESSAGE";
	public static final String CHANGE_TARIFF_HERYONESINIRSIZ_FAIL_MESSAGE = "changeTariff.CHANGE_TARIFF_HERYONESINIRSIZ_FAIL_MESSAGE";
	public static final String CHANGE_TARIFF_HERYONESINIRSIZ_SMS_PREPAID_MESSAGE = "changeTariff.CHANGE_TARIFF_HERYONESINIRSIZ_SMS_PREPAID_MESSAGE";
	public static final String CHANGE_TARIFF_HERYONESINIRSIZ_SMS_CORP_SME_FAIL_MESSAGE = "changeTariff.CHANGE_TARIFF_HERYONESINIRSIZ_SMS_CORP_SME_FAIL_MESSAGE";
	public static final String CHANGE_TARIFF_HERYONESINIRSIZ_SOURCE_NO = "6363";
	public static final String CHANGE_TARIFF_HERYONESINIRSIZ_SMSCHANNEL_FAIL_MESSAGE = "changeTariff.CHANGE_TARIFF_HERYONESINIRSIZ_SMSCHANNEL_FAIL_MESSAGE";
	public static final String CHANGE_TARIFF_TARIFFS_XML_STARTTAG = "<tariff-list>";
	public static final String CHANGE_TARIFF_TARIFFS_XML_ENDTAG = "</tariff-list>";
	public static final String CHANGE_TARIFF_BULK_TARIFFS_XML_STARTTAG = "<bulktariff-list>";
	public static final String CHANGE_TARIFF_BULK_TARIFFS_XML_ENDTAG = "</bulktariff-list>";
	public static final String CHANGE_TARIFF_CURRENT_TARIFF_XML_STARTTAG = "<current-tariff>";
	public static final String CHANGE_TARIFF_CURRENT_TARIFF_XML_ENDTAG = "</current-tariff>";
	public static final String CHANGE_TARIFF_CURRENT_TARIFF_NAME_XML_STARTTAG = "<tariff-name>";
	public static final String CHANGE_TARIFF_CURRENT_TARIFF_NAME_XML_ENDTAG = "</tariff-name>";
	public static final String CHANGE_TARIFF_CURRENT_TARIFF_ID_XML_STARTTAG = "<tariff-id>";
	public static final String CHANGE_TARIFF_CURRENT_TARIFF_ID_XML_ENDTAG = "</tariff-id>";
	public static final String CHANGE_TARIFF_MOBILOGRENCI_INFORMATION_MESSAGE = "changeTariff.MOBILOGRENCI_INFORMATION_MESSAGE";
	public static final String CHANGE_TARIFF_MOBILOGRENCI_POSTPAID_ERROR_MESSAGE = "changeTariff.MOBILOGRENCI_POSTPAID_ERROR_MESSAGE";
	public static final String CHANGE_TARIFF_80LER_TARIFF_SHORT_NUMBER = "8080";
	public static final String CHANGE_TARIFF_80LER_TARIFF_SMS_CHECK_SMS_TEXT_MESSAGE = "changeTariff.smsvalidate.80lerTariff.check.sms.text";
	public static final String CHANGE_TARIFF_80LER_TARIFF_CHANGE_SUCCESS_MESSAGE = "changeTariff.smsvalidate.80lerTariff.success.message";

	/** E-Bill Subscription- Unsubscription */
	public static final String E_BILL_RESOURCE = "eBill";
	public static final String E_BILL_CMD = "eBillSubsUnsubs";
	public static final String E_BILL_SUBSCRIPTION_PROCESS = "1";
	public static final String E_BILL_UNSUBSCRIPTION_PROCESS = "0";
	public static final String E_BILL_HAS_ALREADY_SUBSCRIPTION_ERROR = "11";
	public static final String E_BILL_DOESNT_HAVE_SUBSCRIPTION_ERROR = "12";
	public static final String E_BILL_CONTRACT_SUSPENDED_ERROR = "39";
	public static final String E_BILL_EMAIL = "email";
	public static final String E_BILL_EMAIL_EXIST = "emailExist";
	public static final String E_BILL_PROCESS_TYPE = "processType";
	public static final String E_BILL_SUB_CMD_PARAM = "ebillsubcmd";
	public static final String E_BILL_PAYMENT_CUSTCODE = "paymentCustCode";
	public static final String E_BILL_ALREADY_SUBSCRIBER = "isAlreadySubscriber";
	public static final String E_BILL_SUCCESS_SUBS = "successSubs";
	public static final String E_BILL_SUCCESS_UNSUBS = "successUnsubs";
	public static final String INVALID_EMAIL = "eBill.validate.email";
	public static final String EMPTY_EMAIL = "eBill.validate.empty.email";
	public static final String E_BILL_INVALID_PROCESS_TYPE = "eBill.validate.processType";
	public static final String E_BILL_VALIDATION_ERROR_MESSAGE = "eBill.validate.retCode";
	public static final String E_BILL_SMS_VALIDATION_ERROR_MESSAGE = "eBill.smsvalidate.retCode";
	public static final String E_BILL_SMS_DEACTIVATION_SUCCESS_MESSAGE = "eBill.sms.deactivation.success.message";
	public static final String E_BILL_SMS_ACTIVATION_SUCCESS_MESSAGE = "eBill.sms.activation.success.message";
	public static final String E_BILL_PAYMENT_RESPONSIBLE_NOT_EXIST_MESSAGE = "eBill.payment.responsible.not.exist.message";
	public static final String E_BILL_INVALID_KEYWORD_MSG = "eBill.INVALID_KEYWORD_MSG";
	public static final String E_BILL_INVALID_EMAIL_MSG = "eBill.INVALID_EMAIL_MSG";
	public static final String E_BILL_DEACTIVATION_CMD = "eBillDeactivation";
	public static final String E_BILL_ACTIVATION_CMD = "eBillActivation";
	public static final String E_BILL_PAYMENT_RESPONSIBLE_XML_STARTTAG = "<paymentResponsibles>";
	public static final String E_BILL_PAYMENT_RESPONSIBLE_XML_ENDTAG = "</paymentResponsibles>";
	public static final String E_BILL_DEACTIVATE_FREE_MSG_SOURCE = "3007";
	public static final String E_BILL_REACTIVATE_FREE_MSG_SOURCE = "3008";
	public static final String E_MAIL_CHANGE_FREE_MSG_SOURCE = "3006";
	public static final String E_BILL_EMAIL_UPDATE_SUCCESS = "eBill.email.update.success";
	public static final String E_BILL_EMAIL_UPDATE_FAIL = "eBill.email.update.fail";
	public static final String E_BILL_EMAIL_ADDRESS_TAG = "ADR_EMAIL";
	public static final String DEFAULT_TYPE_HEADER = "headerTypesPermission";

	/** PaymentInfo */
	public static final String PAYMENT_INFO_RESOURCE = "paymentInfo";
	public static final String PAYMENT_INFO_CMD = "paymentInfo";
	public static final String PAYMENT_INFO_PAID_STATUS = "1";
	public static final String PAYMENT_INFO_UNPAID_STATUS = "0";
	public static final String PAYMENT_INFO_NUMBER_OF_RECORDS = "5";
	public static final String PAYMENT_INFO_NUMBER_OF_SIXTH_RECORD = "1";
	public static final String PAYMENT_INFO_BLACKLIST_CUSTOMER_ERROR = "26";
	public static final String PAYMENT_INFO_BILL_NOT_EXIST_ERROR = "36";
	public static final String PAYMENT_INFO_VALIDATION_ERROR_MESSAGE = "paymentInfo.validate.retCode";
	public static final String PAYMENT_INFO_VALIDATION_NO_UNPAID_BILL_ERROR_MESSAGE = "paymentInfo.validate.no_unpaid_bill";
	public static final String PAYMENT_INFO_SUB_CMD_PARAM = "paymentInfosubcmd";
	public static final String PAYMENT_INFO_MAIN_CMD_PARAM = "mainPage";

	/** ADVERTISEMENT */
	public static final String ADVERTISEMENT_RESOURCE = "advertisement";
	public static final String ADVERTISEMENT_CMD = "advertisement";
	public static final String ADVERTISEMENT_BROADCASTSMS_RESULT = "broadcastsmsresult";
	public static final String ADVERTISEMENT_THIRDPARTYSMS_RESULT = "thirdpartysmsresult";
	public static final String ADVERTISEMENT_OUTBOUBDIVR_RESULT = "outboundivrresult";
	public static final String MICROPAYMENT = "MICROPAYMENT";
	public static final String MICROPAYMENT_VAL = "microPaymentVal";

	public static final String AVEA_SMS_ACTIVATE = "AVEA_SMS_ACTIVATE";
	public static final String AVEA_SMS_DEACTIVATE = "AVEA_SMS_DE_ACTIVATE";
	public static final String AVEA_CALL_CLIENT_ACTIVATE = "AVEA_CALL_CLIENT_ACTIVATE";
	public static final String AVEA_CALL_CLIENT_DEACTIVATE = "AVEA_CALL_CLIENT_DEACTIVATE";
	public static final String AVEA_EMAIL_ADV_ACTIVATE = "AVEA_EMAIL_ADV_ACTIVATE";
	public static final String AVEA_EMAIL_ADV_DEACTIVATE = "AVEA_EMAIL_ADV_DEACTIVATE";

	public static final String AVEA_MMS_ACTIVATE = "AVEA_MMS_ACTIVATE";
	public static final String AVEA_MMS_DEACTIVATE = "AVEA_MMS_DEACTIVATE";
	public static final String AVEA_SIM_ACTIVATE = "AVEA_SIM_ACTIVATE";
	public static final String AVEA_SIM_DEACTIVATE = "AVEA_SIM_DEACTIVATE";

	/** Email Adv */
	public static final String ADVERTISEMENT_EMAIL_RESULT = "advemailresult";
	public static final String ADVERTISEMENT_EMAIL_DEACTIVE = "advemaildeactive";

	/** BroadcastSms */
	public static final String BROADCAST_SMS_GETSTATE_COMMAND = "getstate";
	public static final String BROADCAST_SMS_DEACTIVE = "broadcastsmsdeactive";
	public static final String BROADCAST_SMS_SUCCESS_ACTIVATE = "successActivation";
	public static final String BROADCAST_SMS_SUCCESS_DEACTIVATE = "successDeactivation";
	public static final String BROADCAST_SMS_ALREADY_RECEIVE_ERROR = "17";
	public static final String BROADCAST_SMS_ALREADY_DOESNT_RECEIVE_ERROR = "18";
	public static final String BROADCAST_SMS_LINE_TYPE_ERROR = "38";
	public static final String BROADCAST_SMS_VALIDATION_ERROR_MESSAGE = "advertisement.broadcastSms.validate.retCode";

	public static final String BROADCAST_MMS = "broadcastmms";
	public static final String BROADCAST_SIM = "broadcastsim";

	/** ThirdPartySMS */
	public static final String THIRD_PARTY_SMS_RESOURCE = "thirdPartySms";
	public static final String THIRD_PARTY_SMS_DEACTIVE = "thirdPartysmsdeactive";
	public static final String THIRD_PARTY_SMS_SUCCESS_ACTIVATE = "successActivation";
	public static final String THIRD_PARTY_SMS_SUCCESS_DEACTIVATE = "successDeactivation";
	public static final String THIRD_PARTY_SMS_ALREADY_RECEIVE_ERROR = "79";
	public static final String THIRD_PARTY_SMS_ALREADY_DOESNT_RECEIVE_ERROR = "80";
	public static final String THIRD_PARTY_SMS_LINE_TYPE_ERROR = "38";
	public static final String THIRD_PARTY_SMS_VALIDATION_ERROR_MESSAGE = "advertisement.thirdPartySms.validate.retCode";

	/** International Package */
	public static final String INTERNATIONAL_PACKAGE_CMD = "internationalPackage";
	public static final String INTERNATIONAL_PACKAGE_RESOURCE = "internationalPackage";
	public static final String INTERNATIONAL_PACKAGE_ACTIVATION_PROCESS = "1";
	public static final String INTERNATIONAL_PACKAGE_DEACTIVATION_PROCESS = "0";
	public static final String INTERNATIONAL_PACKAGE_DEACTIVE = "deactive";
	public static final String INTERNATIONAL_PACKAGE_NOT_ENOUGH_CONTOUR_ERROR = "15";
	public static final String INTERNATIONAL_PACKAGE_ALREADY_RECEIVE_ERROR = "105";
	public static final String INTERNATIONAL_PACKAGE_ALREADY_DOESNT_RECEIVE_ERROR = "106";
	public static final String INTERNATIONAL_PACKAGE_NOT_ENOUGH_CONTOUR2_ERROR = "107";
	public static final String INTERNATIONAL_PACKAGE_SUCCESS_ACTIVATE = "successActivation";
	public static final String INTERNATIONAL_PACKAGE_SUCCESS_DEACTIVATE = "successDeactivation";
	public static final String INTERNATIONAL_PACKAGE_VALIDATION_ERROR_MESSAGE = "internationalPackage.validate.retCode";
	public static final String INTERNATIONAL_RESULT = "internationalresult";

	/** Call Detail Request */
	public static final String CALL_DETAILS_REQUEST_CMD = "callDetails";
	public static final String CALL_DETAIL_PERIOD = "detailPeriod";
	public static final String CALL_DETAIL_RESOURCE = "callDetailRequest";
	public static final String CALL_DETAIL_INVALID_PERIOD = "callDetailRequest.validate.period";
	public static final String CALL_DETAIL_DATERANGES_XML_STARTTAG = "<dateranges>";
	public static final String CALL_DETAIL_DATERANGES_XML_ENDTAG = "</dateranges>";
	public static final String CALL_DETAIL_DATERANGE_XML_STARTTAG = "<daterange>";
	public static final String CALL_DETAIL_DATERANGE_XML_ENDTAG = "</daterange>";
	public static final String CALL_DETAIL_DATERANGEITEM_XML_STARTTAG = "<daterangeitem>";
	public static final String CALL_DETAIL_DATERANGEITEM_XML_ENDTAG = "</daterangeitem>";

	/** SuspiciousContacts */
	public static final String SUSPICIOUS_CONTACTS_RESOURCE = "suspiciousContacts";
	public static final String SUSPICIOUS_CONTACTS_REFERER_ACTION = "refererAction";
	public static final String SUSPICIOUS_CONTACTS_TRANSACTION_ID = "transactionId";
	public static final String SUSPICIOUS_CONTACTS_EMPTY_CONTACTS = "suspiciousContacts.validate.contacts";
	public static final String SUSPICIOUS_CONTACTS_EMPTY_CONTACT_AREAS = "suspiciousContacts.validate.contactsArea";
	public static final String SUSPICIOUS_CONTACTS_INVALID_CONTACTS = "suspiciousContacts.validate.contact";
	public static final String SUSPICIOUS_CONTACTS_INVALID_CONTACT_AREAS = "suspiciousContacts.validate.contactArea";
	public static final String SUSPICIOUS_CONTACTS_NOTNUMERIC = "suspiciousContacts.validate.numeric";
	public static final String SUSPICIOUS_CONTACTS_SAME_CONTACTS = "suspiciousContacts.validate.samecontacts";
	public static final String SUSPICIOUS_CONTACTS_STATUS_MESSAGE = "suspiciousContacts.status.message";

	/** E-Bill Copy Request */
	public static final String EBILL_COPY_REQUEST_CMD = "eBillCopy";
	public static final String EBILL_COPY_PERIOD = "eBillCopyPeriod";
	public static final String EBILL_COPY_RESOURCE = "eBillCopyRequest";
	public static final String EBILL_COPY_INVALID_EMAIL = "eBillCopyRequest.validate.email";
	public static final String EBILL_COPY_INVALID_PERIOD = "eBillCopyRequest.validate.period";
	public static final String EBILL_COPY_DATERANGES_XML_STARTTAG = "<dateranges>";
	public static final String EBILL_COPY_DATERANGES_XML_ENDTAG = "</dateranges>";
	public static final String EBILL_COPY_DATERANGE_XML_STARTTAG = "<daterange>";
	public static final String EBILL_COPY_DATERANGE_XML_ENDTAG = "</daterange>";
	public static final String EBILL_COPY_DATERANGEITEM_XML_STARTTAG = "<daterangeitem>";
	public static final String EBILL_COPY_DATERANGEITEM_XML_ENDTAG = "</daterangeitem>";
	public static final String EBILL_COPY_EMAIL = "email";
	public static final String EBILL_COPY_EMAIL_TAG = "ADR_EMAIL";
	public static final String EBILL_COPY_VALIDATION_ERROR_MESSAGE = "eBillCopy.validate.retCode";
	public static final String EBILL_COPY_SME_OR_CORPORATE_ERROR = "83";

	/** Credit Card Entry */
	public static final String CREDIT_CARD_CMD = "creditCardEntry";
	public static final String CREDIT_CARD_RESOURCE = "creditCardEntry";
	public static final String CREDIT_CARD_CREDIT_CARD_NO = "creditCardNo";
	public static final String CREDIT_CARD_CVC_NO = "cvcNo";
	public static final String CREDIT_CARD_EXPIRE_MONTH = "expireMonth";
	public static final String CREDIT_CARD_EXPIRE_YEAR = "expireYear";
	public static final String CREDIT_CARD_INFO_OBJECT = "creditCardObject";
	public static final String CREDIT_CARD_BANK_CODE = "1064";
	public static final String CREDIT_CARD_TYPE = "1";
	public static final String CREDIT_CARD_VISA_BRAND_SEPARATOR = "4";
	public static final String CREDIT_CARD_MASTER_BRAND_SEPARATOR_LIST = "51,52,53,54,55";
	public static final String CREDIT_CARD_VISA_BRAND = "1";
	public static final String CREDIT_CARD_MASTER_BRAND = "2";
	public static final String CREDIT_CARD_DUMMY_USER_NAME = "NAME SURNAME";
	public static final String CREDIT_CARD_INFO_HEADER_MESSAGE = "creditCardHeaderMessage";
	public static final String CREDIT_CARD_INFO_FOOTER_MESSAGE = "creditCardFooterMessage";
	public static final String CREDIT_CARD_INFO_BLACKLIST_MESSAGE = "creditCardBlacklistMessage";
	public static final String CREDIT_CARD_INVALID_CARD_NO = "creditCardEntry.validate.creditCardNo";
	public static final String CREDIT_CARD_INVALID_CVC_NO = "creditCardEntry.validate.cvcNo";

	/** Prepaid Reload */
	public static final String PREPAID_RELOAD_CMD = "prepaidReload";
	public static final String PREPAID_RELOAD_RESOURCE = "prepaidReload";
	public static final String PREPAID_RELOAD_NEW_CREDIT_CARD = "otherCreditCard";
	public static final String PREPAID_RELOAD_COUNTER = "counter";
	public static final String PREPAID_RELOAD_SHOW_COUNTER = "showCounter";
	public static final String PREPAID_RELOAD_MASKED_CREDIT_CARD_NO = "maskedCreditCardNumber";
	public static final String PREPAID_RELOAD_PROCESS_NAME = "sch:PrepaidReloadValidationProcessResponse";
	public static final String PREPAID_RELOAD_NOT_ENOUGH_CALL_ERROR = "22";
	public static final String PREPAID_RELOAD_INVALID_CREDIT_CARD_ERROR = "23";
	public static final String PREPAID_RELOAD_ACTIVE_INSTRUCTION_NOT_EXIST_ERROR = "25";
	public static final String PREPAID_RELOAD_SUBSCRIPTION_BLACKLIST_ERROR = "26";
	public static final String PREPAID_RELOAD_MONTHLIMIT_EXCEEDED_ERROR = "27";
	public static final String PREPAID_RELOAD_CREDIT_CARD_BLACKLIST_ERROR = "30";
	public static final String PREPAID_RELOAD_DAYLIMIT_EXCEEDED_ERROR = "33";
	public static final String PREPAID_RELOAD_WEEKLIMIT_EXCEEDED_ERROR = "34";
	public static final String PREPAID_RELOAD_DEFINE_CREDIT_CARD_WEEKLIMIT_EXCEEDED_ERROR = "35";
	public static final String PREPAID_RELOAD_BANK_ERROR = "56";
	public static final String PREPAID_RELOAD_TRANSACTION_LIMIT_EXCEEDED_ERROR = "57";
	public static final String PREPAID_RELOAD_MONTHLY_MSISDN_LIMIT_EXCEEDED_ERROR = "66";
	public static final String PREPAID_RELOAD_WEEKLY_MSISDN_LIMIT_EXCEEDED_ERROR = "74";
	public static final String PREPAID_RELOAD_MISSING_INFORMATION_ERROR = "75";
	public static final String PREPAID_RELOAD_DAYLY_MSISDN_LIMIT_EXCEEDED_ERROR = "76";
	public static final String PREPAID_RELOAD_INSTRUCTION_DAY_LIMIT = "1000";
	public static final String PREPAID_RELOAD_INSTRUCTION_WEEK_LIMIT = "2000";
	public static final String PREPAID_RELOAD_INSTRUCTION_MONTH_LIMIT = "3000";
	public static final String PREPAID_RELOAD_NO_INSTRUCTION_DAY_LIMIT = "100";
	public static final String PREPAID_RELOAD_NO_INSTRUCTION_WEEK_LIMIT = "100";
	public static final String PREPAID_RELOAD_NO_INSTRUCTION_MONTH_LIMIT = "100";
	public static final String PREPAID_RELOAD_NO_INSTRUCTION_COUNTER = "100";
	public static final String PREPAID_RELOAD_COUNTERS_XML_STARTTAG = "<counter-list>";
	public static final String PREPAID_RELOAD_COUNTERS_XML_ENDTAG = "</counter-list>";
	public static final String PREPAID_RELOAD_VALIDATION_ERROR_MESSAGE = "prepaidReload.validate.retCode";
	public static final String PREPAID_RELOAD_WARNING_TITLE = "prepaidReload.warningTitle";
	public static final String PREPAID_RELOAD_FOOTER_TITLE = "prepaidReload.footerTitle";
	public static final String PREPAID_RELOAD_MESSAGE_SUCCESS1 = "prepaidReload.MESSAGE_SUCCESS1";
	public static final String PREPAID_RELOAD_MESSAGE_SUCCESS2 = "prepaidReload.MESSAGE_SUCCESS2";
	public static final String TRX_NAME_3DSECURE = "3DSECURE";
	public static final String SOURCE_NAME_3DSECURE = "WEB_CHANNEL";
	public static final String PREPAID_RELOAD_BANK_NAME = "bankName";
	public static final String PREPAID_RELOAD_OPERATION = "operation";
	public static final String PREPAID_RELOAD_OID = "oid";
	public static final String PREPAID_RELOAD_DESTMSISDN = "destMsisdn";
	public static final String PREPAID_RELOAD_DESTTYPE = "destType";
	public static final String PREPAID_RELOAD_MSISDN_CHANGED_IN_ONE_MONTH = "1";

	public static final String NONSEGMENT = "N";
	public static final String BRONZSEGMENT = "BR";
	public static final String SILVERSEGMENT = "SI";
	public static final String PLATINIUMSEGMENT = "PL";
	public static final String GOLDSEGMENT = "GO";
	public static final String PRIMESEGMENT = "prime";

	/** Threshold Reload */
	public static final String THRESHOLD_RELOAD_CMD = "thresholdReload";
	public static final String THRESHOLD_RELOAD_RESOURCE = "thresholdReload";
	public static final String THRESHOLD_RELOAD_PROCESS_TYPE = "processType";
	public static final String THRESHOLD_RELOAD_TRANSACTION = "transaction";
	public static final String THRESHOLD_RELOAD_COUNTER_UNIT = "counterUnit";
	public static final String THRESHOLD_RELOAD_THRCOUNTER_UNIT = "thrCounterUnit";
	public static final String THRESHOLD_RELOAD_RELOAD_DAY = "reloadDay";
	public static final String THRESHOLD_RELOAD_ORDER_TYPE_PARAM = "orderType";
	public static final String THRESHOLD_RELOAD_PROCESS_ACTIVATE = "activate";
	public static final String THRESHOLD_RELOAD_PROCESS_DEACTIVATE = "deactivate";
	public static final String THRESHOLD_RELOAD_ACTIVE_INSTRUCTION_NOT_EXIST_ERROR = "25";
	public static final String THRESHOLD_RELOAD_ALREADY_ACTIVATED_ERROR = "233";
	public static final String SR_THRESHOLD_RELOAD_ALREADY_ACTIVATED_ERROR = "233";
	public static final String DR_THRESHOLD_RELOAD_ALREADY_ACTIVATED_ERROR = "233";
	public static final String THRESHOLD_RELOAD_VTHR_ORDER_TYPE = "10";
	public static final String THRESHOLD_RELOAD_DR_ORDER_TYPE = "11";
	public static final String THRESHOLD_RELOAD_SR_ORDER_TYPE = "12";
	public static final String THRESHOLD_RELOAD_ACTIVATION_PROCESS_NAME = "sch:PrepaidThresholdReloadActivationValidationProcessResponse";
	public static final String THRESHOLD_RELOAD_MASKED_CREDIT_CARD_NO = "maskedCreditCardNumber";
	public static final String THRESHOLD_RELOAD_ORDER_EXIST = "orderExist";
	public static final String THRESHOLD_RELOAD_VALIDATION_ERROR_MESSAGE = "thresholdReload.validate.retCode";
	public static final String THRESHOLD_RELOAD_PROCESS_TYPE_ERROR = "thresholdReload.validate.processType";

	/** Standing Order */
	public static final String STANDING_ORDER_CMD = "standingOrder";
	public static final String STANDING_ORDER_RESOURCE = "standingOrder";
	public static final String STANDING_ORDER_PROCESS_TYPE = "processType";
	public static final String STANDING_ORDER_TRANSACTION = "transaction";
	public static final String STANDING_ORDER_PROCESS_ACTIVATE = "activate";
	public static final String STANDING_ORDER_PROCESS_DEACTIVATE = "deactivate";
	public static final String STANDING_ORDER_INVALID_CREDIT_CARD_ERROR = "23";
	public static final String STANDING_ORDER_ACTIVE_INSTRUCTION_NOT_EXIST_ERROR = "25";
	public static final String STANDING_ORDER_SUBSCRIPTION_BLACKLIST_ERROR = "26";
	public static final String STANDING_ORDER_CREDIT_CARD_BLACKLIST_ERROR = "30";
	public static final String STANDING_ORDER_ALREADY_HAS_STANDING_ERROR = "31";
	public static final String STANDING_ORDER_DOES_NOT_HAVE_STANDING_ERROR = "32";
	public static final String STANDING_ORDER_ACTIVATION_PROCESS_NAME = "sch:PostpaidStandingOrderActivationValidationProcessResponse";
	public static final String STANDING_ORDER_DEACTIVATION_PROCESS_NAME = "sch:PostpaidStandingOrderDeactivationValidationProcessResponse";
	public static final String STANDING_ORDER_MASKED_CREDIT_CARD_NO = "maskedCreditCardNumber";
	public static final String STANDING_ORDER_VALIDATION_ERROR_MESSAGE = "standingOrder.validate.retCode";
	public static final String STANDING_ORDER_PROCESS_TYPE_ERROR = "standingOrder.validate.processType";

	/** Online Bill Payment */
	public static final String ONLINE_BILL_PAYMENT_CMD = "onlineBillPayment";
	public static final String ONLINE_BILL_PAYMENT_RESOURCE = "onlineBillPayment";
	public static final String ONLINE_BILL_PAYMENT_NOT_ACTIVE_PAYMENT_ERROR = "25";
	public static final String ONLINE_BILL_PAYMENT_SUBSCRIPTION_BLACKLIST_ERROR = "26";
	public static final String ONLINE_BILL_PAYMENT_MONTH_LIMIT_EXCEEDED_ERROR = "27";
	public static final String ONLINE_BILL_PAYMENT_CREDIT_CARD_BLACKLIST_ERROR = "30";
	public static final String ONLINE_BILL_PAYMENT_REVERSE_ERROR = "56";
	public static final String ONLINE_BILL_PAYMENT_BILL_LIMIT_EXCEEDED_ERROR = "77";
	public static final String ONLINE_BILL_PAYMENT_BILL_ALREADY_PAID_ERROR = "78";
	public static final String ONLINE_BILL_PAYMENT_BILL_NO = "billList";
	public static final String ONLINE_BILL_PAYMENT_ACTIVATION_PROCESS_NAME = "sch:PostpaidBillPaymentValidationProcessResponse";
	public static final String ONLINE_BILL_PAYMENT_MASKED_CREDIT_CARD_NO = "maskedCreditCardNumber";
	public static final String ONLINE_BILL_PAYMENT_VALIDATION_ERROR_MESSAGE = "onlineBillPayment.validate.retCode";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_SUCCESS = "onlineBillPayment.message.success";
	public static final String ONLINE_BILL_PAYMENT_ENTER_POSTPAID_NUMBER = "onlineBillPayment.enter.postpaidnumber";
	public static final String ONLINE_BILL_PAYMENT_OTHER_MSISDN_LIMIT_MESSAGE = "onlineBillPayment.other.msisdn.limit.message";
	public static final String OTHERTRX3D_RESOURCE = "otherLineTrx3D";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_25 = "onlineBillPayment.validate.retCode25";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_26 = "onlineBillPayment.validate.retCode26";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_27 = "onlineBillPayment.validate.retCode27";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_30 = "onlineBillPayment.validate.retCode30";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_36 = "onlineBillPayment.validate.retCode36";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_56 = "onlineBillPayment.validate.retCode56";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_66 = "onlineBillPayment.validate.retCode66";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_77 = "onlineBillPayment.validate.retCode77";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_78 = "onlineBillPayment.validate.retCode78";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_9998 = "onlineBillPayment.validate.retCode9998";
	public static final String ONLINE_BILL_PAYMENT_MESSAGE_FAIL_RET_CODE_9999 = "onlineBillPayment.validate.retCode9999";

	/** simCardRequest **/
	public static final String SIMCARDREQUEST_DETAIL_RESOURCE = "simCardRequest";
	public static final String SIMCARDREQUEST_CMD = "simCardRequest";
	public static final String SIMCARDREQ = "simCardReq";
	public static final String SIMCARD_REQUEST_DEFAULT_ADDRESS = "Fatura Adresi";
	public static final String SIMCARDREQUEST_INVALID_MSISDN = "simCardRequest.error.invalidMsisdn";
	public static final String SIMCARDREQUEST_INVALID_REASON = "simCardRequest.error.invalidReason";
	public static final String SIMCARDREQUEST_REQUEST_APPROVE = "simCardRequest.info.message.requestAprove";
	public static final String SIMCARDREQUEST_LOST = "simCardRequest.data.lost";
	public static final String SIMCARDREQUEST_STOLEN = "simCardRequest.data.stolen";
	public static final String SIMCARDREQUEST_DEFECT = "simCardRequest.data.defect";
	public static final String SIMCARDREQUEST_BILL_ADDRESS = "simCardRequest.info.message.billAddress";
	public static final String SIMCARDREQUEST_SEND_BILL_ADDRESS = "simCardRequest.info.message.sendbillAddress";
	public static final String SIMCARDREQUEST_NEW_ADDRESS_MESSAGE = "simCardRequest.newAddressMessage";
	public static final String SIMCARDREQUEST_BLOCK_MESSAGE = "simCardRequest.error.block.message";
	public static final String SIMCARDREQUEST_SME_MESSAGE = "simCardRequest.smemessage";
	public static final String SIMCARD_REQUEST_SEQ = "SIMCARD_REQUEST_SEQ";

	/** changeNumber **/
	public static final String CHANGE_NUMBER_CMD = "changeNumber";
	public static final String CHANGE_NUMBER_RESOURCE = "changeNumber";
	public static final String CHANGE_NUMBER_MESSAGE_SUCCESSFUL = "changeNumber.MESSAGE_SUCCESSFUL";
	public static final String CHANGE_NUMBER_VALIDATION_ERROR_MESSAGE = "changeNumber.validate.retCode";
	public static final String CHANGE_NUMBER_HAS_ACTIVE_CALL_ERROR = "542";
	public static final String CHANGE_NUMBER_HAS_ROAMING_ERROR = "46";
	public static final String CHANGE_NUMBER_EMPLOYEE_LINE_ERROR = "133";
	public static final String CHANGE_NUMBER_DAILY_LIMIT_ERROR = "134";
	public static final String CHANGE_NUMBER_THREEMONTH_LIMIT_ERROR = "156";
	public static final String CHANGE_NUMBER_NOT_ENOUGH_CREDIT_ERROR = "230";
	public static final String CHANGE_NUMBER_HAS_NUMBER_CHANGE_REQUEST_ERROR = "256";
	public static final String CHANGE_NUMBER_HAS_NUMBER_CANCEL_REQUEST_ERROR = "413";
	public static final String CHANGE_NUMBER_HAS_NUMBER_MIGRATION_REQUEST_ERROR = "414";
	public static final String CHANGE_NUMBER_MONTHLY_LIMIT_ERROR = "568";
	public static final String CHANGE_NUMBER_PREPAID_IMEI_MESSAGE = "changeNumber.prepaid.IMEI.message";
	public static final String CHANGE_NUMBER_6MONTHS_LIMIT_ERROR = "648";

	/** addition line request **/
	public static final String ADDITION_LINE_REQUEST_CMD = "additionLineRequest";
	public static final String ADDITION_LINE_REQUEST_RESOURCE = "additionLineRequest";
	public static final String LINE_NUMBER = "number";
	public static final String ADDITION_LINE_REQ_NUMBER_REQUIRE = "additionLineRequest.validate.enter.number";
	public static final String ADDITION_LINE_REQ_NUMBER_INVALID = "additionLineRequest.validate.invalid.number";
	public static final String ADDITION_LINE_REQ_CORPORATE_MESSAGE = "additionLineRequest.corporatemessage";

	public static final String ADDITION_LINE_REQ = "addlineReq";
	public static final String ADDITION_LINE_SEQ = "ADDITION_LINE_SEQ";

	/** bill copy Request **/
	public static final String BILL_COPY_REQUEST_CMD = "billCopyRequest";
	public static final String BILL_COPY_REQUEST_RESOURCE = "billCopyRequest";
	public static final String BILL_COPY_REQUEST_PERIOD = "billCopyRequestPeriod";
	public static final String BILL_COPY_REQUEST_INVALID_PERIOD = "billCopyRequest.validate.period";
	public static final String BILL_COPY_SEQ = "BILL_COPY_SEQ";

	/** simCardChange **/
	public static final String SIMCARD_CHANGE_RESOURCE = "simCardChange";
	public static final String SIMCARD_CHANGE_CMD = "simCardChange";
	public static final String SIMCARD_CHANGE_SIMCARD_NUMBER_PARAMETER = "simcardnumber";
	public static final String SIMCARDCHANGE_SUB_CMD_PARAM = "simcardchangesubcmd";
	public static final String SIMCARD_CHANGE_SIM_CARD_NUMBER_ERROR = "simCardChange.validate.invalid.simcardnumber";
	public static final String SIMCARD_CHANGE_SIM_CARD_NUMBER = "simCardNumber";
	public static final String SIMCARD_CHANGE_VALIDATION_ERROR_MESSAGE = "simCardChange.validate.retCode";
	public static final String SIMCARD_CHANGE_INVALID_ICCID_ERROR = "7";

	/** BonusInfo */
	public static final String BONUS_INFO_RESOURCE = "bonusInfo";
	public static final String BONUS_INFO_CMD = "bonusInfo";

	/** LineDetails */
	public static final String LINE_DETAILS_RESOURCE = "lineDetails";
	public static final String LINE_DETAILS_COMMAND_PARAMETER = "command";
	public static final String LINE_DETAILS_SUBCOMMAND_PARAMETER = "subCommand";

	/** CounterUsage */
	public static final String COUNTER_USAGE_RESOURCE = "counterUsage";

	/** TariffIntercom */
	public static final String TARIFF_INTERCOM_CMD = "tariffIntercom";
	public static final String TARIFF_INTERCOM_INTERCOM_EXIST_MSG = "tariffIntercom.INTERCOM_EXIST_MSG";
	public static final String TARIFF_INTERCOM_INTERCOM_NOT_EXIST_MSG = "tariffIntercom.INTERCOM_NOT_EXIST_MSG";
	public static final String TARIFF_INTERCOM_SMS_VALIDATION_ERROR_MESSAGE = "tariffIntercom.smsvalidate.retCode";
	public static final String TARIFF_INTERCOM_INVALID_KEYWORD_MSG = "tariffIntercom.INVALID_KEYWORD_MSG";
	public static final String TARIFF_INTERCOM_MESSAGE_FAILED = "tariffIntercom.MESSAGE_FAILED";
	public static final String TARIFF_INTERCOM_A_NUMBER_DEACTIVE_ERROR = "1";
	public static final String TARIFF_INTERCOM_B_NUMBER_DEACTIVE_ERROR = "3";
	public static final String TARIFF_INTERCOM_CHARGED_MSG_SOURCE = "6005";
	public static final String TARIFF_INTERCOM_FREE_MSG_SOURCE = "6006";

	/** SubscriberPackages */
	public static final String SUBSCRIBER_PACKAGES_RESOURCE = "subscriberPackages";
	public static final String SUBSCRIBER_PACKAGES_NOT_EXIST_MSG = "subscriberPackages.NOT_EXIST_MESSAGE";
	public static final String SUBSCRIBER_PACKAGES_PACKAGE_LIST_STARTAG = "<packages>";
	public static final String SUBSCRIBER_PACKAGES_PACKAGE_LIST_ENDTAG = "</packages>";
	public static final String SUBSCRIBER_PACKAGES_PACKAGE_STARTAG = "<package>";
	public static final String SUBSCRIBER_PACKAGES_PACKAGE_ENDTAG = "</package>";

	/** MNP */
	public static final String MNP_APPLICATION_RESOURCE = "mnpPreApplication";
	public static final String MNP_VALIDATE_LINE_TYPE_MSG = "mnpPreApplication.validate.lineType";
	public static final String MNP_VALIDATE_CUSTOMERTYPE_MSG = "mnpPreApplication.validate.customerType";
	public static final String MNP_VALIDATE_MASSCUSTOMERTYPE_MSG = "mnpPreApplication.validate.massCustomerType";
	public static final String MNP_VALIDATE_CITIZEN_MSG = "mnpPreApplication.validate.citizen";
	public static final String MNP_VALIDATE_TCNO_MSG = "mnpPreApplication.validate.tcno";
	public static final String MNP_VALIDATE_COMPANY_MSG = "mnpPreApplication.validate.company";
	public static final String MNP_VALIDATE_ENTER_VALID_COMPANY_MSISDN = "mnpPreApplication.validate.enter.valid.company.msisdn";
	public static final String MNP_CUSTOMER_TYPE_MASS_PHYSICAL_ROLE = "BCUEPDSRI";
	public static final String MNP_CUSTOMER_TYPE_MASS_JURIDICAL_ROLE = "BCEDRI";
	public static final String MNP_CUSTOMER_TYPE_MASS = "1";
	public static final String MNP_CUSTOMER_TYPE_JURIDICAL = "2";
	public static final String MNP_CUSTOMER_TYPE_SME = "3";
	public static final String MNP_TTL_ID_MALE = "1";
	public static final String MNP_TTL_ID_FEMALE = "2";
	public static final String MNP_TTL_ID_COMPANY = "3";
	public static final String MNP_ADR_CUSTOMER_TYPE_MASS_PHYSICAL_BSCS = "C";
	public static final String MNP_ADR_CUSTOMER_TYPE_MASS_JURIDICAL_BSCS = "B";
	public static final String MNP_CUSTOMER_TYPE_PHYSICAL_TYPE = "F";
	public static final String MNP_CUSTOMER_TYPE_JURIDICAL_TYPE = "G";
	public static final String MNP_CUSTOMER_TYPE_PREPAID_PHYSICAL_TYPE = "M";
	public static final String MNP_CUSTOMER_TYPE_PREPAID_JURIDICAL_TYPE = "K";
	public static final String MNP_GENERAL_PARAMETER_ERROR_MSG = "mnpPreApplication.parameter.error.msg";
	public static final String MNP_ALREADY_AVEA_ERROR_MSG = "mnpPreApplication.already.avea.error.msg";
	public static final String MNP_REQUEST_ALREADY_EXIST_ERROR_MSG = "mnpPreApplication.request.already.exist.error.msg";
	public static final String MNP_UPDATE_NOT_POSSIBLE_ERROR_MSG = "mnpPreApplication.update.not.possible.error.msg";
	public static final String MNP_SUCCESS_MSG = "mnpPreApplication.success.msg";
	public static final String MNP_INPUT_PARAMETER_MISSING_ERROR = "1";
	public static final String MNP_CUSTOMER_TYPE_WRONG_ERROR = "5";
	public static final String MNP_REQUEST_ALREADY_EXIST_ERROR = "6";
	public static final String MNP_REQUEST_TYPE_WRONG_PREAPP_ERROR = "9";
	public static final String MNP_REQUEST_TYPE_WRONG_MNPFORM_ERROR = "10";
	public static final String MNP_UPDATE_NOT_POSSIBLE_ERROR = "11";
	public static final String MNP_REF_NO_EMPTY_ERROR = "12";
	public static final String MNP_MSISDN_LIST_MISSING_ERROR = "13";
	public static final String MNP_CONTRACT_TYPE_WRONG_ERROR = "18";
	public static final String MNP_OPERATOR_VALUE_MISSING_ERROR = "19";
	public static final String MNP_ALREADY_AVEA_ERROR = "21";
	public static final String MNP_DUPLICATE_REQUEST_ERROR = "24";

	/** Avea Card */
	public static final String AVEACARD_RESOURCE = "aveacard";
	public static final String AVEACARD_VALIDATE_MSISDN = "aveacard.validate.msisdn";
	public static final String AVEACARD_VALIDATE_CUSTOMERGROUP = "aveacard.validate.customerGroup";
	public static final String AVEACARD_MESSAGE_RECEIVED = "aveacard.message.received";

	/** ASP */
	public static final String ASP_RESOURCE = "asp";
	public static final String ASP_PACKETTYPE = "KAYIT";
	public static final String ASP_SUBSCRIPTION_TYPE_REQUEST = "subscriptionRequest";
	public static final String ASP_SHOW_TRAFFIC_TYPE_REQUEST = "showTrafficRequest";
	public static final String ASP_GPRS_TRAFFIC_TYPE_REQUEST = "gprsTrafficRequest";
	public static final String ASP_INPUT_ENTRIES_PER_PAGE = "50";
	public static final String ASP_CORP_MSISDN_NOTFOUND = "asp.corporate.msisdnnotfound";

	/** Mobile Student Campaign */
	public static final String MOBILE_STUDENT_CAMPAIGN_RESOURCE = "mobileStudentCampaign";
	public static final String MOBILE_STUDENT_CAMPAIGN_RULEID = "110505";
	public static final String MOBILE_STUDENT_CAMPAIGN_NOT_AUTHORIZED_ERROR = "mobileStudentCampaign.AUTHORIZE_ERROR";
	public static final String MOBILE_STUDENT_CAMPAIGN_BONUSID = "758";
	public static final String MOBILE_STUDENT_CAMPAIGN_SUCCESS_MESSAGE = "mobileStudentCampaign.SUCCESS";
	public static final String MOBILE_STUDENT_CAMPAIGN_OBMSRESULT = "0";
	public static final String MOBILE_STUDENT_CAMPAIGN_CANCEL_MESSAGE = "mobileStudentCampaign.CANCEL_MESSAGE";
	public static final String MOBILE_STUDENT_RELOAD_RULEID = "118857";
	public static final String MOBILE_STUDENT_CAMPAIGN_TARIFFID = "19";
	/** COMMAND ID'S */
	public static final String COMBINED_DETAIL_QUERY = "1";
	public static final String BROADCAST_SMS_VALIDATION = "2";
	public static final String BROADCAST_SMS_ACTIVATION_TRANSACTION = "3";
	public static final String BROADCAST_SMS_DEACTIVATION_TRANSACTION = "4";
	public static final String CALL_DETAILS_REQUEST_VALIDATION = "5";
	public static final String CALL_DETAILS_REQUEST_TRANSACTION = "6";
	public static final String GET_CONTACT_DETAILS = "7";
	public static final String UPDATE_CONTACT_DETAILS = "8";
	public static final String GET_LANGUAGE = "9";
	public static final String CHANGE_LANGUAGE = "10";
	public static final String CHANGE_TARIFF_VALIDATION = "11";
	public static final String CHANGE_TARIFF_TRANSACTION = "12";
	public static final String EBILL_SUBSCRIPTION_VALIDATION = "13";
	public static final String EBILL_SUBSCRIPTION_TRANSACTION = "14";
	public static final String EBILL_UNSUBSCRIPTION_VALIDATION = "15";
	public static final String EBILL_UNSUBSCRIPTION_TRANSACTION = "16";
	public static final String EBILLCOPY_VALIDATION = "17";
	public static final String EBILLCOPY_TRANSACTION = "18";
	public static final String GET_INTERNATIONAL = "19";
	public static final String OPEN_INTERNATIONAL = "20";
	public static final String CLOSE_INTERNATIONAL = "21";
	public static final String GET_LOST_STOLEN = "22";
	public static final String LOST_STOLEN_OPEN_TRANSACTION = "23";
	public static final String LOST_STOLEN_CLOSE_TRANSACTION = "24";
	public static final String GET_OPEN_CANCEL = "25";
	public static final String OPEN_CANCEL_OPEN_ACTION = "26";
	public static final String OPEN_CANCEL_CLOSE_ACTION = "27";
	public static final String PAYMENT_INFO_TRANSACTION = "28";
	public static final String PREPAID_RELOAD_VALIDATION = "29";
	public static final String PREPAID_RELOAD_TRANSACTION = "30";
	public static final String GET_PUK = "31";
	public static final String STANDING_ORDER_ACTIVATION_VALIDATION = "32";
	public static final String STANDING_ORDER_ACTIVATION_TRANSACTION = "33";
	public static final String STANDING_ORDER_DEACTIVATION_VALIDATION = "34";
	public static final String STANDING_ORDER_DEACTIVATION_TRANSACTION = "35";
	public static final String THRESHOLD_RELOAD_ACTIVATION_VALIDATION = "36";
	public static final String THRESHOLD_RELOAD_ACTIVATION_TRANSACTION = "37";
	public static final String THRESHOLD_RELOAD_DEACTIVATION_VALIDATION = "38";
	public static final String THRESHOLD_RELOAD_DEACTIVATION_TRANSACTION = "39";
	public static final String BILL_DETAIL_ACTIVATION_TRANSACTION = "40";
	public static final String BILL_DETAIL_DEACTIVATION_TRANSACTION = "41";
	public static final String BILL_DETAIL_ACTIVATION_VALIDATION = "42";
	public static final String PREPAID_GET_LOCK_REASON = "43";
	public static final String OPEN_CANCEL_CLOSE_VALIDATION = "44";
	public static final String OPEN_CANCEL_OPEN_VALIDATION = "45";
	public static final String BILL_DETAIL_DEACTIVATION_VALIDATION = "46";
	public static final String LOST_STOLEN_OPEN_VALIDATION = "47";
	public static final String LOST_STOLEN_CLOSE_VALIDATION = "48";
	public static final String ONLINE_BILL_PAYMENT_VALIDATION = "49";
	public static final String ONLINE_BILL_PAYMENT_TRANSACTION = "50";
	public static final String CHANGE_NUMBER_VALIDATION = "51";
	public static final String CHANGE_NUMBER_TRANSACTION = "52";
	public static final String ADDITIONAL_LINE_REQUEST_VALIDATION = "53";
	public static final String SIM_CARD_REQUEST_VALIDATION = "54";
	public static final String INTERNATIONAL_CALL_ACTIVATION_VALIDATION = "55";
	public static final String INTERNATIONAL_CALL_ACTIVATION_TRANSACTION = "56";
	public static final String INTERNATIONAL_CALL_DEACTIVATION_VALIDATION = "57";
	public static final String INTERNATIONAL_CALL_DEACTIVATION_TRANSACTION = "58";
	public static final String THIRD_PARTY_SMS_VALIDATION = "59";
	public static final String THIRD_PARTY_SMS_ACTIVATION_TRANSACTION = "60";
	public static final String THIRD_PARTY_SMS_DEACTIVATION_TRANSACTION = "61";
	public static final String GET_CORPORATE_LIST = "62";
	public static final String BILL_COPY_REQUEST_VALIDATION = "63";
	public static final String SIM_CARD_CHANGE_VALIDATION = "65";
	public static final String SIM_CARD_CHANGE_TRANSACTION = "66";
	public static final String INTERNATIONAL_PACKAGE_VALIDATION = "67";
	public static final String INTERNATIONAL_PACKAGE_ACTIVATION_TRANSACTION = "68";
	public static final String INTERNATIONAL_PACKAGE_DEACTIVATION_TRANSACTION = "69";
	public static final String BONUS_INFO_TRANSACTION = "70";
	public static final String GET_TARIFF_ID = "71";
	public static final String SET_TARIFF_ID = "72";
	public static final String RESET_ACCUMULATOR = "73";
	public static final String FREE_UNIT_ASSIGNMENT = "74";
	public static final String COUNTER_USAGE = "75";
	public static final String GET_ACTIVE_MSISDN_CUSTCODE = "76";
	public static final String GET_MSISDN_EXIST_IN_CUSTCODE_LIST = "77";
	public static final String GET_TARIFF_INTERCOM = "78";
	public static final String GET_SUBSCRIBER_PACKAGES = "79";
	public static final String GET_BILL_NUMBER = "80";
	public static final String MNP_APPLICATION = "81";
	public static final String MNP_GET_APPLICATION_FORM = "82";
	public static final String RETURN_BILL_PERIODS = "83";
	public static final String GET_PAYMENT_RESPONSIBLES = "84";
	public static final String EBILL_VALIDATION_FOR_CORP = "85";
	public static final String EBILL_TRANSACTION_FOR_CORP = "86";
	public static final String LDAPCDB_QUERY = "87";
	public static final String REF_NEW_REQUEST = "88";
	public static final String SCRATCH_CARD_RELOAD = "89";
	public static final String MASS_POSTPAID_PACKAGE_GETSTATE = "90";
	public static final String MASS_POSTPAID_PACKAGE_ACTIVATION = "91";
	public static final String MASS_POSTPAID_PACKAGE_DEACTIVATION = "92";
	public static final String PSTN_PACK_GETSTATE = "93";
	public static final String PSTN_PACK_ACTIVATION = "94";
	public static final String PSTN_PACK_DEACTIVATION = "95";
	public static final String TUMDUNYA_PACKAGE_ACTIVATION = "96";
	public static final String TUMDUNYA_PACKAGE_DEACTIVATION = "97";
	public static final String TUMDUNYA_PACKAGE_GETSTATE = "98";
	public static final String CHANGE_TARIFF_BULK_VALIDATION = "101";
	public static final String GET_POSTPAID_TARIFF_TYPE = "102";
	public static final String GET_AVAILABLE_TARIFFS = "103";
	public static final String GET_TARIFF_DESCRIPTION = "104";
	public static final String BULK_TARIFF_CHANGE = "105";
	public static final String BULK_MVPN_UPDATE = "106";
	public static final String BULK_MVPN_PROFILE = "107";
	public static final String MVPN_GET_AVAILABLE_PROFILES = "108";
	public static final String MVPN_GET_VPNID = "109";
	public static final String MVPN_GET_MVPN_INFO_WITH_MSISDN = "110";
	public static final String MVPN_GET_MVPN_INFO_ = "111";
	public static final String MVPN_UPDATE_ = "112";
	public static final String MVPN_GET_FIRM_NAME = "113";
	public static final String BPM_GET_ALL_IMSIS = "114";
	public static final String POSTPAID_CUST_PRICEGROUP = "115";
	public static final String BPM_EXT_THIRDPARTYSMS = "116";
	public static final String BPM_POST_ADDON_ACTV = "117";
	public static final String BPM_POST_ADDON_DEACTV = "118";
	public static final String BPM_POST_ADDON_ACTV_VLD = "119";
	public static final String CMS_CUSTOMER_IDENTITY_READ_DIRNUM = "120";
	public static final String CMS_CUSTOMER_INFO_READ_DIRNUM = "121";
	public static final String CMS_ADDR_SEQNO_READ = "122";
	public static final String CMS_CONTRACT_DEVICE_READ = "123";
	public static final String POSTPAID_GET_CONTRACT_DB = "124";
	public static final String POSTPAID_SET_CONTRACT_SVC = "125";
	public static final String POSTPAID_GET_CUSTCODES = "126";
	public static final String POSTPAID_UPDATE_RESPONSIBLE_FOR_CUSTCODELIST = "127";
	public static final String POSTPAID_GET_CUSTCODE_FROM_RESPONSIBLE = "128";
	public static final String BPM_GNL_FAXDATA_ACTV = "129";
	public static final String BPM_GNL_FAXDATA_DEACTV = "130";
	public static final String BPM_GNL_FAXDATA_ACTV_VLD = "131";
	public static final String POSTPAID_GET_KOTA = "132";
	public static final String POSTPAID_COMPARE_MSISDNUSER = "133";
	public static final String BPM_POST_BRING_FRIEND_ACTV = "134";
	public static final String POSTPAID_GET_REFEREE_HISTORY = "135";
	public static final String POSTPAID_GET_NEWCOMER_HISTORY = "136";
	public static final String POSTPAID_DELETE_FRIENDS = "137";
	public static final String BPM_POST_BRINGFRIEND_INSTITUTIONAL_ACTV = "138";
	public static final String POSTPAID_GET_BRINGFRIEND_INST_REFEREE_HIST = "139";
	public static final String POSTPAID_GET_BRINGFRIEND_INST_NEWCOMER_HIST = "140";
	public static final String POSTPAID_DELETE_BRINGFRIENDINSTITUTIONAL = "141";

	public static final String BPM_POST_BRINGFRIEND_TOPLANGEL_ACTV = "142";
	public static final String POSTPAID_GET_BRINGFRIEND_REFEREE_HIST = "143";
	public static final String POSTPAID_GET_BRINGFRIEND_NEWCOMER_HIST = "144";
	public static final String POSTPAID_DELETE_BRINGFRIENDTOPLANGEL = "145";
	public static final String BPM_POST_BRING_COMPANY_ACTV = "146";
	public static final String POSTPAID_DELETE_FRIENDS_COMP = "147";
	public static final String POSTPAID_GET_REFEREE_HIST_COMP = "148";
	public static final String POSTPAID_GET_NEWCOMER_HIST_COMP = "149";
	public static final String BPM_POST_OTHERGSM_ACTV = "150";
	public static final String BPM_POST_OTHERGSM_DEACTV = "151";
	public static final String BPM_POST_OTHERGSM_ACTV_VLD = "152";
	public static final String BPM_POST_CAMPAIGN_DEACTV = "153";
	public static final String BPM_POST_CAMPAIGN_DEACTV_VLD = "154";
	public static final String LDAPFBC_GETVOLUMEACCUMULATOR = "155";
	public static final String BPM_PRE_USSDEOCN_ACTV = "156";
	public static final String BPM_PRE_USSDEOCN_DEACTV = "157";
	public static final String POSTPAID_GET_REFSYS_PARENT_CHILD_INFO = "158";
	public static final String POSTPAID_GET_CONTRACT_SVC = "159";
	public static final String DSF_GET_PREPAIDCONTRACT = "160";
	public static final String MNP_IS_PORTOUT_PROCESS_ACTIVE = "161";
	public static final String PREPAID_DEACTIVATE_LINE = "162";
	public static final String OBMS_GET_BONUS = "163";
	public static final String DSF_RETRIEVE_CUSTOMER = "164";
	public static final String MNP_GET_CURRENT_OPERATOR = "165";
	public static final String PREPAID_QUERY = "166";
	public static final String BPM_PRE_GET_MCP_INFORMATION = "167";
	public static final String POSTPAID_GET_TUMDUNYA_HISTORY = "168";
	public static final String POSTPAID_GET_CUSTOMER_INFO = "169";
	public static final String OBMS_CREATE_BONUS = "170";
	public static final String OSM_CREATE_SERVICE = "171";
	public static final String BPM_POST_ONNET_PACKAGE_ACTIVATION = "172";
	public static final String BPM_POST_ONNET_PACKAGE_DEACTIVATION = "173";
	public static final String POSTPAID_CHECK_RESTRICTED_PACK = "174";
	public static final String OSM_GET_SERVICES = "175";

	public static final String PREPAID_BALANCE = "180";
	public static final String PREPAID_BALANCE_COMMIT = "181";
	public static final String THREE_G_PAKAGE_ACTIVATION = "182";// BPM_GNL_TG_ACTIVATION
	public static final String THREE_G_PAKAGE_DEACTIVATION = "183";// BPM_GNL_TG_DEACTIVATION
	public static final String THREE_G_SERVICE_PACKAGES_QUERY = "184"; // BPM_GNL_TG_PACK_QUERY
	public static final String THREE_G_SERVICE_ACTV = "185";// BPM_GNL_TG_DSF_ACTIVATION
	public static final String THREE_G_SERVICE_DEACTV = "186";// BPM_GNL_TG_DSF_DEACTIVATION
	public static final String THREE_G_SERVICE_CHECK = "187";
	public static final String APN_SERVICE_CHECK = "188"; // POSTPAID_SERVICE_CHECK
	public static final String CHANGETARIFF_SINIRSIZ_AVEA = "189";// BPM_POST_UNLIMITEDKAMU_ACT
	public static final String SIP_ACTIVATION = "190";
	public static final String SIP_DEACTIVATION = "191";
	public static final String HYS_ACTIVATION = "193";
	public static final String HYS_DEACTIVATION = "194";

	public static final String VALIDATE_PASO_TARIFF = "195"; // BPM_PRE_YOUTH_ACTV
	public static final String PREPAID_YOUTH_TARIFF_DEACTIVATION = "196";
	public static final String REF_SINIRSIZ_QUERY_CHILD_INFO = "197";

	public static final String REF_SINIRSIZ_DEACTIVATION = "198";
	public static final String REF_SINIRSIZ_UPDATE_STATUS = "199";
	public static final String REF_SINIRSIZ_GET_COID = "200";
	public static final String THREEGHANSET_QUERY = "201";
	public static final String GPRS_PACKAGE_ACTIVATION = "204";// BPM_GNL_TG_VASPACK_SUBSC
	public static final String GPRS_PACKAGE_DEACTIVATION = "205";// BPM_GNL_TG_VASPACK_UNSUBSC
	public static final String THREE_G_SERVICE_HISTORY = "206";
	public static final String HYS_B_NUMBER_COUNT_QUERY = "207";
	public static final String POSTPAID_STANDART_IMPLICIT_TRACKING = "208";
	public static final String CTI_STATUS_QUERY = "209";

	public static final String PRESS_AUTHENTICATE = "210";
	public static final String PRESS_RELOAD = "211";
	public static final String PRESS_RELOADSERIAL = "212";
	public static final String PRESS_QUERYBLACKLIST = "213";
	public static final String PRESS_BLACKLISTMNG = "214";
	public static final String PRESS_QUERY_LOT = "215";
	public static final String PRESS_MODIFY_LOT = "216";
	public static final String PRESS_VIEWRELOAD = "217";
	public static final String PRESS_MODIFY_SC_STATE = "218";
	public static final String POSTPAID_CHECK_FREEUNIT_DETAIL = "219";
	public static final String PREPAID_SERVICE_ACTV = "220";
	public static final String PREPAID_SERVICE_DEACTV = "221";
	public static final String PREPAID_SUBS_LANG_CHANGE = "222";
	public static final String GPRS_PACKAGE_POSTPAID_TOTAL_QUERY = "223";
	public static final String PREPAID_DSF_GET_CUST_LAST_OPERATIONS = "224";
	public static final String PREPAID_DSF_GET_CARD_OWNER_INFO = "225";
	public static final String PREPAID_OBMS_GET_CAMPAIGN_RULE_PACKS = "226";
	public static final String PREPAID_BPM_PACKAGE_ASSIGNMENT = "227";
	public static final String PREPAID_LOCK_LINE = "228";
	public static final String PREPAID_UNLOCK_LINE = "229";
	public static final String ACTIVATE_POSTPAID_SMSPACKAGE = "230";
	public static final String DEACTIVATE_POSTPAID_SMSPACKAGE = "231";
	public static final String EBILL_PDF_GET_EBILL_TYPES = "232";
	public static final String THY_MILES_ACTIVATION = "233";

	public static final String PREPAID_AVAILABLE_TARIFFS = "234";
	public static final String PREPAID_TARIFFS_NAMES = "235";
	public static final String PREPAID_TARIFF_CHANGE = "236";

	public static final String THY_MILES_QUERY = "237";
	public static final String PREPAID_BPPS_THR_ORDER_DEACT = "238";
	public static final String PREPAID_BPM_THR_ORDER_DEACT = "239";
	public static final String PREPAID_YOUTH_TARIFF_GETSTATE = "240";

	public static final String HARBI_TARIFF_PACKAGE_ASSIGNMENT = "241";

	public static final String PREPAID_RELOAD = "242";
	public static final String PREPAID_RELOAD_COMMIT = "243";
	public static final String OBMS_DELETE_BONUS = "244";
	public static final String POSTPAID_GET_RESOURCE = "245";

	public static final String INFOD_ANAHTARKART_CHECK_DEALERCODE = "246";
	public static final String BPM_ANAHTARKARTNT = "247";

	public static final String PostPaidGenericServiceAssign_ACT = "249";
	public static final String PostPaidGenericServiceAssign_DEACT = "250";
	public static final String PrePaid_900Lines_ACT = "251";
	public static final String PrePaid_900Lines__DEACT = "252";
	public static final String FATURA_BPPS_UNPAID_BILL_QUERY = "253";

	public static final String POSTPAID_GET_FREEUNIT_MESSAGE = "254";
	public static final String POSTPAID_GET_GUNCEL_FATURA_TUTARI = "255";
	public static final String POSTPAID_SERVICE_CHECK = "256";
	public static final String IDO_MILES_ACTIVATION = "257";
	public static final String IDO_MILES_QUERY = "258";
	public static final String OVSC_ENABLE_LOT = "259";
	public static final String DSF_GET_SIM_INFO = "260";
	public static final String BPM_CHECK_MAXACT = "261";
	public static final String VAS_LEAD = "262";
	public static final String BPM_SUBDEALER_RELOAD = "263";
	public static final String INFODEALER_SET_PASSWORD = "264";
	public static final String INFODEALER_GET_AMOUNT = "265";
	public static final String CC_ORDER_QUERY = "266";
	public static final String CREDIT_CARD_VALIDATION = "267";
	public static final String CC_ORDER_ACTIVATION = "268";
	public static final String CC_ORDER_DEACTIVATION = "269";
	public static final String PREPAID_LOCK = "270";
	public static final String PREPAID_UNLOCK = "271";
	public static final String CHANGE_NUMBER_POSTPAID_MSISDN_CHANGE_PREPAID = "272";
	public static final String CHANGE_NUMBER_TRANSACTION_PREPAID = "274";
	public static final String CHANGE_NUMBER_DSF_QUERY = "273";
	public static final String TTNET_SINGLE_BILL_ACTIVATION = "275";
	public static final String TTNET_SINGLE_BILL_DEACTIVATION = "276";
	public static final String TTNET_SINGLE_BILL_QUERY = "277";
	public static final String CREDIT_REFUND_VALIDATION = "278";
	public static final String CREDIT_REFUND_TRANSACTION = "279";
	public static final String MOBILE_STUDENT_TARIFF_PACKAGE_ASSIGNMENT = "280";
	public static final String CRM_NOTIFICATION = "281";
	public static final String POSTPAID_UNLOCK = "283";
	public static final String POSTPAID_LOCK = "284";
	public static final String POSTPAID_GET_INVOICE_INFO = "285";
	public static final String PREPAID_GET_MSISDN_CHANGE_STATUS = "286";
	public static final String PREPAID_CEATE_OSM_SERVICE = "287";
	public static final String OSM_DELETE_SERVICE = "288";

	public static final String GET_CALL_WAITING_STATUS = "289";
	public static final String ACTIVATE_CALL_WAITING = "290";
	public static final String DSF_CHECK_YOUTH_CAMP_SUBSC = "291";

	public static final String GET_ALL_JSOG_STATUS = "292";
	public static final String ACTIVATE_GPRS_PREPAID = "293";
	public static final String DEACTIVATE_GPRS_PREPAID = "294";
	public static final String GET_CLIR_STATUS = "295";
	public static final String ACTIVATE_CLIR = "296";
	public static final String DEACTIVATE_CLIR = "297";
	public static final String ACTIVATE_RINGA = "298";
	public static final String DEACTIVATE_RINGA = "299";
	public static final String ACTIVATE_GPRS_POSTPAID = "300";
	public static final String DEACTIVATE_GPRS_POSTPAID = "301";
	public static final String ACTIVATE_CALL_FORWARDING = "302";
	public static final String DEACTIVATE_CALL_FORWARDING = "303";
	public static final String POSTPAID_GET_CURRENT_TARIFF_LIST = "304";
	public static final String POSTPAID_GET_TARIFF_INFO_COMBINED = "305";
	public static final String POSTPAID_GET_ZONE_LIST = "306";
	public static final String POSTPAID_GET_TARIFF_TIME_LIST = "307";
	public static final String POSTPAID_GET_AMOUNT_LIST = "308";
	public static final String POSTPAID_GET_FU_DESC_BY_TARIFF_ID = "309";
	public static final String POSTPAID_GET_FU_DETAIL_INFO = "310";
	public static final String POSTPAID_GET_MSISDN_RESERVATION_LIST = "311";
	public static final String CHECK_DATA_LINE = "312";
	public static final String THREE_G_SERVICE_PACKAGES_ACTV_VLD = "313";
	public static final String THREE_G_SERVICE_PACKAGES_DEACTV_VLD = "314";
	public static final String GET_INVOICE_TARIFFINFO = "315";
	public static final String EBILL_PDF_GET_URL = "316";
	public static final String GET_INVOICEPDF_PARAMETERS = "317";
	public static final String DEACTIVATE_CALL_WAITING = "318";
	public static final String POSTPAID_GET_TARIFFTYPE_FROM_MSISDN = "319";
	public static final String YENIYIL_TARIFF_DATA_PACK_QUERY = "320";
	public static final String YENIYIL_TARIFF_DATA_PACK_ACTIVATE = "321";
	public static final String YENIYIL_TARIFF_DATA_PACK_DEACTIVATE = "322";
	public static final String TT_SAHA_PACK_ACTIVATE = "323";
	public static final String TT_SAHA_PACK_DEACTIVATE = "324";
	public static final String MOBIL_MODEM_INDIRIMLI_PACK_QUERY = "325";
	public static final String MOBIL_MODEM_INDIRIMLI_PACK_ACTIVATE = "326";
	public static final String MOBIL_MODEM_INDIRIMLI_PACK_DEACTIVATE = "327";
	public static final String POSTPAID_CHECK_ANY_FREEUNIT_IS_GIVEN = "340";
	public static final String POSTPAID_GET_LAST_OPEN_AMOUNT = "341";
	public static final String BLACKLIST_OPERATIONS = "342";
	public static final String BLACKLIST_QUERY = "343";
	public static final String BLACKLIST_TYPES = "344";
	public static final String BPM_POST_CAMPAIGN_ASSIGNMENT = "345";
	public static final String POSTPAID_CHECK_SUBS_SERVICES = "346";
	public static final String POSTPAID_GET_MSISDNLIST_BY_CUSTCODE = "348";
	public static final String REF_STATUS_QUERY = "349";

	public static final String PREPAID_FRIENDS_QUERY = "175"; // aveamerkez'den
																// copy paste

	public static final String NEW_ONLINEPASSWORD_SAME_AS_PREV_TWO_PASSWORDS = "changeOnlinePassword.NEW_PASSWORD_SAME_AS_PREV_TWO_PASSWORDS";
	public static final String ONLINEPASSWORDS_MSISDN_INDEXOF_TRUE = "changeOnlinePassword.PASSWORDS_MSISDN_INDEXOF_TRUE";
	public static final String ONLINEPASSWORDS_EQUALS_USERNAME = "changeOnlinePassword.PASSWORDS_EQUALS_USERNAME";
	public static final String ONLINEPASSWORDS_EQUALS_BIRTYEAR = "changeOnlinePassword.PASSWORDS_EQUALS_BIRTYEAR";
	public static final String ONLINEPASSWORDS_EQUALS_FIRSTNAME = "changeOnlinePassword.PASSWORDS_EQUALS_FIRSTNAME";
	public static final String ONLINEPASSWORDS_EQUALS_LASTNAME = "changeOnlinePassword.PASSWORDS_EQUALS_LASTNAME";
	public static final String ONLINEPASSWORDS_TOO_SHORT = "changeOnlinePassword.PASSWORDS_TOO_SHORT";
	public static final String ONLINEPASSWORDS_PASSWORD_CHANGED_SUCCESSFULLY = "changeOnlinePassword.PASSWORD_CHANGED_SUCCESSFULLY";
	public static final String ONLINEPASSWORDS_PASSWORD_CHANGE_FAILED = "changeOnlinePassword.PASSWORD_CHANGE_FAILED";
	public static final String ONLINEPASSWORDS_PASSWORDS_DONT_MATCH = "changeOnlinePassword.PASSWORDS_DONT_MATCH";
	public static final String ONLINEPASSWORDS_OLD_PASSWORD_INCORRECT = "changeOnlinePassword.OLD_PASSWORD_INCORRECT";

	public static final String ONLINEPASSWORDS_NOTIFICATION_MESSAGE = "changeOnlinePassword.PASSWORDS_NOTIFICATION_MESSAGE";
	public static final String ONLINEPASSWORDS_NOTIFICATION_CHANGE_MESSAGE = "changeOnlinePassword.PASSWORDS_NOTIFICATION_CHANGE_MESSAGE";
	public static final String ONLINEPASSWORDS_NOTIFICATION_SECURITY_MESSAGE = "changeOnlinePassword.PASSWORDS_NOTIFICATION_SECURITY_MESSAGE";
	public static final String ONLINEPASSWORDS_ERROR_MESSAGE = "changeOnlinePassword.PASSWORD_CHANGE_FAILED";
	public static final String ONLINEPASSWORDS_FIRST_VALUE_CHANGE_MESSAGE = "changeOnlinePassword.PASSWORDS_FIRST_VALUE_CHANGE_MESSAGE";
	public static final String ONLINEPASSWORDS_FIRST_VALUE_CHANGE_FORCE_MESSAGE = "changeOnlinePassword.PASSWORDS_FIRST_VALUE_CHANGE_FORCE_MESSAGE";
	public static final String ONLINEPASSWORDS_EXPIRE_CHANGE_MESSAGE = "changeOnlinePassword.WEB_MESSAGE_INFO";
	public static final String ONLINEPASSWORDS_ONLINE_PASSWORD_CHANGE_REASON = "changeOnlinePasswordReason";
	public static final String ONLINEPASSWORDS_FIRST_ONLINE_PASSWORD_CHANGE = "1";
	public static final String ONLINEPASSWORDS_EXPIRE_ONLINE_PASSWORD_CHANGE = "2";
	public static final String ONLINEPASSWORDS_FIRST_ONLINE_PASSWORD_CHANGE_FORCE = "4";

	public static final int ONLINE_PASSWORD_ENTRY_SUCCESS = 1;
	public static final int ONLINE_PASSWORD_LOCKED = 2;
	public static final int ONLINE_PASSWORD_FAILED_UNKNOWN = 3;
	public static final int ONLINE_PASSWORD_INVALID_PASSWORD = 4;

	public static final int MAX_ONLINE_PASSWORD_FAILED_COUNT = 3;

	public static final String CLOSE_LINE_ACTION_TYPE = "2";
	public static final String HOTLINE_ACTION_TYPE = "1";

	public static final String INFOBUS_WAP_SYSTEM_NAME = "VAS_WAP";

	public static final String INFOBUS_SMS_SYSTEM_NAME = "9333SMS";

	public static final String AVEAMERKEZSERVICES_URL = "AVEAMERKEZSERVICES_URL";
	public static final String CORPORATE_REPORTING_URL = "CORPORATE_REPORTING.url";
	public static final String ACR_RESOURCE = "acr";

	public static final String USER_COMMON_VALIDATE_ENTER_NAME = "user.common.validate.enter.name";
	public static final String USER_COMMON_VALIDATE_ENTER_SURNAME = "user.common.validate.enter.surname";
	public static final String USER_COMMON_VALIDATE_ENTER_GENDER = "user.common.validate.enter.gender";
	public static final String USER_COMMON_VALIDATE_ENTER_MSISDN = "user.common.validate.enter.msisdn";
	public static final String USER_COMMON_VALIDATE_ENTER_VALID_MSISDN = "user.common.validate.enter.valid.msisdn";
	public static final String USER_COMMON_VALIDATE_ENTER_FATHERNAME = "user.common.validate.enter.fatherName";
	public static final String USER_COMMON_VALIDATE_ENTER_CONTACTNUMBER = "mnpPreApplication.validate.contactNumber";
	public static final String USER_COMMON_VALIDATE_ENTER_BIRTHCITY = "user.common.validate.enter.birthCity";
	public static final String USER_COMMON_VALIDATE_ENTER_BIRTHDISTRICT = "user.common.validate.enter.birthDistrict";
	public static final String USER_COMMON_VALIDATE_ENTER_BIRTHDATE = "user.common.validate.enter.birthDate";
	public static final String USER_COMMON_VALIDATE_ENTER_TAXOFFICE = "user.common.validate.enter.taxOffice";
	public static final String USER_COMMON_VALIDATE_ENTER_TAXNUMBER = "user.common.validate.enter.taxNumber";
	public static final String USER_COMMON_VALIDATE_ENTER_VALID_EMAIL = "user.common.validate.enter.valid.email";
	public static final String USER_COMMON_VALIDATE_ENTER_VALID_TCNO = "user.common.validate.enter.valid.tcno";

	// REFERENCE SYSTEM
	public static final String REF_SYS_APPLICATION_RESOURCE = "refSys";
	public static final String REF_SYS_PARENT_LIMIT_QUERY_MSG = "refSys.parent.limit.query.message";
	public static final String REF_SYS_PARENT_MSISDN_INVALID = "refSys.parent.msisdn.invalid";
	public static final String REF_SYS_CHILD_MSISDN_INVALID = "refSys.child.msisdn.invalid";
	public static final String REF_SYS_KEYWORD_YES = "EVET";
	public static final String REF_SYS_KEYWORD_NO = "HAYIR";
	public static final String REF_SYS_KEYWORD_NO_2 = "HAY1R";
	public static final String REF_SYS_KEYWORD_INVALID = "refSys.error.keyword.invalid";
	public static final String REF_SYS_CHILD_STATUS_MSG = "refSys.child.status.msg.";
	public static final String REF_SYS_PARENT_TCID_ERROR_MSG = "refSys.parent.tcId.error.msg";
	public static final String REF_SYS_NO_CHILD_MSG ="refSys.child.status.msg.d";
	public static final String REF_SYS_HAVE_CHILD_MSG = "refSys.child.status.msg.a";

	// USSD EOC
	public static final String USSD_EOC_RESOURCE = "ussdEoc";
	public static final String USSD_EOC_DEACTIVE = "deactive";
	public static final String USSD_EOC_ACTIVE = "active";
	public static final String USSD_EOC_SUCCESS_ACTIVATE = "successActivation";
	public static final String USSD_EOC_SUCCESS_DEACTIVATE = "successDeactivation";
	public static final String USSD_EOC_ACTIVATION_PROCESS = "1";
	public static final String USSD_EOC_DEACTIVATION_PROCESS = "0";

	// Corporate Reporting
	public static final String CORPORATE_REPORTING_RESOURCE = "corporateReporting";
	public static final String CORPORATE_REPORTING_TITLE = "corporateReporting.TITLE";

	// 3G Packages Subscription
	public static final String SUBSCRIBE_3G_PACKAGES_RESOURCE = "subscribe3GPackages";

	/* 3D Secure Bill Payment */
	public static final String PROCESS_TYPE_3D_BILL_PAYMENT = "P";
	public static final String PROCESS_TYPE_3D_RELOAD_COUNTER = "L";
	public static final String PROCESS_TYPE_3D_EDEVLET_COUNTER = "B";
	public static final String PROCESS_TYPE_3D_CANCELTRX = "C";
	public static final String ONLINE_BILL_PAYMENT_3D_VALIDATE_ERROR = "onlineBillPayment.3D.validate.retCode";
	public static String TYPE_SUCCESS = "00";
	public static String TYPE_INTERNAL_ERROR = "01";
	public static String TYPE_MONTHLY_EXCEED = "02";
	public static String TYPE_WEEKLY_EXCEED = "03";
	public static String TYPE_DAILY_EXCEED = "04";
	public static String TYPE_ALREADY_ACTIVE_TRANS = "05";
	public static String TYPE_NOT_AVEA = "07";
	public static String TYPE_IN_BLACKLIST = "08";
	public static String TYPE_INVALID_AMOUNT = "09";
	public static String TYPE_INVALID_MSISDN = "10";
	public static String TYPE_INVALID_TRANS_ID = "11";
	public static String TYPE_NOT_TRUSTED_CLIENT_IP = "111";
	public static String CLIENT_ID_POST = "CLIENT_ID_POST";
	public static String CLIENT_ID_PRE = "CLIENT_ID_PRE";

	public static final String SUBSCRIBE_3G_NOTAVEASUBSCRIBER = "293";
	public static final String SUBSCRIBE_3G_STATUSSUSPENDED = "39";
	public static final String SUBSCRIBE_3G_NOTACTIVESTATUS = "3";
	public static final String SUBSCRIBE_3G_NOTAVEABRANDCODE = "300";
	public static final String SUBSCRIBE_3G_DOESNOTHAVETGSERVICE = "301";
	public static final String SUBSCRIBE_3G_TGNOTMASSORINSTITUTIONAL = "302";
	public static final String SUBSCRIBE_3G_ALREADYHASTGPACKAGE = "303";
	public static final String SUBSCRIBE_3G_SUBSCRIBERHASONEOF3GPACKS = "304";
	public static final String SUBSCRIBE_3G_CHANNEL_ERROR = "354";
	public static final String SUBSCRIBE_3G_TGNOTHASENOUGHBALANCE = "312";
	public static final String SUBSCRIBE_3G_DEACTIVATE_TGDEACTNOTHASPACKAGE = "311";
	public static final String SUBSCRIBE_3G_TG_NOTSUITABLE = "309";
	public static final String SUBSCRIBE_3G_TG_ONLYPREPAID = "2";
	public static final String SUBSCRIBE_3G_NOTVALID_FORAVEAEMPLOYEE = "362";
	public static final String SUBSCRIBE_3G_CHANNEL_ERROR_MESSAGE = "subscribe3GPackages.channelerror";

	public static final String SUBSCRIBE_3G_ERROR = "subscribe3GPackages.ERROR";
	public static final String SUBSCRIBE_3G_SUCCESS_MESSAGE = "subscribe3GPackages.SUCCESS";

	public static final String THREE_G_SERVICE_RESOURCE = "threeGService";

	public static final String THREE_G_SERVICE_ACTV_SUCCESS_MESSAGE = "threeGService.ActivationSuccess";
	public static final String THREE_G_SERVICE_DEACTV_SUCCESS_MESSAGE = "threeGService.DeactivationSuccess";
	public static final String THREE_G_SERVICE_NOTACTIVESTATUS = "3";
	public static final String THREE_G_SERVICE_STATUSSUSPENDED = "39";
	public static final String THREE_G_SERVICE_INVALID_SERVICECODE = "333";
	public static final String THREE_G_SERVICE_NOTSUITABLE = "344";
	public static final String THREE_G_SERVICE_GENERALFAIL = "345";
	public static final String THREE_G_SERVICE_ALREADYHASSERVICE = "321";
	public static final String THREE_G_SERVICE_NOTMASS = "317";
	public static final String THREE_G_SERVICE_NOT_ENOUGH_DOCUMENT = "318";
	public static final String THREE_G_SERVICE_HAS_ACTIVE_RECORD = "319";
	public static final String THREE_G_SERVICE_ERROR = "threeGService.ERROR";

	public static final String THREE_G_SERVICE_CORP_AUTH_ERROR = "threeGService.Corp.AuthError";
	public static final String THREE_G_SERVICE_CHANNEL_ERROR = "threeGService.Channel.Error";

	public static final String THREE_G_WAP_CHANNEL = "4";
	public static final String THREE_G_WEB_CHANNEL = "3";

	public static final String THREE_G_SERVICE_POSTSNCODE = "457";
	public static final String THREE_G_SERVICE_PRESRVBIT = "24";
	
	public static final String LTE_SERVICE_RESOURCE = "lte";
	public static final String LTE_TOPLUISLEM_RESOURCE = "lteTopluIslem";
	public static final String LTE_SERVICE_POSTSNCODE = "11966";
	public static final String LTE_SERVICE_PRESRVBIT = "XXX"; //TODO: MW will have to announce
	
	public static final String LTE_SUBMISSION = "lteSubmission";
	
	public static final String VOLTE_SERVICE_RESOURCE = "volte";

	public static final String MOBILVIZYON_PACKAGES_RESOURCE = "mvpackages";
	public static final String MOBILVIZYON_PACKAGES_NOPACKAGES_SELECTED = "mvpackages.nopackages.selected";

	// for test tariffId=510
	// for production tariffId=660
	public static final String SINIRSIZ_AVEA_TARIFFCODE = "660";
	public static final String HERYONESINIRSIZ_TARIFFCODE = "648";
	public static final String SHADOW_TARIFFCODE = "687";

	// Paso Tariff Constants
	public static final String PASO_TARIFF_RESOURCE = "pasoTariff";
	public static final String PASO_TARIFF_CODE = "47";
	public static final String NOT_PASO_TARIFF_ERROR = "pasoTariff.validation.NotPasoTariffError";
	public static final String PASO_TARIFF_AUTH_CODE_ERROR = "pasoTariff.validation.AuthCodeError";
	public static final String PASO_TARIFF_TCID_ERROR = "pasoTariff.validation.enter.valid.tcno";

	public static final String VALIDATE_PASOTARIFF_ERROR_NOTPREPAID = "2";
	public static final String VALIDATE_PASOTARIFF_ERROR_NOTACTIVESTATUS = "3";
	public static final String VALIDATE_PASOTARIFF_ERROR_YOUTHNOTENOUGHCONTOUR = "322";
	public static final String VALIDATE_PASOTARIFF_ERROR_NOTHASYOUTHTARIFF = "328";
	public static final String VALIDATE_PASOTARIFF_ERROR_AGEISNOTOKFORYOUTHTARIFF = "329";
	public static final String VALIDATE_PASOTARIFF_ERROR_YOUTHTCIDUSEDBEFORE = "330";
	public static final String VALIDATE_PASOTARIFF_ERROR_YOUTHPROMOTIONASSIGNEDBEFORE = "331";
	public static final String VALIDATE_PASOTARIFF_ERROR_NOTHASYOUTHPROMOTION = "332";
	public static final String VALIDATE_PASOTARIFF_ERROR = "pasoTariff.validation.ERROR";
	public static final String VALIDATE_PASO_TARIFF_SUCCESS_MESSAGE = "pasoTariff.validation.SuccessMessage";

	public static final String EBILL_PDF_RESOURCE = "ebillPdf";
	public static final String EBILL_PDF_DUEDATE_TAG = "DUEDATE";
	public static final String EBILL_PDF_INVOICEID_TAG = "FATURAID";
	public static final String EBILL_PDF_CUSTTYPE_TAG = "CUSTTYPE";
	public static final String EBILL_PDF_PRGCODE_TAG = "PRGCODE";
	public static final String EBILL_PDF_URL_TAG = "URL";
	public static final String EBILL_PDF_VALIDATION_ERROR = "ebillPdf.validation.error";
	public static final int E_BILL_PDF_CONNECTION_READTIMEOUT = 30000;
	public static final int E_BILL_PDF_CONNECTION_CONNECTIONTIMEOUT = 30000;

	public static final String SERVICE_OVER_SDP_DATE_ERROR = "serviceOverSdp.yaseminboran.services.date.error";

	public static final String AVEA_MMS_PACKAGE_100_SHORTNUMBER = "9500";
	public static final String AVEA_MMS_PACKAGE_50_SHORTNUMBER = "9506";
	public static final String FENERCELL_MMS_PACKAGE_50_SHORTNUMBER = "9501";
	public static final String GSMOBILE_MMS_PACKAGE_50_SHORTNUMBER = "9502";
	public static final String KARTALCELL_MMS_PACKAGE_50_SHORTNUMBER = "9503";
	public static final String TRABZONCELL_MMS_PACKAGE_50_SHORTNUMBER = "9504";
	public static final String TTNET_MMS_PACKAGE_50_SHORTNUMBER = "5301";

	public static final String AVEA_BRANDCODE = "0";
	public static final String FENERCELL_BRANDCODE = "1";
	public static final String GSMOBILE_BRANDCODE = "3";
	public static final String KARTALCELL_BRANDCODE = "2";
	public static final String TRABZONCELL_BRANDCODE = "4";
	public static final String TTNET_BRANDCODE = "7";
	public static final String BIMCELL_BRANDCODE = "9";
	public static final String PTTCELL_BRANDCODE = "10";
	public static final String POCELL_BRANDCODE = "11";
	public static final String TEKNOSAMOBIL_BRANDCODE = "12";

	public static final String PATLICAN_BRANDNAME = "patlican";
	public static final String AVEA_BRANDNAME = "avea";
	public static final String FENERCELL_BRANDNAME = "FB";
	public static final String GSMOBILE_BRANDNAME = "GS";
	public static final String KARTALCELL_BRANDNAME = "BJK";
	public static final String TRABZONCELL_BRANDNAME = "TS";

	public static final String FENERCELL_MMS_PACKAGE_PROMO_ID = "201";
	public static final String GSMOBILE_MMS_PACKAGE_PROMO_ID = "202";
	public static final String KARTALCELL_MMS_PACKAGE_PROMO_ID = "203";
	public static final String TRABZONCELL_MMS_PACKAGE_PROMO_ID = "204";

	public static final String GENERAL_PACKAGES_MVNO_ERROR = "353";
	public static final String GENERAL_PACKAGES_MASS_ERROR = "317";
	public static final String GENERAL_PACKAGES_3G_ERROR = "311";
	public static final String GENERAL_PACKAGES_NOPACKAGE_ERROR = "307";
	public static final String GENERAL_PACKAGES_HASPACKAGE_ERROR = "304";
	public static final String GENERAL_PACKAGES_NO3G_ERROR = "296";
	public static final String GENERAL_PACKAGES_CHANNEL_ERROR = "354";
	public static final String GENERAL_PACKAGES_NO_SERVICE_ERROR = "295";
	public static final String GENERAL_PACKAGES_NOTVALID_FORAVEAEMPLOYEE = "362";
	public static final String GENERAL_PACKAGES_ERROR = "generalpackages.gprsPackages.ERROR";

	public static final String CORP_SMSPACKAGES_PACKAGE100_NAME = "package100";
	public static final String CORP_SMSPACKAGES_PACKAGE250_NAME = "package250";
	public static final String CORP_SMSPACKAGES_PACKAGE100_PACKID = "487";
	public static final String CORP_SMSPACKAGES_PACKAGE250_PACKID = "488";
	public static final String CORP_SMSPACKAGES_PACKAGE100_SNCODE = "450";
	public static final String CORP_SMSPACKAGES_PACKAGE250_SNCODE = "451";
	public static final String CORP_SMSPACKAGES_RESOURCE = "corpSmsPackages";
	public static final String CORP_SMSPACKAGES_NOT_CORP_ERROR = "corpSmsPackages.NotCorporateError";
	// Error Codes of Corporate SMS Packages
	public static final String CORP_SMSPACKAGES_ERROR_NOTACTIVESTATUS = "3";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_NOTSMEORCORPORATE = "355";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_ALREADYHASFREEUNIT = "169";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_OCCNOTASSIGNED = "291";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_FREEUNITDESCISNOTNOK = "123";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_NOTPOSTPAID = "1";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_HIGHTRAFFICUSAGE = "10";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_NOTMASSTARIFF = "9";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_NOTHEPSIBIROR360 = "124";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_NOTHASFUPACKAGE = "356";
	public static final String CORP_SMSPACKAGES_ERROR_ERROR_HASDEACTIVATEDFUPACKAGE = "357";
	public static final String CORP_SMSPACKAGES_ERROR = "corpSmsPackages.Error";

	public static final String HARBI_TARIFF_CODE = "52";
	public static final String HARBI_TARIFF_RULEID = "97863";
	public static final String GENCAVEA_3G_PACKAGE_RULEID = "99481";
	public static final String SMS_PACKAGE_1000_10000_RULEID = "111599";
	public static final String HARBI_TARIFF_RESOURCE = "harbiTariff";
	public static final String HARBI_TARIFF_SUCCESS_MESSAGE = "harbiTariff.successMessage";
	public static final String CHANNEL_WEB = "1";
	public static final String SMS_PACKAGE_SERVICENAME = "DailyOnnetMinutesAllDestSMSService";
	public static final String DATA_PACKAGE_SERVICENAME = "DailyOnnetMinutesAllDestSMSDataService";

	public static final String ANAHTARKART_TARIFF_ID = "15";

	public static final String BILL_PAYMENT_ORDER_RESOURCE = "billPaymentOrder";
	public static final String BILL_PAYMENT_CHECK_CREDIT_CARD = "billPaymentOrder.check.credit.card";
	public static final String BILL_PAYMENT_ORDER_BPPS_ORDER_TYPE_AVEA = "billPaymentOrder.type.avea";
	public static final String BILL_PAYMENT_ORDER_BPPS_ORDER_TYPE_BANK = "billPaymentOrder.type.bank";
	public static final String BILL_PAYMENT_ORDER_REQUEST_ACCEPTED_MESSAGE = "billPaymentOrder.request.accepted.message";
	public static final String BILL_PAYMENT_CHECK_CREDIT_CARD_EXPIRE_DATE = "billPaymentOrder.check.credit.card.expire.date";
	public static final String BPPS_OPERATION_SOURCE_WEB = "31";
	public static final String BPPS_OPERATION_SOURCE_WAP = "38";
	public static final String BPPS_ORDER_TYPE_AVEA = "05";
	public static final String BPPS_ORDER_TYPE_BANK = "06";
	public static final String BPPS_INSTITUTION_ID = "2709";

	public static final String PROCESS_TYPE_VALIDATION = "1";
	public static final String PROCESS_TYPE_TRANSACTION = "2";

	public static final String PREPAID_CREDIT_REFUND_RESOURCE = "prepaidCreditRefund";
	public static final String PREPAID_CREDIT_REFUND_CREDIT_EXIST_MESSAGE = "prepaidCreditRefund.credit.exist.message";
	public static final String PREPAID_CREDIT_REFUND_REJECTED_MESSAGE = "prepaidCreditRefund.rejected.message";
	public static final String PREPAID_CREDIT_REFUND_SUCCESS_MESSAGE = "prepaidCreditRefund.success.message";
	public static final String PREPAID_CREDIT_REFUND_INVALID_TC_IDENTITY_NUMBER = "415";
	public static final String PREPAID_CREDIT_REFUND_NO_CANCELLATION = "416";
	public static final String PREPAID_CREDIT_REFUND_ALREADY_HAVE_REQUEST = "417";
	public static final String PREPAID_CREDIT_REFUND_NOT_ENOUGH_CREDIT = "418";
	public static final String PREPAID_CREDIT_REFUND_SUCCESS = "419";
	public static final String PREPAID_CREDIT_REFUND_FRAUD_MESSAGE = "424";
	public static final String PREPAID_CREDIT_REFUND_VALIDATION_ERROR_MESSAGE = "prepaidCreditRefund.validate.retCode";
	public static final String PREPAID_CREDIT_REFUND_VALIDATION_WARN_MSG = "prepaidCreditRefund.validate.retCode3";

	public static final String POSTPAID_CREDIT_REFUND_RESOURCE = "postpaidCreditRefund";
	public static final String POSTPAID_CREDIT_REFUND_CREDIT_EXIST_MESSAGE = "postpaidCreditRefund.credit.exist.message";
	public static final String POSTPAID_CREDIT_REFUND_REJECTED_MESSAGE = "postpaidCreditRefund.rejected.message";
	public static final String POSTPAID_CREDIT_REFUND_SUCCESS_MESSAGE = "postpaidCreditRefund.success.message";
	public static final String POSTPAID_CREDIT_REFUND_INVALID_TC_IDENTITY_NUMBER = "415";
	public static final String POSTPAID_CREDIT_REFUND_NO_CANCELLATION = "416";
	public static final String POSTPAID_CREDIT_REFUND_ALREADY_HAVE_REQUEST = "417";
	public static final String POSTPAID_CREDIT_REFUND_NOT_ENOUGH_CREDIT = "418";
	public static final String POSTPAID_CREDIT_REFUND_SUCCESS = "419";
	public static final String POSTPAID_CREDIT_REFUND_FRAUD_MESSAGE = "424";
	public static final String POSTPAID_CREDIT_REFUND_VALIDATION_ERROR_MESSAGE = "postpaidCreditRefund.validate.retCode";
	public static final String POSTPAID_CREDIT_REFUND_VALIDATION_WARN_MSG = "postpaidCreditRefund.validate.retCode3";

	/** Invoice Info */
	public static final String INVOICE_INFO_RESOURCE = "invoiceinfo";
	public static final String INVOICE_INFO_GSM_DETAIL = "GSM";
	public static final String INVOICE_INFO_INVOICE_DETAIL = "INV";
	public static final String INVOICE_INFO_CDR_DETAIL = "CDR";
	public static final int INVOICE_INFO_OFFSET_COUNT = 15;
	public static final String INVOICE_INFO_GSMDETAIL_NORECORD_MESSAGE = "invoiceinfo.gsmdetail.norecord.message";
	public static final String INVOICE_INFO_INVOICEDETAIL_NORECORD_MESSAGE = "invoiceinfo.invoicedetail.norecord.message";
	public static final String INVOICE_INFO_BILL_NOT_FOUND = "invoiceinfo.bill.not.found";

	/** flexi IVR */
	public static final String FLEXI_IVR_RESOURCE = "flexi";
	public static final String HAS_FLEXI = "has_flexi";
	public static final String HAS_FLEXI_YES = "1";
	public static final String HAS_FLEXI_NO = "0";
	public static final String FLEXI_CTYPE_POSTPAID = "POSTPAID";
	public static final String FLEXI_CTYPE_PREPAID = "PREPAID";
	public static final String FLEXI_COMMAND = "flexicmd";
	public static final String FLEXI_INSERT_COMMAND = "insert";
	public static final String FLEXI_CANCEL_COMMAND = "cancel";
	public static final String FLEXI_MAIN_COMMAND = "mainPage";
	public static final String FLEXI_SUCCESS_INSERT_COMMAND = "insertSuccess";
	public static final String FLEXI_SUCCESS_CANCEL_COMMAND = "cancelSuccess";
	public static final String FLEXI_MENU_NAMES = "menuNames";
	public static final String FLEXI_MENU_NUMBERS = "menuNumbers";
	public static final String FLEXI_CUSTOMER_MENU = "customerMenu";
	public static final String FLEXI_OPTION = "option";
	public static final String FLEXI_OPTION_INSERT = "1";
	public static final String FLEXI_OPTION_CANCEL = "2";
	public static final String FLEXI_SMS_TEXT_SUCCESS_INSERT = "flexi.sms_text";
	public static final String FLEXI_OPTION_NOT_SELECTED = "flexi.warning3";
	public static final String FLEXI_CUSTOMER_NOT_SELECTED = "flexi.warning3";

	public static final String CHANGE_NUMBER_MSISDN_NOT_DEFINED_ERROR = "changeNumber.msisdnNotDefined.error";

	public static final String PREPAID_CALL_PACKAGES_RESOURCE = "prepaidCallPackages";

	public static final String PREPAID_DATA_PACKAGES_RESOURCE = "prepaidDataPackages";
	public static final String PREPAID_DATA_PACKAGES_NOT_ENOUGH_CREDIT = "prepaidDataPackages.warning.NotEnoughCredit";
	public static final String PREPAID_DATA_PACKAGES_WRONG_TARIFF = "prepaidDataPackages.warning.OnlyPrepaid";
	public static final String PREPAID_DATA_PACKAGES_ALREADY_EXIST = "prepaidDataPackages.warning.AlreadyExist";

	public static final String ONLINE_BILL_PAYMENT_TRIGGER_GUEST_VIEW = "GuestView";
	public static final String WARNING_AUTH_CODE_FIELD = "authCode";
	public static final String WARNING_AUTH_CODE = "emailCollectCampaign.warning.AUTH_CODE";
	public static final String ACCIDENT_DAMAGE_QUERY_RESOURCE = "accidentDamageQuery";

	public static final String TALKATIVE_PACKAGE_RESOURCE = "talkativePackage";
	public static final String TALKATIVE_PACKAGE_NOT_ENOUGH_CREDIT = "prepaidDataPackages.warning.NotEnoughCredit";
	public static final String TALKATIVE_PACKAGE_WRONG_TARIFF = "prepaidDataPackages.warning.OnlyPrepaid";
	public static final String TALKATIVE_PACKAGE_ALREADY_EXIST = "prepaidDataPackages.warning.AlreadyExist";

	public static final String LINE_CANCELLATION_APP_RESOURCE = "lineCancellationApp";
	public static final String LINE_CANCELLATION_APP_AUTH_ERROR = "lineCancellationApp.AuthError";
	public static final String EDIT_CONTACT_RECORD_ALLREADY_EXISTS_ERROR = "edit-contact.RECORD_ALLREADY_EXISTS";
	public static final String EDIT_GROUP_RECORD_ALLREADY_EXISTS_ERROR = "edit-group.GROUP_NAME_UNIQUE";
	public static final int YEDEK_REHBER_MAX_CONTACT_COUNT = 250;
	public static final String PREVIOUS_PROCESS_FAILED = "onlineBillPayment.previousProcessFailed";

	public static final String PREVIOUS_PROCESS_FAILED_RETURN_CODE = "-999";

	public static final String CREDIT_CARD_SETCC = "setCC";
	public static final String MAX_CONTACTS_REACHED = "edit-contact.MAX_CONTACTS_REACHED";
	public static final String TALKATIVE_PACKAGE_DUPLICATE_ERROR = "talkativePackage.warning.hasSamePackage";


	/** Social Media Lirapaylas */
	public static final String SOCIAL_MEDIA_LIRAPAYLAS = "socialLirapaylasCmd";
	public static final String SOCIAL_MEDIA_LIRAPAYLAS_HASURL_COMMAND = "hasValidUrl";
	public static final String SOCIAL_MEDIA_LIRAPAYLAS_GENERATE_COMMAND = "generateUrl";
	public static final String SOCIAL_MEDIA_LIRAPAYLAS_GENERATE_SUCCES_COMMAND = "successGenerateUrl";
	public static final String SOCIAL_MEDIA_LIRAPAYLAS_GENERATE_FAILED_COMMAND = "failedGenerateUrl";
	public static final String SOCIAL_MEDIA_LIRAPAYLAS_RESOURCE = "socialMediaLirapaylas";
	// public final String
	// LIRAPAYLAS_URL=configForGeneral.getValue("LIRAPAYLAS_COMMAND");
	public static final String SOCIAL_MEDIA_LIRAPAYLAS_MESSAGE5 = "socialMediaLirapaylas.message5";

	public static final String FEMTO_ACCESS_LIST_MASS_KEY = "AVEA_CONSUMER_ACCESS_LIST_LIMIT";
	public static final String FEMTO_ACCESS_LIST_TTNET_KEY = "TTNET_CONSUMER_ACCESS_LIST_LIMIT";
	public static final String FEMTO_ACCESS_LIST_CORPORATE_KEY = "AVEA_BUSINESS_ACCESS_LIST_LIMIT";
	public static final String FEMTOCELL_RESOURCE = "femtocell";
	public static final String FEMTOCELL_SUBSCRIPTION_NOT_FOUND_MESSAGE = "femtocell.subscription.not.found.message";
	public static final String FEMTOCELL_ACCESS_LIST_MSISDN_NOT_FOUND_MESSAGE = "femtocell.access.list.msisdn.not.found.message";
	public static final String FEMTOCELL_ACCESS_LIST_MSISDN_LIMIT_MESSAGE = "femtocell.access.list.msisdn.limit.message";
	public static final String FEMTOCELL_SOAP_ERROR = "femtocell.soap.error.";
	public static final String FEMTOCELL_ACCESS_LIST_DEFAULT_COUNT = "32";

	/** Son Fatura bilgisi */
	public static final String LAST_OPEN_AMOUNT_RESOURCE = "lastOpenAmount";
	public static final String LAST_OPEN_AMOUNT_STATUS = "lastOpenAmountStatus";
	public static final String LAST_OPEN_AMOUNT_OPEN_AMOUNT = "openAmount";
	public static final String LAST_OPEN_AMOUNT_MESSAGE1 = "lastOpenAmount.message1";
	public static final String LAST_OPEN_AMOUNT_MESSAGE2 = "lastOpenAmount.message2";
	public static final String LAST_OPEN_AMOUNT_MESSAGE3 = "lastOpenAmount.message3";
	public static final String LAST_OPEN_AMOUNT_MESSAGE_1 = "lastOpenAmountMessage1";
	public static final String LAST_OPEN_AMOUNT_MESSAGE_2 = "lastOpenAmountMessage2";
	public static final String LAST_OPEN_AMOUNT_MESSAGE_3 = "lastOpenAmountMessage3";

	public static final String ALODUNYA_TUMDUNYA_PACKAGE_EXIST = "roamingservices.alodunya.tumdunya.package.exist";
	public static final String ALODUNYA_ALREADY_EXIST = "roamingservices.alodunya.already.exist";
	public static final String ALODUNYA_HOTLINE = "roamingservices.alodunya.hotline";
	public static final String ALODUNYA_NOT_ENOUGH_CREDIT = "roamingservices.alodunya.notEnoughCredit";
	public static final String ALODUNYA_NO_SERVICE = "roamingservices.alodunya.notsubscribed";
	public static final String ALODUNYA_DATA_LINE = "roamingservices.alodunya.dataLine";

	public static final String[] PREPAID_DATALINES_TARIFF_CODES = { "53", "63",
			"73", "83", "93", "125" };

	public static final String BIMCELL_DATA_PACKAGES_RULEID = "161579";
	public static final String PTTCELL_SMS_PACKAGES_RULEID = "174749";
	public static final String POCELL_SMS_AND_DATA_PACKAGES_RULEID = "176993";
	public static final String BIMCELL_250MB_DATA_PACKAGES_RULEID = "210865";
	public static final String BIMCELL_250MB_DATA_PACKAGES_SERVICE_NAME = "Bimcell_Monthly_250MB_DataService";
	

	public static final String FRAUDULENT_USER_ERROR_MSG = "fraudulent.user.error.msg";
	public static final String FRAUDULENT_USER_ERROR_MSISDN = "fraudulent.user.error.msisdn";

	public static final String SIFRESIZ_LIRA_YUKLEME = "sifresizLiraYukleme";
	public static final String CORP_CUST_CODES = "custCodes";

	public static final String FATURA_STOP_SESPACKAGE_BONUS_ID = "1701";
	public static final String FATURA_STOP_SESPACKAGE_SERVICENAME = "FaturaStop_EkPaket_HerYoneDakikaService";
	public static final String FATURA_STOP_SESPACKAGE_ACTIVATION_KEYWORD = "KAYIT DAKIKA";
	public static final String FATURA_STOP_SESPACKAGE_RULE_ID = "175240";
	public static final String FATURA_STOP_SMSPACKAGE_BONUS_ID = "1702";
	public static final String FATURA_STOP_SMSPACKAGE_SERVICENAME = "FaturaStop_EkPaket_HerYoneSMSService";
	public static final String FATURA_STOP_SMSPACKAGE_ACTIVATION_KEYWORD = "KAYIT SMS";
	public static final String FATURA_STOP_SMSPACKAGE_RULE_ID = "175240";
	public static final String FATURA_STOP_INTERNETPACKAGE_BONUS_ID = "1703";
	public static final String FATURA_STOP_INTERNETPACKAGE_SERVICENAME = "FaturaStop_EkPaket_DataService";
	public static final String FATURA_STOP_INTERNETPACKAGE_ACTIVATION_KEYWORD = "KAYIT INTERNET";
	public static final String FATURA_STOP_INTERNETPACKAGE_RULE_ID = "175240";
	public static final String FATURA_STOP_TARIFF_ID_1 = "160";
	public static final String FATURA_STOP_TARIFF_ID_2 = "161";

	public static final String[] FATURA_STOP_TARIFF_LIST = { "160", "161",
			"163" };
	public static final String TURIST_HATLARI_PRE_TARIFF_ID = "147";
	public static final String TURIST_HATLARI_POST_TARIFF_ID = "1183";

	public static final String FATURA_STOP_PACKAGES_RESOURCE = "faturaStopPackages";
	public static final String FATURA_STOP_RESOURCE_ONLY_FATURASTOP_TARIFF = "faturaStopPackages.onlyFaturaStop";

	public static final String SEC_PAKETLERI_RESOURCES = "secPaketleri";

	public static final String ASP_VALIDATE_DATE_NOT_VALID_INTERVAL = "asp.validate.notValidInterval";
	public static final String ASP_VALIDATE_START_DATE_AFTER_END_DATE = "asp.validate.startEndDate";
	public static final String ASP_VALIDATE_START_DATE_NOT_ENTERED = "asp.validate.startDate.notEntered";
	public static final String ASP_VALIDATE_END_DATE_NOT_ENTERED = "asp.validate.endDate.notEntered";
	public static final String ASP_CALL_TYPE_NOTCHOSEN = "asp.warning.noData";
	public static final String ASP_VALIDATE_DATE_THREE_MONTHS_LIMIT = "asp.validate.threeMonthsLimit";
	public static final String ASP_VALIDATE_DATE_FORMAT = "asp.validate.dateformat";

	public static final String PTTCELL_SES_PACKAGE_SNCODE = "4382";
	public static final String PTTCELL_SES_PACKAGE_PACKID = "6692";
	public static final String PTTCELL_SES_HY_50_DK_PACKAGE_SNCODE = "9532";
	public static final String PTTCELL_SES_HY_50_DK_PACKAGE_PACKID = "7916";
	public static final String PTTCELL_SMS_PACKAGE_KEYWORD = "2000 SMS";
	public static final String PTTCELL_SMS_PACKAGE_SNCODE = "4379";
	public static final String PTTCELL_SMS_PACKAGE_PACKID = "6690";
	
	public static final String PTTCELL_SMS_PACKAGE_5000_SMS_KEYWORD = "5000 SMS"; // bu kisimdan emin degiliz
	public static final String PTTCELL_SMS_PACKAGE_5000_SMS_SNCODE = "9348";
	public static final String PTTCELL_SMS_PACKAGE_5000_SMS_PACKID = "7917";
	
	public static final String PTTCELL_SMS_PACKAGE_PACKAGENAME = "PttcellFaturaliHY2000";
	public static final String PTTCELL_SMS_PACKAGE_5000_SMS_PACKAGENAME = "PttcellFaturaliHY5000";
	public static final String PTTCELL_INTERNET_PACKAGE_PACKAGEID = "6691";
	public static final String PTTCELL_INTERNET_PACKAGE_SNCODE = "4380";
	public static final String PTTCELL_INTERNET_PACKAGE_PACKAGENAME = "PttcellFaturaliSinirsiz";
	public static final String PTTCELL_INTERNET_PACKAGE_PACKID_ACTIVATION = "1GBSINIRSIZ";
	public static final String PTTCELL_INTERNET_PACKAGE_PACKID_DEACTIVATION = "1GBSINIRSIZ_IPT";

	/* Pttcell 2GB paketi START*/
	public static final String PTTCELL_2GB_INTERNET_PACKAGE_PACKAGEID = "8172";
	public static final String PTTCELL_2GB_INTERNET_PACKAGE_SNCODE = "10583";
	public static final String PTTCELL_2GB_INTERNET_PACKAGE_PACKAGENAME = "Pttcell2GBFaturaliSinirsiz";
	public static final String PTTCELL_2GB_INTERNET_PACKAGE_PACKID_ACTIVATION = "PTTCELL_2GB";
	public static final String PTTCELL_2GB_INTERNET_PACKAGE_PACKID_DEACTIVATION = "PTTCELL_2GB_IPT";

	/* Pttcell 2GB paketi END*/
	
	/* Pttcell 250 MB Asimsiz paketi START*/
	public static final String PTTCELL_250_MB_ASIMSIZ_INTERNET_PACKAGE_PACKAGEID = "7918";
	public static final String PTTCELL_250_MB_ASIMSIZ_INTERNET_PACKAGE_SNCODE = "9534";
	public static final String PTTCELL_250_MB_ASIMSIZ_INTERNET_PACKAGE_PACKAGENAME = "Pttcell250MbAsimsizFaturali";
	public static final String PTTCELL_250_MB_ASIMSIZ_INTERNET_PACKAGE_PACKID_ACTIVATION = "ASIMSIZ 250MB";
	public static final String PTTCELL_250_MB_ASIMSIZ_INTERNET_PACKAGE_PACKID_DEACTIVATION = "ASIMSIZ 250MB IPT";// �ptali olmamas�na ra�men ekledim. 
	
	/* Pttcell 250 MB Asimsiz paketi END*/
	
	/* Pttcell 1 GB paketi */
	
	public static final String PTTCELL_1GB_INTERNET_PACKAGEID = "8540";
	public static final String PTTCELL_1GB_INTERNET_SNCODE = "11953";
	public static final String PTTCELL_1GB_INTERNET_PACKAGE_PACKAGENAME = "PttcellMuhtesem1GB";
	public static final String PTTCELL_1GB_INTERNET_PACKAGE_PACKID_ACTIVATION = "PTTCELL_1GB_MUHTESEM"; // G�khan : �ptal yok eklemedim. 
	
	/* Pttcell 1GB paketi */

	/* Teknosa Mobil 250 MB paketi START*/
	public static final String TEKNOSA_MOBIL_250MB_INTERNET_PACKAGE_PACKAGEID = "8173";
	public static final String TEKNOSA_MOBIL_250MB_INTERNET_PACKAGE_SNCODE = "10584";
	public static final String TEKNOSA_MOBIL_250MB_INTERNET_PACKAGE_PACKAGENAME = "TeknosaMobil250MB";
	public static final String TEKNOSA_MOBIL_250MB_INTERNET_PACKAGE_PACKID_ACTIVATION = "TEKNOSA_250MB";
	public static final String TEKNOSA_MOBIL_250MB_INTERNET_PACKAGE_PACKID_DEACTIVATION = "TEKNOSA_250MB_IPT";

	/* Teknosa Mobil 250 MB paketi END*/
	
	/* Teknosa Mobil 1 GB paketi START*/
	public static final String TEKNOSA_MOBIL_1GB_INTERNET_PACKAGE_PACKAGEID = "8190";
	public static final String TEKNOSA_MOBIL_1GB_INTERNET_PACKAGE_SNCODE = "10618";
	public static final String TEKNOSA_MOBIL_1GB_INTERNET_PACKAGE_PACKAGENAME = "TeknosaMobil1GB";
	public static final String TEKNOSA_MOBIL_1GB_INTERNET_PACKAGE_PACKID_ACTIVATION = "TEKNOSA_1GB";
	public static final String TEKNOSA_MOBIL_1GB_INTERNET_PACKAGE_PACKID_DEACTIVATION = "TEKNOSA_1GB_IPT";
	
	/* Teknosa Mobil 1 GB paketi END*/
	
	/* Teknosa Mobil 2 GB paketi START*/
	public static final String TEKNOSA_MOBIL_2GB_INTERNET_PACKAGE_PACKAGEID = "8212";
	public static final String TEKNOSA_MOBIL_2GB_INTERNET_PACKAGE_SNCODE = "10669";
	public static final String TEKNOSA_MOBIL_2GB_INTERNET_PACKAGE_PACKAGENAME = "TeknosaMobil2GB";
	public static final String TEKNOSA_MOBIL_2GB_INTERNET_PACKAGE_PACKID_ACTIVATION = "TEKNOSA_2GB";
	public static final String TEKNOSA_MOBIL_2GB_INTERNET_PACKAGE_PACKID_DEACTIVATION = "TEKNOSA_2GB_IPT";
	
	/* Teknosa Mobil 2 GB paketi END*/

	public static final String POCELL_INTERNET_PACKAGE_REFERENCE = "pocellInternetPaketleri";
	public static final String POCELL_INTERNET_PACKAGE_PACKAGEID = "6808";
	public static final String POCELL_INTERNET_PACKAGE_SNCODE = "4626";
	public static final String POCELL_INTERNET_PACKAGE_PACKAGENAME = "POCELL 1GB DATA FU";
	public static final String POCELL_INTERNET_PACKAGE_PACKID_ACTIVATION = "POCELL_1GB_DATA";
	public static final String POCELL_INTERNET_PACKAGE_PACKID_DEACTIVATION = "POCELL_1GB_DATA_IPT";

	public static final String POCELL_HER_YONE_250DK_SES_PACKAGE_SNCODE = "7613";
	public static final String POCELL_HER_YONE_250DK_SES_PACKAGE_PACKID = "7447";
	public static final String POCELL_HER_YONE_250DK_SES_ACTIVATION = "POCELL_250_DK";
	public static final String POCELL_HER_YONE_250DK_SES_DEACTIVATION = "POCELL_250_DK_IPT";

	/** TL KULLANIM */
	public static final String TL_TRAFFIC_RESOURCE = "tltraffic";
	public static final String TL_TRAFFIC_VALIDATE_DATE_NOT_VALID_INTERVAL = "tltraffic.validate.notValidInterval";
	public static final String TL_TRAFFIC_VALIDATE_START_DATE_AFTER_END_DATE = "tltraffic.validate.startEndDate";
	public static final String TL_TRAFFIC_VALIDATE_START_DATE_NOT_ENTERED = "tltraffic.validate.startDate.notEntered";
	public static final String TL_TRAFFIC_VALIDATE_END_DATE_NOT_ENTERED = "tltraffic.validate.endDate.notEntered";
	public static final String TL_TRAFFIC_CALL_TYPE_NOTCHOSEN = "tltraffic.warning.noData";
	public static final String TL_TRAFFIC_VALIDATE_DATE_THREE_MONTHS_LIMIT = "tltraffic.validate.threeMonthsLimit";
	public static final String TL_TRAFFIC_VALIDATE_DATE_FORMAT = "tltraffic.validate.dateformat";

	/** Tuketici Sikayet */
	public static final String SIKAYET_RESOURCE = "sikayet";
	public static final String SIKAYET_CMD = "sikayet";
	public static final String SIKAYET_MUKERRER_HATA = "sikayet.mukerrer.hata";

	/** Borc Alacak */
	public static final String BORC_ALACAK_RESOURCE = "borcAlacak";
	public static final String BORC_ALACAK_CMD = "borcAlacak";
	public static final String BORC_ALACAK_LISTE_INFO1 = "borcAlacak.liste.info1";
	public static final String BORC_ALACAK_TCKN_MSISDN_NO_MATCH = "borcAlacak.TCKN_MSISDN_NO_MATCH";
	public static final String BORC_ALACAK_TCKN_NAME_NO_MATCH = "borcAlacak.TCKN_NAME_NO_MATCH";
	public static final String BORC_ALACAK_IADE_ALACAK_SUCCESS_MSG = "borcAlacak.alacakIade.success";
	public static final String BORC_ALACAK_IADE_ALACAK_PARTIAL_SUCCESS_MSG = "borcAlacak.alacakIade.partialSuccess";
	public static final String BORC_ALACAK_IADE_ALACAK_ERROR_MSG = "borcAlacak.alacakIade.error";
	public static final String BORC_ALACAK_IADE_ALACAK_SYSTEM_ERROR_MSG = "borcAlacak.alacakIade.systemError";
	public static final String BORC_ALACAK_BORC_ODEME_SUCCESS_MSG = "borcAlacak.borcOdeme.success";
	public static final String BORC_ALACAK_BORC_ODEME_FAIL_MSG = "borcAlacak.borcOdeme.fail";
	public static final String BORC_ALACAK_INVOICE_NOT_FOUND = "borcAlacak.invoiceNotFound";	
	
	public static final String BORC_ALACAK_EDEVLET_ERROR1 = "borcAlacak.edevletErrorKod1";
	public static final String BORC_ALACAK_EDEVLET_ERROR2 = "borcAlacak.edevletErrorKod2";
	public static final String BORC_ALACAK_EDEVLET_ERROR_OTH = "borcAlacak.edevletErrorKodOthers";
	
	public static final String OZET_KULLANIM_RESOURCE = "ozetKullanimRapor";
	public static String RIZA_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("RIZA_OPERATIONS_WS_ADDRESS");
	public static String TTG_BPMVEPID_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("TTG_BPMVEPID_OPERATIONS_WS_ADDRESS");
	public static String BSCS_ITEMIZED_BILL_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("BSCS_ITEMIZED_BILL_OPERATIONS_WS_ADDRESS");
	public static final String MUSTERI_RIZASI_RESOURCE = "musteriRizasi";
	public static final String MUSTERI_RIZASI_ACTIVATION_SUCCESS = "musteriRizasi.operation.activation.success";
	public static final String MUSTERI_RIZASI_DEACTIVATION_SUCCESS = "musteriRizasi.operation.deactivation.success";
	public static final String MUSTERI_RIZASI_TABNAME = "musteriRizasi";
	public static final String BILLMASK_ACTIVATION_SUCCESS = "billdetail.mask.activation.success";
	public static final String BILLMASK_DEACTIVATION_SUCCESS = "billdetail.mask.deactivation.success";

	public static final String ON_ODEMELI_TOPLU_SMS_TARIFF_ID1 = "180";
	public static final String ON_ODEMELI_TOPLU_SMS_TARIFF_ID2 = "181";
	public static final String ON_ODEMELI_TOPLU_SMS_TARIFF_ID3 = "182";

	/** Centrex */
	public static final String CENTREX_RESOURCE = "centrex";
	public static final String CENTREX_CMD = "centrex";
	public static final String CENTREX_VALIDATE_IS_NOT_MSISDN_AVEA = "centrex.msisdn.isNotMsisdnAvea";
	public static final String CENTREX_CUSTCODE_NOT_AUTHORIZED = "centrex.custCode.notAuthorized";
	public static final String CENTREX_ONLY_CORPORATE_SUBSCRIBER = "centrex.only.corporate.subscriber";
	public static final String CENTREX_NOT_AUTHORIZED = "centrex.not.authorized";

	/** Partner Servis Kampanyalar� */
	public static final String PARTNER_SERVIS_RESOURCE = "partnerServis";
	public static final String PARTNER_SERVIS_CMD = "partnerServisKampanyalari";
	public static final String PARTNER_SERVIS_INFO_MESSAGE = "partnerServis.info.message";
	public static final String PARTNER_SERVIS_PURCHASE_PRODUCT_SUCCESS = "partnerServis.purchase.success";
	public static final String PARTNER_SERVIS_PURCHASE_PRODUCT_ERROR = "partnerServis.purchase.error";

	public static final String TTG_VERIISLEME_RESOURCE = "ttgVeriIsleme";
	public static final String TTG_VERIISLEME_STATU = "ttgVeriIsleme.statu";

	public static final String USER_CONTRACT_GENERAL_RESOURCE = "userContract";
	public static final String ON_BE_HALF_OF_GENERAL_RESOURCE = "onBeHalfOf";
	public static final String PREPAID_PACKAGES_GENERAL_RESOURCE = "prepaidPackages";
	public static final String CURRENT_BILL_DETAIL_GENERAL_RESOURCE = "currentBillDetail";

	public static String MDM_DEVICE_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("MDM_DEVICE_OPERATIONS_WS_ADDRESS");
	public static String MDM_HANDSET_IMAGE_INFO_URL = configForGeneral
			.getValue("MDM_HANDSET_IMAGE_INFO_URL");
	public static String MDM_DEVICE_OPERATIONS_WS_ADDRESS_MOCK = configForGeneral
			.getValue("MDM_DEVICE_OPERATIONS_WS_ADDRESS_MOCK");

	public static final String GENERAL_MESSAGE_SELECT_CUSTCODE = "select.custCode";

	public static String BPM_WIFI_OFFLOAD_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("BPM_WIFI_OFFLOAD_OPERATIONS_WS_ADDRESS");
	public static final String WIFI_OFF_LOAD_ACTV_SUCCESS_MESSAGE = "wifiOffLoadService.ActivationSuccess";
	public static final String WIFI_OFF_LOAD_DEACTV_SUCCESS_MESSAGE = "wifiOffLoadService.DeactivationSuccess";
	public static final String WIFI_OFF_LOAD_RESOURCE = "wifiOffLoadService";

	public static String BSCSFCT_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("BSCSFCT_OPERATIONS_WS_ADDRESS");

	public static final String FCT_CORPORATE_RESOURCE = "corporateMvpn.fct.error";

	public static final String INVOICE_DETAIL_GENERAL_RESOURCE = "displayInvoiceDetails";

	/** SCT **/
	public static String BPM_SCT_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("BPM_SCT_OPERATIONS_WS_ADDRESS");
	public static String SCT_OPERATIONS_WS_ADDRESS = configForGeneral
			.getValue("SCT_OPERATIONS_WS_ADDRESS");

	public static final String INVOICE_DETAIL_NO_INVOICE_FOUND = "displayInvoiceDetails.no.invoice.found";

	public static final String ACME_RESOURCE_NO_DATA_FOUND = "acme.no.data.found";

	public static final String ACME_TRANSACTION_SUCCESS_MESSAGE = "acme.prepaid.transaction.success";
	public static final String ACME_BIMCELL_SUCCESS_MESSAGE = "acme.prepaid.bimcell.success";
	public static final String ACME_DATA_TRANSACTION_SUCCESS_EXTRA_MESSAGE = "acme.prepaid.data.transaction.success.extra";
	public static final String ACME_TRANSACTION_THANKS = "acme.prepaid.thanks";

	public static final String ACME_DATA_TRANSACTION_ERROR_MESSAGE = "acme.prepaid.transaction.error";

	public static final String NENEREDE_KEYWORD = "7777";
	
	public static final String MMS_PROMO_CONFIRM_MESSAGE = "mmsPromo.confirm.message";
	public static final String FUS_SUBSCRIPTION_SUCCESS = "billServices.fus.subscribe.success";

	public static final String FUS_UNSUBSCRIPTION_SUCCESS = "billServices.fus.unsubscribe.success";

	public static final String EFATURA_BENEFIT_MESSAGE = "efatura.benefit.message";

	public static final String EFATURA_BENEFIT_SUCCESS_MESSAGE = "efatura.benefit.success.message";

	public static final String DASHBOARD_CANCEL_SUCCESS = "dashboard.cancel.success";
	
	public static final String $4_5G_SUCCESS_MESSAGE  = "4.5G_SUCCESS_MESSAGE";
	public static final String $4_5G_FAIL_MESSAGE  = "4.5G_FAIL_MESSAGE";
	
	/**
	 * @task(id = 166446)
	 */
	public static final String CC_NUMBER_FOR_PRIME = "444 4 375";
	/**
	 * @task(id = 166446)
	 */
	public static final String CC_NUMBER_DEFAULT = "444 4 375";
	/**
	 * @task(id = 166446)
	 */
	public static final String CC_NUMBER_DOCUMENT_NAME_HR = "ccNumberHr";
	/**
	 * @task(id = 166446)
	 */
	public static final String CC_NUMBER_DOCUMENT_NAME = "ccNumber";
	
	public static final String INSTANTLINK_PROVISIONING_OPERATIONS_WS_ENDPOINT_ADRESS  = configForGeneral.getValue("INSTANTLINK_PROVISIONING_OPERATIONS_WS_ENDPOINT_ADRESS");
	
	public static final String OPEN_CANCEL_POST_DEACT_REASON_CODE= "1018";
	public static final String OPEN_CANCEL_POST_ACT_REASON_CODE= "21";    
	
	/** MNPTONE **/
	public static String BPM_MNPTONE_OPERATIONS_ENDPOINT = configForGeneral
			.getValue("BPM_MNPTONE_OPERATIONS_ENDPOINT");
	public static String MNPTONE_OPERATIONS_ENDPOINT = configForGeneral
			.getValue("MNPTONE_OPERATIONS_ENDPOINT");
    
    public static final String LTE_TOPLU_ISLEM_RESOURCE = "lteTopluIslem";
    public static final String LTE_TOPLU_ISLEM_LTE_DEACTIVATION_SUCCESS = "lteTopluIslem.lte.deactivationSuccess";
    public static final String LTE_TOPLU_ISLEM_LTE_DEACTIVATION_FAIL = "lteTopluIslem.lte.deactivationFail";
    public static final String LTE_TOPLU_ISLEM_LTE_ACTIVATION_SUCCESS = "lteTopluIslem.lte.activationSuccess";
    public static final String LTE_TOPLU_ISLEM_LTE_ACTIVATION_FAIL 	= "lteTopluIslem.lte.activationFail";
    public static final String LTE_TOPLU_ISLEM_THREEG_DEACTIVATION_SUCCESS = "lteTopluIslem.threeG.deactivationSuccess";
    public static final String LTE_TOPLU_ISLEM_THREEG_DEACTIVATION_FAIL = "lteTopluIslem.threeG.deactivationFail";
    public static final String LTE_TOPLU_ISLEM_THREEG_ACTIVATION_SUCCESS = "lteTopluIslem.threeG.activationSuccess";
    public static final String LTE_TOPLU_ISLEM_THREEG_ACTIVATION_FAIL 	= "lteTopluIslem.threeG.activationFail";
    
    public static final String CORP_ADVERTISEMENT_RESOURCE = "corpAdvertisement";
    public static final String CROP_ADVERTISEMENT_CMD = "corpAdvertisement";
    public static final String CROP_ADVERTISEMENT_MUTABAKAT_ERROR = "corpAdvertisement.mutabakat.error";
    public static final String CROP_ADVERTISEMENT_IZIN_1 = "corpAdvertisement.izin.1";
    public static final String CROP_ADVERTISEMENT_IZIN_2 = "corpAdvertisement.izin.2";
    public static final String CROP_ADVERTISEMENT_IZIN_3 = "corpAdvertisement.izin.3";
    public static final String CROP_ADVERTISEMENT_IZIN_4 = "corpAdvertisement.izin.4";
    public static final String CROP_ADVERTISEMENT_IZIN_5 = "corpAdvertisement.izin.5";
    public static final String CROP_ADVERTISEMENT_IZIN_6 = "corpAdvertisement.izin.6";
    public static final String CROP_ADVERTISEMENT_SELECT = "corpAdvertisement.plsSelect";         

    public static final String CHAT_RESOURCE = "newChat";	
	public static final String ONE_TOUCH_VIDEO_RESOURCE = "oneTouchVideo";
	
	public static final String PREPAID_DATA_OIV_IADE_RESOURCE = "prepaidDataOivIade";
	public static final String PREPAID_DATA_OIV_BAKIYE = "bakiye";
	public static final String PREPAID_DATA_OIV_NAKIT = "nakit";
	public static final String PREPAID_DATA_OIV_KURUMSAL = "kurumsal";
	public static final String PREPAID_DATA_OIV_BIREYSEL = "bireysel";

}