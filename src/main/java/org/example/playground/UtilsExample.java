package org.example.playground;

import java.util.Arrays;

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
        double a = Math.pow(2, 3);
        System.out.println("a: " + a);

        int b = Math.abs(3);
        int c = Math.abs(-4);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
    }
}