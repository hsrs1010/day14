package com.one;

public class PopMp3 implements MyMp3 {

	@Override
	public void playmp3() {
		System.out.println("PopMp3����");
	}

	@Override
	public void listenFm() {
		System.out.println("Fm����");
	}

	@Override
	public void viewPhoto() {
		System.out.println("Image View ����");
	}
	
	public static void main(String[] args) {
		PopMp3 pm= new PopMp3();
		pm.playmp3();
		pm.listenFm();
		pm.viewPhoto();
	}
}
