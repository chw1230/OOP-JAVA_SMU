package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator calc = new Calculator();
		
		// 리턴 값이 없는 powerOn() 메서드 호출
		calc.powerOn();
		
		// plus메서드 호출 시 5와 6을 매개값으로 제공하여 덧셈결과를 r 변수로 받기
		int r = calc.plus(5, 6);
		System.out.println("r: " +  r);
		
		int x = 10;
		int y = 4;
		// divide() 메서드 호출 시 변수 x와 y의 값을 매개값으로 제공하고, 나눗셈 결과를 리턴 받아 r2 변수에 대입
		double r2 = calc.divide(x, y);
		System.out.println("r2: " +  r2);

		// 리턴 값이 없는 powerOff() 메서드 호출
		calc.powerOff();
	}
}