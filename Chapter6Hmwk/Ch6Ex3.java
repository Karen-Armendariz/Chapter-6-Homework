/**
 * @class: Ch6Ex3
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Creatd an ArrayList of Integers named dice3. Generated an Integer representing a roll of a six-sided
 * die 10 times, adding each result to dice3.
 * Printed the ArrayList using an enhanced for loop.
 */

package Chapter6Hmwk;

import java.util.ArrayList;                             // ArrayList class imported to generate array.
import java.util.Random;                                //Random class imported to generate random number.

public class Ch6Ex3
{
    public static void main(String[] args)                //main method, array of strings as input.
    {
        ArrayList<Integer> dice3 = new ArrayList<>();     //dice3 is declared with integer object.
        Random rn = new Random();                         // rn is created as object of Random class

        for(int i = 0; i < 10; i++)                      // for loop iterates 10 times (like 10 rolls of the dice).
        {
            int dRoll = rn.nextInt(6) + 1;          // random number generated between 1 and 6 (inclusive bc of +1)
                                                           // dRoll value stores the result.
            dice3.add(dRoll);                            // dRoll value is added to dice3 ArrayList.
        }
        System.out.print("dice3 = ");                   //dice 3 =      is printed.

        for(int num: dice3)                          //enhanced for loop, num holds the current number, the loop
        {                                           // iterates through the numbers.
            System.out.print(num + " ");               // prints the current value of num with a space
        }
    }
}
