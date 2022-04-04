package com.mydev;
//copy paste code : Idea1_w3schools.com
import java.util.Scanner; // Import the Scanner class

class MyClass {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type a number:");
    x = myObj.nextInt(); // Read user input 1

    System.out.println("Type another number:");
    y = myObj.nextInt(); // Read user input 2

    sum = x + y;  // Calculate the sum of x + y
    System.out.println("Sum is: " + sum); // Print the sum
  }
} 