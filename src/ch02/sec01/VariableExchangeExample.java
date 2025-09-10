package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("변경 전");
		System.out.println("X: " + x + ", y: " + y);
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("변경 후");
		System.out.println("X: " + x + ", y: " + y);
	}
}
