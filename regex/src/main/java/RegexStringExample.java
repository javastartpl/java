class RegexStringExample {
    public static void main(String[] args) {
        String email = "jan@gmail.com";
        if (email.matches("\\w+@[a-z0-9]+\\.[a-z]{2,}")) {
            System.out.println("Prawidłowy adres email");
        } else {
            System.out.println("Nieprawidłowy format adresu email");
        }
    }
}
