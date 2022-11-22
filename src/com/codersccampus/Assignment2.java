package com.codersccampus;


import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random()*100)+1;
		int guessCount = 5;
		
		Scanner scanner = new Scanner(System.in);
		int guess;
		boolean win = false;
		
		
		System.out.println("Pick a number between 1 and 100");
		
		
		while (guessCount > 0 ) {
			guess = scanner.nextInt();
			
			
		if (guess < 1 || guess > 100) {
			System.out.println("Your guess is not between 1 and 100,"
						+ " please try again");
			}
			
		else if (guess == randomNumber) {
			System.out.println("You WIN");
		} else if (guess > randomNumber) {
			System.out.println("Please enter a lower number");
		} else if (guess < randomNumber) {
			System.out.println("Please enter a higher number");
		}
			guessCount--;
	}
		if (win == false) {
		System.out.println("You Lose! " 
		+ " The number to guess was " + randomNumber);
	}scanner.close();
}	
	}
