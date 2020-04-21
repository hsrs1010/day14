package com.one;

interface PhoneInterface{
	final int TIMEOUT=10000;
	void sendCall();
	void receivCall();
	void flash();
	
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

class SamSungPhone implements PhoneInterface {

	Call call=new Call();
	@Override
	public void sendCall() {
		call.tokCall();
//		System.out.println("띠링띠링");
	}

	@Override
	public void receivCall() {
		System.out.println("전화가 왔습니다.");
	}

	@Override
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
	
}

public class InterfaceEx {
	public static void main(String[] args) {
		SamSungPhone phone= new SamSungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receivCall();
		phone.flash();
	}
}
