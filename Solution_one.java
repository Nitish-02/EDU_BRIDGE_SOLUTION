package com.edubridge.assesment_solution;

import java.util.ArrayList;

public class Solution_one {
	public static void main(String[] args) {
		 
	    // Creating an array list
	    ArrayList<Integer> numbers = new ArrayList<>();
	    numbers.add(30);
	    numbers.add(40);
	    numbers.add(50);
	    System.out.println("ArrayList: " + numbers);

	    // Using for loop
	    System.out.println("Iterating over ArrayList using for loop: ");

	    for(int i = 0; i < numbers.size(); i++) {
	      System.out.println(numbers.get(i));
	      
	    }
	    
	 // Using forEach loop
	    System.out.println("Iterating over ArrayList using Advance for loop:");
	    for(Integer value : numbers) {
	      System.out.println(value);
	      
	    }
	    
	    // While Loop for iterating ArrayList		
	      System.out.println("Iterating over ArrayList using While Loop"); 		
	      int count = 0; 		
	      while (numbers.size() > count) {
		 System.out.println(numbers.get(count));
	         count++;
	      }
	  }
   }
