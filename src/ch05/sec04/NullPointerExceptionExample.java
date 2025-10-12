package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null; // 아무 객체를 참조하지 않은 상태임
		//intArray[0] = 10; //NullPointerException

		String str = null; // 아무 객체를 참조하지 않은 상태임
		//System.out.println("총 문자수: " + str.length() ); //NullPointerException
	}
}