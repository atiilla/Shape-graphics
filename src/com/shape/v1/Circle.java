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
		this(0);
	}

	public Circle(int radius) {
		this(radius, 0, 0);
	}

	public Circle(int radius, int x, int y) {
		super(x, y);
		this.radius = radius;
		count++;
	}

	public Circle(Circle circle) {
		this(circle.radius, circle.getX(), circle.getY());
	}

	public int getRadius() {
		return radius;
	}
	
	public void scale(int factor) {
		setRadius(factor*radius/100);
		
	}
	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	public double getArea() {
		return radius * radius*3.14;
	}

	public double getPerimeter() {
		return (radius + radius*3.14);
	}

	public static int getCount() {
		return count;

	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
