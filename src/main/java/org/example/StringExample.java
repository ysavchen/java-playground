package org.example;

public class StringExample {

    public static void main(String[] args) {
        String string = "Hello, world!";
        String empty = "";
        String newEmptyString = new String();
        String newString = new String("Hello, world!");
        String fromChars = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        String multiLine = """
            Hello,
            world!
            """;
        System.out.println(multiLine);
    }

    public static void methods() {
        "Hello, world!".startsWith("Hello");
        "Hello, world!".endsWith("world!");
        "Hello, world!".contains(" ");
        "Hello, world!".equalsIgnoreCase("hEllO, wOrlD!");
        "Hello, world!".indexOf('e');
        "Hello, world!".indexOf("l");
        "Hello, world!".replace('o', 'a');
        "Hello, world!".replace("Hello", "Goodbye"); // replace заменяет все вхождения
        "Hello, world!".replaceAll("\\w", "x"); // replaceAll тоже заменяет все вхождения, но ищет по regex
        " Hello, world! ".trim();
        "Hello, world!".substring(6);
        "Hello, world!".substring(6, 11);
        "Hello, world!".split(" ");
    }

    public static void concatenation() {
        // если строка формируется одним предложением, конкатенировать через +
        String string = "Hello, " + "world!";

        // в цикле нужно использовать StringBuilder для конкатенации
        String builder = new StringBuilder().append("Hello, ").append("world!").toString();

        "*".repeat(100);
    }
}
