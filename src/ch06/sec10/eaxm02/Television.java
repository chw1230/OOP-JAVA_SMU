package ch06.sec10.eaxm02;

public class Television {
	static String compmany = "최고다 회사";
	static String model = "맛있는 밥";
	static String info;
	
	// 복잡한 초기화 작업이 피료하면 정적 블럭을 사용 -> 정적 블럭은 클래스가 메모리로 로딩될 때 자동으로 진행
	static {
		info = compmany + "-" + model;
	}
}
