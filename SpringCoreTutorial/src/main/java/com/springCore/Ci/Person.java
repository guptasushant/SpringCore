package com.springCore.Ci;

import java.util.List;

public class Person {
	private String name;
	private int personid;
	private Certi certi;
	private List<String>info;
	public Person(String name, int personid,Certi certi,List<String>info) {
		super();
		this.name = name;
		this.personid = personid;
		this.certi=certi;
		this.info=info;
	}

	@Override
	public String toString() {
		return "Name:"+this.name+","+"ID :"+this.personid+" { "+"certification :"+this.certi.getName()+" }"+this.info;
	}
}
