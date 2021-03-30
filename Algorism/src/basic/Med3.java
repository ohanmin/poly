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
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a의 값?");
		int a = med.nextInt();
		System.out.println("b의 값?");
		int b = med.nextInt();
		System.out.println("c의 값?");
		int c = med.nextInt();
		System.out.println("중앙값은"+med3(a,b,c)+ "입니다.");
	}
}
