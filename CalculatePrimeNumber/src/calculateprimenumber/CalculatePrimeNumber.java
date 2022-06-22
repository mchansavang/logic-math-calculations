package calculateprimenumber;

import java.util.ArrayList;
import java.util.Collections;

// Testing testing testing again

public class CalculatePrimeNumber
{
    
    public static void main(String[] args)
    {
        System.out.println(primeNumbers(10000));
    }
    
    public static ArrayList<Integer> primeNumbers(int max)
    {
        // Create an array to store the prime numbers (PNL)
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        
        // Start off by adding the single digit prime numbers to the PNL
        Collections.addAll(primeNumbers, 1, 2, 3, 5, 7);
        
        // Loop through all odd numbers greater than 10 and that don't end in 5 (because those are all not prime numbers), and see if they are divisible by all previously stored prime numbers
        int factors;
        for (int x = 11; x <= max; x+=2)
        {
            // Test if number doesn't end in 5
            if (x % 5 != 0)
            {
                // Test if number is divisble by any of the previously stored prime numbers
                // First, calculate how many prime number factors the number has
                factors = 0;
                for (int y : primeNumbers)
                {
                    if (x % y != 0)
                    {
//                        System.out.println(x + " is not divisible by " + y);
                    }
                    else
                    {
//                        System.out.println(x + " is divisible by " + y);
                        factors++;
                    }
//                    System.out.println(x + " has " + factors + " factors");
                }
                
                // Second, having calculated how many prime number factors the number has, if it has one or more prime number factors, then it is not a prime number, but if it has exactly two factors (itself and 1), then it is a prime number
                if (factors == 1)
                {
                    // Number is a prime number
//                    System.out.println(x + " is a prime number!");
                    primeNumbers.add(x);
                }
                else
                {
                    // Not a prime number
//                    System.out.println(x + " is not a prime number");
                }
            }
            else
            {
                // Not a prime number
            }
        }
        
        return primeNumbers;
    }
    
}
