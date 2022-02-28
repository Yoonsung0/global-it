package day05;
/*
 * 나이를 입력 받아서 
 * 
 * 	유년기
 * 	10대
 * 	20대
 * 	30대
 * 	40대
 * 	장년층 으로 구분해서 출력하세요.
 * 
 */

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("나이를 입력하세요 : ");
		
		String number = sc.nextLine();
		
		
		int num = Integer.parseInt(number);
		
		String tmp = "장년층";
		
		if (num < 10) {
			tmp = "유년기";
			
		} else if (10 <= num && num < 20) {
			
			tmp = "10대";
			
		} else if (20 <= num && num < 30) {
			
			tmp = "20대";
			
		} else if (30 <= num && num < 40) {
			
			tmp = "30대";
			
		} else if (40 <= num && num < 50) {
			
			tmp = "40대";
			
		} 
		
		System.out.println("입력하신 나이는 " + tmp + "입니다.");
		
		System.out.println();
	}

}
