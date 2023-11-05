/**
 * @class: Ch6Ex6
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Using the given ArrayList, remove the 1900 date item, without removing
 * the associated centennials.add source line, Print the ArrayList.
 */
package Chapter6Hmwk;

import java.time.LocalDate;   //google helped with these import
import java.time.Month;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Ch6Ex6
{
    public static void main(String[] args)
    {
        ArrayList<LocalDate> centennials = new ArrayList<>();

        centennials.add(LocalDate.of(1776, Month.JULY, 4));
        centennials.add(LocalDate.of(1876, Month.JULY, 4));
        centennials.add(LocalDate.of(1900, Month.JULY, 4));
        centennials.add(LocalDate.of(1976, Month.JULY, 4));
        centennials.add(LocalDate.of(2076, Month.JULY, 4));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");  // from stackoverflow
                                                            //formats LocalDate object into format mm/dd/yyyy.

        System.out.println("Before removal: ");                 //print array list and size B4 removal of 1900.
        for(LocalDate date : centennials)
        {
            System.out.println(formatter.format(date));
        }
        System.out.println("Size = " + centennials.size());     //intelliJ method .size


        centennials.remove(LocalDate.of(1900, Month.JULY, 04)); //.remove will remove the specified date.
        System.out.println("After removal: "); //prints the array after the removal of specified date.
        for(LocalDate date: centennials)   //for loop runs through the ArrayList.
        {
            System.out.println(formatter.format(date));
        }
        System.out.println("Size = " + centennials.size());
    }
}
