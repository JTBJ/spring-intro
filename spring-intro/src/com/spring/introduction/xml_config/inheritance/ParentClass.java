package com.spring.introduction.xml_config.inheritance;

public class ParentClass {
	
	private String group;
	private String id;
	
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ParentClass [group=" + group + ", id=" + id + "]";
	}

}
