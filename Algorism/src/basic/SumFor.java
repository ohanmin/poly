package basic;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		System.out.println("1부터 n까지의 합을 구하세요");
		Scanner scanner = new Scanner(System.in);
		System.out.println("n의 값은?");
		int n = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			
			sum += i;
			System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		}
	}
}
