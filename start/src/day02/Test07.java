package day02;

public class Test07 {
		public static void main(String[] args) {
		/* 타입이 다른 두 데이터의 연산의 결과는 항상 큰타입 쪽을 따른다.
		 * 
		 * 
		 * 	
		 */
			
			
			
		double no = 3.14 + 10;
		
		// 'a'의 다섯번째 이후 문자를 출력하세요
		char ch = 'a';
		
		int num = ch + 5;
			
		System.out.println(num);	
		// 문자로 변환
		
		char ch1 = (char)num;
		
		int ch2 = num;
		System.out.println(ch1);
		System.out.println(ch2);
		
		}
}	
