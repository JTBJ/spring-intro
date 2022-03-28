package com.spring.introduction.xml_config.idref;

public class Collaborator {

	private String idRef;
	private String message;
	
	public String getIdRef() {
		return idRef;
	}
	public void setIdRef(String idRef) {
		this.idRef = idRef;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Collaborator [idRef=" + idRef + ", message=" + message + "]";
	}

}
