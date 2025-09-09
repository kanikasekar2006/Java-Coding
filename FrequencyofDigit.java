import java.util.Scanner;
public class FrequencyofDigit {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        // ✅ Read as String to keep all digits, including 0s
        System.out.print("Enter a number: ");
        String number = scan.nextLine();

        int[] count = new int[10]; // To store count of digits 0 to 9

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);

            // ✅ Check if it's a digit (to avoid crashing on non-digit input)
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                count[digit]++;
            }
        }

        // Print only the digits that appeared
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.println(i + "→" + count[i]);
            }
        }
	}

}
