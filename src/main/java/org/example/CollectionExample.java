package org.example;

import java.util.*;

import static java.util.Collections.reverseOrder;

public class CollectionExample {

    public static void main(String[] args) {
        arrayList();
    }

    /**
     * Список на основе динамического массива
     */
    public static void arrayList() {
        List<String> list = new ArrayList<>();
    }

    /**
     * Двусвязный список
     */
    public static void linkedList() {
        List<String> list = new LinkedList<>();
    }

    /**
     * Неупорядоченное множество (unordered set) на основе hash-таблицы<br/>
     * Set не допускает хранение двух уникальных элементов.
     */
    public static void hashSet() {

    }

    /**
     * Упорядоченное множество (ordered set)<br/>
     * Будете итерировать эелементы в том же порядке, в котором их добавляли в множество.
     */
    public static void linkedHashSet() {

    }

    /**
     * Отсортированное множество (sorted set) на основе красно-черного дерева
     */
    public static void treeSet() {

    }

    /**
     * Hash-таблица
     */
    public static void hashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "blabla");
        String result = map.get("1");
        System.out.println(result);
    }

    /**
     * Очередь/стек
     */
    public static void arrayDeque() {
        Deque<String> queue = new ArrayDeque<>();
        queue.removeLast();
        String result = queue.pop();
        System.out.println(result);
    }

    /**
     * Приоритетная очередь
     */
    public static void priorityQueue() {
        PriorityQueue<Integer> integerQueue = new PriorityQueue<>();
        PriorityQueue<Integer> reversedQueue = new PriorityQueue<>(reverseOrder());
    }
}