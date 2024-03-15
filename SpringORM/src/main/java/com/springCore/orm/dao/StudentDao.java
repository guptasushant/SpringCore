package com.springCore.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springCore.orm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int Insert(Student student) {
		// insert object`
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
}
