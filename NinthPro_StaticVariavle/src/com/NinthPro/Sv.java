package com.NinthPro;

public class Sv {

	int rollno;
	String name;
	static String college = "GGITS";
	
	public Sv(int r , String n) 
	{
		rollno = r ; 
		name = n ;
	}
	void display(){
		System.out.println(rollno + " " + name +" " + college);
	}
	
	public static void main(String[] args) {
		Sv s = new Sv(1, "MEHUL");
		Sv s1 = new Sv(2, "DODO");
		
		s.display();
		s1.display();

	}

}
