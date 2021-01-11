import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String shooting = caps("Why are you reading my diary mon?!");

        System.out.println(shooting);
    }

    private static String caps(String s) {
        return s.toUpperCase();
    }
}
