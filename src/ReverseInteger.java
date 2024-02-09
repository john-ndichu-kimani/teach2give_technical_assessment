/*
Question 5: Reverse Integer

Write a program that takes an integer as input and returns an integer with reversed digit
ordering.
 */

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        //Enter integer on keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        //assign function to variable
        int reversedNumber = reverseInteger(number);

        //print result i.e reversed integer
        System.out.println("Reversed integer: " + reversedNumber);
    }
    //function to reverse number entered
    public static int reverseInteger(int number){
        int reversedNumber=0;
        // Iterate through each digit of the number and reverse it
        while(number != 0){
            int digit = number % 10;// Get the last digit
            reversedNumber = reversedNumber * 10 + digit;// Add the digit to the reversed number
            number /= 10;// Move to the next digit by removing the last digit
        }
        return reversedNumber;
    }
}
