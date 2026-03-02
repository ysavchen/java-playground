package org.example.playground;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        array();
    }

    /**
     * Статический массив
     */
    public static void array() {
        String[] array = {"Anna", "Maria", "Elena"};
        System.out.println(Arrays.toString(array));
    }

    /**
     * Таблица / матрица
     */
    public static void table() {
        int[][] table = new int[2][5];
        int[][] initializedTable = {{1, 2, 3}, {4, 5}, {6}};
        System.out.println(Arrays.deepToString(initializedTable));
    }
}
