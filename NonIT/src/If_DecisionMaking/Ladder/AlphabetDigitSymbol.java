package If_DecisionMaking.Ladder;

import java.util.Scanner;

public class AlphabetDigitSymbol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character/number/symbol");
		char ch = sc.next().charAt(0);

		if( (ch >='a' && ch<='z') || (ch >= 'A' && ch <='Z'))	
			System.out.println("alphabet");

		else if (ch >='0' && ch<='9')
			System.out.println("number");
		
		else 
			System.out.println("symbol");

	}

}
