package com.erbil.mps;

import com.erbil.mps.model.BaseVO;




public class PaymentInfoVO extends BaseVO implements java.io.Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4726743003758171012L;
	private String accessType_;	
    private String phoneNumber_;	
    private String custNumber_;
    private String name_;
    private String billType_;
    private String dueDate_;
    private String referenceNo_;
    private String billNo_;
    private String billSeqNo_;
	private String billPeriod_;
	private String billAmount_;
	private String returnCode;
	private String returnMessage;
	
	public String toXML()
	{
		StringBuffer sb = new StringBuffer("");
		sb.append("<bills>");
		sb.append("<billPeriod>" + ((getBillPeriod() == null) ? "" : getBillPeriod() ) + "</billPeriod>");
		sb.append("<billAmount>" + ((getBillAmount() == null) ? "" : getBillAmount() ) + "</billAmount>");		
		sb.append("</bills>");	
		return sb.toString();
	} // toXML
	
    public String getBillAmount() {
        return billAmount_;
    }
    public void setBillAmount(String billAmount_) {
        this.billAmount_ = billAmount_;
    }
    public String getBillPeriod() {
        return billPeriod_;
    }
    public void setBillPeriod(String billPeriod_) {
        this.billPeriod_ = billPeriod_;
    }
    
    public String getAccessType() {
        return accessType_;
    }
    public void setAccessType(String accessType_) {
        this.accessType_ = accessType_;
    }
    
    public String getBillNo() {
        return billNo_;
    }
    public void setBillNo(String billNo_) {
        this.billNo_ = billNo_;
    }
    public String getBillSeqNo() {
        return billSeqNo_;
    }
    public void setBillSeqNo(String billSeqNo_) {
        this.billSeqNo_ = billSeqNo_;
    }
    public String getBillType() {
        return billType_;
    }
    public void setBillType(String billType_) {
        this.billType_ = billType_;
    }
    public String getCustNumber() {
        return custNumber_;
    }
    public void setCustNumber(String custNumber_) {
        this.custNumber_ = custNumber_;
    }
    public String getDueDate() {
        return dueDate_;
    }
    public void setDueDate(String dueDate_) {
        this.dueDate_ = dueDate_;
    }
    public String getName() {
        return name_;
    }
    public void setName(String name_) {
        this.name_ = name_;
    }
    public String getPhoneNumber() {
        return phoneNumber_;
    }
    public void setPhoneNumber(String phoneNumber_) {
        this.phoneNumber_ = phoneNumber_;
    }
    public String getReferenceNo() {
        return referenceNo_;
    }
    public void setReferenceNo(String referenceNo_) {
        this.referenceNo_ = referenceNo_;
    }

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public String getReturnMessage() {
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) {
		this.returnMessage = returnMessage;
	}
}
