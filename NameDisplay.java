// Program to get a name from the user and display it

import java.util.Scanner;

class NameDisplay
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);

        sc.close();
    }
}