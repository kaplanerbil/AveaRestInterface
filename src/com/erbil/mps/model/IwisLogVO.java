package com.erbil.mps.model;


import java.io.Serializable;
import java.util.Date;


/**
 * @author Administrator
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class IwisLogVO extends BaseVO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8790691437574058834L;
	private String msisdn;
    private String operation;
    private Date logDate;
    private String input;
    private String output;
    private String iwisReturnCode;
    private String returnCode;
    private int channel;
    private String tariffName;
    private String extraInfo;
    private String customerGroup;
    private String lineType;
    private String billingPeriod;
    private String corporateMsisdn;
    private String chargingInfo;
    private String kioskLocation;
    private String custCode;
    private String processMsisdn;
    private String clientIpPort;
    private String clientPort;
    private String TCID;
    
	public String getTCID() {
		return TCID;
	}

	public void setTCID(String tCID) {
		TCID = tCID;
	}

	
    public String getClientIp() {
		return clientIpPort;
	}

	public void setClientIp(String clientIpPort) {
		this.clientIpPort = clientIpPort;
	}
	
	public String getClientPort() {
		return clientPort;
	}

	public void setClientPort(String clientPort) {
		this.clientPort = clientPort;
	}

	/* (non-Javadoc)
     * @see com.hp.mps.common.vo.BaseVO#toXML()
     */
    public String toXML() {

		StringBuffer sb = new StringBuffer("");
		
		sb.append("<iwis-log>");
		sb.append("<msisdn>" + ((getMsisdn() == null) ? "" : getMsisdn()) + "</msisdn>");
		sb.append("<operation>" + ((getOperation() == null) ? "" : getOperation()) + "</operation>");
		sb.append("<log-date>" + ((getLogDate() == null) ? "" : getLogDate().toString()) + "</log-date>");		
		sb.append("<iwis-return-code>" + ((getIwisReturnCode() == null) ? "" : getIwisReturnCode()) + "</iwis-return-code>");
		sb.append("<return-code>" + ((getReturnCode() == null) ? "" : getReturnCode()) + "</return-code>");
		sb.append("<input>" + ((getInput() == null) ? "" : getInput()) + "</input>");
		sb.append("<output>" + ((getOutput() == null) ? "" : getOutput()) + "</output>");
		sb.append("<channel>" + getChannel() + "</channel>");
		sb.append("<tariff-name>" + ((getTariffName() == null) ? "" : getTariffName()) + "</tariff-name>");
		sb.append("<extra-info>" + ((getExtraInfo() == null) ? "" : getExtraInfo()) + "</extra-info>");
		sb.append("<customer-group>" + ((getCustomerGroup() == null) ? "" : getCustomerGroup()) + "</customer-group>");
		sb.append("<line-type>" + ((getLineType() == null) ? "" : getLineType()) + "</line-type>");
		sb.append("<billing-period>" + ((getBillingPeriod() == null) ? "" : getBillingPeriod()) + "</billing-period>");
		sb.append("<corporate-msisdn>" + ((getCorporateMsisdn() == null) ? "" : getCorporateMsisdn()) + "</corporate-msisdn>");
		sb.append("<charging-info>" + ((getChargingInfo() == null) ? "" : getChargingInfo()) + "</charging-info>");
		sb.append("<kiosk-location>" + ((getKioskLocation() == null) ? "" : getKioskLocation()) + "</kiosk-location>");
		sb.append("<process-msisdn>" + ((getProcessMsisdn() == null) ? "" : getProcessMsisdn()) + "</process-msisdn>");
		sb.append("<client-ip>" + ((getClientIp() == null) ? "" : getClientIp()) + "</client-ip>");
		sb.append("<client-port>" + ((getClientPort() == null) ? "" : getClientPort()) + "</client-port>");	
		sb.append("<tc-id>" + ((getTCID() == null) ? "" : getTCID())+"</tc-id>");
		sb.append("</iwis-log>");
		return sb.toString();
    }    

    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public Date getLogDate() {
        return logDate;
    }
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }
    public String getMsisdn() {
        return msisdn;
    }
    public void setMsisdn(String msisdn) {
    	if(msisdn!=null && msisdn.length()>10)
    	msisdn=msisdn.substring(msisdn.length()-10);
        this.msisdn = msisdn;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public String getOutput() {
        return output;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getIwisReturnCode() {
        return iwisReturnCode;
    }
    public void setIwisReturnCode(String iwisReturnCode) {
        this.iwisReturnCode = iwisReturnCode;
    }
    public String getReturnCode() {
        return returnCode;
    }
    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public String getExtraInfo() {
        return extraInfo;
    }
    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }
    public String getTariffName() {
        return tariffName;
    }
    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }
    public String getCustomerGroup() {
        return customerGroup;
    }
    public void setCustomerGroup(String customerGroup) {
        this.customerGroup = customerGroup;
    }
    public String getLineType() {
        return lineType;
    }
    public void setLineType(String lineType) {
        this.lineType = lineType;
    }
    public String getBillingPeriod() {
        return billingPeriod;
    }
    public void setBillingPeriod(String billingPeriod) {
        this.billingPeriod = billingPeriod;
    }
    public String getCorporateMsisdn() {
        return corporateMsisdn;
    }
    public void setCorporateMsisdn(String corporateMsisdn) {
        this.corporateMsisdn = corporateMsisdn;
    }
    public String getChargingInfo() {
        return chargingInfo;
    }
    public void setChargingInfo(String chargingInfo) {
        this.chargingInfo = chargingInfo;
    }
    public String getKioskLocation() {
        return kioskLocation;
    }
    public void setKioskLocation(String kioskLocation) {
        this.kioskLocation = kioskLocation;
    }
    /**
     * @return Returns the custCode.
     */
    public String getCustCode() {
        return custCode;
    }
    /**
     * @param custCode The custCode to set.
     */
    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

	public String getProcessMsisdn() {
		return processMsisdn;
	}

	public void setProcessMsisdn(String processMsisdn) {
		this.processMsisdn = processMsisdn;
	}
}
