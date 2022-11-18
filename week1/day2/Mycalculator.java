package week1.day2;

public class Mycalculator {
	public static void main(String[] args) {
		
		Calculator Mycalculator = new Calculator();
		
		int Add = Mycalculator.add(90,70,60);
		int Sub = Mycalculator.sub(120,70,20);
		double Mul = Mycalculator.mul(90,70);
		float Div = Mycalculator.divide(90,5);
		
		System.out.println(Add);
		System.out.println(Sub);
		System.out.println(Mul);
		System.out.println(Div);
	}

}
