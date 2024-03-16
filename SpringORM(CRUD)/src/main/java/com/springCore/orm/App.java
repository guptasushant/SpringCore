package com.springCore.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.orm.dao.StudentDao;
import com.springCore.orm.dao.StudentDaoimpl;
import com.springCore.orm.entities.Student;

/**
 * CRUD operation with hibernate configuration In SpringOrm
 *
 */
public class App {
	private static int id;
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springCore/orm/config.xml");
		StudentDao dao = context.getBean("studentDaoimpl", StudentDaoimpl.class);
		//StudentDao sdao=new StudentDao();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean go = true;
		while (go) {
			System.out.println("====================================Welcome to CRUD operation===================================================");
			System.out.println("PRESS 1 TO ADD NEW STUDENT");
			System.out.println("PRESS 2 DISPLAY ALL STUDENT");
			System.out.println("PRESS 3 DISPLAY TO SINGLE STUDENT");
			System.out.println("PRESS 4 TO DELETE STUDENT");
			System.out.println("PRESS 5 TO UPDATE STUDENT");
			System.out.println("PRESS 6 TO EXIT");
			try {
				int i = Integer.parseInt(br.readLine());
				
				switch (i) {
				case 1:
					// add new student
					Student bean =new Student();
					System.out.println("enter student ID");
					bean.setStudentid(Integer.parseInt(br.readLine()));
					System.out.println("enter student name");
					bean.setStudentname(br.readLine());
					System.out.println("enter student city");
					bean.setStudentcity(br.readLine());
					 dao.Insert(bean);
					System.out.println("DONE");
					break;
				case 2:
					// display all student
					System.out.println(dao.getallStudents());
					break;
				case 3:
					// display single student data
					System.out.println("enter the id you want to find ");
					id = Integer.parseInt(br.readLine());
					System.out.println(dao.getStudent(id));
					break;
				case 4:
					// delete student
					System.out.println("Enter the id you want to delete :");
					 id=Integer.parseInt(br.readLine());
					dao.delete(id);
					break;
				case 5:
					// update student
					System.out.println("Enter the id you want to update :");
					id=Integer.parseInt(br.readLine());
					Student student = dao.getStudent(id);
					//Student student=new Student();
					System.out.println("enter the updated name:");
					student.setStudentname(br.readLine());
					System.out.println("enter the updated city:");
					student.setStudentcity(br.readLine());
					//student.setStudentid(id);
					dao.update(student);
					break;
				case 6:
					// exit console
					go=false;
					break;
				default:
					System.out.println("invalid input ");
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		System.out.println("thankyou for using out application");
	}
}
