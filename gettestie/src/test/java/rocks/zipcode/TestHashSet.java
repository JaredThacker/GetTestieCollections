package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {

    @Test
    public void testHashSetAdd(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        Assert.assertTrue(set.contains(1));
    }

    @Test
    public void testHashSetContains(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        Assert.assertTrue(set.contains(1));
    }

    @Test
    public void testHashSetSize(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        Assert.assertEquals(1, set.size());
    }


    @Test
    public void testHashSetClear(){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.clear();
        Assert.assertEquals(0, set.size());
    }
}
