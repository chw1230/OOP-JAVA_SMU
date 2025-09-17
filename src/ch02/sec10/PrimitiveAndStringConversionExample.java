package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String args[]) {
		int v1 = Integer.parseInt("10");  // String -> int
		double v2 = Double.parseDouble("3.14"); // String -> double
		boolean v3 = Boolean.parseBoolean("true"); // String -> boolean
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println("v3: " + v3);
		
		String str1 = String.valueOf(10); // int -> String
		String str2 = String.valueOf(3.14); // double -> String
		String str3 = String.valueOf(true); // bool -> String

		System.out.println("str1: " + str1); 
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}
}
