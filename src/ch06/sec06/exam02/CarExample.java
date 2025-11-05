package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// Car 객체의 필드값 읽기
		System.out.println("회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색상: "+myCar.color);
		System.out.println("최고 스피드: "+myCar.maxSpeed);
		System.out.println("현재 스피드: "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("수정된 스피드: "+myCar.speed);
	}
}