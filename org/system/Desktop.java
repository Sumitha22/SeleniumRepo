package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("150%");
	}

	public static void main(String[] args) {
		Desktop size = new Desktop();
		size.desktopSize();	
		size.computerModel();
	}

}
