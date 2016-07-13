package com.EighthPro;

public class Honda implements Bike {

	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();
		System.out.println("Drive Safely ....!\n" +"Hello");

	}

	public void run() {
		System.out.println("Run Safely .... !");
		
	}

}
