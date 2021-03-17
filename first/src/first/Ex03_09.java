package first;

public class Ex03_09 {
	public static void main(String[] args) {
		int a, b, c, d;
		a = 100 + 100;
		b = a+ 100;
		c = a + b -100;
		d = a + b + c;
		a = a + 100;
		a = b = c =d =100;
		System.out.println(a +","+b+","+c+","+d);
		a = a+ 200;
		System.out.println("a ÀÇ °ª ==>"+ a);
	}
}
