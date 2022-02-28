package day05;

import java.util.Scanner;

/*
 * switch문으로
 * 
 */






public class Test03 {

	public static void main(String[] args) {

		// 입력도구
		Scanner scanner = new Scanner(System.in);
		
		
		
		// 메세지 출력
		System.out.print("나이를 입력하세요 :");
		
		
		
		// 입력받아서 변수에 기억
		
		String tmp = scanner.nextLine();
		
		int age = Integer.parseInt(tmp);
		
		String sage = "장년층";
		
		
		// 판별해서 결과값 변수에 기억
		
		switch (age / 10 ) {
		case 0:
			sage = "유년기";
			break;
		case 1:
			sage = "10대";
			break;
		case 2:
			sage = "20대";
			break;
		case 3:
			sage = "30대";
			break;
		case 4:
			sage = "40대";
			break;
			
			default:
				
		}
		
		
		
		// 출력
		
		
		System.out.println("입력한 나이는 " + age + "이고 " + sage + "입니다.");
		
	}

}
