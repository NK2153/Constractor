package org.test;

public class Python extends Selenium{
	public Python() {
		this("KN");
		System.out.println("Default Constractor for Python");
	}

	public Python(String name) {
		this(2345);
		System.out.println("Client Name is :"+name);
	}
	
	public Python(int clntId) {
		this(9715005328l);
		System.out.println("Client Id is :"+clntId);
	}
	public Python(long phno) {
		this(2345.345f);
		System.out.println("Client Phone No is :"+phno);
	}
	public Python(float avgclnt) {
		this('F');
		System.out.println("Average Client is :"+avgclnt);
		
	}
	public Python (char gen) {
		System.out.println("Client Gender is :"+gen);
	}
	public static void main(String[] args) {
		Python cc = new Python();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
