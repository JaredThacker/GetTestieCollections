package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TestTreeSet {

    @Test
    public void testTreeSetFirst(){
        TreeSet<String> t = new TreeSet<>();
        t.add("b");
        t.add("a");
        Assert.assertEquals("a", t.first());
    }

    @Test
    public void testTreeSetLast(){
        TreeSet<String> t = new TreeSet<>();
        t.add("b");
        t.add("a");
        Assert.assertEquals("b", t.last());
    }

}
