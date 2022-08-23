package org.test;

public class Java  {
	public Java() {
		this("NK Promotors");
		System.out.println("Default Constractor for Java");
	}

	public Java(String name) {
		this(834439048);
		System.out.println("Company Name is :" + name);
	}

	public Java(int compId) {
		this(8925095622l);
		System.out.println("Company Id is :" + compId);
	}

	public Java(long companyPhono) {
		this(546.34566f);
		System.out.println("Company PhoneNo is :" + companyPhono);
	}

	public Java(float avgrank) {
		this('F');
		System.out.println("Average Rank is :" + avgrank);
	}

	public Java(char ceo) {
		
		System.out.println("Company CEO Gender is :" + ceo);

	}

	public static void main(String[] args) {
		Java aa = new Java();

	}

}
