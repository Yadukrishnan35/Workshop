package com.blz;

import java.util.ArrayList;

public class UserInterface {
	  
	public void print(ArrayList petList) {
	    
		/*
		 * for(int i = 0; i < petList.size();i++) {
		 * 
		 * System.out.println("Pet list is:"+petList.get(i)); }
		 */
		for(Object o : petList) {
			System.out.println(o);
		}
	}
	
	//obj instanceOf Animal
	public void printAnimal(ArrayList petList) {
		for(Object o : petList) {
			if(o instanceof Animal) {
				System.out.println(o);
			}
		
		}
	
	}

	public void printBirds(ArrayList petList) {
		for(Object o : petList) {
			if(o instanceof Bird) {
				System.out.println(o);
			}
	
		}

	}
}