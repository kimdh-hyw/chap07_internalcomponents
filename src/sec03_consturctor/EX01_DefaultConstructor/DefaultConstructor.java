package sec03_consturctor.EX01_DefaultConstructor;

/*기본 생성자의 자동 추가*/

class A {
	int m;
	void work() {
		System.out.println(m); //0
	}
	//컴파일러가 자동으로 추가해주는 기본 생성자
	/*
	A(){
		//객체 생성 이후에 해야 할 추가 일들
	}
	*/
}
class B {
	int m;
	void work() {
		System.out.println(m); //0
	}
	B() { //기본생성자
		
	}
}
class C {
	int m;
	void work() {
		System.out.println(m); //생성자로 넘어온 값
	}
	C(int a) { //생성자의 기본기능 : 객체 생성 + 필드 초기화
		m=a;
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		
		//#1. 클래스의 객체 생성
		A a = new A();
		B b = new B();
		//C c = new C(); //불가능
		C c = new C(3);		
		
		//#2. 메서드 호출
		a.work(); //0
		b.work(); //0
		c.work(); //3
	}
}
























