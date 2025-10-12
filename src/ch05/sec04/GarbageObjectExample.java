package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null;               // "여행"에 해당하는 String 객체를 쓰레기로 만듬 -> 더 이상 참조되지 않는 객체("여행")는, GC(Garbage Collector)에 의해 자동으로 메모리에서 제거
		System.out.println(hobby);

		String kind1 = "자동차";
		String kind2 = kind1;          	// kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null;                   // kind1가 null을 가리키도록 하는 것이지 "자동차"에 해당하는 String 객체를 없애버리는 것이 아님!
		System.out.println("kind2: " + kind2);  // "자동차" 객체는 여전히 kind2가 참조 중
	}
}