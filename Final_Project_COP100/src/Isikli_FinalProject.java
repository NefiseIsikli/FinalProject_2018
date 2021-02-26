
// Project Name : Final Project
// Date: Start:11/26/2018 Finish:12/03/2018
// Author : Nefise Isikli

import java.util.Scanner;

public class Isikli_FinalProject {

	public static void main(String[] args) {

		// Declare and initialize variables
		String exit = "EXIT";
		String madGab = "MADGAB", iQ = "IQ";// name of the games
		String game = ""; // game that player is going to choose/user didn't choose yet,so quote is empty

		Scanner input = new Scanner(System.in);
		// Introduction: Each Game
		System.out.println("There are 2 different games to play:");
		System.out.println("\t1. MadGab: There will be hidden phrases and words that you are going to guess");
		System.out.println(" \t2. How High is Your mathematical IQ? :There will be tricky questions for you");
		System.out.println("\nWhich one would you like to play?");

		while (!game.equalsIgnoreCase(exit)) { // While loop
			// Prompt user to enter the game that she/he wants to play
			System.out.print(" \tEnter 'MADGAB'or 'IQ' to start. Or enter 'EXIT' to quit. \rEnter your choice here:");
			game = input.nextLine();

			if (game.equalsIgnoreCase(madGab)) { // If user choose to play MADGAB game
				// Instructions to play MADGAB
				System.out.println("\nThere are hidden phrases or words and you will try to guess the word/ phrases."
						+ "\r\tFor example: “Tooth Hum Sup”  \r\tGuess! (Do NOT read, LISTEN) \r\tAnswer: “Two Thumps Up”");
				// Declare/Initialize variables for madgab game
				String[] madPhrases = { "Up He Such Ease", "Dwell Fro Sis", "Knee Gull Odie Yon",
						"Assess Seam Ease Heed", "Dent Hull High Chin Nest" };
				String[] Phrases = { "A piece of cheese", "Twelve roses", "Nickelodeon", "A Sesame Seed",
				"Dental Hygienist" };

				MadGab(madPhrases, Phrases); // Invoke Madgab Method
			} // End of if

			else if (game.equalsIgnoreCase(iQ)) {// If user choose to play 'How High is Your mathematical IQ?'
				System.out.println(
						"\n\tYou chose to play 'How High is Your mathematical IQ?'\r\tYou will show your basic Math skills, and "
								+ "learn your IQ level. \r\tNOT: This is not a valid IQ test. It is just for fun and practice");
				// Declare/initialize variables for IQ game
				int howManyQ = 1; // Number of questions (Each question will loop 1 time)
				int correctAnswer = 0; // Count the number of correct answers(0 because no correct answer yet)
				int questions = 0; // Count number of questions

				IQ(howManyQ, correctAnswer, questions); // Invoke IQ Method

				input.close();
			}
		} // End of while loop
		System.out.println("Thanks for playing! Have a nice day!"); // Print if user type EXIT

	}// End of Class

	private static void MadGab(String[] madPhrases, String[] phrases) {// Madgab Method
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < phrases.length; i++) {
			System.out.print("\nThe phrase is :");
			System.out.println(madPhrases[i]);
			System.out.print("\tEnter your guess:");
			String guess = input.nextLine();
			while (!guess.equalsIgnoreCase(phrases[i])) { // while loop if user type a wrong phrase
				System.out.println("\nYour answer is wrong! Please try again.\t\rEnter your guess :");
				guess = input.nextLine();
			} // End of while loop
			System.out.println("\nGood job! You got it!");
		} // End of for loop
		input.close();
	}// End of MadGab Method

	public static void IQ(int hMQ, int correctA, int q) {// IQ Method
		Scanner input = new Scanner(System.in);

		while (q < hMQ) { // loop 0<1
			// Generate 3 random numbers
			int num1 = (int) (Math.random() * 30 + 5);
			int num2 = (int) (Math.random() * 10 + 5);
			int num3 = (int) (Math.random() * 20 + 5);

			// num1 should be bigger than num2,so if it is not, swap to correct it
			if (num1 <= num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			// Print Question 1
			System.out.println("\nQ1: John had " + num1
					+ " books on his bookshelf. John’s dog, Buster, came in and slobbered all over " + num2
					+ " of them."
					+ "\t\nHow many books did John have left that were not slobbered on?\n Enter your answer here ");
			int answer1 = input.nextInt(); // Prompt user to answer the question
			if (num1 - num2 == answer1) { // If given answer is correct
				System.out.println("You are correct!\n"); // Print this message
				correctA++; // Increase correct answer
			} else {
				System.out.println("Your answer is wrong.\n"); // If the given answer is wrong, print this message
			}
			// Print Question 2
			System.out.println(
					"Q2: Dan is getting ready to go to a concert. He wants to figure out how many people will be there."
							+ "\nHe knows that there are " + num1 + " rows of seats, and each row has " + num2
							+ " seats in it. "
							+ "\nHow many seats are there in the concert hall in all?\t\n Enter your answer here ");
			int answer2 = input.nextInt();// Prompt user to answer the question
			if (num1 * num2 == answer2) {// If given answer is correct
				System.out.println("You are correct!\n");// Print this message
				correctA++;// Increase correct answer
			} else {
				System.out.println("Your answer is wrong.\n"); // If the given answer is wrong, print this message
			}
			// Print Question 3
			System.out.println("Q3: Carly is making a dress. She needs " + num1 + " yards of purple fabric, and " + num3
					+ " yards of green fabric." + "\nShe bought " + num2
					+ " yards of yellow fabric last week. How many yard is her total dress? "
					+ "\t\nEnter your answer here:");
			int answer3 = input.nextInt();// Prompt user to answer the question
			if (num1 + num3 + num2 == answer3) {// If given answer is correct
				System.out.println("You are correct!\n");// Print this message
				correctA++;// Increase correct answer
			} else {
				System.out.println("Your answer is wrong.\n"); // If the given answer is wrong, print this message
			}
			// Print Question 4
			System.out.println("Q4: Last hockey season, Jack scored " + num1
					+ " goals. Patrik scored twice as many goals than Tom, " + "and Tom had " + num3
					+ " more scores than Jack. How many scores did they have all together?"
					+ " \t\nEnter your answer here: ");
			int answer4 = input.nextInt();// Prompt user to answer the question
			if (((num1 + num3) * 2) + num1 + num1 + num3 == answer4) { // If given answer is correct
				System.out.println("You are correct!\n");// Print this message
				correctA++;// Increase correct answer
			} else {
				System.out.println("Your answer is wrong.\n"); // If the given answer is wrong, print this message
			}
			// Print Question 5
			System.out.println("Q5: During gym class on Wednesday, the students ran for " + num1 + " kilometres."
					+ "On Thursday, they ran " + num2 + " as many kilometres as on Wednesday."
					+ "\nHow many kilometres did the students run on Thursday?" + "\nEnter your answer here:");
			int answer5 = input.nextInt();// Prompt user to answer the question
			if (num1 + (num1 * num2) == answer5) { // If given answer is correct
				System.out.println("You are correct!\n");// Print this message
				correctA++;// Increase correct answer
			} else {
				System.out.println("Your answer is wrong.\n"); // If the given answer is wrong, print this message
			}
			q++; // increase the question to end while loop(q becomes 1) so that while loop stops

			if (correctA == 5) {
				System.out.println("Score is " + correctA + " out of 5.\r\tIQ Level : Upper Extreme");
			} else if (correctA == 4) {
				System.out.println("Score is " + correctA + " out of 5.\r\tIQ Level : Avarage");
			} else if (correctA == 3) {
				System.out.println("Score is " + correctA + " out of 5.\r\tIQ Level : Below Avarage");
			} else if (correctA == 2) {
				System.out.println("Score is " + correctA + " out of 5.\r\tIQ Level : Low");
			} else {
				System.out.println("Score is " + correctA + " out of 5.\rIQ Level : Extreme Low\n");
			}
			input.close();
			break;// Break infinite loop

		} // End of (q<hMQ) while loop

	}// End of IQ Method
}// End of Main
