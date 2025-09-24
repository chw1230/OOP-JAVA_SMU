package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			// 홀수는 넘어가기기기기기~~~~~
			if(i%2 != 0) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
