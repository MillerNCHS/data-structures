/**
 *   A program that demonstrates the LinkedList class
 */
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList students = new LinkedList();

        students.addFirst("Ben");
        students.addFirst("Emily");
        students.addFirst("Ethan");
        students.addFirst("Noah");

        System.out.println(students);

    }
}
