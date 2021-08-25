package unconditionalcontrolstatement.label;

public class LabelWithBreak {

	public static void main(String[] args) {

		outer:
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {

					if(j==3)
						break outer;	//only inner loop will execute 1 times till j==2 as at j==3 it will break and bcoz of label it will break after j==2
					System.out.println("value of j = "+ j);
				}

			}
	}
}
