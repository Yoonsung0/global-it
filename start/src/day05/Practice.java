package day05;

public class Practice {
	public static void main(String[] args) {

		int i = 0, j = 1;




		while(i<=10) {

			while(j<=i) {

				System.out.print("*");
				j++;
			}


			j = 1;
			System.out.println();
			i++;
		}


	}
}
