package sec02_method.EX02_InternalCallMethods;

/*클래스 내부에서의 메서드 호출*/

public class InternalCallMethods {
	public static void main(String[] args) {		
		//같은 클래스 안에 있는 내부 메서드 호출
		print();
		
		int a = twice(3);
		System.out.println(a); //6
		
		double b = sum(a, 5.8);
		System.out.println(b); //11.8
	}	
	public static void print() {
		System.out.println("안녕");
	}	
	public static int twice(int k) {
		return k*2;
	}	
	public static double sum(int m, double n) {
		return m+n;
	}	
}
