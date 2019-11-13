package algos.adt.stack;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for the algos.algos.adt.stack.LinkedListStack implementation
 */
public class LinkedListStackTest
{
   @Test public void should_create_empty_stack()
   { 
       // given
       Stack<String> systemUnderTest = new LinkedListStack<String>();
       boolean expected = true;

       // when
       boolean actual = systemUnderTest.isEmpty();

       // then
       assertEquals(expected, actual);
   } 

   @Test public void should_return_correct_size_after_adding_items()
   { 
       // given
       Stack<String> systemUnderTest = new LinkedListStack<String>();
       String[] input = {"Hello", "World", "!"};
       int expected = input.length;

       // when
       for (String s : input)
       { systemUnderTest.push(s); }
       int actual = systemUnderTest.getSize();

       // then
       assertEquals(expected, actual);
    }

   @Test public void should_return_correct_empty_flag_after_adding_items()
   {
       // given
       Stack<String> systemUnderTest = new LinkedListStack<String>();
       String[] input = {"Hello", "World", "!"};
       boolean expected = false;

       // when
       for (String s : input)
       { systemUnderTest.push(s); }
       boolean actual = systemUnderTest.isEmpty();

       // then
       assertEquals(expected, actual);
    }

   @Test public void should_pop_elements_in_order_after_push()
   { 
       // given
       Stack<String> systemUnderTest = new LinkedListStack<String>();
       String[] input = {"Hello", "World", "!"};
       String[] expecteds = {"!", "World", "Hello"};
       for (String s : input)
       { systemUnderTest.push(s); }

       // when
       String[] actuals = new String[3];
       int cnt = 0;
       for (String s : systemUnderTest )
       { actuals[cnt++] = s; }

       // then
       assertArrayEquals(expecteds, actuals);
    }

    @Test public void should_pop_elements_in_order_after_push_and_pop()
   { 
       // given
       Stack<String> systemUnderTest = new LinkedListStack<String>();
       String[] input = {"Hello", "World", "!"};
       String[] expecteds = {"World", "Hello"};
       for (String s : input)
       { systemUnderTest.push(s); }
       systemUnderTest.pop();

       // when
       String[] actuals = new String[2];
       int cnt = 0;
       for (String s : systemUnderTest )
       { actuals[cnt++] = s; }

       // then
       assertArrayEquals(expecteds, actuals);
    }

    @Test public void should_handle_pop_for_empty_stack()
    {
        // given
        Stack<String> systemUnderTest = new LinkedListStack<String>();
        String expected = null;

        // when
        String actual = systemUnderTest.pop();

        // then
        assertEquals(expected, actual);
     }
}