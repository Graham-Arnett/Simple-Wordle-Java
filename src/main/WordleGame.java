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
				+ "\nA green letter is correct and in the right spot"
				+ "\nA yellow letter is correct but in the wrong place"
				+ "\nWhite is not used at all");
		
		int turns = 0;
		
		boolean victory = false;//ok, in java its boolean not bool, noted
		String choice;
		Random random = new Random();
		
		do 
		{
			
		System.out.print("\nWould you like to play again? (y/n): ");	
		choice = scanner.next();	
		}while(choice.equalsIgnoreCase("y"));
		
	}

}
