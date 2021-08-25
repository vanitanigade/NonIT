package pattern.rightAscending;

public class NestedWhile_Print123 {

	public static void main(String[] args) {

		int rows=3;
		int i=1;

		while (i<=rows) {
			int j=1;
			while(j<=i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
