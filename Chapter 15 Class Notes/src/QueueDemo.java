import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        // Create a print queue of strings (using a linked list)
        Queue<String> jobs = new LinkedList<>();

        // Add some print jobs
        jobs.add("Harry: Quarter 2 Expense Report");
        jobs.add("Connor: Recipe for Banana Bread");
        jobs.add("Katherine: Top Secret Document");

        System.out.println("Printing: "+jobs.remove());

        // Add some more print jobs
        jobs.add("Vardhan: Grocery List");
        jobs.add("Katherine: Really Top Secret Document");
        jobs.add("Katherine: Can I Get Fired For This?");

        System.out.println("Printing: "+jobs.remove());
        System.out.println("Printing: "+jobs.remove());

        jobs.add("Boss: Katherine Termination Letter");

        // Print the rest of the jobs in the queue
        /* int numJobs = jobs.size();
        for (int i=0; i < numJobs; i++) {
            System.out.println("Printing: "+jobs.remove());
        } */


        while (jobs.size() > 0) {
            System.out.println("Printing: "+jobs.remove());
        }


    }
}
