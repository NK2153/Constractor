package org.test;

public class InterfaceJoin implements InterfaceSch,InterfaceClg,InterfaceLife {

	@Override
	public void gvntjob() {
		this.privtjob();
System.out.println("Full Secured");		
	}

	@Override
	public void privtjob() {
this.selfEmp();
System.out.println("Not Secured");
	}

	@Override
	public void selfEmp() {
this.anna();
System.out.println("Own Risk");
	}

	@Override
	public void anna() {
this.barathiyar();
System.out.println("Engineering");
	}

	@Override
	public void barathiyar() {
this.bharathidasan();
System.out.println("Arts");
	}

	@Override
	public void bharathidasan() {
this.govt();
System.out.println("Also Arts");
	}

	@Override
	public void govt() {
this.cbsc();
System.out.println("Free education");
	}

	@Override
	public void cbsc() {
this.privt();
System.out.println("Central govt Control");
	}

	@Override
	public void privt() {
System.out.println("Self Finance");		
	}
	public static void main(String[] args) {
		InterfaceJoin dd = new InterfaceJoin();
		dd.gvntjob();
		
	}

}
