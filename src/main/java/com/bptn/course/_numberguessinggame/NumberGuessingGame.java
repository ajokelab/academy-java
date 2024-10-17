package com.bptn.course._numberguessinggame;
		
		
		import java.util.Scanner;

		public class NumberGuessingGame {
			
		    public static void main(String[] args) {
		    	
		        Scanner scanner = new Scanner(System.in);
		        int targetNumber = 55; // Set the target number to 55
		        int guess;

		        // Loop until the user guesses the correct number
		        while (true) {
		            // Prompt the user to enter a guess
		            System.out.print("Enter your guess (between 1 and 100): ");
		            guess = scanner.nextInt();

		            // Validate the guess
		            if (guess < 1 || guess > 100) {
		                // If the guess is out of range, prompt the user to enter a valid number
		                System.out.println("Please enter a number between 1 and 100.");
		            } else if (guess < targetNumber) {
		                // If the guess is too low, inform the user
		                System.out.println("Too low! Try again.");
		            } else if (guess > targetNumber) {
		                // If the guess is too high, inform the user
		                System.out.println("Too high! Try again.");
		            } else {
		                // If the guess is correct, congratulate the user and break the loop
		                System.out.println("Congratulations! You guessed the number correctly!");
		                break;
		            }
		        }

		        scanner.close();
		    }
		}

	



