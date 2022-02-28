package day05.ex;

import java.util.Scanner;

/*
 * 
 * 	문제 5 ]
 * 		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
 * 
 * 		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
 * 		가위, 바위, 보로 가정하고
 * 		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
 * 
 * 
 * 		누가 이겼는지를 확인하는 프로그램을 작성하세요.
 * 
 * 
 * 
 * 
 */
public class Ex05 {

	public static void main(String[] args) {

		int userNum = 0;

		String com = "";
		Scanner sc = new Scanner(System.in);


		for(;;) {


			System.out.print("가위, 바위, 보 중에 선택하세요 :");

			String user = sc.nextLine();



			if (user.equals("가위")) userNum = 1;
			else if(user.equals("바위")) userNum = 2;
			else if(user.equals("보")) userNum = 3;



			int comNum = (int)(Math.random()*3 + 1);




			if(userNum == comNum) {
				if (userNum == 1) user = "가위";
				else if (userNum == 2) user = "바위";
				else if (userNum == 3) user = "보";


				System.out.println("모두 " + user + "를 내서 비겼습니다");
			}
			else if(userNum - comNum == -1 || userNum - comNum ==2) {
				if (userNum == 1) user = "가위";
				else if (userNum == 2) user = "바위";
				else if (userNum == 3) user = "보";

				if (comNum == 1) com = "가위";
				else if (comNum == 2) com = "바위";
				else if (comNum == 3) com = "보";

				System.out.println("당신은 " + user + "를 냈고 컴퓨터는 " + com + "을 내서 당신이 졌습니다.");
			}
			else if(userNum - comNum == -2 || userNum - comNum ==1) {
				if (userNum == 1) user = "가위";
				else if (userNum == 2) user = "바위";
				else if (userNum == 3) user = "보";

				if (comNum == 1) com = "가위";
				else if (comNum == 2) com = "바위";
				else if (comNum == 3) com = "보";

				System.out.println("당신은 " + user + "를 냈고 컴퓨터는 " + com + "을 내서 당신이 이겼습니다.");


			}
		}

	}

}
