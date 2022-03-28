package com.spring.introduction.xml_config.c_namespace.w.indexing;

public class CNamespaceIndexingDemo {
	
	private ServesAsConstructorArg_1_ForCNamespaceIndexing arg1;
	private ServesAsConstructorArg_2_ForCNamespaceIndexing arg2;
	
	public CNamespaceIndexingDemo(ServesAsConstructorArg_1_ForCNamespaceIndexing arg1, ServesAsConstructorArg_2_ForCNamespaceIndexing arg2) {
		this.arg1 = arg1;
		this.arg2 = arg2;
	}

	@Override
	public String toString() {
		return "CNamespaceIndexingDemo [arg1=" + arg1 + ", arg2=" + arg2 + "]";
	}
	
}
