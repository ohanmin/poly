package basic;

public class Max4m {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(max < b) max =b;
		if(max < c) max =c;
		if(max < d) max =d;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max(5,6,3,4) ="+max4(5,6,3,4));
	}
}
