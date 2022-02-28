package day05.ex;

import java.util.Scanner;

/*
 * 	문제 4 ]
 * 		전기요금을 계산해주는 프로그램을 작성하세요.
 * 
 * 		전기요금표
 * 
 * 				코드		기본요금	사용요금
 * 		가정용		1		3800		245
 * 		산업용		2		2400		157
 * 		교육용		3		2900		169
 * 		상업용 		4		3200		174
 * 
 * 
 * 		전기요금은
 * 			기본요금 + 사용량 * 사용요금
 * 
 * 		사용자 코드와 사용량을 입력하면
 * 		전기요금을 계산해서 출력해주는 프로그램을 만드세요.	
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

		System.out.print("사용자 코드를 입력하세요 : ");

		String str = sc.nextLine();

		int code = Integer.parseInt(str);

		System.out.print("사용량을 입력하세요 : ");

		String str2 = sc.nextLine();

		int amount = Integer.parseInt(str2);

		int bill = 0;




		switch (code) {

		case 1 :
			bill = 3800 + 245 * amount;
			break;
		case 2 :
			bill = 2400 + 157 * amount;
			break;
		case 3 :
			bill = 2900 + 169 * amount;
			break;
		case 4 : 
			bill = 3200 + 174 * amount;

		}

		System.out.print("전기요금은 " + bill + "원 입니다.");





	}






}


