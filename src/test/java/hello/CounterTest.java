package hello;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CounterTest {

    String name1 = "Giorgio"; // len 7
    String name2 = "Boy George"; // len 10/9
    String name3 = "";  // len 2
    Counter counts = new Counter();




    @Test
    public void counterNameLength() {
        assertEquals(7, counts.nameLength(name1));
        assertEquals(10, counts.nameLength(name2));
        assertEquals(0, counts.nameLength(name3));
    }

    @Test
    public void counterCountsLetters() {
        assertEquals(7, counts.nameLetterCount(name1));
        assertEquals(9, counts.nameLetterCount(name2));
        assertEquals(0, counts.nameLetterCount(name3));

    }

}