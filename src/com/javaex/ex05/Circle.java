package com.javaex.ex05;

public class Circle {

	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public String toString() {
		return "Circle [radius" + radius + "]";
	}
	
}
