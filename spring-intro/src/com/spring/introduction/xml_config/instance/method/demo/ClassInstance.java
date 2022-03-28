package com.spring.introduction.xml_config.instance.method.demo;

public class ClassInstance {
	
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ClassInstance [location=" + location + "]";
	}
	
}
