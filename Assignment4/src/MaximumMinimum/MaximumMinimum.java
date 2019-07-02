//Cameron Collins

package MaximumMinimum;

public class MaximumMinimum
{
    public static void main(String[] args)
    {
        //multidimensional array with concrete type Integer
        Integer[] integerList = new Integer[] {1, 4, 3, 8, 5};

        //multidimensional array with concrete type Double
        Double[] doubleList = new Double[] {1.4, 7.4, 3.3, 6.8, 1.5};

        //displays the Integer list's maximum and minimum
        System.out.println("Integer list:");
        MinMax(integerList);
        System.out.println("");

        //displays the Double list's maximum and minimum
        System.out.println("Double list:");
        MinMax(doubleList);
    }

    public static <E extends Comparable<E>> void MinMax(E[] list)
    {
        E max = list[0];
        E min = list[0];

        //sorts through the list and compares the values and sets the max
        for (int i = 0; i < list.length; i++)
        {
           if (max.compareTo(list[i]) < 0)
           {
               max = list[i];
           }
        }

        //sorts through the list and compares the values and sets the min
        for (int i = 0; i < list.length; i++)
        {
            if (min.compareTo(list[i]) > 0)
            {
                min = list[i];
            }
        }

        System.out.println("The Maximum is:\t" + max + "\nThe Minimum is:\t" + min);
    }
}
