package com.springCore.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springCore.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		int update = this.jdbcTemplate.update(query, student.getId(),student.getName(),student.getCity());
		return update;
	}

	@Override
	public int update(Student student) {
		String query="update student set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return update;
	}

	@Override
	public int delete(int studentid) {
		String query="delete from student where id=?";
		int i = this.jdbcTemplate.update(query,studentid);
		return i;
	}

	@Override
	public Student getStudent(int studentid) {
		String query="select * from student where id=?";
		RowMapper<Student> rowmapper = new RowMapperimpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowmapper,studentid);
		return student;
	}

	@Override
	public List<Student> getallStudents() {
		String query="select * from student";
		List<Student> student = this.jdbcTemplate.query(query,new RowMapperimpl());
		return student;
	}

}
