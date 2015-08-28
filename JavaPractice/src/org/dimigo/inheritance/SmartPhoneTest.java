package org.dimigo.inheritance;
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] phones = {
				new iPhone("iphone", "애플", 700000),
				new Galaxy("갤럭시 s6", "삼성", 650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			
			phone.useSpecialFunction();
			
			phone.turnOff();
			System.out.println();
		}
	}
}
