package org.example.playground;

import java.util.*;

import static java.util.Collections.reverseOrder;

public class CollectionExample {

    public static void main(String[] args) {
        arrayList();
    }

    /**
     * Статический массив
     */
    public static void array() {
        String[] array = {"Anna", "Maria", "Elena"};
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
        list.get(5);
    }

    /**
     * Множество на основе hash-таблицы<br/>
     * Set не допускает хранение двух уникальных элементов.
     */
    public static void hashSet() {
        Set<String> set = new HashSet<>();
    }

    /**
     * Упорядоченное множество (ordered set)<br/>
     * Будете итерировать эелементы в том же порядке, в котором их добавляли в множество (insertion-order).<br/>
     * ArrayList и LinkedList также являются упорядоченными коллекциями.
     */
    public static void linkedHashSet() {
        Set<String> set = new LinkedHashSet<>();
    }

    /**
     * Отсортированное множество (sorted set) на основе красно-черного дерева
     */
    public static void treeSet() {
        Set<String> set = new TreeSet<>();
    }

    /**
     * Hash-таблица
     */
    public static void hashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "Anna");
        String result = map.get("1");
        System.out.println(result);
    }

    /**
     * Упорядоченная hash-таблица
     */
    public static void linkedHashMap() {
        Map<String, String> map = new LinkedHashMap<>();
    }

    /**
     * Отсортированная hash-таблица
     */
    public static void treeMap() {
        Map<String, String> map = new TreeMap<>();
    }

    /**
     * Очередь / стек<br/>
     * {@link Stack} использовать не нужно, так как считается устаревшим.
     */
    public static void arrayDeque() {
        Deque<String> queue = new ArrayDeque<>();
        queue.removeLast();
        String result = queue.pop();
        System.out.println(result);
    }

    /**
     * Очередь с приоритетом (heap-based)
     */
    public static void priorityQueue() {
        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> reversedQueue = new PriorityQueue<>(reverseOrder());
    }
}
