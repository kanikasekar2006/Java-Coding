import java.util.Scanner;
public class PalindromeNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int num=0;
		while(n>0) {
			int digit=n%10;
			num=num*10+digit;
			n=n/10;
		}
		System.out.print(num);

		System.out.println();
		if(temp==num) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
