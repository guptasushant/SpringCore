package com.springCore.jdbc.dao;

import java.util.List;

import com.springCore.jdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(int studentid);
	public Student getStudent(int studentid);
	public List<Student> getallStudents();
}
