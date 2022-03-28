package com.spring.introduction.xml_config.external.bean;

public class Classes {
	
	private String className;
	private long registrationNum;
	
	public Classes() {
		
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public long getRegistrationNum() {
		return registrationNum;
	}

	public void setRegistrationNum(long registrationNum) {
		this.registrationNum = registrationNum;
	}

	@Override
	public String toString() {
		return "Classes [className=" + className + ", registrationNum=" + registrationNum + "]";
	}
	
}
