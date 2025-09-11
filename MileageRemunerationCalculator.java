import java.util.Scanner;
import java.text.DecimalFormat;
public class MileageRemunerationCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double bo=scan.nextDouble();
		double eo=scan.nextDouble();
		double Milestraveled=eo-bo;
		double Remuneration=Milestraveled*25;
		
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println(df.format(Milestraveled )+ " "  + df.format (Remuneration));
		
	}

}
