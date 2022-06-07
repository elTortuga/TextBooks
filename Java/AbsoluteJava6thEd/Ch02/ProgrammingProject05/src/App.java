import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        float percentage = Float.parseFloat(keyboardInput.nextLine());
        float gpa = percentage * 4 / 100;
        System.out.printf("The gpa is %.0f", gpa);
    }
}