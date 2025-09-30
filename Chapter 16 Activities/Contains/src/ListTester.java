/**
    A tester program for the get and set functions of the LinkedList class.
*/
public class ListTester
{
    public static void main(String[] args)
    {
        LinkedList names = new LinkedList();

        System.out.print((names.contains("Zack") ? "true" : "false"));
        System.out.println();
        System.out.println("Expected: false");

        names.addFirst("Tom");
        names.addFirst("Romeo");
        names.addFirst("Harry");
        names.addFirst("Dick");

        System.out.print((names.contains("Zack") ? "true" : "false"));
        System.out.println();
        System.out.println("Expected: false");

        System.out.print((names.contains("Harry") ? "true" : "false"));
        System.out.println();
        System.out.println("Expected: true");

        System.out.print((names.contains("Tom") ? "true" : "false"));
        System.out.println();
        System.out.println("Expected: true");
    }
}
