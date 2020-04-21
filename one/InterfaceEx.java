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
//		System.out.println("�층�층");
	}

	@Override
	public void receivCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}

	@Override
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
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
