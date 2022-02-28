package day03.ex;

/*
 		문제 1 ]
 			두개의 숫자를 입력받은 후(가로, 세로)
 			두 숫자를 이용해서 	사각형의 넓이와 
 			 					삼각형의 넓이를 구해서 
 			결과를 출력하세요
 
 			출력형식 ]
 			
 				가로 : XXXX
 				세로 : XXXX
 				사각형 넓이 : XXXX
 				삼각형 넓이 : XXXX.X
 				
 		참고 ]
 			자바에서 * 기호의 의미
 				1. 연산자로서 곱하기의 의미
 				2. 모든것 을 의미
 				
 				
 */


import java.util.*;

public class Ex01 {
		public static void main(String[] args) {
		//입력도구 준비
			Scanner scanner = new Scanner(System.in);
		
//			
//			
//		// 입력 메세지 출력
			System.out.print("가로를 입력하세요 : ");
//			
//		/* 문자열로 입력받아서 처리하는 방법 */
//			
			String garo = scanner.nextLine(); // 문자열로 입력받는 방법
//		// 정수형태의 문자열을 정수로 변환하는 방법
//		// Integer.parseInt(문자열);
			int width = Integer.parseInt(garo);
		
			System.out.print("세로를 입력하세요 : ");
			String sero = scanner.nextLine();
			
			int height = Integer.parseInt(sero);
			
//			
//		/* 정수로 입력받는 방법 
//		 * 	int  변수이름 = sc.nextInt();
//		 */
//			int width = scanner.nextInt();
//			
//			System.out.println("입력된 정수 가로 : " + width);
//			
//			//메세지 출력
//			System.out.print("세로 : ");
//			int sero = scanner.nextInt();
//			
//			System.out.println("입력된 세로 : " + sero);
//	
													
		// 출력
			System.out.println("입력된 가로 : " + width);
			System.out.println("입력된 세로 : " + height);
			
			System.out.println("사각형의 넓이 : " + width * height);
			System.out.println("삼각형의 넓이 : " + width * height / 2.);
		
		}
}