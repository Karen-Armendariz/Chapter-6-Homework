
/**
 * @class: Ch6Ex4
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Created an ArrayList of Integers named dice4. Generated an Integer representing a roll of a six-sided
 * die 5 times, adding each result to dice4. Printed the ArrayList using an enhanced for loop.
 */
package Chapter6Hmwk;

import java.util.ArrayList;                             // ArrayList class imported to generate array.
import java.util.Random;                                //Random class imported to generate random number.

public class Ch6Ex4
{
    public static void main(String[] args)                //main method, array of strings as input.
    {
        ArrayList<Integer> dice4 = new ArrayList<>();     //dice4 is declared with integer object.
        Random rn = new Random();                         // rn is created as object of Random class

        for(int i = 0; i < 5; i++)                      // for loop iterates 5 times (like 5 rolls of the dice).
        {
            int dRoll = rn.nextInt(6) + 1;          // random number generated between 1 and 6 (inclusive bc of +1)
            // dRoll value stores the result.
            dice4.add(dRoll);                            // dRoll value is added to dice4 ArrayList.
        }
        System.out.print("dice4 = ");                   //dice 4 =      is printed.

        for(int num: dice4)                           //enhanced for loop, num holds the current number, the loop
        {                                            // iterates through the numbers.
            System.out.print(num + " ");               // prints the current value of num with a space
        }
    }
}
