package com.shape.v1;

public class Circle extends Shape {

	private int radius;
	public static final int ANGLES;
	private static int count;

	static {
		count = 0;
		ANGLES = 0;
	}

	

	public Circle() {
		
	}

	public Circle(int radius) {

	}

	public Circle(int radius, int x, int y) {

	}

	public Circle(Circle c) {

	}

	public int getRadius() {
		return 0;
	}

	public double getArea() {
		return 0;
	}

	public double getPerimeter() {
		return 0;
	}

	public static int getCount() {
		return count;

	}

	public void setRadius(int radius) {

	}

}
