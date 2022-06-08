import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter price of item\n(from 25 cents to a dollar, in 5-cent increments):");
        int price = keyboard.nextShort();
        int change = 100-price;
        int q = change / 25;
        int d = (change %25) / 10;
        int n = ((change %25) % 10) / 5;
        System.out.printf("You bout an item for %d cents and fave me a dollar so your change is%n%d quarters%n%d dimes, and%n%d nickles.",
            change,
            q,
            d,
            n
        );
    }
}
