package com.erbil.mps.constant;

import com.erbil.mps.config.GetConfigForGeneral;

/**
 * Contains common constants used by all modules.
 */
public class MPSConstants {

    public static final String INFOBUS_OTHER_SYSTEM_NAME = "VAS_PORTAL";
    private static GetConfigForGeneral configForGeneral = GetConfigForGeneral.getInstance();

    public static final int HTTP_READ_TIMEOUT = Integer.parseInt(configForGeneral.getValue("HTTP_READ_TIMEOUT"));// 15000'di
    public static final int HTTP_LONG_READ_TIMEOUT = 20000;
    public static final int HTTP_LONG_CONNECTION_TIMEOUT = 10000;
    public static final int HTTP_CONNECTION_TIMEOUT = Integer.parseInt(configForGeneral.getValue("HTTP_CONNECTION_TIMEOUT"));// 5000'di
    public static final int HTTP_SHORT_CONNECTION_TIMEOUT = 2000;
    public static final int HTTP_SHORT_READ_TIMEOUT = 3000;
    public static final int HTTP_BILPAYMENT_READ_TIMEOUT = 65000;
    public static final int HTTP_LIMIT_SUCCESS = 400;
    public static final int HTTP_LIMIT_CLIENT_ERROR = 500;
    
	public static final String PAYMENT_INFO_PAID_STATUS = "1";
	public static final String PAYMENT_INFO_UNPAID_STATUS = "0";
	public static final String PAYMENT_INFO_NUMBER_OF_RECORDS = "5";

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
	
} // class
