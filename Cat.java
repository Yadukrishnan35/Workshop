package com.blz;

public class Cat extends Animal {
	 
	public Cat(String id){
		this.id = id;
		name = "Cat";
		colour = Colour.BLACK;
	
	}
	@Override
	  public void eat() {
	    System.out.println("Cats eat fish");
	  }
}
