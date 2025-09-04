import java.util.Scanner;
public class DivBy3and5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		if(a%3==0&&a%5==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
