package algos.examples;

import algos.adt.bag.Bag;
import algos.adt.bag.LinkedListBag;

/**
 * Class to calcualte the mean of items
 * 
 * Internally a algos.algos.adt.bag.Bag is utilized to collect the items
 */
public class Mean
{
    private Bag<Double> numbers;

    public Mean()
    { this.numbers = new LinkedListBag<Double>(); }

    public void add(int i)
    { this.numbers.add(Double.valueOf(i));}

    public double getMean()
    { 
        // prevent division by 0
        if (this.numbers.getSize() == 0) 
        { return 0; }

        // sum up the numbers
        double sum = 0;
        for(Double d : this.numbers)
        { sum += d; }

        // return mean
        return sum / this.numbers.getSize(); 
    }
}