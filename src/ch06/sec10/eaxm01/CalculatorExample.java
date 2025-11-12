package ch06.sec10.eaxm01;

public class CalculatorExample {

	public static void main(String[] args) {
		double r1 = 10*10*Calculator.pi; // 정적 맴버라서 클래스 로더가 메서드 영역에 올려두기 떄문에 클래스 생성 없이도 사용할 수 있음 -> 정적 맴버 => 정적 필드
		int r2 = Calculator.plus(10,5);
		int r3 = Calculator.minus(10, 5);
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
	}
}