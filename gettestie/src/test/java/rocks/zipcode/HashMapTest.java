package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    private static final Map<Integer, String> hash = new HashMap<>();

    @After
    public void tearDown(){
        hash.clear();
    }

    @Test
    public void isEmptyTest1(){
        Assert.assertTrue(hash.isEmpty());
    }

    @Test
    public void getTest(){
        hash.put(1, "anthony");
        Assert.assertNull(hash.get(2));
    }

    @Test
    public void putTest(){
        hash.put(1, "anthony");
        hash.put(2, "pearson");

        Assert.assertEquals("anthony", hash.get(1));
        Assert.assertEquals("pearson", hash.get(2));
    }

    @Test
    public void sizeTest(){
        hash.put(1, "anthony");
        hash.put(2, "pearson");

        Integer expectedSize = 2;
        Integer actualSize = hash.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void containsKeyTest1(){
        hash.put(1, "anthony");
        Assert.assertTrue(hash.containsKey(1));
    }

    @Test
    public void containsKeyTest2(){
        hash.put(1, "anthony");
        Assert.assertFalse(hash.containsKey(2));
    }

    @Test
    public void containsValueTest1(){
        hash.put(1, "anthony");
        Assert.assertTrue(hash.containsValue("anthony"));
    }

    @Test
    public void containsValueTest2(){
        hash.put(1, "anthony");
        Assert.assertFalse(hash.containsValue("pearson"));
    }

    @Test
    public void removeTest(){
        hash.put(1, "anthony");
        hash.remove(1);

        Assert.assertTrue(hash.isEmpty());
    }

    @Test
    public void replaceTest(){
        hash.put(1, "anthony");
        hash.replace(1, "pearson");

        Assert.assertEquals("pearson", hash.get(1));
    }
}
