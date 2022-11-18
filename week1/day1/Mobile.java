package week1.day1;

public class Mobile {
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("Calling");

	}
	public void sendMsg() {
		// TODO Auto-generated method stub
		System.out.println("Received");
	}
	
	public static void main(String[] args) {
		Mobile myMob = new Mobile();
		
		myMob.makeCall();
		myMob.sendMsg();		
		
	}
}
