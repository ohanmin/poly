package first;

import java.util.Scanner;

public class Ex05_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("1~4 �� ����");
		a = s.nextInt();
		switch (a) {
		case 1:
			System.out.println("1�� ���̽�");
			
		case 2:
			System.out.println("2 choose");
			break;
		case 3:
			System.out.println("3 choose");
			break;
		case 4:
			System.out.println("4 CHOOSE");
			break;
		default:
			System.out.println("�̻��ؾ� �ʷ� ���ߴ�.");
		}
	}
}
