package ch.serial.doors;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Door5Test {
    @Test
    @Ignore
    public void test() throws InterruptedException {
        Door5 door5 = new Door5();

        Thread thread1 = new Thread(new Door5.Door5Runnable(door5, 100));
        thread1.start();

        Thread thread2 = new Thread(new Door5.Door5Runnable(door5, 200));
        thread2.start();

        thread1.join(60000);
        thread2.join(60000);

        Assert.assertEquals(300, door5.count());
    }
}
