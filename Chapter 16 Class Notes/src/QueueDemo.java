public class QueueDemo
{
    public static void main(String[] args)
    {
        
        CircularArrayQueue queue = new CircularArrayQueue();

        queue.add("Tom");
        queue.add("Diana");
        queue.add("Harry");
        queue.add("sam");
        System.out.println(queue.remove()); // remove Tom
        queue.add("Romeo");
        System.out.println(queue.remove()); // remove Diana
        queue.add("Juliet");
        queue.add("Maria");

        while(!queue.empty())
        {
            System.out.println(queue.remove());
        }
        
        System.out.println("Expected output: Tom, Diana, Harry, Romeo, Juliet, Maria");
        
    }
}
