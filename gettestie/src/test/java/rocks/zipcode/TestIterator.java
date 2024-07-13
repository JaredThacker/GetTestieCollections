package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {

    @Test
    public void iteratorNext(){
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("a");
        letters.add("b");

        Iterator<String> it = letters.iterator();
        String expected = "a";
        String next = it.next();
        Assert.assertEquals(expected, next);
    }

    @Test
    public void iteratorHasNext(){
        int i = 0;

        ArrayList<String> letters = new ArrayList<String>();
        letters.add("a");
        letters.add("b");
        letters.add("c");

        Iterator<String> it = letters.iterator();
        while (it.hasNext()) {
            it.next();
            i += 1;
        }
        Assert.assertEquals(3,i);
    }
}
