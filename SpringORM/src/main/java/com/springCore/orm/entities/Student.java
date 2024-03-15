package com.springCore.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "student_id")
	private int studentid;
	@Column(name = "student_name")
	private String studentname;
	@Column(name = "student_city")
	private String studentcity;

	public Student(int studentid, String studentname, String studentcity) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentcity = studentcity;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentcity=" + studentcity
				+ "]";
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}
}
