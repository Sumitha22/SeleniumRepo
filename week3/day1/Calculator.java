package week3.day1;

public class Calculator {
	
	public void add(int n1, int n2) {
		System.out.println("add of 2 int " + (n1+n2));
	}
	
	public void add(int n1, int n2,int n3) {
		System.out.println("add of 3 int " + (n1+n2+n3));
	}

	public void sub(double n1, double n2) {
		System.out.println("sub of 2 double " + (n1-n2));
	}
	
	public void sub(int n1, int n2) {
		System.out.println("sub of 2 int " +(n1-n2));
	}
	
	public void mul(int n1, double n2) {
		System.out.println("mul of int and double " + (n1*n2));
	}
	
	public void mul(double n1, double n2) {
		System.out.println("mul of 2 double " + (n1*n2));
	}
	
	 public static void main(String[] args) {
	     Calculator task  = new Calculator();
			//float Div = Mycalculator.divide(90,5);

	     task.add(89,98);
	     task.add(89,1000,29);
	     task.sub(54.76,18.88);
	     task.sub(100,18);
	     task.mul(99,1);
	     task.mul(67.98,98.98);
	     System.out.println();
	}
}
