package pl.javastart.template;

import static java.lang.StringTemplate.RAW;

class RawExample {
    public static void main(String[] args) {
        String firstName = "Jan";
        int age = 20;
        StringTemplate template = RAW."\{firstName} za rok będzie miał \{age + 1} lat";
        System.out.println(template.fragments()); //["", " za rok będzie miał ", " lat"]
        System.out.println(template.values()); //["Jan", 21]
        System.out.println(template.interpolate()); //Jan za rok będzie miał 21 lat
    }
}
