package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {

    @Test
    public void testHashMapPut(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        Assert.assertEquals("v", map.get("k"));
    }

    @Test
    public void testHashMapGet(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        Assert.assertEquals("v", map.get("k"));
    }

    @Test
    public void testHashMapSize(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        int expected = 1;
        Assert.assertEquals(expected, map.size());
    }

    @Test
    public void testHashMapContainsKey(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        Assert.assertTrue(map.containsKey("k"));
    }

    @Test
    public void testHashMapClear(){
        HashMap<String, String> map = new HashMap<>();
        map.put("k", "v");
        map.clear();
        Assert.assertEquals(0, map.size());
    }
}
