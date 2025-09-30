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
    private int currentSize;

    private Node last;
    private int lastIndex;

    /** 
        Constructs an empty linked list.
    */
    public LinkedList()
    {
        first = null;
        currentSize = 0;
        last = null;
        lastIndex = -1;
    }

    /**
        Computes the size of the linked list
        @return the number of elements in the list
    */
    public int size()
    {
        return currentSize;
    }

    /**
        Checks if this linked list contains the given object (recursive version).
        @param obj The object to be checked for.
        @return true if the object exists in the list, false otherwise.
    */
    public boolean contains(Object obj)
    {
        return contains(first, obj);
    }


  /* CONTAINS METHOD WITHOUT ITERATOR
    public boolean contains(Object obj)
    {
        Node current = first;
        while (current != null)
        {
            if (obj == null && current.data == null) {
                return true;
            }
            if (obj != null && obj.equals(current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }*/



    /**
        Recursive helper method for contains.
        @param start The current node in the recursion.
        @param obj The object to search for.
        @return true if found, false otherwise.
    */
    private static boolean contains(Node start, Object obj)
    {
        if (start == null) {
            return false;
        }

        if (obj == null && start.data == null) {
            return true;
        }

        if (obj != null && obj.equals(start.data)) {
            return true;
        }

        return contains(start.next, obj);
    }

    public Object getFirst()
    {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    public Object removeFirst()
    {
        if (first == null)
            throw new NoSuchElementException();
        Object element = first.data;
        first = first.next;
        currentSize--;
        last = null;
        lastIndex = -1;
        return element;
    }

    public void addFirst(Object element)
    {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
        currentSize++;
        last = null;
        lastIndex = -1;
    }

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

    public void set(int n, Object newElement)
    {
        Node node = getNode(first, n);
        node.data = newElement;
    }

    private static Node getNode(Node start, int distance)
    {
        if ((distance <= 0) || (start == null))
            return start;
        return getNode(start.next, distance - 1);
    }

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

        public LinkedListIterator()
        {
            position = null;
            previous = null;
        }

        public Object next()
        {
            if (!hasNext())
                throw new NoSuchElementException();
            previous = position;
            if (position == null)
                position = first;
            else
                position = position.next;
            return position.data;
        }

        public boolean hasNext()
        {
            if (position == null)
                return first != null;
            else
                return position.next != null;
        }

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

        public void set(Object element)
        {
            if (position == null)
                throw new NoSuchElementException();
            position.data = element;
        }
    }
}
