import java.util.Scanner;
public class SBICreditCardEligibility {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int primaryAge = scan.nextInt();
        int addonAge = scan.nextInt();
        int employmentType = scan.nextInt();
        double income = scan.nextDouble();

		
			
		boolean isEligible=true;
		if(primaryAge <21|| primaryAge>60) {
			isEligible=false;
		}
		if(addonAge<18) {
			isEligible=false;
		}
		if(employmentType>=5) {
			isEligible=false;
		}
		if(income>300000) {
			isEligible=false;
		}
		
		if(isEligible) {
			System.out.println("Yes. You are eligible for SBI credit cards");
		}
		else {
			System.out.println("No. You are not eligible for SBI credit cards");
		}
	}

}
