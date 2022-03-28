package com.spring.introduction.xml_config.p_namespace;

public class PNamespaceDemo {
	
	private String pName;
	private int pId;
	private String pOccupation;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpOccupation() {
		return pOccupation;
	}
	public void setpOccupation(String pOccupation) {
		this.pOccupation = pOccupation;
	}
	@Override
	public String toString() {
		return "PNamespaceDemo [pName=" + pName + ", pId=" + pId + ", pOccupation=" + pOccupation + "]";
	}

}
