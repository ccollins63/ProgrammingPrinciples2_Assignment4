//Cameron Collins

package RemoveDuplicates;

import java.util.ArrayList;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        //Array List of concrete type Integer
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(2);
        integerList.add(3);
        integerList.add(2);

        //Array List of concrete type String
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Dog");
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Fish");
        stringList.add("Bunny");
        stringList.add("Fish");

        //Displays before and after of Integer Array List
        System.out.println("Integer list before method:\t" + integerList);
        System.out.println("Integer list after method:\t" + removeDuplicates(integerList));

        //Displays before and after of Double Array List
        System.out.println("String list before method:\t" + stringList);
        System.out.println("String list after method:\t" + removeDuplicates(stringList));
    }

    //Creates a second Array List to add elements from the original list once then returns the list
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> list2 = new ArrayList<E>();

        for (E elem : list)
        {
            if (!list2.contains(elem))
            {
                list2.add(elem);
            }
        }

        return list2;

    }
}
