package unconditionalcontrolstatement.breakstatement;

public class BreakDemo {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			
			if(i==5)						
				break;								//terminate the loop when i=5 so it will print till i=4
			System.out.println("i: "+i);
		}
		System.out.println("out of loop");
	}

}
