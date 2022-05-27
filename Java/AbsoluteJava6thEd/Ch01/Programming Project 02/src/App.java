public class App {
    public static void main(String[] args) throws Exception {
        int wonCoupons = 25;
        int costOfCandyBar = 10;
        int costOfGumBall = 3;
        System.out.println("Number of Candy Bars: " + wonCoupons/costOfCandyBar);
        System.out.println("Number of Gum Balls: " + (wonCoupons%costOfCandyBar) / costOfGumBall);
    }
}
