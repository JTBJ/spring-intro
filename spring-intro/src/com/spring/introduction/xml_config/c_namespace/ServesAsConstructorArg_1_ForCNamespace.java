package com.spring.introduction.xml_config.c_namespace;

public class ServesAsConstructorArg_1_ForCNamespace {

	private String cName;
	private int cId;
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "ServesAsConstructorArg_1_ForCNamespace [cName=" + cName + ", cId=" + cId + "]";
	}
}
