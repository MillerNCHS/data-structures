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

        //create a priority queue of strings
        //a priority needs to be composed of comparable objects

        Queue<String> students = new PriorityQueue<>();
        students.add("Neel");
        students.add("Jonathan");
        students.add("Cam");
        students.add("Kaitlyn");
        students.add("Dylan");

        // the next highest priorty object is moved to the front of the queue
        //when the head of the queue is removed
        while(students.size()>0){
            System.out.println(students.remove());
        }

        //create a to-do lis
        //the workorder class has a priority and description
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        //lower priority is more important
        toDo.add(new WorkOrder(3,"Water Plants"));
        toDo.add(new WorkOrder(2,"Make Dinner"));
        toDo.add(new WorkOrder(1,"Conquer World"));
        toDo.add(new WorkOrder(9,"Play Videogames"));
        toDo.add(new WorkOrder(1,"Study for the test"));

        //objects are NOT stored in priority order
        System.out.println(toDo);

        //objects will be removed in priority order
        while(toDo.size()>0){
            System.out.println(toDo.remove());
        }


}}
