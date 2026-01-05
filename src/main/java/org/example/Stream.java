package org.example;

import java.util.Arrays;
import java.util.Collection;

public class Stream {

    public static void main(String[] args) {
        distinctWords();
    }

    /**
     * Разбить текст на уникальные слова
     */
    private static void distinctWords() {
        String text = """
            """;

        String[] words = text.lines()
            .filter(line -> !line.isEmpty())
            .map(line -> Arrays.stream(line.split("\\s+")).toList())
            .flatMap(Collection::stream)
            .distinct()
            .toArray(String[]::new);

        System.out.println(Arrays.toString(words));
    }
}
