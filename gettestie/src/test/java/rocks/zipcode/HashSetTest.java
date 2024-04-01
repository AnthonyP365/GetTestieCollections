package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;

public class HashSetTest {
    private static final HashSet<Integer> hash = new HashSet<>();

    @After
    public void tearDown(){
        hash.clear();
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(hash.isEmpty());
    }

    @Test
    public void containsTest(){
        Assert.assertFalse(hash.contains(1));
    }

    @Test
    public void addTest(){
        hash.add(1);
        Assert.assertTrue(hash.contains(1));
    }

    @Test
    public void sizeTest(){
        hash.add(1);
        hash.add(2);

        Integer expectedSize = 2;
        Integer actualSize = hash.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeTest(){
        hash.add(1);
        hash.add(2);

        hash.remove(2);

        Assert.assertFalse(hash.contains(2));
    }
}
