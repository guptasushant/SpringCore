package com.springCore.Ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("constructor: int,int");
	}
	public Addition(double a,double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
	System.out.println("constructor :double ,double");
	}
	public void dosum() 
	{
		System.out.println("Sum is :"+(this.a + this.b));
	}
}
