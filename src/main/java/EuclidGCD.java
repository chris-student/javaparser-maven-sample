import java.util.Scanner;

/**
 * @author Chris Brown
 * @version v0.01
 * @since 11/11/2017
 */
public class EuclidGCD {
    public static void main(String[] args) {
        System.out.println("This program finds the greatest common divisor (GCD) of 2 numbers.");
        System.out.print("Please enter the first (largest) number: ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print("Please enter the second (smaller) number: ");
        int y = input.nextInt();

//        int gcd = euclid(x, y);
        int gcd = recursive(x, y);

        System.out.println("The GCD of " + x + " and " + y + " is: " + gcd);
    }

    private static int iterative(int x, int y){
        while( y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    private static int recursive(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return recursive(y, x % y);
        }
    }
}