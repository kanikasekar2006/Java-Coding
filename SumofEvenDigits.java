import java.util.Scanner;
public class SumofEvenDigits {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   int n=scan.nextInt();
	   int sum=0;
	   while(n>0) {
		   int digits=n%10;
		   if(digits%2==0) {
			   sum=sum+digits;
		   }
		   n=n/10;
	   }
	   System.out.print(sum);
	}

}
