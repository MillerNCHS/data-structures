/*
 * Shriya Kunnanath
 * 8/29/2025
 * Software Engineering 1
 * Reverse List Program
 */

import java.util.ArrayList;
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
        //made a list iterator and arraylist to set up the reversed list and an iterator to go through the linkedlist
        ListIterator<String> iterator = strings.listIterator();
        ArrayList<String> tempList = new ArrayList<>(); 

        //the while loop goes through the list
        while(iterator.hasNext()){
            iterator.next();

            //the first value is added to templist and then removed from the original linkedlist
            tempList.add(0, strings.getFirst());
            iterator.remove();
        }
        //all the content from tempList is transfered into the empty strings linkedlist
        strings.addAll(tempList);
    }
}