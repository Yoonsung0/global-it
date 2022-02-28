package day04;

/*
 	정수 하나를 입력받아서 이 수가 홀수인지 짝수인지 판별하세요.


 */

import java.util.*;

public class Test01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");


		String num = scanner.nextLine();

		String result = "입력하신 숫자는 홀수입니다.";
		
		
		
		int num1 = Integer.parseInt(num);

		if (num1 == 0) {
			result = "입력하신 숫자는 0입니다.";
		}
		else if(num1 % 2 == 0) {
			result = "입력하신 숫자는 짝수입니다.";
		}
		
		System.out.println(result);

	}
}
