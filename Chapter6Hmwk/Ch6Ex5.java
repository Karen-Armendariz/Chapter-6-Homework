/**
 * @class: Ch6Ex5
 * @author: Karen Armendariz
 * @version: 1.0
 * @course: ITEC 2140, Section 13, Fall 2023
 * @written: November 1, 2023
 * @description: Created a new ArrayList named intersection that contained only those items that occur in both lists.
 * If a value was duplicated in either list and it occured in both lists, it would only occur once in the
 * intersection list.
 */
package Chapter6Hmwk;

import java.util.ArrayList;

public class Ch6Ex5
{
    public static void main (String[] args)
    {
        int[] list1 = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8, 9, 10};
        int[] list2 = {2, 4, 8, 10, 12, 14, 16, 18, 20};

        ArrayList<Integer>intersection = new ArrayList<>();      // ArrayList called intersection created.

        for(int n1 : list1)         //list1 with enhanced for loop to iterate thru list 1
        {
            for(int n2: list2)          //list2 with enhanced for loop to iterate thru list 2.
            {
                if(n1 == n2)                //n1 and n2 numbers are checked in list1 and list2. If equal, then continue.
                {
                    if(!intersection.contains(n1))           //check to see if intersection list DOES NOT contain the n1 number.
                    {                                       //if the n1 number is not found, then proceed - got help from husband on this one.
                        intersection.add(n1);            //the n1 number is added to the intersection list.
                        break;                          //break used to exit loop to prevent multiples of the same number.
                    }
                }
            }
        }
        System.out.print("intersection = ");            //prints    intersection =

        for(int number : intersection)                  //enhanced loop iterates thru the intersection list.
        {                                               // number holds the current value.
            System.out.print(number + " ");             //prints the value of the current number held in number.
        }
    }
}
