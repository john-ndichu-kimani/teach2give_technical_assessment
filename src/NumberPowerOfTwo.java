/*
Question 3: Power of Two
Write a program that takes an integer as input and returns true if the input is a power of two.
 */


import java.util.Scanner;

public class NumberPowerOfTwo {
    public static void main(String[] args) {
        //Enter an integer from keyboard

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int num = scanner.nextInt();

        //true if integer is a power of two
        if(isPowerOfTwo(num)){
            System.out.println(num + " is a power of 2.");
        }
        //false if integer not a power of two
        else {
            System.out.println(num + " is not a power of 2.");
        }

    }
    // This function returns `true` if the input is a power of two
    public static boolean isPowerOfTwo(int num) {


            // If the input is less than 1, it cannot be a power of two
            if (num < 1) {
                return false;
            }
            // If the input is 1, it is a power of two
            if (num == 1) {
                return true;
            }
            // This loop runs as long as the input is greater than 1
            while (num > 1) {
                // If the input is not divisible by 2, it cannot be a power of two
                if (num % 2 != 0) {
                    return false;
                }
                // Otherwise, we divide the input by 2 and continue the loop
                num /= 2;
            }

            return true;

    }
}
