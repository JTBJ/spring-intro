package com.spring.introduction.xml_config.setter.di;

import com.spring.introduction.xml_config.beans.Student;
import com.spring.introduction.xml_config.beans.Teacher;
import com.spring.introduction.xml_config.external.bean.Classes;

public class SetterBasedDi {

	private Student student;
	private Teacher teacher;
	private Classes classes;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	@Override
	public String toString() {
		return "SetterBasedDi [student=" + student + ", teacher=" + teacher + ", classes=" + classes + "]";
	}
	
}
