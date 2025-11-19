package ch06.sec13.exam03.pck1;

//0 == > 클래스 내부일 경우 접근제한자의 영향을 받지 않는다.
//0 == > 클래스 내부일 경우 접근제한자의 영향을 받지 않는다.

public class A {
	//public 필드 선언
	public int field1;
	//default 필드 선언
	int field2;
	//private 필드 선언
	private int field3;
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1; 
		// 위의 3개 모두 클래스 내부에 있기 때문에 영향을 받지 않음
		
		method1(); 
		method2(); 
		method3(); 
		// 위의 3개 모두 클래스 내부에 있기 때문에 영향을 받지 않음
	}
	//public 접근 제한을 갖는 메소드 선언
	public void method1() { }
	
	//default 접근 제한을 갖는 메소드 선언
	void method2() { }
	
	//private 접근 제한을 갖는 메소드 선언
	private void method3() { }
}
