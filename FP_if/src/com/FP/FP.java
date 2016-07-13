package com.FP;

import java.util.Scanner;

public class FP {

	public static void main(String[] args) {
		int marksobtained , passingmarks ;
		
		passingmarks = 40;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Marks Scored by you");
		marksobtained = sc.nextInt();
		if(marksobtained >=passingmarks)
		{
			System.out.println("You are successfully passed");
		}
	}

}
