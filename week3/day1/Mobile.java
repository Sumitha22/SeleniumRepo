package week3.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Calling");
	}
	public void sendMsg() {
		System.out.println("Received");
	}
	public void saveContact() {
		// TODO Auto-generated method stub
		System.out.println("Contact Saved");
	}	
	public static void main(String[] args) {
		Mobile myMob = new Mobile();
		
		myMob.makeCall();
		myMob.sendMsg();
		myMob.saveContact();		
	}
}

