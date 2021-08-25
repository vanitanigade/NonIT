package If_DecisionMaking.IfElse;

import java.util.Scanner;

public class EvenOdd_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scanner.nextInt();
		
		if(n%2==0)
			System.out.println("n is even number");
		else
			System.out.println("n is odd number");

	}

}
