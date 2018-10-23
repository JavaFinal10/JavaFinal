package indEncounters;

import java.util.Scanner;


public class indEncounter2
{

	public static void displayindEncounter2() 
	{
		Scanner input = new Scanner(System.in);
		
		int userChoice;
		
		System.out.println("The day started out like any other normal day for Jake. He woke up, got ready for the day, and got on with his errands."
				+ "It didn't help that he had the suspicion he was being followed, or watched. He should've trusted his gut instinct, becuase one secon he was in the grocery store, next in a van."
				+ "\nKidnapped, and fearing for his life, he panicked. But his panicking was helpless, as it made nothing of difference. He soon calmed down and fell asleep, his own panic draining him of energy."
				+ "\nWhen he woke up, he was in an interrogation room, surrounded by what appeared to be people in various costumes. "
				+ "\nPlague doctors, witches, zombies, even werewolves. All things people fear, but it just confused Jake. "
				+ "\nUntil of course, from out of the darkness, a giant bunch of bananas flew out and landed on the table. Jake's heart dropped, and he instantly began pleading for the bananas to be removed.");
		System.out.println("What is someone to do in this situation?"
				+ "\n1- Attempt to slip out of bounds"
				+ "\n2- Kick the table and make the bananas fall");
		userChoice = input.nextInt();
		
		System.out.println("His struggling and the constant friction resulted in an escape from the bounds, and Jake was able to remove the bananas from the table."
				+ "\nAfter removing the bananas, he looked around, trying to find a way out. The one light in the room went out, and then red."
				+ "\nThe compound had lost power. "
				+ "\nIn the red flashing, Jake found a door, and this door led out to the hallway. He could hear people shouting, and yelling to 'contain the prisoners'. He probably shouldn't but he couldn't help but want to go towards the voices. "
				+ "\nWhat should he do?"
				+ "\n1- Go towards the voices, maybe they'll help."
				+ "\n2- Turn around and go away from the voices, they don't sound too friendly.");
		userChoice = input.nextInt();
		
		if(userChoice == 1) 
		{
			System.out.println("I'm no rocket scientist, but I'm pretty sure when someone says 'detain the prisoner', they don't have friendly intent. "
					+ "\nJake is dragged away by the people and never heard from again."
					+ "\nGAME OVER");
		}
		else if(userChoice == 2) 
		{
			System.out.println("Yea, probably a better choice for later. Jake begins walking the halls of the compound, hearing various people talking about  "
					+ "these prisoners and how they must be contained. He passes a room with an open door, but when a light turns on he stops and looks at it, wondering if he should enter."
					+ "\n1- Maybe there's something useful in there, I've gotta check."
					+ "\n2- Better to stay away from possible traps, dodge the room.");
			userChoice = input.nextInt();
		
			
			
			if(userChoice == 1) 
			{
				System.out.println("You enter the room, and see some guards attire. After putting it on to hide from any roaming security, Jake notices the bunch of bananas from earlier."
						+ "\nTerrified, his heart sinks. He's afraid of the fact that the attire he's wearing is tainted by the bananas."
						+ "\n1- Take it off, he could hyperventilate or something!"
						+ "\n2- Deal with it, gotta get through somehow without drawing attention.");				
				userChoice = input.nextInt();
				
			if (userChoice == 1) 
				{
				System.out.println("Yea, best to get this off. Sneakier without it anyway. Jake removes the guards outfit and continues on with his quest. He hears what sounds like someone yelling, probably got caught."
						+ "\nIt doesn't bother Katie, she's focused on getting out without being detained. As she makes her way through the hallway she sees through the door windows different items. Items you'd normally have at home."
						+ "\nCotton balls, cheese, and...mannequins? Odd, but he presses on, mainly in fear that there'll be a room filled with bananas."
						+ "\nJake comes to a crossroads when he finds a large door that requires a keycard. There's a body next to him on the right, but there's a security room on the left."
						+ "\n1- Check the body, they wouldn't need the keycard anymore."
						+ "\n2- Go into the security room, easier to search since everybody else is out.");
				userChoice = input.nextInt();
				
				if (userChoice == 1) 
					{
					System.out.println("That body woke up after 20 seconds of searching, guess a corpse should be left well alone."
							+ "\nGAME OVER");
					}
				else if (userChoice == 2) 
					{
					System.out.println("Walking into the security room gave an odd feeling, like the room was colder. There were slices of bananas everywhere, which Jake only noticed after almost touching one."
							+ "\nHe wanted to scream, but remembered the issue he was currently in. So he sucked it up, and found the keycard. Walking back out to the door he used the keycard."
							+ "\nWhat was on the other side could only be described as a giant gate, strung up with barbed wire and a lot of electricity going through said barbed wire. "
							+ "\nThe only exit on it was guarded, which would mean he'd have to have brought the guards gear to get through. Now he'll have to improvise."
							+ "\n1- Attempt to climb it, can't be that hard right?"
							+ "\n2- Attempt to distract the guards, if they have other problems they can't stop you."
							+ "\n3- Use some objects you found on your journey and see what you could do to get out.");
					userChoice = input.nextInt();
					
					if (userChoice == 1) 
						{
						System.out.println("When would this ever be a good idea? "
								+ "Jake grabs the barbed wire, and managed to get half way up the wall without being shocked before getting shot down by someone in the guard tower."
								+ "\nGAME OVER");
						}
					else if (userChoice == 2) 
						{
						System.out.println("Good idea on paper, bad idea when done. They track Jake as the source after the supposed distraction is threatened with a banana, and he is detained."
								+ "\nGAME OVER");
						}
					else if (userChoice == 3) 
						{
						System.out.println("'Ok Jake, you've seen something like this before.' he gets to work mapping out spots to get items from, and he gets them. Some spare clothes, a pressure system, some hose, and a couple of other things."
								+ "\nHe plans on building a plane to get out of this place. he takes all of his pieces to the roof, but before he can get back up to the roof to finish a squad blocks his only path. What's the answer here?"
								+ "\n1- Create a distraction, go past when they go for it."
								+ "\n2- Try to persuade them that you lost your uniform, those darn inmates.");
						userChoice = input.nextInt();
						
						if (userChoice == 1) 
							{
							System.out.println("Jake and distractions aren't very good together. "
									+ "\nGAME OVER");
							
							}
						else if (userChoice == 2) 
							{
							System.out.println("And with that, they believed him. Good thing the new guys were on the job today. Jake made it to the roof, and began for his take off. A guard found him and grabbed onto the wing of the plane."
									+ "\n1- Kick the guard off, no chances!"
									+ "\n2- Do nothing, focus on steering.");
							userChoice = input.nextInt();
							
							if (userChoice == 1) 
								{
								System.out.println("Kicking the guard off was a good idea, however the result of this action was not good. The plane steered toward the right, and out of the fog a bridge appeared. The plane hit the bridge and Jake went down."
										+ "\nJake had never thought he'd seen the Golden Gate up close, but now he was sitting on it. He admired its beauty, and then sighed in relief. No banans wer near him, but now he was stuck."
										+ "\nEND");
								}
							else if (userChoice == 2) 
								{
								System.out.println("The guard made the aircraft unstable, but not enough to harm the course. When the guard smacked Jake with a banana, Jake fainted and fell off the plane, never to be seen again."
										+ "\nGAME OVER");
								}
							}
						}
					}
				}
			else if (userChoice == 2) 
				{
				System.out.println("Going with the guard attire on, Jake exited the room. He continued on through the hallways and went to a door, which opened as he walked towards it."
						+ "\nThere was a body, and a security room. In front of these was another giant door, which required a keycard. Which would be better to check?"
						+ "\n1- Check the body, they won't need the keycard"
						+ "\n2- Go into the security room, more chances to find a key.");
				userChoice = input.nextInt();
				
				if (userChoice == 1) 
					{
					System.out.println("The body woke up, good thing Jake had the guard uniform on. The guard went off to another sector and gave Jake a keycard, which he used to open the door and find a large gate, with electrified barbed wire surrounding it."
							+ "\nHow was he going to do this one?"
							+ "\n1- Confront the security at the front and request access outside of the compound"
							+ "\n2- Walk through without talking to the security.");
					userChoice = input.nextInt();
					System.out.println("\nJake approached the gate, and it opened. Without him saying anything he walked out, and away from the compound."
							+ "\nEND");
					}
				else if (userChoice == 2) 
					{
					System.out.println("Jake walked into the security room, and saw huge piles of bananas. He couldn't take it, more so his heart couldn't. Jake had a heart attack at the sight of the bananas, while wearing banana tainted apparel."
							+ "\nGAME OVER");
					}
				}
			}
			else if(userChoice == 2) 
			{
				System.out.println("Ok, no chances taken today Jake. He begins walking away from the room when he hears some other security talking."
						+ "\n'The one that fears bananas is out, we'll start planting some around the compound. Maybe he'll scream if he touches it, hehe.'"
						+ "Of course Jake is terrified by this, they're using his fear against him. Nervous, he begins making his way out to the hallway, when he bumps into another person."
						+ "\nThis person appears to be out of breath, like they were just running. She seems kind of delusional."
						+ "\n'You don't have any cheese on you, do you!?'"
						+ "\n1- Ask why She's worried about something like cheese."
						+ "\n2- Say yes and see what happens.");
				userChoice = input.nextInt();
				
			
				if (userChoice == 1) 
					{
					System.out.println("'Just answer the question!' So you do, you answer honestly and she sighs a sigh of relief. 'I have a major fear of them, sorry. I'm Katie.' "
							+ "\nAfter introductions Katie says she has a way out of the compound, however she'll have to get to the main door of the compound in order to get out with the keycard she has."
							+ "\nShe also has a map that goes over the whole compound, and this map shows that there's a gaint gate between them and the compound door, and another unmarked door."
							+ "\nThere are two paths to this door, in which the two have to decide where to go. Jake thinks they should go left because it goes past the security room, they can arm themselves."
							+ "\nBranden however thinks they should go right because it passes the camera room, where they can find everyone on guard."
							+ "\n1- Jake's choice"
							+ "\n2- Katie's choice");
					}
				else if (userChoice == 2) 
					{
					System.out.println("She panics and hits Jake in the arm with a needle, which had a experimental liquid in it. Too bad that liquid was an acidic based mixture, Jake's body shuts down."
							+ "\nGAME OVER");
					}
			}
			
		}

		

	}

}