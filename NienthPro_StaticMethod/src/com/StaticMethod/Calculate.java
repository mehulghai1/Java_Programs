package com.StaticMethod;

public class Calculate {
	static int square(int x)
	{
		
		return x*x;
		
	}
	public static void main(String[] args) {
		int result = Calculate.square(10);
		System.out.println("Result :- "+result);
	}

}
