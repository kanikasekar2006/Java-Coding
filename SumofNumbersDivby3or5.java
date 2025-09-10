import java.util.Scanner;
public class SumofNumbersDivby3or5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			if(i%3==0||i%5==0) {
				sum=sum+i;
			}
		}
		System.out.print(sum);

	}

}
