package day03;
/*
 * 	문자열 데이터의 비교는 
 * 			equals() 사용해서 비교해야 한다.
 * 
 * 			형식 ]
 * 
 * 				 	문자열.equals(비교할 문자열)
 */




public class Test03 {
	public static void main(String[] args) {
		
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		//비교연산자로 비교
		boolean bool1 = name1 == name2;
		
		//equals()로 비교
		boolean bool2 = name1.equals(name2);
		
		System.out.println("name1 == name2 : " + bool1);
		System.out.println("name1.equals(name2) : " + bool2);
		
		
		
		
		
		
		
	}
}
