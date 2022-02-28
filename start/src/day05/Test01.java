package day05;

/*
 *  정수를 입력받아서
 * 
 */

import java.util.*;

public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("정수 입력 : ");
		
		String st = sc.nextLine();

		int num = Integer.parseInt(st);

		String tmp = "홀수";



		if (num ==0)
			tmp = "0";
		else if (num % 2 ==0)
			tmp = "짝수";

		System.out.println("입력하신 숫자는 " + num + "(" + tmp +")" + "입니다.");


	}
}
