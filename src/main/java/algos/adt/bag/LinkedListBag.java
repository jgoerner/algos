package algos.adt.bag;

import java.util.Iterator;

/**
 * Implementation of the bag interafce utilizing linked lists
 * 
 * @param <T> generic type parameter of the entity to be store in the bag
 * @see algos.algos.adt.bag.Bag
 */
public class LinkedListBag<T> implements Bag<T> 
{
    private int size;
    private Node first;

    public LinkedListBag()
    { 
        this.size = 0; 
        this.first = null;
    }

    @Override
    public Iterator<T> iterator() 
    { return new LinkedListBagIterator(); }

    @Override
    public void add(T item) 
    {
        Node oldFirst = this.first;
        Node newFirst = new Node();
        newFirst.item = item;
        newFirst.next = oldFirst;
        this.first = newFirst; 
        this.size++; 
    }

    @Override
    public int getSize() 
    { return this.size; }

    @Override
    public boolean isEmpty() 
    { return this.size == 0; }

    private class Node 
    {
        Node next;
        T item;
    }

    private class LinkedListBagIterator implements Iterator<T>
    {
        private Node current = first;

        @Override
        public boolean hasNext() 
        { return current != null; }

        @Override
        public T next() 
        {
            T result = current.item;
            current = current.next;
            return result;
        }
        
    }
}