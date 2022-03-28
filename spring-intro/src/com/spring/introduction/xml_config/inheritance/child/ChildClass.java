package com.spring.introduction.xml_config.inheritance.child;

public class ChildClass {

	private String group;
	private String id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "ChildClass [group=" + group + ", id=" + id + "]";
	}
}
