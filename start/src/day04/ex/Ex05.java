package day04.ex;

import java.util.Scanner;

import javax.swing.*;
/*
 * 	3자리 숫자를 입력받아서
 * 이 숫자에 가장 가까운 100의 배수를 만들기 위해서는 얼마가 필요한지
 * 
 * 	예 ]
 * 		241 은 200에 가까우므로 41을 빼야한다.
 * 		777 은 800에 가까우므로 23을 더해야 한다.
 * 	
 * 
 * 
 */
public class Ex05 {
	public static void main(String[] args) {
		
		String sno = JOptionPane.showInputDialog("세자리 정수 입력 : ");
		
		int num = Integer.parseInt(sno);
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 : ");
//		
//		String num1 = sc.nextLine();
//		
//		int num = Integer.parseInt(num1);
//		
		int dif = num % 100;
		
		
		
		
		
		
		num = ( 0 <= dif  &&  dif <= 50 ) ? num - dif : num + (100 - dif);
		
		
		System.out.println("수정된 숫자 : " + num);
 		
		
		
		
	}
}
