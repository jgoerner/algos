package algos.adt.stack;

/**
 * Abstract Data Type stack 
 * 
 * A stack is a last in first out (LIFO) queue
 * 
 * @param <T> generic type parameter of the entity to be store in the stack
 */
public interface Stack<T> extends Iterable<T>
{
    /**
     * Indicates if no item is in the stack
     * @return if stack is empty
     */
    public boolean isEmpty(); 

    /**
     * Shows how many items are in the stack
     * @return number of items in the stack
     */
    public int getSize();

    /**
     * Push an item on top of the bag
     * 
     * @param item the item to be pushed
     */
    public void push(T item);

    /**
     * Pops the upmost item from the stack
     * @return top item of the stack
     */
    public T pop();
}