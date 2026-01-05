package org.example;

import java.util.*;

import static java.util.Collections.reverseOrder;

public class Collections {

    public static void main(String[] args) {
        arrayDeque();
        priorityQueue();
        hashMap();
    }

    private static void arrayDeque() {
        Deque<String> queue = new ArrayDeque<>();
        queue.removeLast();
        String result = queue.pop();
        System.out.println(result);
    }

    private static void priorityQueue() {
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
        PriorityQueue<Integer> reversedQueue = new PriorityQueue<>(reverseOrder());
    }

    private static void hashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "blabla");
        String result = map.get("1");
        System.out.println(result);
    }
}