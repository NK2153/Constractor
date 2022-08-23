package org.test;

public class Join extends AbstractHeavy  {

	@Override
	public void lorry() {
		this.Tanker();
System.out.println("Heavy");		
	}

	@Override
	public void Tanker() {
		this.bus();
System.out.println("Water");		
	}

	@Override
	public void bus() {
		this.apachie();
System.out.println("People");		
	}

	@Override
	public void apachie() {
		this.shine();
System.out.println("Stylish");		
	}

	@Override
	public void shine() {
		this.tvs();
System.out.println("Normal");		
	}

	@Override
	public void tvs() {
		this.benz();
System.out.println("Heavy Load");		
	}

	@Override
	public void benz() {
		this.honda();
System.out.println("Luxuries Vechicle");		
	}

	@Override
	public void honda() {
		this.hundai();
System.out.println("Desent Vechicle");		
	}

	@Override
	public void hundai() {
System.out.println("Normal Performance");		
	}
public static void main(String[] args) {
	Join bb = new Join();
	bb.lorry();
}
}
