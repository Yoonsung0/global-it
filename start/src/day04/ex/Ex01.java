package day04.ex;
	
/*
 	문제 1 ]
 		숫자 3개를 랜덤하게 발생시켜서
 		그 수들중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 		( 1 ~25 )
 		
 		단, 3항 연산자를 사용해서 처리하세요.
 
 	보너스문제 ]
 	
 		-100 ~ 100 사이의 정수를 랜덤하게 발생시켜보세요.
 		(int)(Math.random()*201 + 1);
 
 */

public class Ex01 {
	public static void main(String[] args) {

		
		int num1 = (int)(Math.random()*25 +1), num2 = (int)(Math.random()*25 +1), num3 = (int)(Math.random()*25 +1);
		
		
		
		int biggestNum = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num3 ? num2 : num3);
		
		
		System.out.println("숫자들 : " + num1 +" , " + num2 + " , " + num3);
		
		System.out.println("가장 큰 수는 : " + biggestNum);
		
		System.out.println("\"입력한 세 정수 " + num1 + ", " + num2 + ", " +num3 + " 중 제일 큰 수는 " + biggestNum + "입니다\"");
		
		
	}
	

}
