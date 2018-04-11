package ch.serial.doors;

import org.junit.Assert;
import org.junit.Test;

public class Door1Test {

    @Test
    public void test() {
        Assert.assertFalse(new Door1().compare("s1", "s2"));
    }
}
