package com.springCore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springCore.javaconfig")
public class Javaconfig {
	//configuring bean thru annotation
	@Bean
	public Samosa getSamosa() {
		Samosa samosa=new Samosa();
		return samosa;
	}
	
	@Bean
	public Student getStudent() {

		Student student=new Student(getSamosa());
		return student;
	}
}
