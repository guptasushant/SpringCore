package com.springCore;

public class Student {
	private int Studentid;
	private String Studentname;
	private String Studentaddress;

	public int getStudentid() {
	return Studentid;
}

	public void setStudentid(int studentid) {
		Studentid = studentid;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getStudentaddress() {
		return Studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		Studentaddress = studentaddress;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studentid, String studentname, String studentaddress) {
		super();
		Studentid = studentid;
		Studentname = studentname;
		Studentaddress = studentaddress;
	}

	public String toString() {
		return "Student [Studentid=" + Studentid + ", Studentname=" + Studentname + ", Studentaddress=" + Studentaddress
				+ "]";
	}
}
