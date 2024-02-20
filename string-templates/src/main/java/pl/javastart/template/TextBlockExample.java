package pl.javastart.template;

import static java.util.FormatProcessor.FMT;

class TextBlockExample {
    public static void main(String[] args) {
        String product = "Czekolada";
        double nettoPrice = 2.99;
        String productInfo = FMT."""
                Produkt: \{product}:
                    > Cena netto: %.2f\{nettoPrice}zł
                    > Cena brutto: %.2f\{nettoPrice * 1.23}zł
                """;
        System.out.println(productInfo);
    }
}
