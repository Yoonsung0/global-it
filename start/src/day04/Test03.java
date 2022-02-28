package day04;


import java.util.*;

public class Test03 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	String tmp = sc.nextLine();
	
	int num = Integer.parseInt(tmp);
	
	String state;
	
	
	state = (num == 0) ? "0" : ( (num % 2 == 0) ? "짝수" : "홀수") ;
	
	System.out.println("입력한 숫자는 " + state + " 입니다.");
	
	}
}
