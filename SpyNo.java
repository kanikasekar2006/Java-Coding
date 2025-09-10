import java.util.Scanner;
public class SpyNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int temp=n;
		int pro=1;
		while(temp>0) {
			int digit=temp%10;
			sum=sum+digit;
			pro=pro*digit;
			temp=temp/10;
		}
		System.out.println(sum);
		System.out.println(pro);
		
		
		
		if(sum==pro) {
			System.out.print("Spy Number");
		}
		else {
			System.out.print("Not an Spy Number");
		}
	
	}

}
