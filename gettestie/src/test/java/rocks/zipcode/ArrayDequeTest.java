package rocks.zipcode;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayDeque;

public class ArrayDequeTest {
    private static final ArrayDeque<Integer> deque = new ArrayDeque<>();

    @After
    public void tearDown(){
        deque.clear();
    }

    @Test
    public void isEmptyTest(){
        Assert.assertTrue(deque.isEmpty());
    }

    @Test
    public void addFirstTest(){
        deque.add(2);
        deque.add(3);
        deque.addFirst(1);

        Integer expectedFirst = 1;
        Integer actualFirst = deque.getFirst();

        Assert.assertEquals(expectedFirst, actualFirst);
    }

    @Test
    public void addLastTest(){
        deque.add(2);
        deque.add(3);
        deque.addLast(1);

        Integer expectedLast = 1;
        Integer actualLast = deque.getLast();

        Assert.assertEquals(expectedLast, actualLast);
    }

    @Test
    public void removeFirstTest(){
        deque.add(2);
        deque.addFirst(1);

        Integer expectedRemove = 1;
        Integer actualRemove = deque.removeFirst();

        Assert.assertEquals(expectedRemove, actualRemove);
    }

    @Test
    public void removeLastTest(){
        deque.add(2);
        deque.addLast(1);

        Integer expectedRemove = 1;
        Integer actualRemove = deque.removeLast();

        Assert.assertEquals(expectedRemove, actualRemove);
    }
}
