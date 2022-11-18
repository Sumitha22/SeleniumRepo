package week1.day1;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 58395879835l;
	boolean isPunctured = true;	
	String bikeName = "Avenger";
	double runningKM = 23488.88;
	
public static void main(String[] args) {
	TwoWheeler Features = new TwoWheeler();
	System.out.println(Features.noOfWheels); 
	System.out.println(Features.chassisNumber);
	System.out.println(Features.noOfMirrors);
	System.out.println(Features.isPunctured);
	System.out.println(Features.bikeName);
	System.out.println(Features.runningKM);
}

}
