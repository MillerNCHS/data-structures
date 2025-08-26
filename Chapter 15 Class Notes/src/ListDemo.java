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
        /* The addLast method can be used to populate a list. */
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("Tony");
        staff.addLast("Natasha");
        staff.addLast("Peter");
        staff.addLast("Steve");

        System.out.println(staff);

        // The list is currently: TNPS
        /*
         * The listIterator method creates a new list iterator
         * that is positioned at the head of the list.
         * The | is used to represent the iterator position.
         */
        ListIterator<String> iterator = staff.listIterator(); // |TNPS

        /* The next method advances the iterator OVER the next element in the list.
         */
        iterator.next(); // T|NPS

        /* The next method also returns the element that the iterator passes over. */
        String avenger = iterator.next(); // TN|PS
        System.out.println(avenger); // Should print Natasha

        /* The add method inserts an element at the iterator position.
         * The iterator is then positioned AFTER the element that was added.
         */
        iterator.add("Clint"); // TNC|PS
        iterator.add("Bruce"); // TNCB|PS
        System.out.println(staff);

        /* The remove method can ONLY be called after calling next or previous. */
        // iterator.remove(); This line would cause an IllegalStateException
        // The remove method removes the element returned after calling next or previous
        iterator.next(); // TNCBP|S
        iterator.remove(); // Peter is removed -> TNCB|S
        System.out.println(staff);

        /* The set method updates the element returned by
         * the last call to next or previous.
         */
        iterator.previous(); // TNC|BS
        iterator.set("Thor"); // Bruce is replaced by Thor -> TNC|TS
        System.out.println(staff);

        /* The hasNext method is used to determine if there is a next node
         * after the iterator. The hasNext is often used in the condition
         * of a while loop.
         */
        iterator = staff.listIterator(); // |TNCTS
        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Natasha")) { // TN|CTS
                iterator.remove(); // T|CTS
            }
        } // TCTS|

        /* Enhanced for loops work with linked lists */
        for (String n: staff) {
            System.out.print(n + " ");
        }
        System.out.println();

        /* ConcurrentModificiationException
         * 
         * CANNOT modify a linked list while using an iterator
         * UNLESS you use the iterator to do the modification.
         */
        iterator = staff.listIterator(); // |TCTS
        while (iterator.hasNext()) {
            String n = iterator.next();
            if (n.equals("Tony")) {
               // staff.remove("Tony"); ConcurrentModificationException
            }
        }

        /* The enhanced for loop AUTOMATICALLY creates an iterator.
         * You CANNOT add or remove when using an enhanced for loop.
         */
        for (String n: staff) {
            if (n.equals("Tony")) {
                // staff.add("T'Challa"); ConcurrentModificationException
            }
        }

        System.out.println(staff);

    }
}
