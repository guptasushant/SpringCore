package com.springCore.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.orm.dao.StudentDao;
import com.springCore.orm.entities.Student;

/**
 * hibernate configuration In SpringOrm 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/orm/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student bean =new Student(101,"sushant","mumbai");
        int i = studentDao.Insert(bean);
        System.out.println("Done :"+i);
        
    }
}
