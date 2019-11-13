package algos.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Class to test algos.algos.examples.ExpressionEvaluator
 */
public class ExpressionEvaluatorTest
{

    @Test public void should_handle_trivial_expression()
    { 
        // given
        ExpressionEvaluator systemUnderTest = new ExpressionEvaluator();
        String input = "1 + 2";
        double expected = 3;

        // when
        double actual = systemUnderTest.evaluate(input);

        // then
        assertEquals(expected, actual, 0.0);
    }

    @Test public void should_handle_easy_expression()
    { 
        // given
        ExpressionEvaluator systemUnderTest = new ExpressionEvaluator();
        String input = "( 5 + 2 ) * 7";
        double expected = 49.0;

        // when
        double actual = systemUnderTest.evaluate(input);

        // then
        assertEquals(expected, actual, 0.0);
    }

    @Test public void should_handle_medium_expression()
    { 
        // given
        ExpressionEvaluator systemUnderTest = new ExpressionEvaluator();
        String input = "( ( 5 + 2 ) * 7 ) + 10";
        double expected = 59.0;

        // when
        double actual = systemUnderTest.evaluate(input);

        // then
        assertEquals(expected, actual, 0.0);
    }

    @Test public void should_handle_hard_expression()
    { 
        // given
        ExpressionEvaluator systemUnderTest = new ExpressionEvaluator();
        String input = "( ( ( 5 + 2 ) * 7 ) + 15 ) / 8";
        double expected = 8.0;

        // when
        double actual = systemUnderTest.evaluate(input);

        // then
        assertEquals(expected, actual, 0.0);
     }

     @Test public void should_handle_extreme_expression()
     { 
         // given
         ExpressionEvaluator systemUnderTest = new ExpressionEvaluator();
         String input = "( ( ( 5 + 2 ) * ( -10 + 17 ) ) + 15 ) / 8";
         double expected = 8.0;
 
         // when
         double actual = systemUnderTest.evaluate(input);
 
         // then
         assertEquals(expected, actual, 0.0);
      }
}