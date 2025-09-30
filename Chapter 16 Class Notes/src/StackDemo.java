public class StackDemo
{
    public static void main(String[] args)
    {
        
        LinkedListStack stack = new LinkedListStack();

        stack.push("Tom");
        stack.push("Diana");
        stack.push("Harry");

        while(!stack.empty())
        {
            System.out.println(stack.pop());
        }

        System.out.println("Expected: Harry Diana Tom");
        
    }
}
