package org.test;

public class Selenium extends Java {

	public Selenium() {
		this("NK");
		System.out.println("Default Constractor for Selenium");

	}

	public Selenium(String name) {
		this(545678);
		System.out.println("Employee Name is :" + name);
	}

	public Selenium(int empId) {
		this(8344390486l);
		System.out.println("Employee Id is :" + empId);
	}

	public Selenium(long empPhono) {
		this(234567.34567f);
		System.out.println("Employee Phone No is :" + empPhono);
	}

	public Selenium(float empavg) {
		this('M');
		System.out.println("Average Working Employee is :" + empavg);
	}

	public Selenium(char gender) {
		System.out.println("Mostly Working Gender is :" + gender);
	}

	public static void main(String[] args) {
		Selenium bb = new Selenium();
	}

}
