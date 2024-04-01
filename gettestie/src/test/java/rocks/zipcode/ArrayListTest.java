package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;

public class ArrayListTest {
    private static final ArrayList<Integer> arrayList = new ArrayList<>();

    @After
    public void breakDown(){
        arrayList.clear();
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(arrayList.isEmpty());
    }

    @Test
    public void addTest(){
        arrayList.add(1);
        Integer expectedAdd = 1;
        Integer actualAdd = arrayList.get(0);

        Assert.assertEquals(expectedAdd, actualAdd);
    }

    @Test
    public void getTest(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Integer expectedGet = 2;
        Integer actualGet = arrayList.get(1);

        Assert.assertEquals(expectedGet, actualGet);
    }

    @Test
    public void setTest(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.set(1, 4);
        Integer expectedSet = 4;
        Integer actualSet = arrayList.get(1);

        Assert.assertEquals(expectedSet, actualSet);
    }

    @Test
    public void removeTest(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Integer expectedRemove = 2;
        Integer actualRemove = arrayList.remove(1);

        Assert.assertEquals(expectedRemove, actualRemove);
    }

    @Test
    public void sizeTest(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Integer expectedSize = 3;
        Integer actualSize = arrayList.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void containsTest1(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Assert.assertTrue(arrayList.contains(2));
    }

    @Test
    public void containsTest2() {
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Assert.assertFalse(arrayList.contains(5));
    }
}
