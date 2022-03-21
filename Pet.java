package com.blz;

public abstract class Pet {
	
	enum Colour{
		
		BLACK, RED, WHITE, BLUE, BLACK_WHITE, GREEN,GRAY
	}
	
	String id;
	String name;
	Colour colour;
	int age;
	int price;
  
  public abstract void eat();

  		@Override
  		public String toString() {
  		return "Pet [id=" + id + ", name=" + name + ", colour=" + colour + ", age=" + age + ", price=" + price + "]";
  	}
}
