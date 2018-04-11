package ch.serial.doors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Door4 {

    public static abstract class Elements {

        private Collection<String> elements;

        protected Elements(Collection<String> elements) {
            this.elements = elements;
        }

        public final void add(String s) {
            elements.add(s);
        }

        public final int size() {
            return elements.size();
        }

        public final void print() {
            for (String e : elements) {
                System.out.println(e);
            }
        }
    }

    public static class Strings1 extends Elements {
        public Strings1() {
            super(new HashSet<>());
        }
    }

    public static class Strings2 extends Elements {
        public Strings2() {
            super(new ArrayList<>());
        }
    }

    public static void main(String[] args) {
        String[] strings = {"string1", "string2", "string2", "string4", "string3"};

        Elements strings1 = new Strings1();
        Elements strings2 = new Strings2();

        for (String s : strings) {
            strings1.add(s);
            strings2.add(s);
        }

        System.out.println(String.format("strings1 %d", strings1.size()));
        strings1.print();

        System.out.println(String.format("strings2 %d", strings2.size()));
        strings2.print();
    }
}
