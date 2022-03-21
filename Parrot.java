package com.blz;

public class Parrot extends Bird {
	 
	public Parrot(String id) {
		this.id = id;
		name = "Parrot";
		colour = Colour.RED;
	 }
	@Override
	  public void eat() {
	    System.out.println("Parrots eat paddy");
	  }
}