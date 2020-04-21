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
		System.out.println("������������");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}

	@Override
	public void play() {
		System.out.println("���� ���� �մϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}

	@Override
	public void sendSMS() {
		System.out.println("���� ���ϴ�.");
	}

	@Override
	public void receveSMS() {
		System.out.println("���� �Խ��ϴ�.");
	}

	public void schedule() {
		System.out.println("���� ������ �մϴ�.");
	}
}

public class InterFaceEX2 {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ�" + phone.calculate(3, 5));
		phone.schedule();
	}
}

// Ŭ���� extends Ŭ����
//�������̽� extends �������̽�
//  Ŭ���� implements �������̽�

