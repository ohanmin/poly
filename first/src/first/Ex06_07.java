package first;

public  class Ex06_07 {
	static int bbbbb = 0; //클레스 전체에서 사용되는 변수(전역변수)
	public static void main(String[] args) {
		System.out.println(bbbbb);
		int hap = 0;//Main 함수 실행되는 동안만 살아있는 변수
		int i;
		for(i=1; i<=10; i++) {
			int b = 0;//for문 한번 돌때만 살아있는 변수
			hap =hap +i;
		}
		System.out.println("1~10합?"+hap);
	}
}
