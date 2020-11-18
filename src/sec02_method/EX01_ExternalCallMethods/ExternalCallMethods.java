package sec02_method.EX01_ExternalCallMethods;

/*클래스의 외부에서 메서드 호출*/

//#1. 클래스의 정의
class A {
	//@1. 리턴타입: void + 매개변수: 없음
	void print() {
		System.out.println("안녕");
	}	
	//@2. 리턴타입: int + 매개변수: 없음
	int data() {
		return 3;
	}
	//@3. 리턴타입: double + 매개변수: 2개
	double sum(int a, double b) {
		return a+b;
	}	
	//@4. 리턴타입: void + 내부에 리턴 포함 (함수를 종료한다는 의미)
	void printMonth(int m) {
		if(m<0 || m>12) {
			System.out.println("잘못된 입력");
			return;
		}
		System.out.println(m+"월입니다.");
	}	
}
public class ExternalCallMethods {
	public static void main(String[] args) {		
		//#2. 객체생성
		A a = new A();		
		
		//#3. 메서드 호출 (멤버활용)
		a.print();					//안녕		
		int k = a.data();
		System.out.println(k);		//3		
		double result = a.sum(3, 5.2);
		System.out.println(result);	//8.2		
		a.printMonth(5); 			//5월입니다.
		a.printMonth(15); 			//잘못된 입력
	}
}

























