package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int Number, Temp, Reminder, Times = 0;
		double Sum = 0;
		Number = 158;
		Temp = Number;
		while (Temp != 0) {
			Times = Times + 1;
			Temp = Temp / 10;
		}
		   
		Temp = Number;
		while( Temp > 0)  {
			Reminder = Temp %10;
		    Sum = Sum + Math.pow(Reminder, Times);
		    Temp = Temp /10;
		}
		System.out.format("\n Sum of entered is = %.2f", Sum);
		
		if (Sum == Number) {
			System.out.format("\n% d is a Armstrong", Number);
		}
		else {
			System.out.format("\n% d is NOT", Number);
		}
	}

}
