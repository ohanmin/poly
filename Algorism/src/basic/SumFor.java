package basic;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		System.out.println("1���� n������ ���� ���ϼ���");
		Scanner scanner = new Scanner(System.in);
		System.out.println("n�� ����?");
		int n = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			
			sum += i;
			System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		}
	}
}
