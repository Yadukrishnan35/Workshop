package com.blz;

public class Dog extends Animal {
	  
	public Dog(String id){
		
		this.id = id;
		name = "Dog";
		colour = Colour.GRAY;
		
	}
	  @Override
	  public void eat() {
	    System.out.println("Dog eats nonveg items");
	  }
}