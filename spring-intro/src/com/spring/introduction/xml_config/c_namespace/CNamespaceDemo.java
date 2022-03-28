package com.spring.introduction.xml_config.c_namespace;

public class CNamespaceDemo {
	
	private ServesAsConstructorArg_1_ForCNamespace arg1;
	private ServesAsConstructorArg_2_ForCNamespace arg2;
	
	public CNamespaceDemo() {
		
	}
	
	public CNamespaceDemo(ServesAsConstructorArg_1_ForCNamespace arg1, ServesAsConstructorArg_2_ForCNamespace arg2) {
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	@Override
	public String toString() {
		return "CNamespaceDemo [arg1=" + arg1 + ", arg2=" + arg2 + "]";
	}
	
}
