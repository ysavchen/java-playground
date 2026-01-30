package org.example.playground;

public class ControlFlowExample {

    public static void main(String[] args) {
        // *** if ***
        int a = 5;
        if (a > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative or zero");
        }

        if (a > 0) {
            System.out.println("positive");
        } else if (a == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }

        // *** ternary operator ***
        int b = 5;
        System.out.println(b > 0 ? "positive" : "negative or zero");


        // *** while ***
        int c = 0;
        while (c < 10) {
            System.out.println(c);
            c++;
        }

        int d = 0;
        do {
            System.out.println(d);
            d++;
        } while (d < 10);


        // *** for ***
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // *** for-each ***
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println(i);
        }


        // *** switch statement ***
        int e = 0;
        switch (e) {
            case 1:
                System.out.println("one");
                break;
            case 2:
            case 3:
                System.out.println("two or three");
                break;
            default:
                System.out.println("other: ");
                System.out.println(e);
        }

        switch (e) {
            case 1 -> System.out.println("one");
            case 2, 3 -> System.out.println("two or three");
            default -> {
                System.out.println("other: ");
                System.out.println(e);
            }
        }

        // *** switch expression ***
        int k = 0;
        System.out.println(switch (k) {
            case 1 -> "one";
            case 2 -> "two";
            default -> "other";
        });
    }
}