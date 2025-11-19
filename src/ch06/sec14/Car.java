package ch06.sec14;

public class Car {
	//필드 선언
	private int speed;
	private boolean stop;

	//speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed<0) {
			System.out.println("속도는 음수일 수 없습니당");
			this. speed = 0;
		} else {
			this. speed = speed;
		}
	}
	
	//stop 필드의 Getter/Setter 선엔
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			this.speed = 0;
		}
	}
}