import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n<0) {
			System.out.println("Error! Factorial of a negative number doesn't exist.");
		}
		else {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			System.out.println(fact);
		}

	}

}
