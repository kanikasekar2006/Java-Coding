import java.util.Scanner;
public class CustomerGrouping {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		int gender=scan.nextInt();
		switch(gender) {
		  
		case 1: 
			if(age<25) {
				System.out.println("Group 1");
			}
			else if(age>=25&&age<=45) {
				System.out.print("Group 3");
			}
			else if(age>45){
				System.out.print("Group 5");
			} 
			break;
		
	case 2: 
		if(age<25) {
			System.out.println("Group 2");
		}
		else if(age>=25&&age<=45) {
			System.out.print("Group 4");
		}
		else if(age>45){
			System.out.print("Group 5");
		} 
		break;
	
		default:System.out.println("Invalid");
		}
			
		

	}

}
