import java.util.Scanner;
public class Primeno {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<=1) {
			System.out.println("Not a prime");
			return;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("Not a prime");
				return;
			}
		}
		
			System.out.println("prime");
		
	}

}
