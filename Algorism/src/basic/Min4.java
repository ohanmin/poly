package basic;

public class Min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(min > b) min =b;
		if(min > c) min = c;
		if(min > d) min = d;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(546,564,3252,45) = "+ min4(546,564,3252,45));
	}
}
