// Program to print a name 10 times using loop

import java.util.Scanner;

class PrintName
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("\nName printed 10 times:");

        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i + ". " + name);
        }

        sc.close();
    }
}