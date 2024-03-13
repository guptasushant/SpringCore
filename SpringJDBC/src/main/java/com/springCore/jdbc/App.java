package com.springCore.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.jdbc.dao.StudentDao;
import com.springCore.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	 public static void main(String[] args) {
		 System.out.println("hello world !");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/jdbc/config.xml");
		StudentDao studentdao = context.getBean("daoimpl", StudentDao.class);
		Student bean = new Student();
		Scanner sc = new Scanner(System.in);
		int button ;
		do {
			System.out.println("enter 1 to add ");
			System.out.println("enter 2 to update ");
			System.out.println("enter 3 to delete ");
			System.out.println("enter 4 to fetch by id ");
			System.out.println("enter 5 to fetch all ");
			System.out.println("-------------------------------------------------------------------------");
			button=sc.nextInt();
			switch (button) {
			case 1:
				System.out.println("enter the ID here:");
				bean.setId(sc.nextInt());
				System.out.println("enter the name here:");
				bean.setName(sc.next());
				System.out.println("enter the city here:");
				bean.setCity(sc.next());
				int result = studentdao.insert(bean);
				System.out.println("number of data added :" + result);
				break;
			case 2:
				System.out.println("enter the id to update :");
				bean.setId(sc.nextInt());
				System.out.println("enter the name to update :");
				bean.setName(sc.next());
				System.out.println("enter the city to update :");
				bean.setCity(sc.next());
				int result2 = studentdao.update(bean);
				System.out.println("updated the data :" + result2);
				break;
			case 3:
				System.out.println("enter the id want to delete :");
				int delete = studentdao.delete(sc.nextInt());
				System.out.println("id deleted successfully:" + delete);
				break;
			case 4:
				System.out.println("enter the id want to fetch :");
				Student fetch = studentdao.getStudent(sc.nextInt());
				System.out.println("fetched by id" + fetch);
				break;
			case 5:
				List<Student> list = studentdao.getallStudents();
				for (Student student : list) {
					System.out.println(student);
				}
				break;
			default:
				System.out.println("INVALID BUTTON ");
			}
		} while (button != 0);

	}
}
