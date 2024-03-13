package com.springCore.javaconfig;

public class Student {
	
	
	private Samosa samosa;
	
	public void Study() {
		this.samosa.display();
		System.out.println("Student is studying");
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
}
