package algos.examples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Class to test algos.algos.examples.Mean
 */
public class MeanTest
{
    @Test public void should_return_0_for_empty_input()
    {
        // given
        Mean systemUnderTest = new Mean();
        double expected = 0.0;

        // when
        double actual = systemUnderTest.getMean();

        // then
        assertEquals(expected, actual, 0.0);
    }

    @Test public void should_return_0_for_same_positive_and_negative_number_input()
    {
        // given
        Mean systemUnderTest = new Mean();
        double expected = 0.0;

        // when
        systemUnderTest.add(5);
        systemUnderTest.add(-5);
        double actual = systemUnderTest.getMean();

        // then
        assertEquals(expected, actual, 0.0);
    }
   
    @Test public void should_return_correct_mean_for_multiple_inputs()
    {
        // given
        Mean systemUnderTest = new Mean();
        int[] input = {2, 3, 4};
        double expected = 3.0;

        // when
        for(int i : input)
        { systemUnderTest.add(i); }
        double actual = systemUnderTest.getMean();

        // then
        assertEquals(expected, actual, 0.0);
    }

}