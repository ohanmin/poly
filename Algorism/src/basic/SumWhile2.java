package basic;

import java.util.Scanner;

public class SumWhile2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1���� n���� ��?");
		System.out.println("n�� ��?");
		int n = stdIn.nextInt();
		int sum = 0;
		int i = 0;
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("i���� " +i+"�Դϴ�.");
		System.out.println("1����"+ n+"������ ����" +sum +"�Դϴ�.");
	}
}
