package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    ArrayList<Integer> arrayList = new ArrayList<>();

    @Test
    public void nextTest(){
        arrayList.add(1);
        Iterator<Integer> iterator = arrayList.iterator();

        Integer expectedInt = 1;
        Integer actualInt = iterator.next();

        Assert.assertEquals(expectedInt, actualInt);
    }

    @Test
    public void hasNextTest1(){
        arrayList.add(1);
        Iterator<Integer> iterator = arrayList.iterator();

        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void hasNextTest2(){
        Iterator<Integer> iterator = arrayList.iterator();
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public void removeTest(){
        arrayList.add(1);
        Iterator<Integer> iterator = arrayList.iterator();

        iterator.next();
        iterator.remove();

        Assert.assertFalse(iterator.hasNext());
    }
}
