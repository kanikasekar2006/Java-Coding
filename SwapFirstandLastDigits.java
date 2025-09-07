import java.util.Scanner;
public class SwapFirstandLastDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int LastDigit=n%10;
		 int FirstDigit=0;
		 int temp=n;
		 int digit=0;
		 while(temp>0) {
			 FirstDigit=temp;
			 temp=temp/10;
			 digit++;
		 }
		 int Middlepart=(n%(int)Math.pow(10,digit-1))/10;
		 int Swap=LastDigit*(int)Math.pow(10, digit-1)+Middlepart*10+FirstDigit;
		 System.out.println(Swap);
	}

}
