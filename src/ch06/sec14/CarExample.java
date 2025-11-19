package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		//객제 생성
		Car myCar = new Car();

		//잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		//을바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: "+myCar.getSpeed());
		
		//스땁!!!!
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도: "+myCar.getSpeed());
	}
}