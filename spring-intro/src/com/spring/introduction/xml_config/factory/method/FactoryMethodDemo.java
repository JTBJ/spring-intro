package com.spring.introduction.xml_config.factory.method;

import com.spring.introduction.xml_config.beans.Teacher;

public class FactoryMethodDemo {
	
	/**
	 * has to be declared in the static context to be seen 
	 * by the container
	 */
	public static Teacher getTeacher() {
		return new Teacher();
	}
	
	public static Teacher getTeacherParam(Teacher teacher) {
		return getTeacher();
	}

}
