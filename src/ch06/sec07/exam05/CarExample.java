package ch06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		Car car2 = new Car("아반떼");	
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println();
		
		Car car3 = new Car("산타페","흰색");	
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println();
		
		Car car4 = new Car("제네시스","검정색",250);	
		System.out.println("car4.company: " + car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
		System.out.println();
	}
}
