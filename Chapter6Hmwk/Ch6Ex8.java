/**
 * @class: Ch6Ex8
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Given an ArrayList,  the code determined if the centennial (1876, at 100 years) was present.
 */
package Chapter6Hmwk;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Ch6Ex8
{
    public static void main(String[] args)
    {
        ArrayList<LocalDate> centennials = new ArrayList<>();               //ArrayList called centennials is created.
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        boolean centennialPresent = false;      //boolean variable initialized to false.

        for(LocalDate date : centennials) // for loop starts iterating thru the ArrayList.
        {
            if(date.equals(LocalDate.of(1876, Month.JULY, 4))) // checks if the date in the ArrayList is this date.
            {
               centennialPresent = true;  //when the ArrayList date is the specified date, returns true.
               break; // exit loop when date is found, no further iterations are needed.
            }
        }
        System.out.println("Centennial present = " + centennialPresent); // prints true if the date is found.  false if not found.
    }
}
