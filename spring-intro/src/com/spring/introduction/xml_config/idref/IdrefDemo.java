package com.spring.introduction.xml_config.idref;

public class IdrefDemo {

	private Collaborator bean;

	public Collaborator getBean() {
		return bean;
	}

	public void setBean(Collaborator bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return "IdrefDemo [bean=" + bean + "]";
	}
	
}
