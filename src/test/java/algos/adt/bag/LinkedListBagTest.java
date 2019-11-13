package algos.adt.bag;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit tests for the algos.algos.adt.bag.LinkedListBag implementation
 */
public class LinkedListBagTest 
{
    @Test public void should_create_emtpy_bag()
    {
        //given        
        Bag<String> systemUnderTest = new LinkedListBag<String>();
        boolean expected = true;

        // when
        boolean actual = systemUnderTest.isEmpty();

        // then
        assertEquals(expected, actual);
    }

    @Test public void should_have_correct_size_after_adding()
    {
        // given
        Bag<String> systemUnderTest = new LinkedListBag<String>();
        int expected = 5;
        
        // when
        for (int i=0;i<5;i++)
        { systemUnderTest.add("world"); }
        int actual = systemUnderTest.getSize();

        // then
        assertEquals(expected, actual);
    }
    
    @Test public void should_have_correct_empty_flag_after_adding()
    {
        // given
        Bag<String> systemUnderTest = new LinkedListBag<String>();
        boolean expected = false;

        // given 
        systemUnderTest.add("word");
        boolean actual = systemUnderTest.isEmpty();

        // then
        assertEquals(expected, actual);
    }

    @Test public void should_iterate_over_all_added_items()
    {
        // given
        Bag<String> systemUnderTest = new LinkedListBag<String>();
        String[] expecteds = {"Hello", "World", "!"};
        for (String s : expecteds)
        { systemUnderTest.add(s); }

        // when
        String[] actuals = new String[expecteds.length];
        int cnt = 0;
        for (String s : systemUnderTest)
        { actuals[cnt++] = s; }
        Arrays.sort(expecteds);
        Arrays.sort(actuals);

        // then
        assertArrayEquals(expecteds, actuals);
    }
}