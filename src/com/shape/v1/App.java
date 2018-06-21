package com.shape.v1;

public class App {

	public static void main(String[] args) {
		Rectangle s = new Rectangle(5,7,9,8);
		Circle s1 = new Circle(3,4,6);
		System.out.println(s.getArea());
		
		Shape shape = new Rectangle(5,7,9,8);
		System.out.println(shape.getArea());
		

	}

}
