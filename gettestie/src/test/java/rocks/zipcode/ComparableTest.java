package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class ComparableTest {
    private Integer myIntOne;
    private Integer myIntTwo;

    @Test
    public void compareToIntTest1(){
        myIntOne = 1;
        myIntTwo = 1;

        Assert.assertEquals(0, myIntOne.compareTo(myIntTwo));
    }

    @Test
    public void compareToIntTest2(){
        myIntOne = 1;
        myIntTwo = 2;

        Assert.assertEquals(-1, myIntOne.compareTo(myIntTwo));
    }

    @Test
    public void compareToIntTest3(){
        myIntOne = 2;
        myIntTwo = 1;

        Assert.assertEquals(1, myIntOne.compareTo(myIntTwo));
    }
}
