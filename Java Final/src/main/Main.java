package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int userChoice;		
		
     Scanner input = new Scanner(System.in);
     
     System.out.println("Before we start this story you will need to choose a number (this number will decide what charcter you are.)");
     System.out.println("Choose a number between 1 and 5 >>> ");
     userChoice = input.nextInt();
     System.out.println("");
     
     
     
     if (userChoice == 1)
	 backStories.BackStory1.displayBackStory1();	
     else if(userChoice == 2) 
     {
    	backStories.BackStory2.displayBackStory2(); 
     }
     else if(userChoice == 3) 
     {
    	 backStories.BackStory3.displayBackStory3();
     }
     else if(userChoice == 4) 
     {
    	 backStories.BackStory4.displayBackStory4();
     }
     else if(userChoice == 5) 
     {
    	 backStories.BackStory5.displayBackStory5();
     }
     else
    	 System.out.print("Failure to choose a charcter just leaves them all stranded bud, ya killed em. Nice job. Applause for you 'rulebreaker'.");
	}
	
}
