import java.util.Scanner;
public class SumofEvenNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=2;i<=n;i=i+2) {
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
