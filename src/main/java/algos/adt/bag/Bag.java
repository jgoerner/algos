package algos.adt.bag;

/**
 * Abstract Data Type Bag
 * 
 * A bag is a collection which one can add but not remove items
 * 
 * @param <T> generic type parameter of the entity to be store in the bag
 */
public interface Bag<T> extends Iterable<T> 
{
    /**
     * Add an item to the bag
     * 
     * @param item the item to be added
     */
    public void add(T item);

    /**
     * Shows how many items are in the bag
     * @return number of items in the bag
     */
    public int getSize();

    /**
     * Indicates if no item is in the bag
     * @return if bag is empty
     */
    public boolean isEmpty();
}