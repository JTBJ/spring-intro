package com.spring.introduction.xml_config.constructor.di;

public class ConstructorBaseDiSimpleIndex {
	
	private String someName;
	private int someAge;
	
	public ConstructorBaseDiSimpleIndex(String someName, int someAge) {
		this.someName = someName;
		this.someAge = someAge;
	}

	public String getSomeName() {
		return someName;
	}

	public void setSomeName(String someName) {
		this.someName = someName;
	}

	public int getSomeAge() {
		return someAge;
	}

	public void setSomeAge(int someAge) {
		this.someAge = someAge;
	}

	@Override
	public String toString() {
		return "ConstructorBaseDiSimpleIndex [someName=" + someName + ", someAge=" + someAge + "]";
	}
	
}
