package day03.ex;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] arg) {
		
			final double PI = 3.14;
		
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("반지름을 입력하세요 : ");
			
			String radius = scanner.nextLine();
			
			int radius1 = Integer.parseInt(radius);
			
			System.out.println("입력하신 반지름 : " + radius1);
			
			System.out.println("원의 둘레 : " + 2 * radius1 * PI);
			
			System.out.println("원의 둘레 : " + radius1 * radius1 * PI);
	}
}
