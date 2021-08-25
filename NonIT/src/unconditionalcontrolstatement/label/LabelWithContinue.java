package unconditionalcontrolstatement.label;

public class LabelWithContinue {

	public static void main(String[] args) {

		outer:
			for(int i=1; i<10; i++) {
				for(int j=0; j<10; j++) {
					
					if(j==1)
						continue outer;	//only inner loop will execute 10 times till j==2 as j==3 will skip and bcoz of label it will break after j==2
					System.out.println("value of j = "+ j);
				}
			}
	}

}
