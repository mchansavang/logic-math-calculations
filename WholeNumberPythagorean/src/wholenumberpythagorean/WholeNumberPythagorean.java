/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wholenumberpythagorean;

/**
 *
 * @author user
 */
public class WholeNumberPythagorean {
    
    public static void main(String[] args) {
        
        wholeNumberPythagoreanValues();
        
//        int testArr[][] = new ArrayList;
        
//        testArr.
        
    }
    
    public static int[][] wholeNumberPythagoreanValues() {
        
        // TOMORROW: make a dynamic 2D array where you can keep adding more values as more whole number pythagorean values are added
        double hypotenuse;
        int arr[][] = new int[100][100];
        
        // Try every number with every number
        for (int legA = 1; legA <= 1000; legA++)
        {
            for(int legB = 1; legB <= 1000; legB++) {
                // Calculate the hypotenuse value given an a value and a b value
                hypotenuse = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2)); // c = sqrt(a squared plus b squared)
                
                // See if the hypotenuse is a whole number of not. If it is, then add it to the array, but if not, then
                if (hypotenuse == (int) hypotenuse)
                {
                    System.out.println(legA + " and " + legB + " are...you know what!");
                }
            }
        }
        
        return arr;
    }
    
}
