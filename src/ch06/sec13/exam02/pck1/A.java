package ch06.sec13.exam02.pck1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// public 접근 제안 생성자 선언
	public A(boolean b) {
		
	}
	
	// default 접근 제안 생서자 생성
	A(int b) {
		
	}
	
	// private 접근 제안 생섲자 선언
	private A(String b) {
		
	}
}
