
//Write a program that takes a number as input and prints all its factors except 1 and the number itself.. 
//If the number has only two factors (1 and the number itself), then the program should print -1.
import java.util.Scanner;

class Loop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean hasFactor = false;

        // Loop from 2 to num/2 to find factors
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) { // Check if 'i' is a factor of 'num'
                System.out.print(i + " ");
                hasFactor = true;
            }
        }

        // If no factors found, print -1
        if (!hasFactor) {
            System.out.println("-1");
        }

        sc.close(); // Close the scanner
    }
}
