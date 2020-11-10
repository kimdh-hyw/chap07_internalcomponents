package sec05_thismethod.EX01_ThisMethod_1;

/*this(생성자의 매개변수) 메서드의 문법적 특징과 의미*/

//#1. 클래스의 정의
class A {
	A() {
		System.out.println("첫번째 생성자");
	}
	A(int a){
		this(); //생성자의 첫줄에만 올 수 있다. 
		System.out.println("두번째 생성자");
	}
//	void abc() {
//		this(); //불가능
//	}
}
public class ThisMethod_1 {
	public static void main(String[] args) {		
		//#2. 객체 생성
		A a1 = new A(); //첫번째 생성자
		System.out.println();
		A a2 = new A(3);// 첫번째 생성자 -> 두번째 생성자	
	}
}
