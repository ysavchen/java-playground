package org.example.playground;

public class SingletonExample {

    public static void main(String[] args) {
        Container container = Container.getInstance();
    }

    public static class Container {
        int x = 1;

        static Container getInstance() {
            return Holder.INSTANCE;
        }

        private static class Holder {
            static final Container INSTANCE = new Container();
        }
    }
}
