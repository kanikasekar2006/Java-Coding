import java.util.Scanner;
public class ProductofDigits {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int pro=1;
	while(n>0) {
		int digits=n%10;
		pro=pro*digits;
		if(digits==0) {
			pro=0;
		}
		n=n/10;
	}
	System.out.print(pro);
	}

}
