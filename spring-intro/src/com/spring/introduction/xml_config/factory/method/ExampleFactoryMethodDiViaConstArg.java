package com.spring.introduction.xml_config.factory.method;


public class ExampleFactoryMethodDiViaConstArg {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ExampleFactoryMethodDiViaConstArg [message=" + message + "]";
	}

}
