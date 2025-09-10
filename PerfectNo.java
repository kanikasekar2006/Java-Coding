import java.util.Scanner;
public class PerfectNo {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	 int sum=0;
	 int i=1;
	 while(i<n) {
		 if(n%i==0) {
			 sum=sum+i;
			 
		 }
		 i++;
		 
	 }
	 if(sum==n) {
		 System.out.println("Perfect Number");
	 }
	 else {
		 System.out.println("Not Perfect Number");
	 }

	}

}
