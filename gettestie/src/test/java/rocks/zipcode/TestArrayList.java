package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {

    @Test
    public void testArrayListAdd(){
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        Assert.assertTrue(list.contains("add"));
    }

    @Test
    public void testArrayListRemove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        list.remove("add");
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testArrayListSize(){
        ArrayList<String> list = new ArrayList<>();
        list.add("add");
        Assert.assertEquals(1, list.size());
    }
}
