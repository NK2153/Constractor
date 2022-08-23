package org.test;

public class Company extends Client {
	public void companyName() {
		this.companyPhno();
		System.out.println("Zebronics");
	}

	private void companyPhno() {
		this.compEmail();
		System.out.println("345678567");
	}

	public void compEmail() {
		this.name();
		System.out.println("zebronics1324@gmail.com");
	}
}
