import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        final double MOUSE_WEIGHT = 30; //grams
        final double FRACTION_OF_SWEETENER_TO_SODA = .001;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many grams of artifical sweetner does it take to kill a mouse?");
        double amountOfArtificalSweetenerToKillMouse = keyboard.nextDouble(); //https://www.doctorsbeyondmedicine.com/listing/aspartame-experiment
        System.out.println("What is your desired weight in Kilograms?");
        double desiredWeight = keyboard.nextDouble()*1000;
        System.out.printf(
            "The amount of soda a day in grams is %.0f.%nThat's about %.0f liters day.",
            amountOfArtificalSweetenerToKillMouse*desiredWeight /
            (MOUSE_WEIGHT*FRACTION_OF_SWEETENER_TO_SODA),
            (amountOfArtificalSweetenerToKillMouse*desiredWeight /
            (MOUSE_WEIGHT*FRACTION_OF_SWEETENER_TO_SODA)) / 1000
        );
    }
}
