/**
 * Created by John Antonio Collins on 5/2/17.
 * hackerrank Java 1D Array solution with Exception handling and recovery.
 */

import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {
        int n = 0;
        Scanner scan;

        while(true)
        {
            try
            {
                System.out.println("Enter an integer n, followed by n integers. Press the 'return' or 'enter' key after each input.");
                scan = new Scanner(System.in);
                n = scan.nextInt();
                break;
            } catch (InputMismatchException m)
            {
                System.out.println("There was an input mismatch. Enter new input.");
            }
        }

        // Declare array a here
        Integer[] a = new Integer[n];

        for (int i = 0; i < n; i++)
        {
            int val = scan.nextInt();
            // Fill array a here
            a[i] = val;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
