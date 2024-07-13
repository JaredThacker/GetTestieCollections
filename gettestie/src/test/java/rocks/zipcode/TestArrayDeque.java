package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    @Test
    public void testDequeAddFirst(){
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("first");
        deque.addLast("last");
        Assert.assertEquals("first", deque.element());
    }

    @Test
    public void testDequeAddLast(){
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("first");
        deque.addLast("last");
        Assert.assertEquals("last", deque.getLast());
    }
}
