package indEncounters;

import java.util.Scanner;

public class indEncounter3 {

	public static void displayindEncounter3() {
		// TODO Auto-generated method stub
	 int cheeseChoice;
	 
	 Scanner input = new Scanner(System.in);
	 
     System.out.println("It was a normal day for Brandon when he went into the grocery store to buy ingridients for his"
     		+ "dinner when he was faced with a tough choice.");
     System.out.println("Press 1 for a Taco dinner or 2 for Macoroni and Cheese");
     cheeseChoice = input.nextInt();
     
     if (cheeseChoice == 1) {
    	 System.out.println("Brandon suddenly had an urge for Tacos and went to get the cheese for his dinner."
    	 		+ "\n He stayed far from every aisle that might contain cotton balls until he reached the cheese aisle."
    	 		+ "\n as soon as he got to the aisle he grabbed a bag of shredded mozerrela cheese and went to leave."
    	 		+ "\n he was leaving the aisle when a man in a mask fell from the cieling and pointed a slingshot at him."
    	 		+ "\n he begged the man not to shoot but he did. The cotton ball was shot from the slingshot"
    	 		+ "\n the ball floated peacfully towards Brandon and landed gracefully on his nose. The next thing Brandon knew"
    	 		+ "\n he woke up in what seemed to be an interrogation room. Brandon was tied to a chair in a completely dark room");
     }
	}

}
