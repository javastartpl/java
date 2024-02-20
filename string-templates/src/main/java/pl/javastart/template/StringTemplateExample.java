package pl.javastart.template;

import java.util.List;

class StringTemplateExample {
    public static void main(String[] args) {
        String firstName = "Jan";
        int age = 20;
        StringTemplate template = StringTemplate.of(
                List.of("", " za rok będzie miał ", " lat"),
                List.of(firstName, age + 1)
        );
        String interpolatedTemplate = template.interpolate();
        System.out.println(interpolatedTemplate);
//        List<String> fragments = template.fragments();
//        System.out.println(fragments);
//        List<Object> values = template.values();
//        System.out.println(values);
    }
}
