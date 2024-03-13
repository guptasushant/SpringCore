package com.springCore.autoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/autoWire/autoconfig.xml");
		Emp bean = context.getBean("emp", Emp.class);
		System.out.println(bean);
	}
}
