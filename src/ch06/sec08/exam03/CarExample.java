package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		
		// 리턴 값이 없는 SetGas() 메서드 호출
		car.setGas(5);
		
		// isLeftGas()메서드를 호출해서 받은 리턴값이 true일 경우 if 블럭 실행
		if(car.isLeftGas()) {
			System.out.println("출발합니다.");
			
			// 리턴 값이 없는 run() 메서드 호출
			car.run();

		}
		System.out.println("출발합니다.");
	}
}
