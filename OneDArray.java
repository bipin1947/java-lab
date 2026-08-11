// Program to demonstrate 1D Array

import java.util.Scanner;

class OneDArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        // Input elements
        System.out.println("Enter 5 elements:");

        for(int i = 0; i < 5; i++)
        {
            arr[i] = sc.nextInt();
        }

        // Display elements
        System.out.println("Array Elements are:");

        for(int i = 0; i < 5; i++)
        {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}