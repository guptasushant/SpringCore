package com.springCore.orm.dao;

import java.util.List;

import com.springCore.orm.entities.Student;

public interface StudentDao {
	public void Insert(Student student);

	public Student getStudent(int studentid);

	public List<Student> getallStudents();

	public void delete(int id);

	public void update(Student student);
}
