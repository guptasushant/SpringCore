package com.springCore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/reference/refconfig.xml");
		A bean = (A) context.getBean("aref");
			System.out.println(bean.getX());
			System.out.println(bean.getOb());
			System.out.println(bean);
	
	}

}
