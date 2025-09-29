import java.util.NoSuchElementException;

/**
    A linked list is a sequence of nodes with efficient
    element insertion and removal. This class 
    contains a subset of the methods of the standard
    java.util.LinkedList class.
*/
public class LinkedList
{
    private Node first;

    private Node last;
    private int lastIndex;

    /** 
        Constructs an empty linked list.
    */
    public LinkedList()
    {
        first = null;
        last = null;
        lastIndex = -1;
    }

    /**
        Computes the size of the linked list
        @return the number of elements in the list
    */
    public int size()
    {
       // ...
    }

    /**
        Checks if this linked list contains the given object.
        @param obj The object to be checked for.
        @return If the object exists in the list.
    */
    public boolean contains(Object obj)
    {
        // ...
    }

    /**
        Returns the first element in the linked list.
        @return the first element in the linked list
    */
    public Object getFirst()
    {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    /**
        Removes the first element in the linked list.
        @return the removed element
    */
    public Object removeFirst()
    {
        if (first == null)
            throw new NoSuchElementException();
        Object element = first.data;
        first = first.next;
        // clear old cached data
        last = null;
        lastIndex = -1;
        // return removed element
        return element;
    }

    /**
        Adds an element to the front of the linked list.
        @param element the element to add
    */
    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        // clear old cached data
        last = null;
        lastIndex = -1;
    }

    /**
        Gets the object at the given index.
        @param n The index of the object.
        @return The object at the given index.
    */
    public Object get(int n)
    {
        if ((lastIndex == -1) || (lastIndex >= n))
        {
            last = getNode(first, n);
            lastIndex = n;
        }
        else
        {
            last = getNode(last, n - lastIndex);
            lastIndex = n;
        }
        return last.data;
    }

    /**
        Sets the object at the given index.
        @param n The index of the object to be set.
        @param newElement The object to set.
    */
    public void set(int n, Object newElement)
    {
        Node node = getNode(first, n);
        node.data = newElement;
    }

    /**
        Gets the node at the given index.
        @param start The start node to count from.
        @param distance The index of the object to get.
        @return The node at the given object.
    */
    private static Node getNode(Node start, int distance)
    {
        if ((distance <= 0) || (start == null))
            return start;
        return getNode(start.next, distance - 1);
    }

    /**
        Returns an iterator for iterating through this list.
        @return an iterator for iterating through this list
    */
    public ListIterator listIterator()
    {
        return new LinkedListIterator();
    }

    private class Node
    {
        public Object data;
        public Node next;
    }

    private class LinkedListIterator implements ListIterator
    {
        private Node position;
        private Node previous;

        /**
            Constructs an iterator that points to the front
            of the linked list.
        */
        public LinkedListIterator()
        {
            position = null;
            previous = null;
        }

        /**
            Moves the iterator past the next element.
            @return the traversed element
        */
        public Object next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            previous = position; // Remember for remove

            if (position == null)
                position = first;
            else
                position = position.next;

            return position.data;
        }

        /**
            Tests if there is an element after the iterator 
            position.
            @return true if there is an element after the iterator 
            position
        */
        public boolean hasNext()
        {
            if (position == null)
                return first != null;
            else
                return position.next != null;
        }

        /**
            Adds an element before the iterator position
            and moves the iterator past the inserted element.
            @param element the element to add
        */
        public void add(Object element)
        {
            if (position == null)
            {
                addFirst(element);
                position = first;
            }
            else
            {
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
                currentSize++;
            }
            previous = position;
        }

        /**
            Removes the last traversed element. This method may
            only be called after a call to the next() method.
        */
        public void remove()
        {
            if (previous == position)
                throw new IllegalStateException();

            if (position == first)
            {
                removeFirst();
            }
            else
            {
                previous.next = position.next;
                currentSize--;
            }
            position = previous;
        }

        /**
            Sets the last traversed element to a different 
            value. 
            @param element the element to set
        */
        public void set(Object element)
        {
            if (position == null)
                throw new NoSuchElementException();
            position.data = element;
        }
    }
}
