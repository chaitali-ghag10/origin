package com.myAbstract;

public class Circle extends Shape {
	
	 private int radius;
	 
	 public Circle(){
		radius =0; 
	 }
	 
	 
	public Circle(int radius,String name) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double area() {
	
		return (3.14*radius*radius);
	}

}
