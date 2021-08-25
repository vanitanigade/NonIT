package If_DecisionMaking.Ladder;

import java.util.Scanner;

public class LargestNumber_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		System.out.println("enter the number");
		int b = scanner.nextInt();
		System.out.println("enter the number");
		int c = scanner.nextInt();
		
		if(a>=b && a>=c)
			System.out.println("a is largest number");
		else if(b>=a && b>=c)
			System.out.println("b is largest number");
		else
			System.out.println("c is largest number");
	}

}
