package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    private static final LinkedList<Integer> list = new LinkedList<>();

    @After
    public void tearDown(){
        list.clear();
    }

    @Test
    public void addTest(){
        list.add(1);

        Integer expectedAdd = 1;
        Integer actualAdd = list.get(0);

        Assert.assertEquals(expectedAdd, actualAdd);
    }

    @Test
    public void getTest(){
        list.add(1);
        list.add(2);
        list.add(3);

        Integer expectedGet = 3;
        Integer actualGet = list.get(2);

        Assert.assertEquals(expectedGet, actualGet);
    }

    @Test
    public void containsTest1() {
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertTrue(list.contains(2));
    }

    @Test
    public void containsTest2() {
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertFalse(list.contains(4));
    }

    @Test
    public void removeTest(){
        list.add(1);
        list.add(2);

        list.remove(1);

        Assert.assertFalse(list.contains(2));
    }

    @Test
    public void setTest(){
        list.add(1);
        list.add(2);
        list.add(3);

        list.set(1, 4);
        Integer expectedSet = 4;

        Assert.assertEquals(expectedSet, list.get(1));
    }

    @Test
    public void sizeTest(){
        list.add(1);
        list.add(2);
        list.add(3);

        Integer expectedSize = 3;
        Integer actualSize = list.size();

        Assert.assertEquals(expectedSize, actualSize);
    }
}
