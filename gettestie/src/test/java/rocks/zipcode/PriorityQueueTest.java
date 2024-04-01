package rocks.zipcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    private PriorityQueue<String> priorityQueue;

    @Before
    public void setup(){
        priorityQueue = new PriorityQueue<>();
    }

    @Test
    public void peekTest(){
        Assert.assertNull(priorityQueue.peek());
    }

    @Test
    public void addTest(){
        priorityQueue.add("one");

        String expectedPeek = "one";
        String actualPeek = priorityQueue.peek();

        Assert.assertEquals(expectedPeek, actualPeek);
    }

    @Test
    public void sizeTest(){
        priorityQueue.add("one");
        priorityQueue.add("two");

        Integer expectedSize = 2;
        Integer actualSize = priorityQueue.size();

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeTest(){
        priorityQueue.add("one");

        priorityQueue.remove();

        Assert.assertNull(priorityQueue.peek());
    }

    @Test
    public void containsTest1(){
        priorityQueue.add("one");
        priorityQueue.add("two");

        Assert.assertTrue(priorityQueue.contains("two"));
    }

    @Test
    public void containsTest2(){
        priorityQueue.add("one");
        priorityQueue.add("two");

        Assert.assertFalse(priorityQueue.contains("three"));
    }
}
