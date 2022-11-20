package org.system;

public class Bankinfo {

	public void saving() {
		System.out.println("Savings");
	}
	public void fixed() {
		System.out.println("Fixed");
	}
	public void deposit() {
		System.out.println("Deposit");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankinfo Bank = new Bankinfo();
		Bank.saving();
		Bank.fixed();
		Bank.deposit();

	}

}
