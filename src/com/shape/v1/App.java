package com.shape.v1;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Rectangle s = new Rectangle(5,7,9,8);
		Circle s1 = new Circle(3,4,6);
		System.out.println(s.getArea());
		
		Shape shape = new Rectangle(5,7,9,8);
		System.out.println(shape.getArea());
		
		Shape shape1 = getRandomShape();
		
		
		System.out.println(shape1.getArea());

	}
	private static Shape getRandomShape() {
		Random number  = new Random();
		int select = number.nextInt(3);
		if(select ==0) {
			return new Rectangle(10,20);
		}else if(select ==1) {
			return new Circle(10);
		}else {
			return new Square(10,20,30);
		}
	}

}
