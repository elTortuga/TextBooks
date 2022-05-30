public class App {
    public static void main(String[] args) throws Exception {
        final double TEN_GRAMS = 10;
        final double OUNCE_TO_GRAM_CONVERSION = 28.34952;
        double caffineInCola = .034;
        double ouncesOfCola = 12;
        double caffineInCoffe = .160;
        double ouncesOfCoffe = 16;
        System.out.println(TEN_GRAMS/.035+ " twelve ounce colas will kill you due to caffine");
        System.out.println(TEN_GRAMS/caffineInCoffe+ " 16 ounce coffees will kill you due to caffine");
    }
}

// not accurate - https://www.vice.com/en/article/exmwka/how-much-caffeine-will-kill-you-127

/*OUTPUT:
285.71428571428567 twelve ounce colas will kill you due to caffine.
62.5 16 ounce coffees will kill you due to caffine.
*/