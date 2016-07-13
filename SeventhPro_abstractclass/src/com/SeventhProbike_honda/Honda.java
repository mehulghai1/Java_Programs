package com.SeventhProbike_honda;

public class Honda extends Bike{
	

	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();
		System.out.println("Drive Safely .... !");

	}

	@Override
	void run() {
		System.out.println("Run Safely ..... !");
		
	}

}
