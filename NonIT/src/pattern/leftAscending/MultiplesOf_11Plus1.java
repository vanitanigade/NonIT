package pattern.leftAscending;

public class MultiplesOf_11Plus1 {

	public static void main(String[] args) {
		
		for(int i=11; i<=11111; i=i*10+1) {				//check this same code in left ascending with minor change
			System.out.printf("%9d",i*i);
			System.out.println();
		}
		
	

	}

}
