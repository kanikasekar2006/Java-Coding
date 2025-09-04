import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sqrt=(int) Math.sqrt(n);
		if(sqrt*sqrt==n) {
			System.out.println("Perfect Square");
		}
		else {
			System.out.println("Not a Perfect Square");
		}

	}

}
