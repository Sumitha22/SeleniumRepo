package week1.day2;

public class Calculator {
	public int add(int N1, int N2, int N3) {
		// TODO Auto-generated method stub
		int resultonaddition =  N1 +  N2 + N3;
		System.out.println(resultonaddition);
		return resultonaddition;
		//return N1 + N2 + N3;
	}
	public int sub(int N1, int N2, int N3) {
		// TODO Auto-generated method stub
		int resultonSub =  N1 -  N2 - N3;
		System.out.println(resultonSub);
		return resultonSub;
		//return N1 - N2 - N3;(while using this return none of the other line are needed in this menthod, except first and this return)
	}
	public double mul(double N1, double N2) {
		// TODO Auto-generated method stub
		double resultonMul =  N1 * N2;
		System.out.println(resultonMul);
		return resultonMul;
		//return N1 * N2;
	}
	public float divide(float N1, float N2) {
		// TODO Auto-generated method stub
		float resultonDiv =  N1 / N2;
		System.out.println(resultonDiv);
		return resultonDiv;
		//return N1 / N2;
}
			}
