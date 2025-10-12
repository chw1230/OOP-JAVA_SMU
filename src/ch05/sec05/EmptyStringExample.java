package ch05.sec05;

public class EmptyStringExample {

	public static void main(String[] args) {
		String hobby = ""; // 빈 문자열도 String객체로 생성됨
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조는 String 객체는 빈문자열");
		}
	}
}