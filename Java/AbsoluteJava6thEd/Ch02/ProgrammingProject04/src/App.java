public class App {
    public static void main(String[] args) throws Exception {
        float distance = 55;
        float mph = 15;

        float time = distance/mph;
        System.out.printf("It takes John %.3f hours to travel %.0f miles at an average speed of %.0f mph.", time, distance, mph);
    }
}
