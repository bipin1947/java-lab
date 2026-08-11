// Program to get different values from user using Scanner

import java.util.Scanner;

class ScannerDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Accept Integer
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        // Accept Float
        System.out.print("Enter a Float Value: ");
        float f = sc.nextFloat();

        // Accept Double
        System.out.print("Enter a Double Value: ");
        double d = sc.nextDouble();

        // Accept Character
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        // Accept String
        sc.nextLine(); // Clear input buffer
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        // Display Values
        System.out.println("\n----- Entered Values -----");
        System.out.println("Integer  : " + num);
        System.out.println("Float    : " + f);
        System.out.println("Double   : " + d);
        System.out.println("Character: " + ch);
        System.out.println("String   : " + str);

        sc.close();
    }
}