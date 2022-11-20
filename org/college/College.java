package org.college;

public class College {
	public void collegeName() {
		System.out.println("College Name: Anna University");
	}
	public void collegeCode() {
		System.out.println("College code: 572623");	
	}
   public void collegeRank() {
	   System.out.println("CollegeRank: A+");
   }
   public static void main(String[] args) {
	   College C = new College();
	   C.collegeName();
	   C.collegeCode();
	   C.collegeRank();
    }
}
