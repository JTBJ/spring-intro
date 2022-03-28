package com.spring.introduction.xml_config.beans;

public class Teacher {
	
	private String name;
	private String courseTaught;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseTaught() {
		return courseTaught;
	}
	public void setCourseTaught(String courseTaught) {
		this.courseTaught = courseTaught;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", courseTaught=" + courseTaught + "]";
	}

}
