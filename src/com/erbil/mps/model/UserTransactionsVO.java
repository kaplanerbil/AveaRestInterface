package com.erbil.mps.model;


import java.io.Serializable;
import java.util.Date;

public class UserTransactionsVO extends BaseVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private long userId;
	private long menuId;
	private Date operationDate;
	private String client_ip;
	private String client_port;
	
	public String getClient_port() {
		return client_port;
	}

	public void setClient_port(String client_port) {
		this.client_port = client_port;
	}

	private int channel;
	private String showOnMenu;
	private String caseId;
	private String domainUserId;
	private String cmd;

    /**
     * @return Returns the menuId.
     */
    public long getMenuId() {
        return menuId;
    }
    /**
     * @param menuId The menuId to set.
     */
    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }
    /**
     * @return Returns the operationDate.
     */
    public Date getOperationDate() {
        return operationDate;
    }
    /**
     * @param operationDate The operationDate to set.
     */
    public void setOperationDate(Date operationDate) {
        this.operationDate = operationDate;
    }
    /**
     * @return Returns the userId.
     */
    public long getUserId() {
        return userId;
    }
    /**
     * @param userId The userId to set.
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

	public String getClient_ip() {
		return client_ip;
	}

	

	public String getShowOnMenu() {
		return showOnMenu;
	}

	public void setClient_ip(String client_ip) {
		this.client_ip = client_ip;
	}

	public void setShowOnMenu(String showOnMenu) {
		this.showOnMenu = showOnMenu;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getDomainUserId() {
		return domainUserId;
	}

	public void setDomainUserId(String domainUserId) {
		this.domainUserId = domainUserId;
	}
}
