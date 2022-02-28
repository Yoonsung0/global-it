package day04.ex;

import java.util.Scanner;

/*
	 * 		문제 4 ]
	 * 			1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서
	 * 			이 숫자를 년도로 하는 해는
	 *			윤년인지 평년인지를 판별해서 출력해주는
	 *			프로그램을 작성하세요.
	 *
	 *
	 *
	 *		참고 ]
	 *			윤년은 4로 나누어 떨어지고 
	 *					100으로 나누어 떨어지면 안되고
	 *					400으로 나누어 떨어지는 해를 윤년이라한다.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("년도를 입력하세요 : ");
		
		String year1 = sc.nextLine();
		
		
		int year =	Integer.parseInt(year1);
		
		
		
		String yoon = "윤달";
		
		yoon = year % 4 != 0 ? "평달" : ((year % 100 == 0) && (year % 400 !=0) ? "평달" : "윤달" );
		
		System.out.println("입력하신 년도 : " + year);
		System.out.println(year + "는 " + yoon + "입니다.");
		
		
		
		
	}
}
