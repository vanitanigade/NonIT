package pattern.Square;

import java.util.Scanner;

public class PrintEvenOddLines {

	public static void main(String[] args) {

		int i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		

		for(i=1; i<=num; i++) {			// no. of rows
			for(j=1; j<=5; j++) {		// no. of columns

				if(i%2 == 1)				// Print 1 if current row is odd. //diff eg if(i%2 == 0), //if(i%2 !== 1)
					System.out.print("# ");	//Odd lines
				else 
					System.out.print("@ ");	//even lines
			}
			System.out.println();

		}
	}

}
