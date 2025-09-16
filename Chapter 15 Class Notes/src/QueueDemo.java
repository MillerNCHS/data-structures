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
        // create a print queue of strings using a linkedlist
        Queue<String> jobs = new LinkedList<>();

        //add some print jobs
        jobs.add("Harry: Quarter 2 Expense Report");
        jobs.add("Conner: Recipe for banana bread");
        jobs.add("Katherine: Top secret document");

        System.out.println("Printing: "+jobs.remove());

        //add some more print jobs
        jobs.add("Vardhan: Grocery List");
        jobs.add("Katherine: Really top secret document");
        jobs.add("Katherine: Can I get fired for this?");

        System.out.println("Printing: "+jobs.remove());
        System.out.println("Printing: "+jobs.remove());

        jobs.add("Boss: Katherine Termination Letter");

        //print the rest of the jobs in the queue
       /* 
       int numjobs = jobs.size();
        for(int i=0;i<numjobs;i++){
            System.out.println("Printing: "+jobs.remove());
        }*/

        for (String job: jobs){

        }


        while(jobs.size()>0){
            System.out.println("Printing" +jobs.remove());
        }
    }
}
