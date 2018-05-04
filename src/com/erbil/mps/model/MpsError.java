package com.erbil.mps.model;

public class MpsError {

	int errorCode;
	String errorMessage;

	public MpsError(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public String getErrorString(){
		return getErrorCode() + " - " + getErrorMessage();
	}

}
