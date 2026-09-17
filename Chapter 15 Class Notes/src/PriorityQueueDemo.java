import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        // Create a priority queue of strings
        // a priority queue MUST be composed of Comparable objects
        Queue<String> students = new PriorityQueue<>();
        students.add("Shiva");
        students.add("Claire");
        students.add("Ludovic");
        students.add("Manny");
        students.add("Ethan");
        students.add("Davin");

        // The next highest priority object is moved to the front of the queue
        // when the head of the queue is removed
        while (students.size() > 0) {
            System.out.println(students.remove());
        }
    }
}
