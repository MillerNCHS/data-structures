import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


/**
 * A test program to reverse the entries in a linked list.
*/
public class ReverseTester
{
    public static void main(String[] args)
    {
        LinkedList<String> employeeNames = new LinkedList<>();
        employeeNames.addLast("Dick");
        employeeNames.addLast("Harry");
        employeeNames.addLast("Romeo");
        employeeNames.addLast("Tom");

        ListUtil.reverse(employeeNames);
        System.out.println(employeeNames);
        System.out.println("Expected: [Tom, Romeo, Harry, Dick]");
    }
}