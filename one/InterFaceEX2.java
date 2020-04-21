package com.one;

interface PhoneInterface2 {
	final int TIMEOUT = 10000;

	void sendCall();

	void receiveCall();

	default void printLogo() {
		System.out.println("**Phone**");
	}
}

interface MobilePhoneInerface extends PhoneInterface2 {
	void sendSMS();

	void receveSMS();
}

interface MP3Interface {
	public void play();

	public void stop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SmartPhone extends PDA implements MobilePhoneInerface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}

	@Override
	public void play() {
		System.out.println("음악 연주 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다.");
	}

	@Override
	public void receveSMS() {
		System.out.println("문자 왔습니다.");
	}

	public void schedule() {
		System.out.println("일정 관리를 합니다.");
	}
}

public class InterFaceEX2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면" + phone.calculate(3, 5));
		phone.schedule();
	}
}

// 클래스 extends 클래스
//인터페이스 extends 인터페이스
//  클래스 implements 인터페이스

