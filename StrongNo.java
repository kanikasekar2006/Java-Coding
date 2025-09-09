import java.util.Scanner;
public class StrongNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			int fact=1;
			int i=1;
			while(i<=digit) {
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			num=num/10;
			
		}
		
		if(sum==temp) {
			System.out.print("Strong No");
			
		}
		else {
			System.out.print("Not a Strong No");
		}

	}

}
