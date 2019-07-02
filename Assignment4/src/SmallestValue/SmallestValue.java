//Cameron Collins

package SmallestValue;

import java.util.Scanner;

public class SmallestValue
{
    public static void main(String[] args)
    {
        Scanner scan         = new Scanner(System.in);
        int[] listOfIntegers = new int[10];

        System.out.println("Enter 10 integers:\n");

        //add values to array
        for (int i = 0; i < listOfIntegers.length; i++)
        {
            listOfIntegers[i] = scan.nextInt();
        }

        System.out.println("The smallest value of the list is:\t" + smallestValue(listOfIntegers)); //displays the smallest value in the array
    }

    //sorts through the array comparing values and setting the minimum as the smallest number
    public static int smallestValue(int[] listOfIntegers)
    {
        int smallestNumber = listOfIntegers[0];

        for (int i = 0; i < listOfIntegers.length; i++)
        {
            if (listOfIntegers[i] < smallestNumber)
            {
                smallestNumber = listOfIntegers[i];
            }
        }

        return smallestNumber;
    }
}
