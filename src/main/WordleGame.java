package main;
import java.util.Scanner;
import java.util.Random;

public class WordleGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to my Wordle App\n"
				+ "The rules:"
				+ "\nYou have 6 guesses"
				+ "\nThe word is a valid 5 letter word"
				+ "\nA blue letter is correct and in the right spot"
				+ "\nA yellow letter is correct but in the wrong place"
				+ "\nWhite is not used at all");
		
		String ANSI_YELLOW = "\u001B[33m";
		String ANSI_BLUE = "\u001B[34m";
		int turns = 0;
		
		boolean gameEnd = false;//ok, in java its boolean not bool, noted
		String choice;
		Random random = new Random();
		
		String[] answers = {"FLOAT","BLAME","SHARP","IDIOT","MORON","GLOAT","CLOAK","BROKE","FIXED","PUSHY"};
		do 
		{
		int pickedAnswer = random.nextInt(0,10);
		String answer = answers[pickedAnswer];
		while(!gameEnd) 
		{
			System.out.print("\nYour guess: ");
			String entry = scanner.next();
			int strLength = entry.length();
			if(entry.length() < 5 || entry.length() > 5) 
			{
				System.out.println("All answers are precisely 5 letters long, this will not increment turns or provide a hint. Guess again.");
			}
			for(int counter = 0; counter < answer.length(); counter++) 
			{
				char answChar = answer.charAt(counter);
				char entryChar = entry.charAt(counter);
				if(answChar == entryChar)
				{
					System.out.print(ANSI_BLUE);
				}
				else if(answer.contains(""+entryChar) && entryChar != answChar) 
				{
					System.out.print(ANSI_YELLOW);
				}
			}
			if(entry.equals(answer)) 
			{
				System.out.println("YOU WON!");
				gameEnd = true;
			}
			else if (turns == 6) 
			{
				System.out.println("\nYou have LOST!\n\n");
				gameEnd = true;
			}
			}
			turns++;
		}
		System.out.print("You took " + turns + "turns.");
		System.out.print("\nWould you like to play again? (y/n): ");	
		choice = scanner.next();	
		}while(choice.equalsIgnoreCase("y"));
		
	}

}
