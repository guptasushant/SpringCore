package com.springCore.autoWire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	private int id;
	private String name;
	private double salary;
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	public Emp(int id, String name, double salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Address address) {
		super();
		this.address=address;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
