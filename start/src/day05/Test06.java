package day05;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Test06 {

	public static void main(String[] args) {


		for(int i = 0; ; i++) {

			int no = i + 1;

			if(no > 50) 
				break;

			System.out.print(no + ", ");
		}

		System.out.println();
		int no1 = 1;


		while(true) {
			if(no1>50) break;

			System.out.print(no1 + ", ");


			no1++;

		}

		// do while은 실행문을 무조건 1번은 실행시킨다.
		int no2 = 10;

		do {

			System.out.print("no : " + no2);
			no2++;

		} while(no2 < 10);
		
		System.out.println();

		int dan = 5;

		for(int i = 0; i < 9 ; i++){
			int gop = (i+1);

			if(gop==6)
				continue;


			System.out.println(dan + " x " + gop + " = " + (dan*gop));

		}

	}
}







