package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorTest {
    private static final Vector<Integer> vector = new Vector<>();

    @After
    public void tearDown(){
        vector.clear();
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(vector.isEmpty());
    }

    @Test
    public void containsTest(){
        Assert.assertFalse(vector.contains(1));
    }

    @Test
    public void addTest(){
        vector.add(1);
        Assert.assertTrue(vector.contains(1));
    }

    @Test
    public void sizeTest(){
        vector.add(1);
        vector.add(2);

        Integer expectedSize = 2;
        Integer actualSize = vector.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeTest(){
        vector.add(1);
        vector.add(2);

        vector.remove(1);

        Assert.assertFalse(vector.contains(2));
    }
}
