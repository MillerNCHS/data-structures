import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
            The Map interface is generic.
            The first type is the key.
            The second type is the value.
        */
        Map<String, Color> favColors = new HashMap<>();

        // Add elements to the map using the put method
        favColors.put("Jason", Color.BLUE);
        favColors.put("Emily", Color.RED);
        favColors.put("Evan", Color.GREEN);
        favColors.put("Ugh", Color.PINK);
        favColors.put("VII", Color.CYAN);
        System.out.println("Ugh".equals("VII"));

        // Two different elements can have the same value
        favColors.put("Ethan", Color.GREEN);

        // The same key CANNOT have two different values
        // Using put on a key that already exists, changes the value
        favColors.put("Emily", Color.ORANGE);

        // Create a set of the keys is the map
        Set<String> keys = favColors.keySet();
        for (String key: keys) {
            // [name] ([hashCode]) : [color]
            System.out.println(key + "(" + key.hashCode() +")" + favColors.get(key));
        }
    }
}
