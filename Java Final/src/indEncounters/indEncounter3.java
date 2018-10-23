package indEncounters;

import java.util.Scanner;

public class indEncounter3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		 int cheeseChoice;
		 
	     System.out.println("It was a normal day for Brandon when he went into the grocery store to buy ingridients for his"
	     		+ "dinner when he was faced with a tough choice.");
	     System.out.println("Press 1 for a Taco dinner or 2 for Macoroni and Cheese");
	     cheeseChoice = input.nextInt();
	     
	     if (cheeseChoice == 1) 
	     {
	    	 System.out.println("Brandon suddenly had an urge for Tacos and went to get the cheese for his dinner."
	    	 		+ "\n He stayed far from every aisle that might contain cotton balls until he reached the cheese aisle."
	    	 		+ "\n as soon as he got to the aisle he grabbed a bag of shredded mozerrela cheese and went to leave."
	    	 		+ "\n he was leaving the aisle when a man in a mask fell from the cieling and pointed a slingshot at him."
	    	 		+ "\n he begged the man not to shoot but he did. The cotton ball was shot from the slingshot"
	    	 		+ "\n the ball floated peacfully towards Brandon and landed gracefully on his nose. The next thing Brandon knew"
	    	 		+ "\n he woke up in what seemed to be an interrogation room. Brandon was tied to a chair in a completely dark room");
	    	 
	     }
	     else if (cheeseChoice == 2) 
	     {
	    	 System.out.println("Brandon suddenly had an urge for Mac and Cheese and went to the aisle for said treasure. He dodged any aisle that had cotton balls and made his way to the golden goody."
	    	 		+ "\nHe made it, but was bombarded by cotton balls. He fainted, and awoke in an interrogation room."
	    	 		+ "\nWhat can you do in this instance?"
	    	 		+ "\n1- Nothing, just wait for the interrogation"
	    	 		+ "\n2- Attempt to break out of the chair");
	    	 cheeseChoice = input.nextInt();
	    	 
	    	 if (cheeseChoice == 1) 
	    	 {
	    		 System.out.println("Waiting was a good idea, because the compound goes under lockdown after 2 minutes of waiting. Brandon walks out of the interrogation room, looking for an exit."
	    		 		+ "\nHowever all he finds is red blinking lights around him. Brandon is left with the choice of going left or right. Which way should he go?"
	    		 		+ "\n1- Left"
	    		 		+ "\n2- Right");
	    	 }
	    		 
	     }
	}
}
