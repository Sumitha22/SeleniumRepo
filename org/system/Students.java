package org.system;

public class Students {
	
	public void getStudentInfo(int Stuid) {
		System.out.println("Student ID: " + Stuid);
}
	public void getStudentInfo(int Stuid, String Stuname) {
		System.out.println("Student ID and Name: "+ Stuid + " "+ Stuname);
	}
	public void getStudentInfo (String Stuemail, long stuphoneNumber) {
		System.out.println("Email and PhoneNumber: " + Stuemail + " " + stuphoneNumber);
    }

	public static void main(String[] args) {
      Students S = new Students();
      S.getStudentInfo(198);
      S.getStudentInfo(198 , "Suji");
      S.getStudentInfo("xys@gmail.com",9283748489l);
 
	}

}
