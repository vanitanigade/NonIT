package If_DecisionMaking.Ladder;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=20, c=30;
		
		if(a>=b && a>=c)
			System.out.println(a+" is largest number");
		else if(b>=a && b>=c)
			System.out.println(b+" is larget number");
		else
			System.out.println(c+" is largest number");
	}

}
