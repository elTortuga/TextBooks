import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first name:");
        String first = keyboard.nextLine();
        System.out.println("Enter last name:");
        String last = keyboard.nextLine();

        first = first.substring(1,2).toUpperCase() +
                first.substring(2) +
                first.substring(0,1) +
                "ay";
        last = last.substring(1,2).toUpperCase() +
                last.substring(2) +
                last.substring(0,1) +
                "ay";

        System.out.println(first + " " + last);
        
        first = "michael";
        last = "simon";
        System.out.println("Enter first name:\n" + first + "\nEnter last name:\n"+ last );
        
        first = first.substring(1,2).toUpperCase() +
                first.substring(2) +
                first.substring(0,1) +
                "ay";
        last = last.substring(1,2).toUpperCase() +
                last.substring(2) +
                last.substring(0,1) +
                "ay";

        System.out.println(first + " " + last);
    }
}
