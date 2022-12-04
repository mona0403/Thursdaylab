package oopsconcepts;
import java.util.Scanner;
class CopyArray
{
    public static void main(String[] args)
    {
        int n,i,j=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int array[] = new int[n];
        int copy[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Copied elements of an array is :");
        for( j=0;j<n ;j++)
        {
            copy[j] = array[j];
            System.out.println(copy[j]);

        }
    }
}