/*
 * Christopher Chakchay
 * Programming fundamentals
 * Summer 2021
 * Programming Assignment 1 (Cipher)
 */

import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Random randomNumber = new Random();
		
		int numberOne;
		int numberTwo;
		int numberThree;
		int numberFour;
		int numberFive;
		int key = randomNumber.nextInt(9); //generates random number for the key
		
		System.out.println("Welcome to the Cipher program.");
		System.out.println("Please enter 5 numbers between 0 and 19");
	
		//Prompts user for 5 numbers and terminates code if number is larger than 19
		
		System.out.print("1st number: ");
		numberOne = scan.nextInt();
		if (numberOne > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		System.out.print("2nd number: ");
		numberTwo = scan.nextInt();
		if (numberTwo > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		System.out.print("3rd number: ");
		numberThree = scan.nextInt();
		if (numberThree > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		System.out.print("4th number: ");
		numberFour = scan.nextInt();
		if (numberFour > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		System.out.print("5th number: ");
		numberFive = scan.nextInt();
		if (numberFive > 19) {
			System.out.println("Please read directions and try again!");
			System.exit(0);
		}
		
		//calculates total, then prints total and random key
		
		int total = numberOne + numberTwo + numberThree + numberFour + numberFive; 
		System.out.println("Total: " + total); 
		System.out.println("Your random key is : " +key); 
		
		int digit1 = total / 10; //take first digit of total and stores it into a new variable
		int digit2 = total % 10; //take second digit of total and stores it into a new variable
		
		if (total < 10) {
		    digit1 = 0;
		}
		
		int encodedDigit1 = (digit1+key)%10; //enters first digit into equation
		int encodedDigit2 = (digit2+key)%10; //enters second digit into equation
		
		System.out.println("Your encoded Number is: " + encodedDigit1 + encodedDigit2); //combines and prints encoded number
	
	}
}
