package com.paint2;
// paint �ر׸� �۾�

// waterpaint,oilpaint,orient ��,��äȭ���� �غ�,ä��, �ϼ�
// 1,2,3 �Էµ� ���� ���� �帣(orient) ����
// �ݺ�

import java.util.Scanner;

public class PaintTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		OilPaint op = new OilPaint();
		WaterPaint wp = new WaterPaint();
		OrientPaint orp = new OrientPaint();

		while (true) {
			System.out.println("�帣���� (1,2,3)");
			int typechoice = sc.nextInt();

			if (typechoice == -1) {
				System.out.println("��������");
				break;
			}

			switch (typechoice) {
			case 1:
				op.draw("��äȭ");
				// op.oil();
				op.drawpic();
				break;

			case 2:
				wp.draw("��äȭ");
				// wp.water();
				wp.drawpic();
				break;

			case 3:
				orp.draw("����ȭ");
				// orp.ori();
				orp.drawpic();
				break;

			default:
				System.out.println("�帣 �� ����");
				break;
			}
		}
	}
}