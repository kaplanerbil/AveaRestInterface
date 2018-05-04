package com.erbil.mps.model;

import java.util.List;

import com.erbil.mps.PaymentInfoVO;


public class SubscriberVO extends BaseVO implements java.io.Serializable {

    private static final long serialVersionUID = 7250632845379895934L;
    private String customerType;
    private String lineStatus;
    private String msisdn;
    private String customerGroup;
    private String custCode;
    private String coRep;
    private String tariffName;
    private String billingPeriod;
    private String password;
    private String billAmount;
    private List<PaymentInfoVO> invoices;
    
    private UserTransactionsVO log;
    
    /*
     * BrandCode,BrandName MVNO icin eklendi.Seda 18/12/2008
     */
    private String brandCode;
    private String brandName;
    private String is3G;
    /**
     * 
     * Added for Lost Stolen Lines Seda 15/7/2009
     */
    private String reasonCode;
    private String serviceCode;
    private String tariffCode;
    private String segment;
    private String imsi;

    
    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
     * @return Returns the customerType.
     */
    public String getCustomerType() {
	return customerType;
    }

    /**
     * @param customerType
     *            The customerType to set.
     */
    public void setCustomerType(String customerType) {
	this.customerType = customerType;
    }

    /**
     * @return Returns the lineStatus.
     */
    public String getLineStatus() {
	return lineStatus;
    }

    /**
     * @param lineStatus
     *            The lineStatus to set.
     */
    public void setLineStatus(String lineStatus) {
	this.lineStatus = lineStatus;
    }

    /**
     * @return Returns the msisdn.
     */
    public String getMsisdn() {
	return msisdn;
    }

    /**
     * @param msisdn
     *            The msisdn to set.
     */
    public void setMsisdn(String msisdn) {
	this.msisdn = msisdn;
    }

    public String toXML() {
	StringBuffer sb = new StringBuffer("");
	sb.append("<SubscriberVO>");
	sb.append("<msisdn>" + getMsisdn() + "</msisdn>");
	sb.append("<lineStatus>" + getLineStatus() + "</lineStatus>");
	sb.append("<subscriberType>" + getCustomerType() + "</subscriberType>");
	sb.append("<customerGroup>" + getCustomerGroup() + "</customerGroup>");
	sb.append("<tariffName>" + ((getTariffName() == null) ? "" : getTariffName()) + "</tariffName>");
	sb.append("<tariffCode>" + ((getTariffCode() == null) ? "" : getTariffCode()) + "</tariffCode>");
	sb.append("<billingPeriod>" + ((getBillingPeriod() == null) ? "" : getBillingPeriod()) + "</billingPeriod>");
	sb.append("<brandCode>" + ((getBrandCode() == null) ? "" : getBrandCode()) + "</brandCode>");
	sb.append("<brandName>" + ((getBrandName() == null) ? "" : getBrandName()) + "</brandName>");
	sb.append("<is3G>" + ((getIs3G() == null) ? "N" : getIs3G()) + "</is3G>");
	sb.append("<reasonCode>" + ((getReasonCode() == null) ? "" : getReasonCode()) + "</reasonCode>");
	sb.append("<serviceCode>" + ((getServiceCode() == null) ? "" : getServiceCode()) + "</serviceCode>");
	sb.append("</SubscriberVO>");
	return sb.toString();
    } // toXML

    /**
     * @return Returns the customerGroup.
     */
    public String getCustomerGroup() {
	return customerGroup;
    }

    /**
     * @param customerGroup
     *            The customerGroup to set.
     */
    public void setCustomerGroup(String customerGroup) {
	this.customerGroup = customerGroup;
    }

    /**
     * @return Returns the custCode.
     */
    public String getCustCode() {
	return custCode;
    }

    /**
     * @param custCode
     *            The custCode to set.
     */
    public void setCustCode(String custCode) {
	this.custCode = custCode;
    }

    /**
     * @return Returns the billingPeriod.
     */
    public String getBillingPeriod() {
	return billingPeriod;
    }

    /**
     * @param billingPeriod
     *            The billingPeriod to set.
     */
    public void setBillingPeriod(String billingPeriod) {
	this.billingPeriod = billingPeriod;
    }

    /**
     * @return Returns the coRep.
     */
    public String getCoRep() {
	return coRep;
    }

    /**
     * @param coRep
     *            The coRep to set.
     */
    public void setCoRep(String coRep) {
	this.coRep = coRep;
    }

    /**
     * @return Returns the tariffName.
     */
    public String getTariffName() {
	return tariffName;
    }

    /**
     * @param tariffName
     *            The tariffName to set.
     */
    public void setTariffName(String tariffName) {
	this.tariffName = tariffName;
    }

    public String getBrandCode() {
	return brandCode;
    }

    public void setBrandCode(String brandCode) {
	this.brandCode = brandCode;
    }

    public String getBrandName() {
	return brandName;
    }

    public void setBrandName(String brandName) {
	this.brandName = brandName;
    }

    public String getIs3G() {
	return is3G;
    }

    public void setIs3G(String is3G) {
	this.is3G = is3G;
    }

    public String getReasonCode() {
	return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
	this.reasonCode = reasonCode;
    }

    public String getServiceCode() {
	return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
	this.serviceCode = serviceCode;
    }

    public String getTariffCode() {
	return tariffCode;
    }

    public void setTariffCode(String tariffCode) {
	this.tariffCode = tariffCode;
    }

    public String getSegment() {
	return segment;
    }

    public void setSegment(String segment) {
	this.segment = segment;
    }

    public String toString() {
	return "SubscriberVO [customerType=" + customerType + ", lineStatus=" + lineStatus + ", msisdn=" + msisdn + ", customerGroup=" + customerGroup + ", custCode=" + custCode + ", coRep=" + coRep + ", tariffName=" + tariffName + ", billingPeriod=" + billingPeriod + ", brandCode=" + brandCode + ", brandName=" + brandName + ", is3G=" + is3G + ", reasonCode=" + reasonCode + ", serviceCode=" + serviceCode + ", tariffCode=" + tariffCode + ", segment=" + segment + "]";
    }

    public String getImsi() {
	return imsi;
    }

    public void setImsi(String imsi) {
	this.imsi = imsi;
    }

	public UserTransactionsVO getLog() {
		return log;
	}

	public void setLog(UserTransactionsVO log) {
		this.log = log;
	}

	public String getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

	public List<PaymentInfoVO> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<PaymentInfoVO> invoices) {
		this.invoices = invoices;
	}

} // class
