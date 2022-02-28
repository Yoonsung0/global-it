package day04.ex;

/*
 * 
 * 	문제 3 ]
 * 
 * 		게시물을 게시판에 출력하는데
 * 		하나의 페이지에 게시물을 15개를 출력할 예정이다.
 * 
 * 		게시물 수를 랜덤하게 발생시켜서
 * 		게시판의 페이지가 몇페이지가 필요한지를 계산해서
 * 		출력해주는 프로그램을 작성하세요.
 * 
 * 		참고 ]
 * 			게시물이 없는 경우는 게시물이 없는 페이지가 1페이지 필요
 * 
 * 
 * 
 * 
 * 
 */



public class EX03 {
	public static void main(String[] args) {
		
	int tmp = (int)(Math.random()*100);
	
	int page = tmp == 0 ? 1 : (tmp /15) +1;

	
	System.out.println("게시물 수 : " + tmp);
	System.out.println("필요한 페이지 수는 " + page + "페이지 입니다.");
		
		
	}
}
