import java.util.Scanner;
public class GCD {
	public static int findGCD(int a,int b) {
		while(b!=0) {
			int remainder=a%b;
			a=b;
			b=remainder;
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int GCD= findGCD(num1,num2);
		System.out.print("GCD of " + num1 + " and " + num2 + " is= " + GCD );
		

	}

}
