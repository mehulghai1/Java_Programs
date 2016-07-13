package com.TP;

import java.util.Scanner;

public class TP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		
		
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		
		
		System.out.println("Enter the value of z");
		int z = sc.nextInt();
		
		if (x<y && x<z)
		{
			System.out.println("x is less than y and x is less than z");
		}
		else if (x>y && x>z) {
			System.out.println("x is greater than y and x is greater than z");
		}
		else if (y<x && y<z)
		{
				System.out.println("y is less than x and y is less than z");
		}
		else if (y>x && y>z) {
			System.out.println("y is greater than x and y is greater than z");
		}
		else if (z<x && z<y)
		{
				System.out.println("z is less than x and z is less than y");
		}
		else if (z>x && z>y) {
			System.out.println("z is greater than x and z is greater than y");
		}
		else
		{
			System.out.println("Enter Correct Value ... !");
		}
	}

}
