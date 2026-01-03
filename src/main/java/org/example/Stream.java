package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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

        List<String> words = text.lines()
            .filter(line -> !line.isEmpty())
            .map(line -> Arrays.stream(line.split("\\s+")).toList())
            .flatMap(Collection::stream)
            .distinct()
            .toList();

        System.out.println(words);
    }
}
