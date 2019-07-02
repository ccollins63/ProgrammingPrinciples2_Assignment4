//Cameron Collins

package PrintDiagonal;

public class PrintDiagonal
{
    public static void main(String[] args)
    {
        //multidimensional array with concrete type Integer
        Integer[][] squareInteger = new Integer[][]
                {{1, 2, 3, 4, 5}, {2, 3, 4, 5, 1}, {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}};

        //multidimensional array with concrete type Double
        Double[][] squareDouble = new Double[][]
                {{1.1, 2.2, 3.3, 4.4, 5.5}, {2.2, 3.3, 4.4, 5.5, 1.1}, {3.3, 4.4, 5.5, 1.1, 2.2}, {4.4, 5.5, 1.1, 2.2, 3.3}, {5.5, 1.1, 2.2, 3.3, 4.4}};

        //displays the Integer array before the diagonal method
        System.out.println("Integer matrix before:");

        for (int i = 0; i < squareInteger.length; i++)
        {
            for (int j = 0; j < squareInteger[i].length; j++)
            {
                System.out.print(squareInteger[i][j] + " ");
            }

            System.out.println("");
        }

        System.out.println("");

        //displays the Integer array after the diagonal method
        System.out.println("Integer matrix after:");
        PrintDiagonal(squareInteger);
        System.out.println("");

        //displays the Double array before the diagonal method
        System.out.println("Double matrix before:");

        for (int i = 0; i < squareDouble.length; i++)
        {
            for (int j = 0; j < squareDouble[i].length; j++)
            {
                System.out.print(squareDouble[i][j] + " ");
            }

            System.out.println("");
        }

        System.out.println("");

        //displays the Double array after the diagonal method
        System.out.println("Double matrix after:");
        PrintDiagonal(squareDouble);
    }

    //sorts through and only displays the value of the array along a diagonal line
    public static <E> void PrintDiagonal(E[][] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            for (int j = 0; j < list[i].length; j++)
            {
                if (i == j)
                {
                    System.out.print(list[i][j] + " ");
                }

                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }
}
