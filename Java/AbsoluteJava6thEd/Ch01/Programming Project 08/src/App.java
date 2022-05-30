public class App {
    public static void main(String[] args) throws Exception {
        final double TIME = 20.5;
        final double DISTANCE = 50;
        final double AVERAGE_SPEED = DISTANCE/TIME;
        System.out.println(
            "This programm calculates vehicles average speed " +
            "given a time and distane travled."
        );
        System.out.println(
            "Car average speed is " + AVERAGE_SPEED + " given a time and distane travled."
        );
    }
}
