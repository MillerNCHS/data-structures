import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a
 * map whose keys are word lengths and whose values
 * are comma-separated strings of words of the same length.
 * Then print out those strings, in increasing order by
 * the length of their entries.
 * Use the Java 8 merge() method from Java 8 Note 15.1.
 */
public class StringLengthMap2
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/StringLengthMap/src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

        Map<Integer,String> freq = new TreeMap<>();
            

            while (in.hasNext())
            {
                String word = clean(in.next());
                Integer len = word.length();
                 if (word.length() > 0) {

                    // Use merge to add or update the entry
                    freq.merge(len, word, (existing, newWord) -> existing + "," + newWord);}
                }
            
                // Update the map here
                // Use the Java 8 merge() method
                


            
                for (Integer len : freq.keySet()) {
                System.out.println(len + ": " + freq.get(len));
            }
            // Print the strings, in increasing order of their length
            // Use this format: 1: i, a, i
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
