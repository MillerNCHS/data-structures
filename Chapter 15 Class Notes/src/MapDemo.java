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
        /* The Map interface is generic.
         * The first type given is the key.
         * The second type given is the value.
         */
        Map<String, Color> favColors = new HashMap<>();

        // Add elements to the map using the put method
        favColors.put("Sreeram", Color.GREEN);
        favColors.put("Cam", Color.BLUE);
        favColors.put("Nimai", Color.RED);

        // Two different elements with the same value
        favColors.put("Kaitlyn", Color.GREEN);

        // The same key CANNOT have two different values
        // Using put on a key that exists, changes the value
        favColors.put("Cam", Color.ORANGE);

        // Create a set of the keys in a map
        Set<String> keys = favColors.keySet();
        for (String key: keys) {
            // [name] ([hasCode]): [color]
            System.out.println(key + "("+key.hashCode()+"): "+favColors.get(key));
        }

    }
}
