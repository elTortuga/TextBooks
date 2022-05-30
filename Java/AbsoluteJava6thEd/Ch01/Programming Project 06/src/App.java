public class App {
    public static void main(String[] args) throws Exception {
        int princi_amnt = 1000;
        double int_rate = 5.0;
        int no_of_yrs = 5;
        System.out.println(
            "Simple Interest: " +
            (princi_amnt*int_rate*no_of_yrs / 100)
        );
    }
}
