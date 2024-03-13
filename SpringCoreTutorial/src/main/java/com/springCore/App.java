package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student bean = (Student) applicationContext.getBean("s1");
        Student bean2 = (Student) applicationContext.getBean("s2");
        Student bean3 = (Student) applicationContext.getBean("s3");
        System.out.println(bean);
        System.out.println(bean2);
        System.out.println(bean3);
    }
}
