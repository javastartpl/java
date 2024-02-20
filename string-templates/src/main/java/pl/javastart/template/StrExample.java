package pl.javastart.template;

import static java.lang.StringTemplate.RAW;

class StrExample {
    public static void main(String[] args) {
        String firstName = "Jan";
        int age = 20;
        String result = STR."\{firstName} za rok będzie miał \{age + 1} lat";
        System.out.println(result); //Jan za rok będzie miał 21 lat

//        StringTemplate template = RAW."\{firstName} za rok będzie miał \{age + 1} lat";
//        String result = template.interpolate();
//        System.out.println(result);
    }
}
