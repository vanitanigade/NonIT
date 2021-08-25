package pattern.rightAscending;

import java.util.Scanner;

public class PrintVerticalAlphabets_j {

	public static void main(String[] args) {

		int alphabet = 65; //ASCII value of alphabet 'A'

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rows = sc.nextInt();

		for(int i=0; i<=rows; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(alphabet+j)+" ");	//65+0=65 ->A  //65+1=66 ->B
			}
			System.out.println();
		}


	}

}
