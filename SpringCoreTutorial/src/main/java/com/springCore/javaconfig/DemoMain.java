package com.springCore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
	ApplicationContext context= new AnnotationConfigApplicationContext(Javaconfig.class);
	Student bean = context.getBean(Student.class);
	bean.Study();
	System.out.println(bean);
	}
}
