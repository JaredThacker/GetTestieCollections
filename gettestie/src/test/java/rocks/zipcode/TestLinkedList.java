package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class TestLinkedList {

    @Test
    public void testLinkedListAddFirst(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.addLast("b");
        Assert.assertEquals("a", list.getFirst());
    }

    @Test
    public void testLinkedListRemoveFirst(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.remove("a");
        Assert.assertEquals("b", list.getFirst());
    }
}
