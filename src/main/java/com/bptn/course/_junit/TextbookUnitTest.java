package com.bptn.course._junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TextbookUnitTest {
    @Test
    public void testGetTitle() {
        TextBook tb = new TextBook("Computer Science", 14.99, 9);
        assertEquals("Computer Science", tb.getTitle());
    }

    @Test
    public void testGetEdition() {
        TextBook tb = new TextBook("Computer Science", 14.99, 9);
        assertEquals(9, tb.getEdition());
    }

    @Test
    public void testGetBookInfo() {
        TextBook tb = new TextBook("Computer Science", 14.99, 9);
        assertEquals("Computer Science-14.99-9", tb.getBookInfo());
    }

    @Test
    public void testCanSubstituteFor_canSubstitute() {
        TextBook tb = new TextBook("Computer Science", 14.99, 9);
        TextBook tb2 = new TextBook("Computer Science", 19.99, 2);
        assertEquals(true, tb.canSubstituteFor(tb2));
    }

    @Test
    public void testCanSubstituteFor_cannotSubstitute() {
        TextBook tb = new TextBook("Computer Science", 14.99, 9);
        TextBook tb2 = new TextBook("Basketweaving", 19.99, 2);
        assertEquals(false, tb.canSubstituteFor(tb2));
    }
}