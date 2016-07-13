package com.FoP;

import java.util.Scanner;

public class FoP {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :-");
		int month = sc.nextInt();
		String monthstring = null;
		switch (month) {
		case 1:
			monthstring = "JANUARY";
			break;
		case 2:
			monthstring = "FEBRUARY";
			break;
		case 3:
			monthstring = "MARCH";
			break;
		case 4:
			monthstring = "APRIL";
			break;
		case 5:
			monthstring = "MAY";
			break;
		case 6:
			monthstring = "JUNE";
			break;
		case 7:
			monthstring = "JULY";
			break;
		case 8:
			monthstring = "AUGUST";
			break;
		case 9:
			monthstring = "SEPTEMBER";
			break;
		case 10:
			monthstring = "OCTOBER";
			break;
		case 11:
			monthstring = "NOVEMBER";
			break;
		case 12:
			monthstring = "DECEMBER";
			break;
		default:
			break;
		}
System.out.println("Print monthstring :- "+monthstring);
	}

}
