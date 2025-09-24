package test;

public class test {
	public void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x*y;
		
		System.out.println(z);
		// int의 허용범위를 넘어가기 때문에
		System.out.println("--------------------------------");
		
		// long으로 캐스팅 해서 구해줘야 한다! 기본적인 연산에서는 int로 계산되기 때문에!!
		long x1 = 1000000;
		long y1 = 1000000;
		long z1 = (long)x1*(long)y1;
		
		System.out.println(z1);
	}
}
