package ch06.sec08.exam02;

public class Computer {
	// 가변 길이 매개변수를 갖는 메서드 선언
	int sum (int ... v) {
		// sum 변수 선언
		int sum = 0;
		
		// v는 배열 타입의 변수 처럼 사용
		for ( int i = 0; i < v.length; i++) {
			sum += v[i];
		}
		
		// 합 결과 반환
		return sum;
	}
}
