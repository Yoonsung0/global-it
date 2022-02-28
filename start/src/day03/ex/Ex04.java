package day03.ex;

/*
 * 	1년은 365.2426 일이다.
 * 
 *	이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력하세요.
 *	
 *	힌트 ]
 *		365.2426일은 단위가 일 단위이다.
 *		하루는 24시간이다.
 *		따라서 0.5일은 12시간을 의미한다.
 * 
 */



public class Ex04 {
	public static void main(String[] args) {
		
		double year = 365.2426;
		
		int day;
		int hour;
		int minute;
		int second;
		
		day = (int)year;
		year %= day;
		
		hour = (int)(year*24);
		year *= 24;
		year %= hour;
		
		minute = (int)(year*60);
		year *= 60;
		year %= minute;
		
		second = (int)(year*60);
		
		
		
		
		
		System.out.printf("1년은%n일: " + day + "%n");
		System.out.println("시간 :" + hour);
		System.out.println("분 :" + minute);
		System.out.println("초 :" + second);
		
		
		double year2 = day + second/(60*60*24.) + minute/(60*24.) + hour/(24.);
		System.out.println("1년은 : " + year2);
		
		
	}
}
