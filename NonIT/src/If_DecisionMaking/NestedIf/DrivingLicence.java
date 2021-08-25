package If_DecisionMaking.NestedIf;

import java.util.Scanner;

public class DrivingLicence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age of person");
		int age = sc.nextInt();
		
		if(age!=0) 
			
			if(age>=18)
				System.out.println("eligible for driving licence");
			else
				System.out.println("not eligible for driving licence");
		else
			System.out.println("invalid age");
			
		
	}

}
