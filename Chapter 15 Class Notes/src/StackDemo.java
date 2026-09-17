import java.util.Stack;

/**
 * This program simulates an undo stack. Note that operations
 * must be undone in the opposite order in which they are first
 * issued.
*/
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<String> commands = new Stack<>();

        // Push the commands entered onto the stack
        commands.push("Insert: 'Hello'");
        commands.push("Insert: ','");
        commands.push("Insert: ' '");
        commands.push("Insert: 'World'");
        commands.push("Insert: '?'");
        commands.push("Delete: '?'");
        commands.push("Insert: '!'");

        // Print the stack, the top of the stack is on the right
        System.out.println(commands);

        // Simulate the user pressing undo 4 times
        for (int i=0; i<4; i++) {
            System.out.println("Undo "+commands.pop());
        }

        // Confirm 4 commands have been removed
        System.out.println(commands);
    }
}
