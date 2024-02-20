package pl.javastart.processor;

import static pl.javastart.processor.CounterProcessor.COUNTER;

class CounterProcessorTest {
    public static void main(String[] args) {
        String firstName = "Ala";
        int words = COUNTER."\{firstName} ma kota";
        System.out.println(words);

        System.out.println(COUNTER."Ala");
        System.out.println(COUNTER.",");
        System.out.println(COUNTER."Ala ma");
        System.out.println(COUNTER."\{firstName}");
        System.out.println(COUNTER." ");
    }
}


//        System.out.println(COUNTER."Ala");
//        System.out.println(COUNTER.",");
//        System.out.println(COUNTER."Ala ma");
//        System.out.println(COUNTER."\{firstName}");
//        System.out.println(Arrays.toString("Ala".split(" ")));
//        System.out.println(Arrays.toString(" ma kota".split(" ")));
