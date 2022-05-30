public class App {
    public static void main(String[] args) throws Exception {
        int seconds = 50391;
        System.out.println(
            seconds + " is equal to " +
            seconds/3600 + " hours, " +
            (seconds%3600) / 60 + " minutes, and " +
            seconds % 60 + " seconds."
        );

    }
}
