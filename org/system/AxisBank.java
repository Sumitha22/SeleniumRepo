package org.system;

public class AxisBank extends Bankinfo{

	public void deposit() {
		System.out.println("Deposit in Axis");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();

    }
}
