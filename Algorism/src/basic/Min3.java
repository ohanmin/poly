package basic;

public class Min3 {
	static int min3(int a, int b, int c) {
		int min = a;
		if(min>b) min = b;
		if(min>c) min = c;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min3(5,55,12) = " + min3(5, 55, 12));
	}
}
