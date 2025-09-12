import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * A program to add, remove, modify or print
 * student names and grades.
*/
public class Gradebook
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, String> gradebook = new HashMap<>();
      //Set<String> keys = gradebook.keySet();
       

        boolean done = false;
        while(!done)
        {
            System.out.println("A)dd R)emove M)odify P)rint Q)uit");
        
            String input = in.next().toUpperCase();
            if (input.equals("Q"))
            {
                done = true;
            } else if (input.equals("A"))
            {
                String name = in.next();
                String grade = in.next();
                gradebook.put(name, grade);

            } else if (input.equals("R"))
            {
                String name = in.next();

                Set<String> keys = gradebook.keySet();
                 for (String key: keys) {
                    if (key==name){
                        gradebook.remove(key);}
            }}else if (input.equals("M"))
            {
                String name = in.next();
                String grade = in.next();

                Set<String> list=gradebook.keySet();
                for (String key: list){
                    if (key.equals(name)){
                        gradebook.put(name, grade);

            }else if (input.equalsIgnoreCase("P"))
            {
                Set<String> x = gradebook.keySet();
                 for (String i: x) {
                    System.out.println(i + ": "+gradebook.get(i));
        }
            } else
            {
                done = true;
            }
        }
    }
        }}}
