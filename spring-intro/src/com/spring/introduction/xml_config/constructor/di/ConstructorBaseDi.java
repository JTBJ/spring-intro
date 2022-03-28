package com.spring.introduction.xml_config.constructor.di;

import com.spring.introduction.xml_config.beans.Student;
import com.spring.introduction.xml_config.beans.Teacher;

public class ConstructorBaseDi {
	
	private Student student;
	private Teacher teacher;

	public ConstructorBaseDi(Student student, Teacher teacher) {
		this.student = student;
		this.teacher = teacher;
	}

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

	@Override
	public String toString() {
		return "ConstructorBaseDi [student=" + student + ", teacher=" + teacher + "]";
	}
	
}
