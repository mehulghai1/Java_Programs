package com.NinthPro;

public class Counter {
	
	static int count = 0;
	
	public Counter() {
		count++;
		System.out.println("Count Value :- "+count);
	}

	public static void main(String[] args) {
		Counter c = new Counter();
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();

	}

}
