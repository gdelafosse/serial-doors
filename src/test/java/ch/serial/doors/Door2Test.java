package ch.serial.doors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Door2Test {

    @Test
    public void testSegment() {
        Assert.assertEquals(2, new Door2().getDotCount(new Door2.Segment()));
    }

    @Test
    public void testTriangle() {
        Assert.assertEquals(3, new Door2().getDotCount(new Door2.Triangle()));
    }

    @Test
    public void testSquare() {
        Assert.assertEquals(4, new Door2().getDotCount(new Door2.Square()));
    }
}
