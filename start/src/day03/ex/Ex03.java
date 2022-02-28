package day03.ex;

/*
 * 84232원을 지불할려고 한다.
	우리나라 화폐단위로 이금액을 지불하려면 
	각 단위가 몇개씩 필요한지 계산해서 출력하세요.
	
	화폐단위
		50000권
		10000권
		5000권
		1000권
		500권
		100
		50
		10
		1
 */



public class Ex03 {
	public static void main(String[] arg) {
		
		int money = 84232;
		
		int change50000 ;
		int change10000;
		int change5000;
		int change1000;
		int change500;
		int change100;
		int change50;
		int change10;
		int change1;
		
		change50000 = money/50000;
		money %=  50000;
		
		change10000 = money/10000;
		money %=  10000;
		
		change5000 = money/5000;
		money %=  5000;
		
		change1000 = money/1000;
		money %=  1000;
		
		change500 = money/500;
		money %=  500;
		
		change100 = money/100;
		money %=  100;
		
		change50 = money/50;
		money %=  50;
		
		change10 = money/10;
		money %=  10;
		
		change1 = money/1;
		money %= change1;
		
		System.out.println("84232원은 50000원권 : " + change50000);
		System.out.println("10000원권 : " + change10000);
		System.out.println("5000원권 : " + change5000);
		System.out.println("1000원권 : " + change1000);
		System.out.println("500원권 : " + change500);
		System.out.println("100원권 : " + change100);
		System.out.println("50원권 : " + change50);
		System.out.println("10원권 : " + change10);
		System.out.println("1원권 : " + change1);
		
		
		
		
		
	}
}
