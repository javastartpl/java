package pl.javastart.processor;

class CounterProcessor implements StringTemplate.Processor<Integer, RuntimeException> {
    public static final CounterProcessor COUNTER = new CounterProcessor();

    @Override
    public Integer process(StringTemplate template) {
        String interpolatedText = template.interpolate();
        return interpolatedText.split(" ").length;
    }
}

//class CounterProcessor implements StringTemplate.Processor<Integer, RuntimeException> {
//    public static final CounterProcessor COUNTER = new CounterProcessor();
//
//    @Override
//    public Integer process(StringTemplate template) {
//        Stream<String> fragmentStream = template.fragments().stream();
//        Stream<String> valueStream = template.values().stream().map(Object::toString);
//        return (int) Stream.concat(fragmentStream, valueStream)
//                .map(s -> s.split(" "))
//                .flatMap(Arrays::stream)
//                .filter(s -> !s.isEmpty())
//                .count();
//    }
//}
