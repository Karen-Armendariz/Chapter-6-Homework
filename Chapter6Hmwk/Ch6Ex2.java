/**
 * @class: Ch6Ex2
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Created an integer array named dice2 with a size of 6.
 * Populated each array location with a roll of a six-sided die.
 * Printed the array using an indexed for loop.
 */


package Chapter6Hmwk;

import java.util.Random;  //Random class imported to generate random number.

public class Ch6Ex2
{
    public static void main(String[] args) //main method, array of strings as input.
    {
        int[] dice2 = new int[6]; //dice2 integer array is declared, size is 6.
        Random rn = new Random(); // rn is created as object of Random class

        for(int i = 0; i < dice2.length; i++) // for loop iterates from 0 to 6.
        {
            dice2[i] = rn.nextInt(6) + 1;  // random number generated between 1 and 6 (inclusive bc of +1)
        }                                       // result stored in dice2 array, position at i.
        System.out.print("dice2 = "); // dice2 =   is printed

        for(int i = 0; i < dice2.length; i++) //indexed for loop, iterates thru dice2 array.
        {
            System.out.print(dice2[i] + " "); // prints the current indexed i value and space.
        }
    }
}
