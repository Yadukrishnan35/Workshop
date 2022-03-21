package com.blz;

import java.util.ArrayList;

public class Main {

	 public static void main(String[] args) {
		    System.out.println("Welcome to pet management system");
		    
		    Dog dog = new Dog("D001");
		    dog.age = 4;
		    dog.price = 500;
		    dog.breed = "German";
		    
		    Duck duck = new Duck("DK001");
		    duck.age = 8;
		    duck.price = 500;
		    duck.species = "DDD";
		 
		    Parrot parrot = new Parrot("P001");
		    parrot.age = 8;
		    parrot.price = 500;
		    parrot.species = "PPP";
		    
		    Rabbit rabbit = new Rabbit("R001");
		    rabbit.age = 6;
		    rabbit.price = 700;
		    rabbit.breed = "RRR";
		 
		    
		    Cat cat = new Cat("C001");
		    cat.age = 7;
		    cat.price = 500;
		    cat.breed = "CCC";
		 
		    
		    PetStorage petStorage = new PetStorage();
		    petStorage.add(cat);
		    petStorage.add(dog);
		    petStorage.add(duck);
		    petStorage.add(parrot);
		    petStorage.add(rabbit);
		    
		    UserInterface userInterface = new UserInterface();
		    		    
		    ArrayList petList = petStorage.getPetList();
		    userInterface.print(petList);
		    
		    System.out.println("Printing Animals");
		    userInterface.printAnimal(petList);
		    System.out.println("Printing Birds only");
		    userInterface.printBirds(petList);
		    
		    petStorage.remove(cat);
		    System.out.println("After removing");
		    petList = petStorage.getPetList();
		    userInterface.print(petList);
		    
	 }

}
