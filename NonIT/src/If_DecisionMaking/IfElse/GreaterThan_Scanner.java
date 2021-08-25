package If_DecisionMaking.IfElse;

import java.util.Scanner;

public class GreaterThan_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int a = scanner.nextInt();
		System.out.println("enter the number");
		int b = scanner.nextInt();
		
		if(a>b)
			System.out.println("a is greater than b");
		else 
			System.out.println("a is smaller than b");
		
		if(a%b==0)
			System.out.println("a is greater than b");
		else
			System.out.println("a is smaller than b");
	}

}
