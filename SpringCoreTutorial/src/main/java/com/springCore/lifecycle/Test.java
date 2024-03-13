package com.springCore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/lifecycle/lifeconfig.xml");
		Samosa bean = (Samosa) context.getBean("sam");
		System.out.println(bean);
		// registering shutdown hook and calling destroy
		context.registerShutdownHook();
		System.out.println("----------------------------------------------------------------");
		Pepsi bean2 = (Pepsi) context.getBean("pep");
		System.out.println(bean2);
		System.out.println("----------------------------------------------------------------");
		Example bean3 = (Example) context.getBean("ex");
		System.out.println(bean3);
		
	}

}
