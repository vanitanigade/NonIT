package If_DecisionMaking.Ladder;

import java.util.Scanner;

public class PositiveNegNo_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		
		if(n>0)
			System.out.println("n is positive number");
		else if(n<0)
			System.out.println("n is negative number");
		else
			System.out.println("n is 0");
	}

}
