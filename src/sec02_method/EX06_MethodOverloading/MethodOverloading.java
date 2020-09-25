package sec02_method.EX06_MethodOverloading;

public class MethodOverloading {
	public static void main(String[] args) {
		
		print(); //데이터가 없습니다.
		print(3); //3
		print(5.8); //5.8
		print(2, 5);

	}
	
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}
	
	public static void print(int a) {
		System.out.println(a);
	}
	
	public static void print(double a) {
		System.out.println(a);
	}
//	public static void print(double b) { //불가능
//		System.out.println(b);
//	}
	
	public static void print(int a, int b) {
		System.out.println("a: "+ a + " b: "+b);
	}
	
//	public static int print(int a, int b) { //불가능
//		System.out.println("a: "+ a + " b: "+b);
//		return a+b;
//	} 
}








