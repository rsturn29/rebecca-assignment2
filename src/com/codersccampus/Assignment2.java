package com.codersccampus;


import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		 
		
		
		int  guess;
		int randomNumber = (int)(Math.random()*100)+1;
		int attempts;
		System.out.println(randomNumber);
		attempts = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){
		System.out.println("Pick a number between 1 and 100");
		
		guess = scanner.nextInt();
		
		if (guess == randomNumber) {
			System.out.println("You WIN");
		
		break;
		}
		if (attempts==4) {
			System.out.println("You lose too many guesses." + " The number is " + randomNumber );
		break;
		}
		if((guess < 1)|| (guess>100)) {
			System.out.println("Your guess was not between 1 & 100, try again.");
		}
		else if (guess > randomNumber ) { 
			System.out.println("Please enter a lower number");
			attempts++;
		 }
		else if ( guess < randomNumber) {
			System.out.println("Please enter a higher number");
			attempts++;
		
		}
		}while(guess!= randomNumber);
		
		
		scanner.close();
		
		}
}
