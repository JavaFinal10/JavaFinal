package indEncounters;

import java.util.Scanner;

public class indEncounter1 
{

	public static void displayindEncounter1() 
	{
		Scanner input = new Scanner(System.in);
		int userChoice;
		System.out.println("The day started out like any other normal day for Katie. She woke up, got ready for the day, and got on with her errands."
				+ "It didn't help that she had the suspicion she was being watched, or followed. She should've trusted her gut instinct, becuase one secon she was in the grocery store, next in a van."
				+ "\nKidnapped, and fearing for her life, she panicked. But her panicking was helpless, as it made nothing of difference. She soon calmed down and fell asleep, her own panic draining her of energy."
				+ "\nWhen she woke up, she wasa in an interrogation room, surrounded by what appeared to be people in various costumes. "
				+ "\nPlague doctors, witches, zombies, even werewolves. All things people fear, but it just confused Katie. "
				+ "\nUntil of course, from out of the darkness, a bag of shredded mozzarella cheese flew out and landed onto the table. Katie's heart dropped, and she instantly began pleading for the cheese to be removed.");
		System.out.println("What is someone to do in this situation?"
				+ "\n1- Attempt to slip out of bounds"
				+ "\n2- Kick the table and make the cheese fall");
		userChoice = input.nextInt();
		System.out.println("The struggling and the constant friction resulted in an escape from the bounds, and Katie was able to remove the bag of cheese from the table."
				+ "\nAfter removing the bag, she looked around, trying to find a way out. The one light in the room went out, and then red."
				+ "\nThe compound had lost power. "
				+ "\nIn the red flashing, Katie fonud a door, and this door led out to the hallway. She could hear people shouting, and yelling to 'contain the prisoners'. She probably shouldn't but she couldn't help but want to go towards the voices. "
				+ "\nWhat should she do?"
				+ "\n1- Go towards the voices, maybe they'll help."
				+ "\n2- Turn around and go away from the voices, they don't sound too friendly.");
		userChoice = input.nextInt();
		
		if(userChoice == 1) 
		{
			System.out.println("I'm no rocket scientist, but I'm pretty sure when someone says 'detain the prisoner', they don't have friendly intent. "
					+ "\nKatie is dragged away by the people and never heard from again."
					+ "\nGAME OVER");
		}
		else if(userChoice == 2) 
		{
			System.out.println("Yea, probably a better choice for later. Katie begins walking the halls of the compound, hearing various people talking about  "
					+ "these prisoners and how they must be contained. She passes a room with an open door, but when a light turns on she stops and looks at it, wondering if she should enter."
					+ "\n1- Maybe there's something useful in there, I've gotta check."
					+ "\n2- Better to stay away from possible traps, dodge the room.");
			userChoice = input.nextInt();
		
			
			
			if(userChoice == 1) 
			{
				System.out.println("You enter the room, and see some guards attire. After putting it on to hide from any roaming security, Katie notices the bag of cheese from earlier."
						+ "\nTerrified, her heart sinks. She's afraid of the fact that the attire she's wearing is tainted by the cheese."
						+ "\n1- Take it off, she could hyperventilate or something!"
						+ "\n2- Deal with it, gotta get through somehow without drawing attention.");				
				userChoice = input.nextInt();
				
			if (userChoice == 1) 
				{
				System.out.println("Yea, best to get this off. Sneakier without it anyway. Katie removes the guards outfit and continues on with her quest. She hears what sounds like someone yelling, probably got caught."
						+ "\nIt doesn't bother Katie, she's focused on getting out without being detained. As she makes her way through the hallway she sees through the door windows different items. Items you'd normally have at home."
						+ "\nCotton balls, bananas, and...mannequins? Odd, but she presses on, mainly in fear that there'll be a room filled with cheese."
						+ "\nKatie comes to a crossroads when she finds a large door that requires a keycard. There's a body next to her on the right, but there's a security room on the left."
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
					System.out.println("Walking into the security room gave an odd feeling, like the room was colder. There were slices of cheese everywhere, which Katie only noticed after almost touching one."
							+ "\nShe was going to scream, but remembered the issue she was currently in. So she sucked it up, and found the keycard. Walking back out to the door she used the keycard."
							+ "\nWhat was on the other side could only be described as a giant gate, strung up with barbed wire and a lot of electricity going through said barbed wire. "
							+ "\nThe only exit on it was guarded, which would mean she'd have to have brought the guards gear to get through. Now she'll have to improvise."
							+ "\n1- Attempt to climb it, can't be that hard right?"
							+ "\n2- Attempt to distract the guards, if they have other problems they can't stop you."
							+ "\n3");
					userChoice = input.nextInt();
					
					if (userChoice == 1) 
						{
						System.out.println("When would this ever be a good idea? Katie grabs the barbed wire, and manage to get half way up the wall without being shocked before getting shot down by someone in the guard tower."
								+ "\nGAME OVER");
						}
					else if (userChoice == 2) 
						{
						System.out.println("Good idea on paper, bad idea when done. They track Katie as the source after the supposed distraction is threatened with a banana, and she is detained."
								+ "\nGAME OVER");
						}
					else if (userChoice == 3) 
						{
						System.out.println("'Ok Katie, you've seen something like this before.' She gets to work mapping out spots to get items from, and she gets them. Some spare clothes, a pressure system, some hose, and a couple of other things."
								+ "\nShe plans on building a plane to get out of this place. She takes all of her pieces to the roof, but before she can get back up to the roof to finish a squad blocks her only path. What's the answer here?"
								+ "\n1- Create a distraction, go past when they go for it."
								+ "\n2- Try to persuade them that you lost your uniform, those darn inmates.");
						userChoice = input.nextInt();
						
						if (userChoice == 1) 
							{
							System.out.println("Katie and distractions aren't very good together. "
									+ "\nGAME OVER");
							
							}
						else if (userChoice == 2) 
							{
							System.out.println("And with that, they believed her. Good thing the new guys were on the job today. Katie made it to the roof, and began for her take off. A guard found her and grabbed onto the wing of the plane."
									+ "\n1- Kick the guard off, no chances!"
									+ "\n2- Do nothing, focus on steering.");
							userChoice = input.nextInt();
							
							if (userChoice == 1) 
								{
								System.out.println("Kicking the guard off was a good idea, however the result of this action was not good. The plane steered toward the right, and out of the fog a bridge appeared. The plane hit the bridge and Katie went down."
										+ "\nKatie had never thought she'd seen the Golden Gate up close, but now she was sitting on it. She admired its beauty, and then sighed in relief. No cheese was near her, but now she was stuck."
										+ "\nEND");
								}
							else if (userChoice == 2) 
								{
								System.out.println("");
								}
							}
						}
					}
				}
			}
			else if(userChoice == 2) 
			{
				System.out.println("Ok, no chances taken today Katie. She begins walking away from the room when she hears some other security talking."
						+ "\n'The one that fears cheese is out, we'll start planting some around the compound. Maybe she'll scream if she touches it, hehe.'"
						+ "Of course Katie is terrified by this, they're using her fear against her. Nervous, she begins making her way out to the hallway, when she bumps into another person."
						+ "\nThis person appears to be out of breath, like they were just running. He seems kind of delusional."
						+ "\n'You don't have any cotton balls on you, do you!?'"
						+ "\n1- Ask why he's worried about something like cotton balls."
						+ "\n2- Say yes and see what happens.");
				userChoice = input.nextInt();
				
			
				if (userChoice == 1) 
					{
					System.out.println("'Just answer the question!' So you do, you answer honestly and he sighs a sigh of relief. 'I have a major fear of them, sorry. I'm Brandon.' "
							+ "\nAfter introductions Brandon says he has a way out of the compound, however he'll have to get to the main door of the compound in order to get out with the keycard he has."
							+ "\nHe also has a map that goes over the whole compound, and this map shows that there's a gaint gate between them and the compound door, and another unmarked door."
							+ "\nThere are two paths to this door, in which the two have to decide where to go. Katie thinks they should go left because it goes past the security room, they can arm themselves."
							+ "\nBranden however thinks they should go right because it passes the camera room, where they can find everyone on guard."
							+ "\n1- Katie's choice"
							+ "\n2- Branden's choice");
					}
				else if (userChoice == 2) 
					{
					System.out.println("He panics and hits Katie in the arm with a needle, which had a experimental liquid in it. Too bad that liquid was an acidic based mixture, Katies body shut down."
							+ "\nGAME OVER");
					}
			}
			
		}
		

	}

}
