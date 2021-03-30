package basic;

import java.util.Scanner;

public class SumWhile2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지 합?");
		System.out.println("n의 값?");
		int n = stdIn.nextInt();
		int sum = 0;
		int i = 0;
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("i값은 " +i+"입니다.");
		System.out.println("1부터"+ n+"까지의 합은" +sum +"입니다.");
	}
}
