package first;

import java.util.Scanner;

public class Ex05_09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("1~4 중 선택");
		a = s.nextInt();
		switch (a) {
		case 1:
			System.out.println("1을 초이스");
			
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
			System.out.println("이상해씨 너로 정했다.");
		}
	}
}
