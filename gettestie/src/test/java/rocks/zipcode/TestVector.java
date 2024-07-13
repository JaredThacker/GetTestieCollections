package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class TestVector {

    @Test
    public void testCap(){
        Vector<String> v = new Vector<>();
        Assert.assertEquals(10, v.capacity());
    }

    @Test
    public void testEnsureCap(){
        Vector<String> v = new Vector<>();
        v.ensureCapacity(21);
        Assert.assertEquals(21, v.capacity());
    }
}
