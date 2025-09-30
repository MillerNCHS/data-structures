import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * Shriya Kunnanath
 * 9/8/25
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();
        

        Set<Integer> prime = new HashSet<>();
        for (int i=2; i<= n; i++){
            prime.add(i);
        }

        //made an arraylist that has the numbers in the range from the original value of n
        ArrayList<Integer> numbers = new ArrayList<>(prime);

        // Loop through numbers starting from 2 up to the square root of n
        for (int i = 2; i * i <= n; i++) {

            // Only proceed if 'i' is still in the set 
            if (prime.contains(i)) {

                // Loop through all multiples of 'i' starting from i*2 up to n
                for (int j = i * 2; j <= n; j += i) {

                    // Remove 'j' from the set since it's a multiple of 'i' and not a prime
                    prime.remove(j);
                }
    }
}

         //print prime numbers
        numbers = new ArrayList<>(prime);
        numbers.sort(null); // sort the list
        System.out.println(numbers);
        System.out.println(prime);
    }
}
