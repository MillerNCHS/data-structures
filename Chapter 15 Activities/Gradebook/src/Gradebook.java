
/**
 * Shriya Kunnanath
 * 9/14/25
 * gradebook program
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Gradebook {
    public static void main(String[] args) {
        // Create scanner and gradebook map
        Scanner in = new Scanner(System.in);
        Map<String, String> gradebook = new HashMap<>();

        // Loop until user chooses to quit
        boolean done = false;

        while (!done) {
            // Prompt for user action
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
            String input = in.next().toUpperCase();

            // Quit the program
            if (input.equals("Q")) {
                done = true;

            // Add a student and their grade
            } else if (input.equals("A")) {
                String name = in.next();
                String grade = in.next();
                gradebook.put(name, grade);

            // Remove a student
            } else if (input.equals("R")) {
                String name = in.next();
                if (gradebook.containsKey(name)) {
                    gradebook.remove(name);
                } 

            // Modify a student's grade
            } else if (input.equals("M")) {
                String name = in.next();
                if (gradebook.containsKey(name)) {
                    String grade = in.next();
                    gradebook.put(name, grade);
                } 

            // Print all students and grades in alphabetical order
            } else if (input.equals("P")) {
                System.out.println();
                List<String> names = new ArrayList<>(gradebook.keySet());
                Collections.sort(names);

                for (String name : names) {
                    System.out.println(name + ": " + gradebook.get(name));
                }
                System.out.println();

            } else {
                done = true;
            }
        }
    }
}
