package org.test;

public class Employee extends Company {
	public void empname() {
		this.empmobno();
		System.out.println("Karuna");
	}

	public void empmobno() {
		this.empemail();
		System.out.println("9725918678456");
	}

	public void empemail() {
		this.companyName();
		System.out.println("karuna144@gmail.com");
	}
	public static void main(String[] args) {
		Employee aa = new Employee();
		aa.empname();
	}

	

}
