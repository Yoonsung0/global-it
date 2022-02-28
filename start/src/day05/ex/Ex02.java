package day05.ex;
/*
 *  문제 2 ]
 *  	'A' 부터 문자를 10개를 만들어서 출력하세요.
 * 
 */
public class Ex02 {

	public static void main(String[] args) {

		char ch = 'A';
		
		
		for (int i = 0; i < 10; i++) {
			
			if(i != 9) System.out.print(ch++ + ", ");
			
			else System.out.print(ch);
		}
		
		
	}

}
