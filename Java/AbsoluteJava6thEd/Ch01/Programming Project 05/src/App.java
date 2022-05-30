public class App {
    public static void main(String[] args) throws Exception {
        String text = "I hate you.";
        System.out.println("The line of text to be changed is:\n" + text);
        int index = text.indexOf("hate", 0);
        System.out.println("I have rephrased that line to read:\n"+text.substring(0, index) + "love" + text.substring(index+4));
    }
}