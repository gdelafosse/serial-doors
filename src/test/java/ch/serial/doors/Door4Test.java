package ch.serial.doors;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Door4Test {
    private static final String[] strings = {"string1", "string2", "string2", "string4", "string3"};

    @Parameterized.Parameter
    public Door4.Elements elements;

    @Parameterized.Parameter(1)
    public int expected;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { new Door4.Strings1(), 4 },
                { new Door4.Strings2(), 5 }
        });
    }

    @Test
    public void test() {

        for (String s : strings) {
            elements.add(s);
        }

        Assert.assertEquals(expected, elements.size());
    }
}
