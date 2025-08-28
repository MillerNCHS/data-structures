import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        ListIterator<String> iterator = strings.listIterator();
        String end ="";
        iterator.next();
        while(iterator.hasNext()){
           // iterator.next();
            end = strings.getFirst();
            iterator.next();
            strings.add(end);
            //String temp =  iterator.next();
        }
        /* get last add and then add to teh current position with the iterator remove the previoous and move on to the next keep 
         * array list
         */
    }
}