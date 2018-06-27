package com.shape.v1;

import java.util.Random;

public class App {

	public static void main(String[] args) {
		Shape s = new Rectangle(5, 7, 9, 8);
		Shape s1 = new Circle(3, 4, 6);
		Square s2 = new Square(3, 4, 6);
		System.out.println(s.getArea());

		Shape shape = new Rectangle(5, 7, 9, 8);
		System.out.println(shape.getArea());

		Shape shape1 = getRandomShape();
		Shape shape2 = App.getRandomShape();

		System.out.println(shape1.getArea());

		if (shape2 instanceof Square) {
			System.out.println("Square: " + s2.getArea());

		} else if (shape2 instanceof Rectangle) {
			System.out.println("Rectangle: " + s.getArea());
		} else if (shape2 instanceof Circle) {
			System.out.println("Circle: " + s1.getArea());
		}

		IsoScelesTriangle iso = new IsoScelesTriangle(56, 7, 9, 0);
		System.out.println(iso.toString());

		System.out.println(shape.hashCode());
		
		Drawing drawing = new Drawing();
		drawing.printShapes();
		for (int i = 0; i < 100; i++) {
			
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Shape))
			return false;
		if (obj == this)
			return true;
		System.out.println(obj.hashCode());
		return this.getRandomShape() == obj;
	}

	private static Shape getRandomShape() {
		Random number = new Random();
		int select = number.nextInt(3);
		if (select == 0) {
			return new Rectangle(10, 20);
		} else if (select == 1) {
			return new Circle(10);
		} else {
			return new Square(10, 20, 30);
		}

	}

}
