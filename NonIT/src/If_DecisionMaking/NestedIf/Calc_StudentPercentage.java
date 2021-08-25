package If_DecisionMaking.NestedIf;

import java.util.Scanner;

public class Calc_StudentPercentage {

	public static void main(String[] args) {

		int eng, sci, maths, total;
		float percentage;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of english subject");
		eng = sc.nextInt();
		System.out.println("enter the marks of Science subject");
		sci = sc.nextInt();
		System.out.println("enter the marks of Maths subject");
		maths = sc.nextInt();
		
		total = eng + sci + maths;
		System.out.println("total marks scored "+ total);
		percentage=total/3;
		System.out.println("percentage obtained by student "+ percentage);
		
		if(eng>=40 && sci>=40 && maths>=40) {
			if (percentage>=70)
				System.out.println("distinction");
			else if(percentage>=60)
				System.out.println("first class");
			else if(percentage>=50)
				System.out.println("second class");
			else 
				System.out.println("pass class");
		}else 
			System.out.println("student has failed");
		
	}

}
