import java.util.LinkedList;
import java.util.PriorityQueue;
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
        jobs.add("Jason: Quarter 2 Expense Report");
        jobs.add("Evan: Recipe for Banana Bread");
        jobs.add("Emily: Top Secret Document");

        System.out.println("Printing: "+jobs.remove()); // Prints Jason's expense report

        // Add some more print jobs
        jobs.add("Noah: Grocery List");
        jobs.add("Emily: Really Top Secret Document");
        jobs.add("Emily: Can I Get Fired for This?");

        System.out.println("Printing: "+jobs.remove()); // Prints Evan's recipe
        System.out.println("Printing: "+jobs.remove()); // Prints Emily's Top Secret Document
    
        jobs.add("Boss: Emily's Termination Letter");

        // Print the rest of the jobs in the queue

            // Using a for loop
            int numJobs = jobs.size();
            for (int i=0; i < numJobs; i++) {
                System.out.println("Printing: "+ jobs.remove());
            }

            // Using a while loop
            while (jobs.size() > 0) {
                System.out.println("Printing: "+ jobs.remove());
            }

            // Create a to-do list
            // The WorkOrder class has an int priority and a string description
            Queue<WorkOrder> toDo = new PriorityQueue<>();

            // Lower priority is considered more important
            toDo.add(new WorkOrder(3, "Water Plants"));
            toDo.add(new WorkOrder(2, "Make Dinner"));
            toDo.add(new WorkOrder(1, "Conquer World"));
            toDo.add(new WorkOrder(9, "Play Videogames"));
            toDo.add(new WorkOrder(1, "Study for the Ch. 15 Test"));

            // Objects are NOT stored in priority order
            System.out.println(toDo);

            // Objects will be removed in priority order
            while (toDo.size() > 0) {
                System.out.println(toDo.remove());
            }
    }

}
