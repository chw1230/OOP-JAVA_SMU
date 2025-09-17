package ch02.sec11;

public class VariableScopeExample {
	public static void main(String args[]) {
		int v1 = 15;
		int v2 = 0;
		if ( v1 > 10 ) {
			v2 = v1 - 10; // v2는 if{ } 블럭 속에서 사용되는 변수
		}
		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없어서 오류 발생!
		
		System.out.println("v3: " + v3);
	}
}
