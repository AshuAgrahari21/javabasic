import java.util.Scanner;

public class lec1 {

    // public static void main(String[] args) {
    // System.out.println("hello world"); // basic output lena
    // System.out.println("hello ashu"); // basic output lena
    // System.out.println(3 + 2);//printing number

    // public static void main(String[] args) {
    // int x; // creating storage for data in x;
    // x = 5; // assgin vale in x;
    // x++;// this is for increment and decrement of values;
    // System.out.println(x); // priting value of x;
    // String a;
    // a = "A";
    // System.out.println(a + x);
    // }

    // here im going to slove the example 1;
    // Q, calculating percentage of 5 subjects;
    // double x1=90;
    // double x2=91;
    // double x3=92;
    // double x4=93;
    // double x5=94;
    // public static void main(String[] args) {
    // double x1 = 90;
    // double x2 = 91;
    // double x3 = 92;
    // double x4 = 93;
    // double x5 = 94;
    // double y = x1 + x2 + x3 + x4 + x5;
    // System.out.println(y / 500 * 100);

    // }

    // Q2, calculating area of a circle
    // public static void main(String[] args) {
    // double radius = 5;
    // double pi = 3.1415;
    // System.out.println(radius * radius * pi + "ms");
    // }

    // how to take input;
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in); // here it is class for scanner for
    // taking input;
    // int x;
    // System.out.println("Enter a number\n");
    // x = sc.nextInt();// user will give the value of x;
    // int y = x * x;
    // System.out.println("spuare of the number is" + y);

    // }

    // Q3, Take two integar input a, and b, and find the remainder when a is divided
    // by b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("put the value of a");
        a = sc.nextInt();
        System.out.println("put the value of b");
        b = sc.nextInt();
        int y = a % b;
        System.out.println("Remainder of when a is divided by b is " + y);

    }
}