import java.util.Scanner;

public class SumofEvenandOdd {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				int n=scan.nextInt();
				int evensum=0;
				 int oddsum=0;
				for(int i=2;i<=n;i=i+2) {
					evensum=evensum+i;
				}
				System.out.println(evensum);
	      
	       for(int i=1;i<=n;i=i+2) {
	    	   oddsum=oddsum+i;
	    	   

		}
	       System.out.println(oddsum);

	}

}
