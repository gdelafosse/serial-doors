package ch.serial.doors;

import java.util.ArrayList;
import java.util.List;

public class Door2 {

    public static class Segment {
        public int getDotCount() {
            return 2;
        }
    }

    public static class Triangle {
        public int getDotCount() {
            return 3;
        }
    }

    public static class Square {
        public int getDotCount() {
            return 4;
        }
    }

    public int getDotCount(Object shape) {
        int dotCount = 0;
        if (shape instanceof Segment) {
            dotCount = ((Segment)shape).getDotCount();
        } else if (shape instanceof Triangle) {
            dotCount = ((Triangle)shape).getDotCount();
        } else if (shape instanceof Square) {
            dotCount = ((Square)shape).getDotCount();
        }
        return dotCount;
    }

    public static void main(String[] args) {
        List<Object> shapes = new ArrayList<>();
        shapes.add(new Segment());
        shapes.add(new Triangle());
        shapes.add(new Square());

        Door2 door2 = new Door2();
        for (Object shape : shapes) {
            System.out.println(door2.getDotCount(shape));
        }
    }
}
