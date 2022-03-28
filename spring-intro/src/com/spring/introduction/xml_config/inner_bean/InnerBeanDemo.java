package com.spring.introduction.xml_config.inner_bean;

public class InnerBeanDemo {

	private Collaborator bean;

	public Collaborator getBean() {
		return bean;
	}

	public void setBean(Collaborator bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return "InnerBeanDemo [bean=" + bean + "]";
	}
	
}
