import java.util.Scanner;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        // Step 1: Find the max of 4
        int max1 = Math.max(Math.max(a, b), Math.max(c, d));

        // Step 2: Remove max1
        int a1 = a, b1 = b, c1 = c, d1 = d;
        if (max1 == a1) a1 = Integer.MIN_VALUE;
        else if (max1 == b1) b1 = Integer.MIN_VALUE;
        else if (max1 == c1) c1 = Integer.MIN_VALUE;
        else d1 = Integer.MIN_VALUE;

        // Step 3: Second max
        int max2 = Math.max(Math.max(a1, b1), Math.max(c1, d1));

        if (max2 == a1) a1 = Integer.MIN_VALUE;
        else if (max2 == b1) b1 = Integer.MIN_VALUE;
        else if (max2 == c1) c1 = Integer.MIN_VALUE;
        else d1 = Integer.MIN_VALUE;

        // Step 4: Third max
        int max3 = Math.max(Math.max(a1, b1), Math.max(c1, d1));

        if (max3 == a1) a1 = Integer.MIN_VALUE;
        else if (max3 == b1) b1 = Integer.MIN_VALUE;
        else if (max3 == c1) c1 = Integer.MIN_VALUE;
        else d1 = Integer.MIN_VALUE;

        // Step 5: Fourth number is the last one remaining
        int max4 = Math.max(Math.max(a1, b1), Math.max(c1, d1));

        System.out.println(max1 + " " + max2 + " " + max3 + " " + max4);

        scan.close();
    }
}
