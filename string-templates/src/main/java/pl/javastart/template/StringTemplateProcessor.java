package pl.javastart.template;

class StringTemplateProcessor implements StringTemplate.Processor<String, RuntimeException> {
    @Override
    public String process(StringTemplate stringTemplate) {
        return stringTemplate.interpolate();
    }
}
