package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void testPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @org.junit.Test
    public void testPop(){
        Stack<String> stack = new Stack<>();
        stack.push("popped");
        stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @org.junit.Test
    public void testPeek(){
        Stack<String> stack = new Stack<>();
        stack.push("peek");
        assertEquals("peek", stack.peek());
    }

    @org.junit.Test
    public void isEmpty(){
        Stack<String> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }
}
