import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);

        // System.out.println("enter a nummber");
        // x = ab.nextInt();
        // System.out.println(x * 2);
        // if (x == 3) {
        // System.out.println("hurry");
        // } else {
        // System.out.println("chutiya");
        // }

        // Q1, take an input from user, and find the number either even or odd;
        // System.out.println("Enter the value of x");
        // x = ab.nextInt();
        // if (x % 2 == 0) {
        // System.out.println("The number is even");
        // } else {
        // System.out.println("The number is odd");
        // }

        // Q2,take positive integer input and tell if it is divsible by 5 or not.
        // System.out.println("enter the number x");
        // x = ab.nextInt();
        // if (x % 5 == 0) {
        // System.out.println("The number is divisible by 5");
        // } else {
        // System.out.println("The number is not divisible by 5");
        // }
        // System.out.println("enter your years");
        // x = ab.nextInt();
        // if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
        // System.out.println("this is leap year");
        // } else {
        // System.out.println("This is not leap yaer");
        // }

        // Q3,Take integer input and print the absolute value of that integer;

        // System.out.println("Enter your integer value");
        // x = ab.nextInt();
        // if (x < 0) {
        // System.out.println("This is negative number");

        // } else {
        // System.out.println("This is positive number");
        // }

        // Q4,if cost price and selling price of an item is input through the keybord
        // ,write a program to determine wheather seller has made profit or incurred
        // loss.
        // also determine how much profit he made or loss he incurred.

        // System.out.println("enter the cost price");
        // x = ab.nextInt();
        // System.out.println("enter the selling price");
        // y = ab.nextInt();
        // if (y > x) {
        // System.out.println("Profite is made");
        // System.out.println(y - x);
        // } else {

        // System.out.println("loss is made");
        // System.out.println(y - x);

        // }

        // Q5,give the length and breadth of a rectangle,write a program to find
        // wheather the area od the rectangale is greather than its perimeter;
        // System.out.println("enter the length");
        // x = ab.nextInt();
        // System.out.println("enter the breadth");
        // y = ab.nextInt();
        // z = x * y;
        // System.out.println("Area of rectangle is " + z);
        // c = (x + y + x + y);
        // System.out.println("perimeter of rectangle is " + c);
        // if (z > c) {
        // System.out.println("area is greather than perimeter");

        // } else {
        // System.out.println("perimeter is greater than area");
        // }

        // Q6, take a positive imteger input and tell if it is a three digit number or
        // not?
        // System.out.println("Enter the number");
        // x = ab.nextInt();
        // if (x >= 100 && x <= 999) {
        // System.out.println("yes!! this are three digit number");

        // } else {
        // System.out.println("no! this is not three digit number");
        // }

        // Q7,given three point (x1,y1),(x2,y2),(x3,y3), write a program to check if all
        // three point fall on one straight line;
        // double x1 = 1, x2 = 2, x3 = 3, y1 = 1, y2 = 2, y3 = 3;
        // System.out.println("enter the co odinate");
        // x1 = ab.nextDouble();
        // x2 = ab.nextDouble();
        // x3 = ab.nextDouble();
        // y1 = ab.nextDouble();
        // y2 = ab.nextDouble();
        // y3 = ab.nextDouble();
        // double m1 = (y2 - y1) / (x2 - x1);
        // double m2 = (y3 - y2) / (x3 - x2);
        // if (m1 == m2) {
        // System.out.println("The three point find lie on the single line");
        // } else {
        // System.out.println("They do not lie on the single line");
        // }

        // Q8,given a poin (x,y), write a program to find out if it lies on the axis x
        // and yor viz(0,0);
        // int x, y;
        // System.out.println("enter the point value");
        // x = ab.nextInt();
        // y = ab.nextInt();
        // if (x == 0 && y != 0) {
        // System.out.println("the point is on y axis");
        // } else if (y == 0 && x != 0) {
        // System.out.println("the poin is on X axis");
        // } else if (x != 0 && y != 0) {
        // System.out.println("the poin is between x-y axis");
        // }

        // Q9,givem the co ordinate (x,y) of a center of a circle,write a program which
        // will determine whether a poin lies inside the circle , on the circle or
        // outside the circle;
        int x, y;
        int r;
        System.out.println("enter the value of co ordinate and its radius");
        x = ab.nextInt();
        y = ab.nextInt();
        r = ab.nextInt();
        if ((x >= r && x == y) && (y >= r && x == y)) {
            System.out.println("The point inside the circle");
        } else {
            System.out.println("The poin outside the circle");
        }

    }

}