package week1.day1;

public class MobileData {
	String mobileBrandName = "OnePlus";
	char mobileLogo = 'P';
	short noOfMobilePiece = 10000;
	int modeInumber = 67;
	long mobilemeiNumber = 93476398568l;
	float mobilePrice = 25000.50f;
	boolean isDamaged = true;
	
	public static void main(String[] args) {
		MobileData MyMob = new MobileData();
		System.out.println(MyMob.mobileBrandName);
		System.out.println(MyMob.mobileLogo);
		System.out.println(MyMob.noOfMobilePiece);
		System.out.println(MyMob.modeInumber);
		System.out.println(MyMob.mobilemeiNumber);
		System.out.println(MyMob.mobilePrice );
		System.out.println(MyMob.isDamaged);
		
	}	

}
