import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?<username>\\w+)@(?<domain>[a-z0-9]+\\.[a-z]{2,})");
        String emails = """
                jan@gmail.com
                blah blah
                marek@tlen.pl
                bleh bleh
                """;
        Matcher matcher = pattern.matcher(emails);
        while (matcher.find()) {
            System.out.println("Nazwa użytkownika: " + matcher.group("username"));
            System.out.println("Domena: " + matcher.group("domain"));
        }
    }
}
