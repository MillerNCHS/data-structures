import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        /* the addLast method can be used to populate a list */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Steve");

        System.out.println(staff);

        //The list is currently: TNPS

        /*
         * The listIterator method creates a new list iterator that is positioned at the head of the list.
         * The | is used to represent the iterator position
         */
        ListIterator<String> iterator = staff.listIterator(); // |TNPS iterator is right before the linkedlist

        /* The next method advances the iterator OVER the next element in the list. */
        iterator.next(); // T| NPS
        /* The next method also returns the element that the iterator passes over. */
        String  avenger = iterator.next();
        System.out.println(avenger); //should print natasha
        }
}
