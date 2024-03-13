package com.springCore.standalone.collections;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/standalone/collections/standaloneconfig.xml");
		Person bean = context.getBean("person1",Person.class);
		//Person bean2 = context.getBean("person2",Person.class);
		System.out.println(bean);
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(bean.getFeestructure().getClass().getName());
		//System.out.println(bean2);
	}
}
