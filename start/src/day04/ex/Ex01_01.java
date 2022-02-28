package day04.ex;

public class Ex01_01 {

	public static void main(String[] args) {



		int num1 = (int)(Math.random() * 41 -20), num2 = (int)(Math.random() * 41 -20), num3 = (int)(Math.random() * 41 -20);

		int max = num1 >= num2 ? num1 >= num3 ? num1 : num3 : num2 >= num3 ? num2 : num3;

		int min = num1 >= num2 ? num2 >= num3 ? num3 : num2 : num1 >= num3 ? num3 : num1;

		int middle = num1 == max || num1 == min ? num2 == max || num2 == min ? num3 : num2: num1;

		
		System.out.println("순서대로 : " + max + ", " + middle + ", " + min + "입니다.");
		
	}

}
