package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA"); 
		// replace() 메서드는 기존 문자열 객체를 수정하지 않고,
		// "자바"가 "JAVA"로 대체된 새로운 String 객체를 Heap 영역에 새로 생성하여 반환함
		
		// 즉, Stack에는 oldStr과 newStr이라는 참조 변수가 있고,
		// Heap에는 각각의 문자열("자바...", "JAVA...") 객체가 존재함
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
