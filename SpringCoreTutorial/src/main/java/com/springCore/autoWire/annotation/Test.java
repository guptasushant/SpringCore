package com.springCore.autoWire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/autoWire/annotation/autoconfig.xml");
		Emp bean = context.getBean("emp", Emp.class);
		Emp bean2 = context.getBean("emp2", Emp.class);
		System.out.println(bean);
		System.out.println(bean2);
	}
}
