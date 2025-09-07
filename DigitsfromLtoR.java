import java.util.*;
public class DigitsfromLtoR {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=n;
		int div=1;
		while(temp>10) {
			temp=temp/10;
			div=div*10;
		}
		while(div>0) {
			int digit=n/div;
			System.out.print(digit+" ");
			n=n%div;
			div=div/10;
		}
		
	}

}
