package ch.serial.doors;

import com.sun.javaws.exceptions.ErrorCodeResponseException;

public class Door3 {

    public void throwException(int i) throws Exception {
        if (i == 1) {
            throw new Exception();
        } else if (i == 2) {
            throw new IllegalArgumentException();
        } else if (i == 3) {
            throw new RuntimeException();
        } else if (i == 4) {
            throw new Error();
        }
    }

    public static void main(String[] args) {
        try {
            new Door3().throwException(4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getClass().getSimpleName());
            throw e;
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
        } finally {
            System.out.println("finally");
        }
    }
}
