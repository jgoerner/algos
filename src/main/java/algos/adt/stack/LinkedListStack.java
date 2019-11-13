package algos.adt.stack;

import java.util.Iterator;

/**
 * Implementation of the stack interafce utilizing linked lists
 * 
 * @param <T> generic type parameter of the entity to be store in the stack
 * @see algos.algos.adt.stack.Stack
 */
public class LinkedListStack<T> implements Stack<T> {

    private int size;
    private Node top;

    public LinkedListStack()
    { 
        this.size = 0;
        this.top = null;
     }

    @Override
    public Iterator<T> iterator() 
    { return new LinkedListStackIterator(); }

    @Override
    public boolean isEmpty() 
    { return this.size == 0; }

    @Override
    public int getSize() 
    { return this.size; }

    @Override
    public void push(T item)
    { 
        Node oldTop = this.top;
        Node newTop = new Node();
        newTop.next = oldTop;
        newTop.item = item;
        top = newTop;
        this.size++;
    }

    @Override
    public T pop() 
    { 
        // check if any element is present on the stack
        if (this.isEmpty()) return null;

        // reconfigure the new top
        T result = this.top.item;
        this.top = this.top.next;
        this.size--;
        return result;
    }

    private class Node
    {
        Node next;
        T item;
    }

    private class LinkedListStackIterator implements Iterator<T>{

        Node current = top;

        @Override
        public boolean hasNext() 
        { return current != null; }

        @Override
        public T next() {
            T result = current.item;
            current = current.next;
            return result;
        }

    }

}