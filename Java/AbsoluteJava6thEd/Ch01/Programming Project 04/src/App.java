public class App {
    public static void main(String[] args) throws Exception {
        final double AMOUNT_OF_ARTIFICAL_SWEETENER_TO_KILL_MOUSE = .08; //https://www.doctorsbeyondmedicine.com/listing/aspartame-experiment
        final double MOUSE_WEIGHT = 30; //grams
        // final double STARTING_WEIGHT = 75000; // not necessary
        final double DESIRED_WEIGHT = 70000;
        final double FRACTION_OF_SWEETENER_TO_SODA = .001;

        System.out.println(
            "The amount of soda a day in grams is "+
            AMOUNT_OF_ARTIFICAL_SWEETENER_TO_KILL_MOUSE*DESIRED_WEIGHT /
            (MOUSE_WEIGHT*FRACTION_OF_SWEETENER_TO_SODA) +
            "\nthats about " + 
            (int)(AMOUNT_OF_ARTIFICAL_SWEETENER_TO_KILL_MOUSE*DESIRED_WEIGHT /
            (MOUSE_WEIGHT*FRACTION_OF_SWEETENER_TO_SODA)) / 1000 +
            " liters a day"
            );
    }
}
