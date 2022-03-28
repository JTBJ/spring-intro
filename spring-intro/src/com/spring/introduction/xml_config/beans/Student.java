package com.spring.introduction.xml_config.beans;

import com.spring.introduction.xml_config.external.bean.Classes;

public class Student {
	
	private String name;
	private long id;
	private String className;
	private Classes clazz;
	
	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Classes getClazz() {
		return clazz;
	}

	public void setClazz(Classes clazz) {
		this.clazz = clazz;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", className=" + className + ", clazz=" + clazz + "]";
	}

}
