package day03;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("3.14 + 10 : " + (3.14 + 10));
		// "3.14 + 10 : " + 3.14
		// ==> "3.14 + 10 : 3.14"
		
		System.out.println('J' + 3.14);
		
		//'J' 이후의 열번째 문자
		
		System.out.println((char)('J'+10));
		
		
		//나머지 
		
		int no1 = 5;
		int no2 = 3;
		
		System.out.println("no1 / no2 = " + (no1 / no2));
		System.out.println("no1 + no2 = " + (no1 + no2));
		System.out.println("no1 - no2 = " + (no1 - no2));
		System.out.println("no1 * no2 = " + (no1 * no2));
		System.out.println("no1 % no2 = " + (no1 % no2));
		
		int no3 = 10;
		int no4 = 20;
		
		int no5 = no3++ + ++no4;
		
		System.out.println("no3 : " + no3);
		System.out.println("no4 : " + no4);
		System.out.println("no5 : " + no5);
		
		
		
		
		
	}
}
