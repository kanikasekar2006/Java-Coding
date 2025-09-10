import java.util.Scanner;
public class CollatzSequence {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt(); 
	        while(n!=1) {
	        	System.out.print(n+",");
	        	if(n%2==0) {
	        		n=n/2;
	        	}
	        	else {
	        		n=3*n+1;
	        	}
	        }
        System.out.print(1);
	}

}
