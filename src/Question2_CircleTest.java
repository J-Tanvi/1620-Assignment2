/*
---------------------------------------------------------------------------------
Name: Tanvi Jain
Student #: 220287975
Subject: ITEC 1620 - Object-Based Programming
Date: November 2nd, 2023

Purpose: to calculate the area and perimeter of a circle using a given radius.
~~Note- this question has a class named 'Circle' that runs with it~~
----------------------------------------------------------------------------------
 */
//libraries
import java.util.Scanner;
import java.text.*;
public class Question2_CircleTest {
    public static void main(String[] args) {
        //creates a new scanner and a format for the numbers
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#.####");

        //creates the default circle and prints off its characteristics
        Circle def = new Circle();
        double radius = 2.0;
        String colour = "Green";
        double area = def.calculateArea(); //gets the area
        double perm = def.getPerimeter(); //gets perimeter
        System.out.print("\nThe first circle is " + colour + " and has a radius of " + radius);
        System.out.println(", area of " + fmt.format(area) + " and perimeter of " + fmt.format(perm));

        //asks users for the radius of the second circle
        System.out.println("\nPlease enter the radius for the second circle: ");
        radius = scan.nextDouble();
        //asks user to provide a positive number if they haven't already
        while (radius < 0){
            System.out.println("Please enter a positive value of the radius for the second circle: ");
            radius = scan.nextDouble();
        }
        //asks user for the colour of the second circle
        System.out.println("Please enter the colour for the second circle: ");
        colour = scan.next();
        //creates the second circle, calculates area and perimeter, and prints the results
        Circle pineapple = new Circle(radius, colour);
        area = pineapple.calculateArea();
        perm = pineapple.getPerimeter();
        System.out.print("The second circle is " + colour + " and has a radius of " + radius);
        System.out.println(", area of " + fmt.format(area) + " and perimeter of " + fmt.format(perm));

        //gets a new radius for the second circle and ensures the number is positive
        System.out.println("\nPlease enter the new radius for the second circle: ");
        radius = scan.nextDouble();
        while (radius < 0){
            System.out.println("Please enter a positive value of the new radius for the second circle: ");
            radius = scan.nextDouble();
        }
        //creates the new second circle, calculates area/perimeter, and prints results
        pineapple = new Circle(radius,colour);
        area = pineapple.calculateArea();
        perm = pineapple.getPerimeter();
        System.out.print("The radius of the " + colour + " circle became " + radius);
        System.out.print(", its area now is " + fmt.format(area) + " and its perimeter is now " + fmt.format(perm));
    }
}
