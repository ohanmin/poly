package basic;

import java.util.Scanner;

public class Med3 {
	static int med3(int a, int b, int c) {
		if((a>=b && c<=a) || (b>=a && a>=c)) {
			return a;
		}
		else if((b>a && c>b)||(a<b &&b<c)) {
			return b;
		}
		else return c;
	}
	public static void main(String[] args) {
		Scanner med = new Scanner(System.in);
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a�� ��?");
		int a = med.nextInt();
		System.out.println("b�� ��?");
		int b = med.nextInt();
		System.out.println("c�� ��?");
		int c = med.nextInt();
		System.out.println("�߾Ӱ���"+med3(a,b,c)+ "�Դϴ�.");
	}
}
