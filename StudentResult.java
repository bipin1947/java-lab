// Program to find Student Result and Grade using IF condition

import java.util.Scanner;

class StudentResult
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks (0-100): ");
        int marks = sc.nextInt();

        if(marks >= 75 && marks <= 100)
        {
            System.out.println("Result : Pass");
            System.out.println("Grade  : Distinction");
        }
        else if(marks >= 60)
        {
            System.out.println("Result : Pass");
            System.out.println("Grade  : First Class");
        }
        else if(marks >= 50)
        {
            System.out.println("Result : Pass");
            System.out.println("Grade  : Second Class");
        }
        else if(marks >= 35)
        {
            System.out.println("Result : Pass");
            System.out.println("Grade  : Pass Class");
        }
        else if(marks >= 0)
        {
            System.out.println("Result : Fail");
            System.out.println("Grade  : Fail");
        }
        else
        {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}