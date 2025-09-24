package ch04.sec07;

public class BreakExample {
	public static void main(String[] args) throws Exception {
		int cnt = 0; // 몇번 만에 종료하는지 추가해보기
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			cnt++;
			System.out.println(num);
			// 특정 조건(num == 6)이 되면 while을 종료하기
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료 / 실행 횟수: "+ cnt);
	}
}
