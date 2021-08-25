package If_DecisionMaking.IfElse;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = scanner.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			System.out.println("character is a vowel");
		else 
			System.out.println("character is a consonant");
	}

}
