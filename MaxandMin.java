import java.util.Scanner;
public class MaxandMin {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		int Max=(a>b)? a:b;
		int Min=(a<b)? a:b;
		
		System.out.println("Max= " + Max  + " Min = " + Min);

	}

}
