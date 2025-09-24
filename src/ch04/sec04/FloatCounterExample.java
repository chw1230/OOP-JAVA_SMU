package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) { // int로 반복문을 돌리지 않은 문제 존재!
			System.out.println(x);
		}
	}
}
