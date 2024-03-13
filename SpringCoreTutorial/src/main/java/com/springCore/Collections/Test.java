package com.springCore.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/springCore/Collections/collectionConfig.xml");
		Emp bean = (Emp) appContext.getBean("emp");
		System.out.println("The Name is "+bean.getEmpname());
		System.out.println(bean.getPhones());
		System.out.println(bean.getAddresses());
		System.out.println(bean.getCourses());
		System.out.println(bean);
	}
}
