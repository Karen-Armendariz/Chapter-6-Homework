/**
 * @class: Ch6Ex7
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Given an ArrayList, this code will determine the ArrayList size.
 */
package Chapter6Hmwk;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;


public class Ch6Ex7
{
    public static void main (String[] args)
    {
        ArrayList<LocalDate> centennials = new ArrayList<>();
        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        System.out.println("Size = " + centennials.size());  // prints the size of the list using .size.
    }
}
