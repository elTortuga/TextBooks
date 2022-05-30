import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter dividend:");
        int dividend = keyboard.nextInt();
        System.out.println("Enter divisor:");
        int divisor = keyboard.nextInt();
        int quotient = dividend/divisor;
        int remainder = dividend%divisor;
        System.out.println(
            "\nDividend: " + dividend +
            "\nDivisor: " + divisor +
            "\nQuotient: " + quotient +
            "\nRemainder: " + remainder
        );
    }
}
