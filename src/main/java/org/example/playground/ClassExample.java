package org.example.playground;

/**
 * Примеры использования классов и объектов.
 * <p>
 * Объект обладает идентичностью: свежесозданный объект не может быть равен (==) никакому ранее созданному объекту.
 */
public class ClassExample {

    public static void main(String[] args) {
        // Локальный класс
        class Point {
            int x, y;
        }

        Point p = new Point();
        p.x = 5;
        p.y = 6;
    }
}
