package com.springCore.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springCore.orm.entities.Student;

public class StudentDaoimpl implements StudentDao {

	HibernateTemplate hibernateTemplate;

	@Transactional
	public void Insert(Student student) {
		// insert object`
		System.out.println(student);
		this.hibernateTemplate.save(student);

	}

	// fetch single student data
	public Student getStudent(int studentid) {
		Student student = this.hibernateTemplate.get(Student.class, studentid);
		return student;
	}

	// get all students data
	public List<Student> getallStudents() {
		List<Student> list = this.hibernateTemplate.loadAll(Student.class);
		return list;
	}

	// delete student from database first getting from get method then using delete
	// method of hibernate template
	@Transactional
	public void delete(int id) {
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}

	// update data
	@Transactional
	public void update(Student student) {
		this.hibernateTemplate.update(student);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
