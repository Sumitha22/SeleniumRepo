package org.system;

public class Automation extends MultipleLangauge implements Language,TestTool{
	
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	public void Java() {
		// TODO Auto-generated method stub
		
		System.out.println("Selenium");
	}
	
	public static void main(String[] args) {
		
		Automation A = new Automation();
		 A.Java();
		 A.Selenium();
		 A.ruby();
		 A.python();
	}

}


