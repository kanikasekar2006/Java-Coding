import java.util.Scanner;
public class CenterDigitofNo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
	    int length=a.length();
	    if(length%2==1) {
	    	int middleindex=length/2;
	    	char centerDigit=a.charAt(middleindex);
            System.out.println(centerDigit);

	    }
	    else {
	    	System.out.println(-1);
	    }
		
	}

}
