package com.shape.v1;

public class Drawing {

	private Shape[] shapes = new Shape[100];
	private int size;

	private boolean isPresent(Shape s) {
		boolean isPresent = false;
		for (Shape shape : shapes) {

			if (shape != null && shape.equals(s)) {
				isPresent = true;
			}

		}
		return isPresent;
	}

	

	public void add(Shape s) {
		System.out.println("Adding a shape");
		if (!isPresent(s)) {
			int freeLocation = getFreeLocation();
			if (freeLocation != -1) {
				shapes[freeLocation] = s;
				size++;
				System.out.println("shape has been added");
			} else {
				increaseArraySize();
			}

		}
	}

	private void increaseArraySize() {
		Shape[] newShapeArray = new Shape[200];
		for (int i = 0; i < newShapeArray.length; i++) {
			newShapeArray[i] = shapes[i];
		}
		shapes = newShapeArray;
	}

	public void clear() {
		shapes = new Shape[100];
	}

	public void remove(Shape s) {
		System.out.println("Removing a shape");
		if (isPresent(s)) {
			for (int i = 0; i < shapes.length; i++) {
				if (shapes[i].equals(s) && shapes[i] != null) {
					shapes[i] = null;
					size--;
				} else {
					System.out.println("error[] removing a shape");
				}
			}
		}

	}

	private int getFreeLocation() {
		System.out.println("checking for a free location");
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i] == null) {
				System.out.println("free Location: " + i);
				return i;
			}
		}
		return -1; // -1 basladiginda data nerede diye bakacak.
	}

	public void printShapes() {
		for (Shape shape : shapes) {
			if (shape != null) {
				System.out.println(shape.getArea());
			} else {

			}
		}
	}

}
