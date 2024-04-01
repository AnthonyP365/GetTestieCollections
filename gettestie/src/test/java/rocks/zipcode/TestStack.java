package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void peekTest(){
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");

        String expectedPeek = "two";
        String actualPeek = stack.peek();

        Assert.assertEquals(expectedPeek, actualPeek);
    }

    @Test
    public void popTest(){
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");

        String expectedPop1 = "two";
        String actualPop1 = stack.peek();
        String expectedPop2 = "two";
        String actualPop2 = stack.peek();

        Assert.assertEquals(expectedPop1, actualPop1);
        Assert.assertEquals(expectedPop2, actualPop1);
    }

    @Test
    public void searchTest(){
        Stack<String> stack = new Stack<>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");

        int expectedSearch = 2;
        int actualSearch = stack.search("three");

        Assert.assertEquals(expectedSearch, actualSearch);
    }
}
