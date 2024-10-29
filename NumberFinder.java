import java.util.regex.*;

    public class NumberFinder {
        public static void main(String[] args) {
            String text = "The price of the product is $19.99 and $2000.00 fine for rubbing no + $50.00";
            Pattern pattern = Pattern.compile("\\d+\\.\\d+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }


