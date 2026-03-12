package org.example.playground;

import java.util.Arrays;

/**
 * Утилитные классы
 */
public class UtilsExample {

    public static void main(String[] args) {
        //Objects, Arrays, Math, Collections (emptyList(), reverseOrder(), binarySearch())

        math();
    }

    public static void arrays() {
        String[] array = {"Anna", "Maria", "Elena"};
        String[] secondArray = {"Elena", "Maria", "Anna"};

        boolean equal = Arrays.equals(array, secondArray);
        System.out.println(equal);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String[] copy = array.clone();
        System.out.println(Arrays.toString(copy));

        int[][] table = {{1, 2, 3}, {4, 5}, {6}};
        int[][] tableCopy = table.clone();
        System.out.println(Arrays.deepEquals(table, tableCopy));
        System.out.println(Arrays.deepToString(tableCopy));
    }

    public static void math() {
        double a = Math.pow(2, 3); // возведение 2 в степень 3
        System.out.println("a: " + a);

        int b = Math.abs(3); // получение абсолютного значения числа
        int c = Math.abs(-4);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        int d = Math.max(5, 7); // нахождение наибольшего числа из двух значений
        int e = Math.min(4, 8); // нахождение наименьшего числа из двух значений
        System.out.println("Max: " + d);
        System.out.println("Min: " + e);

        // математическое целочисленное деление (округление всегда происходи вниз)
        int f = -1 / 3;
        int g = Math.floorDiv(-1, 3);
        System.out.println("Java division: " + f);
        System.out.println("Math division: " + g);
    }
}