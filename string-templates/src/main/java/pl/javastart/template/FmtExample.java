package pl.javastart.template;

import static java.util.FormatProcessor.FMT;

class FmtExample {
    public static void main(String[] args) {
        String product = "Czekolada";
        double nettoPrice = 2.99;
        String productInfo = FMT."\{product} ma cenę netto: %.2f\{nettoPrice}zł i brutto %.2f\{nettoPrice * 1.23}zł";
        System.out.println(productInfo);
    }
}
