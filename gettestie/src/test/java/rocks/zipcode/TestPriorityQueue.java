package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class TestPriorityQueue {

    @Test
    public void testPeek(){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("a");
        q.add("b");
        Assert.assertEquals("a", q.peek());
    }

    @Test
    public void testPoll(){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("a");
        q.add("b");
        Assert.assertEquals("a", q.poll());
    }
}
