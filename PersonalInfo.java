// Program to get personal information from user and display it

import java.util.Scanner;

class PersonalInfo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter your Gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter your City: ");
        String city = sc.nextLine();

        System.out.print("Enter your Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.println("\n----- Personal Information -----");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("City   : " + city);
        System.out.println("Mobile : " + mobile);

        sc.close();
    }
}