package pl.javastart.processor;

class CounterBasicTest {
    public static void main(String[] args) {
        String firstName = "Ala";
        int words = STR."\{firstName} ma kota".split(" ").length;
        System.out.println(words);
    }
}
