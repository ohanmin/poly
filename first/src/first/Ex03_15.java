package first;

public class Ex03_15 {
	public static void main(String[] args) {
		String str1 = "it cookbook 입네다.";
		String str2 = "10";
		String str3 = "20";
		System.out.println(str1);
		System.out.println(str2 + str3);
		int num1 = Integer.parseInt(str2);
		int num2 = Integer.parseInt(str3);
		System.out.println("결과"+ (num1 + num2));
	}
}
