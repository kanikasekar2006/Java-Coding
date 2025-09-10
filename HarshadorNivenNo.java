import java.util.Scanner;
public class HarshadorNivenNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		int sum=0;
		int temp=n;
		while(n>0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
		if(temp%sum==0) {
			System.out.println("Harshad Number");
		}
		else {
			System.out.println("Not Harshad Number");
		}
	}

}
