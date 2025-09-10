/*import java.util.Scanner;
public class CharacterType {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if(ch>='a'&& ch<='z'||ch>='A'&& ch<='Z') {
			System.out.print("Alphabet");
		}
		else if(ch>='0'&&ch<='9') {
			System.out.print("Digit");
		}
		else {
			System.out.print("Special");
		}

	}

}*/

import java.util.Scanner;

public class CharacterType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read a single character
        char ch = scan.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }
    }
}

