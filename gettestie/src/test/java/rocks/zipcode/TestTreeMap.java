package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testGet(){
        TreeMap<String, String> t = new TreeMap<>();
        t.put("k", "v");
        Assert.assertEquals("v", t.get("k"));
    }

    @Test
    public void testFirstKey(){
        TreeMap<String, String> t = new TreeMap<>();
        t.put("k", "v");
        t.put("a", "c");
        Assert.assertEquals("a", t.firstKey());
    }
}
