/**
 * @class: Ch6Ex1
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Created an integer array named dice1 with a size of 10.
 * Populated each array location with a roll of a six-sided die.
 * Printed the array out using an enhanced for loop.
 */

package Chapter6Hmwk;

import java.util.Random;         //Random class imported to get random numbers.

public class Ch6Ex1
{
    public static void main(String[] args) // main method, executed when run program.
    {
        int[] dice1 = new int[10]; //dice1 integer array named, size is 10.
        Random rn = new Random(); // rn instance created, of class Random.


        for(int i = 0; i < dice1.length; i++) //for loop starts at 0, runs through 10.
        {
            dice1[i] = rn.nextInt(6) + 1; // random number generated between 1 and 6 (inclusive bc of +1)
        }
        System.out.print("dice1 = "); //dice1 =    is printed

        for(int num : dice1)    // the value of the dice is stored in the num variable during each iteration
        {                       //using an enhanced for loop
            System.out.print(num + " "); //num is printed, a space is left in between each new num number.
        }
    }           //RandomValue.java and ArraysDemo.java and Programming Fundamentals text used to help with creating
}               //this code.
