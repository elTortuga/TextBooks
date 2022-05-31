public class App {
    public static void main(String[] args) throws Exception {
        final float DISTANCE = 55;
        final float SPEED = 15;

        System.out.printf("It will take %.2f units of time to travel %.2f " +
        "units of distance at a rate of %.2f%n", DISTANCE/SPEED, DISTANCE, SPEED);
    }
}
