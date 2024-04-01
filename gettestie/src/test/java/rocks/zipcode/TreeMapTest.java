package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    private static final Map<Integer, String> tree = new TreeMap<>();

    @After
    public void tearDown(){
        tree.clear();
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(tree.isEmpty());
    }

    @Test
    public void getTest1(){
        tree.put(1, "anthony");

        String expectedVal = "anthony";
        String actualVal = tree.get(1);

        Assert.assertEquals(expectedVal, actualVal);
    }

    @Test
    public void getTest2(){
        tree.put(1, "anthony");

        Assert.assertNull(tree.get(2));
    }

    @Test
    public void putTest(){
        tree.put(1, "anthony");
        tree.put(2, "pearson");

        Assert.assertEquals("anthony", tree.get(1));
        Assert.assertEquals("pearson", tree.get(2));
    }

    @Test
    public void sizeTest(){
        tree.put(1, "anthony");
        tree.put(2, "pearson");

        Integer expectedSize = 2;
        Integer actualSize = tree.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void containsKeyTest1(){
        tree.put(1, "anthony");
        Assert.assertTrue(tree.containsKey(1));
    }

    @Test
    public void containsKeyTest2(){
        tree.put(1, "anthony");
        Assert.assertFalse(tree.containsKey(2));
    }

    @Test
    public void containsValueTest1(){
        tree.put(1, "anthony");
        Assert.assertTrue(tree.containsValue("anthony"));
    }

    @Test
    public void containsValueTest2(){
        tree.put(1, "anthony");
        Assert.assertFalse(tree.containsValue("pearson"));
    }

    @Test
    public void removeTest(){
        tree.put(1, "anthony");
        tree.remove(1);

        Assert.assertTrue(tree.isEmpty());
    }

    @Test
    public void replaceTest(){
        tree.put(1, "anthony");
        tree.replace(1, "pearson");

        Assert.assertEquals("pearson", tree.get(1));
    }
}
