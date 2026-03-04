package org.example.playground;

/**
 * Примеры использования классов и объектов.
 * <p>
 * Объект обладает идентичностью: свежесозданный объект не может быть равен (==) никакому ранее созданному объекту.
 */
public class ClassExample {

    private int a = 1, b = 2;

    private static int c = 3, d = 4;

    /**
     * InnerClass имеет доступ не только к своим полям, но и к полям внешнего класса.
     */
    class InnerClass {
        void print() {
            System.out.println("InnerClass: a = " + a + ", b = " + b);
        }
    }

    /**
     * StaticInnerClass имеет доступ только к статическим полям внешнего класса.
     */
    static class StaticInnerClass {
        void print() {
            System.out.println("StaticInnerClass: c = " + c + ", d = " + d);
        }
    }

    public static void main(String[] args) {
        staticInnerClass();
    }

    /**
     * Локальный класс
     */
    public static void localClass() {
        class Point {
            int x, y;
        }

        Point p = new Point();
        p.x = 5;
        p.y = 6;
    }

    /**
     * Вложенный класс<br/>
     * В примере инициализация с помощью qualified new (редко используется).<br/>
     * Вложенный класс имеет скрытую ссылку на инициализированный объект внешнего класса - this$0.<br/>
     * Вложенный классы приводят к утечкам памяти, так как из-за скрытой ссылки GC не будет удалять внешний класс,
     * даже если вложенный класс не использует никакие поля внешнего класса.
     */
    public static void innerClass() {
        var innerClass = new ClassExample().new InnerClass();
        innerClass.print();
    }

    /**
     * Статический вложенный класс<br/>
     * Статический вложенный класс не привязан к экземляру внешнего класса и не имеют ссылку this$0.<br/>
     * Статический вложенный класс отличается от просто вложенного класса только отсутствием ссылки на экземпляр внешнего класса.<br/>
     * Статическе классы удобны для группировки, когда есть большой класс и с ним по смыслу связаны более маленькие классы.
     */
    public static void staticInnerClass() {
        var staticInnerClass = new StaticInnerClass();
        staticInnerClass.print();
    }
}
