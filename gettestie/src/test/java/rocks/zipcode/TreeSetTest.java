package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {
    private static final TreeSet<Integer> tree = new TreeSet<>();

    @After
    public void tearDown(){
        tree.clear();
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(tree.isEmpty());
    }

    @Test
    public void containsTest(){
        Assert.assertFalse(tree.contains(1));
    }

    @Test
    public void addTest(){
        tree.add(1);
        Assert.assertTrue(tree.contains(1));
    }

    @Test
    public void sizeTest(){
        tree.add(1);
        tree.add(2);

        Integer expectedSize = 2;
        Integer actualSize = tree.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeTest(){
        tree.add(1);
        tree.add(2);

        tree.remove(2);

        Assert.assertFalse(tree.contains(2));
    }
}
