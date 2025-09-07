import java.util.Scanner;
public class FirstandLastOcurrenceofDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		int n=scan.nextInt();
		int target=scan.nextInt();
		int rev=0;
		while(n>0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		
		int position=1;
		int first=-1;
		int last=-1;
		while(rev>0) {
			int digits=rev%10;
			if(digits==target) {
				if(first==-1) {
					first=position;
				}
				last=position;
			}
			rev=rev/10;
			position++;
		}
		System.out.println("First = " + first);
		System.out.println("Last = " + last);
	
	}

}
