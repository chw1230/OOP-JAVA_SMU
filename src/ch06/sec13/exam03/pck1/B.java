package ch06.sec13.exam03.pck1;

public class B {
	public void method() {
		A a = new A(); // 객체 생성
		
		// 필드 값 변경
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1; // private 필드이기에 접근 불가
		
		// 메서드 호출
		a.method1();
		a.method2();
//		a.method3(); // private 생성자이기에 사용 불가
	}
}
