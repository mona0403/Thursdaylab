package oopsconcepts;

import java.util.Scanner;
public class MinAndMax {
    public int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int myArray[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( int i=0; i < n; i++)
        {
            myArray[i] = s.nextInt();
        }

        MinAndMax m = new MinAndMax();
        System.out.println("Maximum value in the array is::"+m.max(myArray));
        System.out.println("Minimum value in the array is::"+m.min(myArray));
    }
}

