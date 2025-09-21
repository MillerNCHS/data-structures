import java.util.Stack;
import java.util.Scanner;

/**
 * Class for simulating a driveway and a street, using stacks
 * of cars with license plate numbers as representation.
*/
public class Driveway
{
    /**
      * Stack representing the cars in the driveway.
    */

    private Stack<Integer> driveway;
    /**
      * Stack representing the cars in the street.
    */
    
    private Stack<Integer> street;

    /**
      * Constructor.
    */
    public Driveway()
    {
        driveway = new Stack<>();
        street= new Stack<>();


    }

    /**
      * Add the given license plate to the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void add(int licensePlate)
    {
        // Complete this method
        driveway.push(licensePlate);


    }

    /**
      * Remove the given license plate from the driveway.
      *
      * @param licensePlate number of license plate.
    */
    public void remove(int licensePlate)
    {
        // Complete this method
        while (!driveway.isEmpty() && driveway.peek() != licensePlate) {
            int car = driveway.pop();
            street.push(car);}

        if (!driveway.isEmpty() && driveway.peek() == licensePlate) {
            driveway.pop();}
        

//after a car is taken out, the ones on the street are always returned to the driveway
        while (!street.isEmpty()) {
            int car = street.pop();
            driveway.push(car);}}
    /**
      * Prints the driveway and street details to the screen.
    */
    public void print()
{
    System.out.println("In Driveway, starting at first in (one license plate per line):");
    for (int car : driveway) {
        System.out.println(car);
    }

    System.out.println("In Street, starting at first in (one license plate per line):");
    for (int car : street) {
        System.out.println(car);
    }
}

}
