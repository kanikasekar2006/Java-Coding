import java.util.Scanner;
public class digitsfromRtoL {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		while(n>0) {
			int digits=n%10;
		     System.out.print(digits+" ");
		     n=n/10;
		}

	}

}
