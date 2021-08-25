package pattern.rightAscending;

public class NestedForLoop_123 {

	public static void main(String[] args) {
		
		int rows=3, number=1;
		
		for(int i=1; i<=rows; i++) {	//rows//i<=3
			for(int j=1; j<=i; j++) {	//columns//j<=3	after condition it will print j then j++ till condition gets fulfilled i.e j<=3 then it will go to outer loop
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=rows; i++) {	
			for(int j=1; j<=i; j++) {	
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=rows; i++) {	
			for(int j=1; j<=i; j++) {	
				System.out.print(number+" ");		//use int number
				number = number+1;
			}
			System.out.println();
		}

		
		
		for(int i=1; i<=rows; i++) {	
			for(int j=1; j<=rows; j++) {	
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
}
