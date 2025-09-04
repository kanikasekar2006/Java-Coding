import java.util.Scanner;
public class RighttoLeft {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(num>0) {
			int digit=num%10;
			System.out.println(digit+" ");
			num=num/10;
		}

	}

}
