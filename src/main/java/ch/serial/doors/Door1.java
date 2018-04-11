package ch.serial.doors;

public class Door1 {

    boolean compare(String s1, String s2) {
        if (s1 == s2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "Door" + '1';
        String s2 = String.format("Door%d", 1);
        if (new Door1().compare(s1, s2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
