import java.util.Scanner;
public class Days {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int totaldays=scan.nextInt();
		int year=totaldays / 365;
		int remainingdays=totaldays % 365;
		int months=remainingdays/30;
		int days=remainingdays % 30;
		 System.out.println("Years: " + year);
	     System.out.println("Months: " + months);
	     System.out.println("Days: " + days);
	}

}
