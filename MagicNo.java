import java.util.Scanner; 
public class MagicNo {
	public static int Findnum(int n) {
		while(n>9) {
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum=sum+digit;
				n=n/10;
			}
			n=sum;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int FinialDigit=Findnum( num);
		if(FinialDigit==1) {
			System.out.println("Magic Number");
		}
		else {
			System.out.println("Not a Magic Number");
		}

	}

}
