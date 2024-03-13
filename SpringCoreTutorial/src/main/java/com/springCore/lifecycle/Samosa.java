package com.springCore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public void start() {
		System.out.println("inside Init method");
	}

	public void end() {
		System.out.println("inside destroy method");
	}
}
