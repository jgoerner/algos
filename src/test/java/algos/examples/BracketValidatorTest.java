package algos.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BracketValidatorTest
{
    @Test public void should_validate_correct_brackets()
    { 
        // given
        BracketValidator systemUnderTest = new BracketValidator();
        String valid = "{[()()]}";
        boolean expected = true;

        // when
        boolean actual = systemUnderTest.validate(valid);

        // then
        assertEquals(expected, actual);
     }
    
    @Test public void should_invalidate_incorrect_brackets()
    { 
        // given
        BracketValidator systemUnderTest = new BracketValidator();
        String valid = "{[(}])";
        boolean expected = false;

        // when
        boolean actual = systemUnderTest.validate(valid);

        // then
        assertEquals(expected, actual);
     }

     @Test public void should_invalidate_if_brackets_left()
     { 
        // given
        BracketValidator systemUnderTest = new BracketValidator();
        String valid = "{[()]";
        boolean expected = false;

        // when
        boolean actual = systemUnderTest.validate(valid);

        // then
        assertEquals(expected, actual);
     }
     
     @Test public void should_invalidate_if_not_enough_brackets()
     { 
        // given
        BracketValidator systemUnderTest = new BracketValidator();
        String valid = "{[()]})";
        boolean expected = false;

        // when
        boolean actual = systemUnderTest.validate(valid);

        // then
        assertEquals(expected, actual);
     }


}