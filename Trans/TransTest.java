package com.Trans;

public class TransTest {
	public static void main(String[] args) {
//		Trans trn1= new Train(2, 0, 20, 0);
//		System.out.println(trn1);
//		
//		Trans trn2= new Express(4, 0, 40, 0);
//		System.out.println(trn2);
//		
//		Trans trn3= new CityBus(6, 0, 60, 0);
//		System.out.println(trn3);
//		
//		Trans trn4= new Taxi(0, 30, 100, 0);
//		System.out.println(trn4);
		
		Trans[] trs= new Trans[4];
			trs[0]=new Train(2, 0, 20, 0);
			trs[1]=new Express(4, 0, 40, 0);
			trs[2]=new CityBus(6, 0, 60, 0);
			trs[3]=new Taxi(1, 30, 100, 0);
			
		for (int i = 0; i < trs.length; i++) {
			printcharge (trs[i]);
		}
	}
		public static void printcharge(Trans trs) {
			System.out.println("�ο� : �Ÿ� : �ܰ� : ���");
			System.out.println(trs);
			System.out.println(trs.getCharge());
			System.out.println("===============================");
								
	}
}
//�θ� Ŭ���� Trans
//�ڽ� Ŭ���� Train, Express, CityBus, Taxi
//���� Ŭ���� TransTest main ó��
//����ο� cnt
//�Ÿ� dis
//�ܰ� dan
//��� charge
//�߻�޼ҵ� : getCharge()