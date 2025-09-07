import java.util.Scanner;
public class AmstrongNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int original=n;
		int result=0;
		
		int digits=0;
		int temp=n;
		while(temp>0) {
			digits++;
			temp=temp/10;		}
		
	
	   temp=n;
	   while(temp>0) {
		  int digit=temp%10;
		  result = result + (int)Math.pow(digit, digits);
		   temp=temp/10;
		   
	   }
	   if(result==original) {
		   System.out.println("Amstrong Number");
	   }
	   else {
		   System.out.println("Not an Amstrong Number");
	   }
	   
	}
}
