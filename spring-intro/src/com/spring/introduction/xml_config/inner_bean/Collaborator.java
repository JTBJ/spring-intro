package com.spring.introduction.xml_config.inner_bean;

public class Collaborator {

	private String innerBeanRef;
	private String message;
	
	public String getInnerBeanRef() {
		return innerBeanRef;
	}

	public void setInnerBeanRef(String innerBeanRef) {
		this.innerBeanRef = innerBeanRef;
	}

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Collaborator [innerBeanRef=" + innerBeanRef + ", message=" + message + "]";
	}

}
