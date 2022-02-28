package day05.ex;

import java.util.Scanner;

/*
 * 	문제 6 ]
 * 
 * 		랜덤하게 정수를 컴퓨터가 만들어 내면
 * 		그 수를 알아맞추는 게임을 만드세요.
 * 
 * 		예 ]
 * 			발생숫자 : 54
 * 
 * 			사용자입력숫자 : 45
 * 
 * 			==> " 입력한 수가 더 작습니다."
 * 			로 메세지를 출력해서 사용자가 숫자를 알아맞추는 게임
 * 
 * 			횟수도 같이 출력되게 하세요.
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		

		int com = (int)(Math.random()*99 + 1);

		for(;;) {
			
			System.out.print("숫자를 입력하세요 : ");
			
			int user = sc.nextInt();
			
			if (user > com) System.out.println("입력한 숫자가 더 큽니다.");
			
			else if (user < com) System.out.println("입력한 숫자가 더 작습니다.");
			
			else {System.out.println("정답입니다 " + user);
				break;
			}
		}



	}

}
