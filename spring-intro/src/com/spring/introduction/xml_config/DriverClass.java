package com.spring.introduction.xml_config;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.introduction.xml_config.beans.Student;
import com.spring.introduction.xml_config.beans.Teacher;
import com.spring.introduction.xml_config.c_namespace.CNamespaceDemo;
import com.spring.introduction.xml_config.c_namespace.w.indexing.CNamespaceIndexingDemo;
import com.spring.introduction.xml_config.collection.merge.ChildCollection;
import com.spring.introduction.xml_config.collection.merge.ParentCollection;
import com.spring.introduction.xml_config.collections.SpringCollectionDemo;
import com.spring.introduction.xml_config.constructor.di.ConstructorBaseDi;
import com.spring.introduction.xml_config.constructor.di.ConstructorBaseDiSimpleIndex;
import com.spring.introduction.xml_config.constructor.di.ConstructorBaseDiSimpleName;
import com.spring.introduction.xml_config.constructor.di.ConstructorBaseDiSimpleType;
import com.spring.introduction.xml_config.database.MyDatabaseConnection;
import com.spring.introduction.xml_config.external.bean.Classes;
import com.spring.introduction.xml_config.factory.method.ExampleFactoryMethodDiViaConstArg;
import com.spring.introduction.xml_config.factory.method.FactoryMethodDemoConstructorArgParam;
import com.spring.introduction.xml_config.idref.IdrefDemo;
import com.spring.introduction.xml_config.inheritance.ParentClass;
import com.spring.introduction.xml_config.inheritance.child.ChildClass;
import com.spring.introduction.xml_config.inner_bean.InnerBeanDemo;
import com.spring.introduction.xml_config.instance.method.demo.ClassInstance;
import com.spring.introduction.xml_config.p_namespace.PNamespaceDemo;
import com.spring.introduction.xml_config.setter.di.SetterBasedDi;

public class DriverClass {

	public static void main(String[] args) throws SQLException {

		/**
		 * take note that the bean id in the configuration file matches the class name,
		 * giving the fact of the first letter being lower cased. Use
		 */

		/**
		 * the applicationContext below references two configuration files. the config
		 * file on the class path imports the external config into its configuration and
		 * references the bean defined in the external config file by its id
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		Student student = context.getBean(Student.class);

		System.out.println(student);

		context.close();

		/**
		 * the applicationContext below references multiple configuration files, from
		 * within the constructor. The implementation of referencing one config file
		 * from within the other was not changed when using the approach below and the
		 * added array is not necessarily needed to create all beans. But this is one
		 * way to pass multiple resources to the constructor
		 */
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
				new String[] { "application-context.xml", "external-application-context.xml",
						"factory-method-application-context.xml", "instance-method-application-context.xml",
						"constructor-di-application-context.xml", "constructor-di-simple-type-application-context.xml",
						"constructor-di-simple-index-application-context.xml",
						"constructor-di-simple-name-application-context.xml", "setter-based-di-application-context.xml",
						"factory-method-constructor-arg-application-context.xml",
						"com/spring/introduction/xml_config/database/database-application-context.xml",
						"com/spring/introduction/xml_config/p_namespace/p-namespace-application-context.xml",
						"com/spring/introduction/xml_config/idref/application-context.xml",
						"com/spring/introduction/xml_config/inner_bean/application-context.xml",
						"com/spring/introduction/xml_config/collections/collections-application-context.xml",
						"com/spring/introduction/xml_config/inheritance/child/inheritance-application-context.xml",
						"com/spring/introduction/xml_config/collection/merge/colleciton-merge-application-context.xml",
						"com/spring/introduction/xml_config/c_namespace/c-namespace-application-context.xml",
						"com/spring/introduction/xml_config/c_namespace/w/indexing/c-namespace-indexing-application-context.xml"});

		Student student2 = context2.getBean("student", Student.class);
		Classes classes = context2.getBean("class", Classes.class);
		Teacher teacher = context2.getBean(Teacher.class);
		ClassInstance classInstance = context2.getBean(ClassInstance.class);
		ConstructorBaseDi constructorDi = context2.getBean(ConstructorBaseDi.class);
		ConstructorBaseDiSimpleType diByType = context2.getBean(ConstructorBaseDiSimpleType.class);
		ConstructorBaseDiSimpleIndex diByIndex = context2.getBean(ConstructorBaseDiSimpleIndex.class);
		ConstructorBaseDiSimpleName diByName = context2.getBean(ConstructorBaseDiSimpleName.class);
		SetterBasedDi setterBasedDi = context2.getBean(SetterBasedDi.class);
		ExampleFactoryMethodDiViaConstArg constDiWithConstArg = context2
				.getBean(ExampleFactoryMethodDiViaConstArg.class);
		FactoryMethodDemoConstructorArgParam constDiWithConstArgEx2 = context2
				.getBean(FactoryMethodDemoConstructorArgParam.class);
		MyDatabaseConnection database = context2.getBean(MyDatabaseConnection.class);
		PNamespaceDemo pnd = context2.getBean(PNamespaceDemo.class);
		IdrefDemo idref = context2.getBean(IdrefDemo.class);
		InnerBeanDemo ibd = context2.getBean(InnerBeanDemo.class);
		SpringCollectionDemo scd = context2.getBean(SpringCollectionDemo.class);
		ChildClass cc = context2.getBean(ChildClass.class);
		ParentClass pc = context2.getBean(ParentClass.class);
		ChildCollection cCollection	= context2.getBean(ChildCollection.class);
		CNamespaceDemo cnd = context2.getBean(CNamespaceDemo.class);
		CNamespaceIndexingDemo cnid = context2.getBean(CNamespaceIndexingDemo.class);

		System.out.println(student2);
		System.out.println(classes);
		System.out.println(teacher);
		System.out.println(classInstance);
		System.out.println(constructorDi);
		System.out.println(diByType);
		System.out.println(diByIndex);
		System.out.println(diByName);
		System.out.println(setterBasedDi);
		System.out.println(constDiWithConstArg);
		System.out.println(constDiWithConstArgEx2);

		Statement stmt = database.getMyDbConnection();
		String query = "SELECT * FROM student";
		ResultSet rs = database.executeMyQuery(stmt, query);
		System.out.println(database.printMyQueryResults(rs));

		System.out.println(pnd);
		System.out.println(idref);
		System.out.println(ibd);
		System.out.println(scd);
		System.out.println(pc);
		System.out.println(cc);
		System.out.println(cCollection);
		System.out.println(cnd);
		System.out.println(cnid);

		context2.close();

	}

}
