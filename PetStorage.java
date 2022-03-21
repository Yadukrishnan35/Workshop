package com.blz;

import java.util.ArrayList;

public class PetStorage {
	  private ArrayList<Pet> petList = new ArrayList();
	  
	  public void add(Pet pet) {
	    petList.add(pet);
	  }
	  
	  /*public void add(Dog dog) {
	    petList.add(dog);
	  }
	  
	  public void add(Duck duck) {
	    petList.add(duck);
	  }
	  
	  public void add(Parrot parrot) {
	    petList.add(parrot);
	  }
	  
	  public void add(Rabbit rabbit) {
	    petList.add(rabbit); 
	  } */
	  
	  public ArrayList getPetList() {
	    return petList;
	    
	  }

	  public void remove(Pet pet) {
		  petList.remove(pet);
	  }

}