package pattern.rightAscending;

public class MultiplesOf_11Add1 {

	public static void main(String[] args) {

		for(int i=11; i<=11111; i=i*10+1) {
			System.out.println(i);
		}
		
		System.out.println();		// divider  
		
		for(int i=11; i<=11111; i=i*10+1) {				//check this same code in left ascending with minor change
			System.out.println(i*i);
		}
		
		System.out.println();
	}

}
