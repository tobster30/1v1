import java.util.Scanner;
import java.util.Random;

public class fight {
	
	public static void main (String [] args)
	{
		
		int playerHP = 100;
		int opponentHP = 100;
		int damage;
		
		Random rand = new Random();
		int attackList[] = {1,2,3};
		
		
		int count;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String UName = userInput.nextLine();
		
		System.out.println("Who is your opponent?");
		String OName = userInput.nextLine();
		
		System.out.println("Your name is " + UName);
		System.out.println("Your opponent is " + OName);
		System.out.println(" ");
		
		for(count = 0; count < 1; count++ )
		{
			System.out.println("Your HP is: " + playerHP);
			System.out.println(OName + "'s HP is: " + opponentHP);
			System.out.println("Who will attack first?");
			System.out.println(" ");
			System.out.println("Type 1 for you, or 2 for " + OName);
			int UChoice = userInput.nextInt();
			
			if (UChoice == 1)
			{
				
				for (int count2 = 0; count < 1; count++)
				{
				
				System.out.println("How will you attack " + OName + "?");
				System.out.println("Type 1 for head attack");
				System.out.println("Type 2 for body attack");
				System.out.println("Type 3 for lower attack");
				System.out.println(" ");
				int AChoice = userInput.nextInt();
				
					if (AChoice == 1)
					{
						System.out.println("You punched " + OName + " in the face!");
						damage = 15;
						opponentHP -= damage;
						System.out.println(OName + " took " + damage + " damage");
						System.out.println(OName + " has " + opponentHP + " HP left");
						System.out.println(" ");
						
							if (opponentHP == 0)
							{
								break;
							}
							
							else 
							{
								int randomAttack = attackList[rand.nextInt(3)];
									if(randomAttack == 1)
									{
										damage = 15;
										playerHP -= damage;
										System.out.println(OName + " punched " + UName + " in the face ");
										System.out.println(UName + " took " + damage + " damage ");
										System.out.println(" ");
										continue;
									}
									
									else if (randomAttack == 2)
									{
										damage = 10;
										playerHP -= damage;
										System.out.println(OName + " punched " + UName + " in the chest ");
										System.out.println(UName + " took " + damage + " damage ");
										System.out.println(" ");
										continue;
									}
									
									else if (randomAttack == 3)
									{
										damage = 5;
										playerHP -= damage;
										System.out.println(OName + " punched " + UName + " in the legs ");
										System.out.println(UName + " took " + damage + " damage ");
										System.out.println(" ");
										continue;
									}
							}
					}
					
					
					else if (AChoice == 2)
					{
						System.out.println("You punched " + OName + " in the chest!");
						damage = 10;
						opponentHP -= damage;
						System.out.println(OName + " has " + opponentHP + " HP left");
						
							if (opponentHP == 0)
							{
								break;
							}
							
							else 
							{
								continue;
							}
					}
					
					else if (AChoice == 3)
					{
						System.out.println("You punched " + OName + " in the legs!");
						damage = 5;
						opponentHP -= damage;
						System.out.println(OName + " has " + opponentHP + " HP left");
						
							if (opponentHP == 0)
							{
								break;
							}
							
							else 
							{
								continue;
							}
					}
				}
				
			}
			
			else if (UChoice == 2)
			{
				System.out.println("bleugh");
				continue;
			}
			
			
		}
		
		if (opponentHP == 0)
		{
			System.out.println(UName + " is victorious");
		}
		
		else if (playerHP == 0)
		{
			System.out.println(OName + " is victorious");
		}
		
		userInput.close();

	}

}
