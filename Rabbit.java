package com.blz;

public class Rabbit extends Animal {
    
	public Rabbit(String id) {
    	this.id = id;
    	name = "Rabbit";
    	colour = Colour.BLACK_WHITE;
    }
	
    @Override
    public void eat() {
    	System.out.println("Rabbits eat carrots");
    }
}