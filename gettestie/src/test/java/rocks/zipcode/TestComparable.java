package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class TestComparable implements Comparable<Integer>{

    @Override
    public int compareTo(Integer o) {
        return this.compareTo(o);
    }

    @Test
    public void compareToEqual(){
        Integer compareNum = 0;
        Integer initialNum = 0;
        Assert.assertEquals(0, compareNum.compareTo(initialNum));
    }

    @Test
    public void compareToGreaterThan(){
        Integer compareNum = 1;
        Integer initialNum = 0;
        Assert.assertEquals(1, compareNum.compareTo(initialNum));
    }
}
