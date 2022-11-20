package week3.day1;

public class SmartPhone extends AndriodPhone{
    public void connectWhatsapp() {
   	 System.out.println("Whatsapp Connected");
    }
    
	public void takevideo() {
		System.out.println("Video Running");
	}
    public static void main(String[] args) {
     SmartPhone whatsapp = new SmartPhone();
   	 whatsapp.connectWhatsapp();
   	 whatsapp.takevideo();
   	 whatsapp.makeCall();
   	 whatsapp.sendMsg();
	 whatsapp.saveContact();
   	 
	}

}
