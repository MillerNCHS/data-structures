/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList students = new LinkedList();

        students.addFirst("Cam");
        students.addFirst("Conner");
        students.addFirst("Catherine");
        students.addFirst("Jonathan");

        System.out.println(students);
    }
}
