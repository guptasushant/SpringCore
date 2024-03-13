package com.springCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
private double Price;

public double getPrice() {
	return Price;
}

public void setPrice(double price) {
	Price = price;
}

@Override
public String toString() {
	return "Pepsi [Price=" + Price + "]";
}

@Override
public void destroy() throws Exception {
	System.out.println("pepsi:destroy");
}

@Override
public void afterPropertiesSet() throws Exception {
}

}
