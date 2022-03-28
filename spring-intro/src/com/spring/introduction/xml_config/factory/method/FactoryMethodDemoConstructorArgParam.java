package com.spring.introduction.xml_config.factory.method;

public class FactoryMethodDemoConstructorArgParam {
	
	private ExampleFactoryMethodDiViaConstArg factMethViaConstArg;

	public FactoryMethodDemoConstructorArgParam() {
		
	}
	
	public FactoryMethodDemoConstructorArgParam(ExampleFactoryMethodDiViaConstArg factMethViaConstArg) {
		this.factMethViaConstArg = factMethViaConstArg;
	}

	public static FactoryMethodDemoConstructorArgParam getExampleFactoryMethodDiViaConstArg() { 
		return new FactoryMethodDemoConstructorArgParam();
	}

	@Override
	public String toString() {
		return "FactoryMethodDemoConstructorArgParam [factMethViaConstArg=" + factMethViaConstArg + "]";
	}
	
//	public static ExampleFactoryMethodDiViaConstArg getExampleFactoryMethodDiViaConstArg(
//			ExampleFactoryMethodDiViaConstArg factMethViaConstArg) { 
//		factMethViaConstArg = new ExampleFactoryMethodDiViaConstArg(); 
//		return new ExampleFactoryMethodDiViaConstArg();
//	}
	
}
