package com.shape.v1;

public abstract class Shape implements Scaleable{
	   private int x;
	   private int y;
	   private static int count = 0;

	   {
	      count++;
	   }

	   public Shape() {
	      this(0, 0);
	      
	   }

	   public Shape(int x, int y) {
	      this.x = x;
	      this.y = y;
	      count++;
	   }

	   public void setX(int x) {
	      this.x = x;
	   }

	   public int getX() {
	      return x;
	   }

	   public void setY(int y) {
	      this.y = y;
	   }

	   public int getY() {
	      return y;
	   }

	   public void setPosition(int x, int y) {
	      setX(x);
	      setY(y);
	     
	   }

	   public static int getCount() {
	      return count;
	   }
	   
	   
	   
	   
	   @Override
	   public boolean equals(Object shape) {
		   if(shape==null) {
			   return false;
		   }
		if(shape instanceof Shape) {
			if(((Shape)shape).x==x && ((Shape)shape).y==y){
				   return true;
			   }
			
		}
		return false; 
	   }

	   public abstract double getArea();

	   public abstract double getPerimeter();

	   
	}
