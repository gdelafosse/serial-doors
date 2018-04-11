package ch.serial.doors;

import org.junit.Test;

public class Door3Test {

    @Test
    public void test0() throws Exception {
        new Door3().throwException(0);
    }

    @Test(expected = Exception.class)
    public void test1() throws Exception {
        new Door3().throwException(1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() throws Exception {
        new Door3().throwException(2);
    }

    @Test(expected = RuntimeException.class)
    public void test3() throws Exception {
        new Door3().throwException(3);
    }

    @Test(expected = Error.class)
    public void test4() throws Exception {
        new Door3().throwException(4);
    }
}
