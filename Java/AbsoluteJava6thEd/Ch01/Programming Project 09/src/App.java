public class App {
    public static void main(String[] args) throws Exception {
        final int FIVE_FEET_POUNDS = 110;
        int feet = 6;
        int inches = 3;
        int weight = FIVE_FEET_POUNDS + 60*(feet%5) + 5 * inches;
        System.out.println(feet + " feet " + inches + " inches, has an ideal body weight of " + weight);
    }
}

//OUTPUT: 6 feet 3 inches, has an ideal body weight of 185