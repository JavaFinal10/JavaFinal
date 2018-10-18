package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int userChoice;		
		
     Scanner input = new Scanner(System.in);
     
     System.out.println("Before we start this story you will need to choose a number (this number will decide what charcter you are.)");
     System.out.println("Choose a number between 1 and 3 >>> ");
     userChoice = input.nextInt();
     System.out.println("");
     
     
     
     if (userChoice == 1) {
    	backStories.BackStory1.displayBackStory1();
 	indEncounters.indEncounter1.displayindEncounter1();
 	}
     else if(userChoice == 2) 
     {
    	backStories.BackStory2.displayBackStory2(); 
     }
     else if(userChoice == 3) 
     {
    	backStories.BackStory3.displayBackStory3();
     }
     
     else
    	System.out.println("Failure to choose a character has gotten them killed. Good job bud, restart and play the game right.");
	}
	
}
