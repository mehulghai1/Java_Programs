package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		int a;
		int b;
		String operation;
try{
		Scanner i = new Scanner(System.in);

		System.out.println("Enter the value of a");
		a = i.nextInt();

		System.out.println("Enter the value of b");
		b = i.nextInt();

		Scanner op = new Scanner(System.in);
		System.out.println("Please enter Operation");
		operation = op.next();

		if (operation.equals("+")) {
			System.out.println("Your Answer is :-" + (a + b));

		} else if (operation.equals("-")) {
			System.out.println("Your answer is :-" + (a - b));

		} else if (operation.equals("*")) {
			System.out.println("Your answer is :-" + (a * b));

		} else if (operation.equals("%")) {
			System.out.println("Your answer is :-" + (a % b));
		} else if (operation.equals("/")) {
			System.out.println("Your Answer is :-" + (a / b));
		} 
			
		}catch(InputMismatchException e){
			System.out.println("Invalid Command");
		}
		
	}

}
