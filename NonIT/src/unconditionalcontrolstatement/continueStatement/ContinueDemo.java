package unconditionalcontrolstatement.continueStatement;

public class ContinueDemo {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {

			if(i==2)			
				continue;					//if the number is 2 skip and continue
			System.out.print(i + " ");
		}
	}

}
