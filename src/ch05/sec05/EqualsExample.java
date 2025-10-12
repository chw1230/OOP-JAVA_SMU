package ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 갈음"); // 이게 출력됨 -> 같은 리터럴이 다시 등장하면 새로 만들지 않고, 기존 걸 재사용
			// strVar1과 strVar2는 둘 다 그 하나의 객체를 참조하는 것
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
			// 하지만 new String("홍길동"); 이였다면 -> Heap 영역에 새로운 String 객체를 따로 생성
		}

		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 갈을");
		}

		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름"); // 이게 출력 서로 Heap에 다른 홍길동 객체를 생성
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 갈음");
		}
	}
}
