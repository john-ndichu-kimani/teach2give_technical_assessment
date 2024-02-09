/*Question 1: FizzBuzz
Write a program that prints the numbers from 1 to 100. For multiples of 3, print "Fizz"; for
multiples of 5, print "Buzz"; and for numbers that are multiples of both 3 and 5, print
"FizzBuzz".
*/


public class FizzBuzzChallenge {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {

            //numbers divisible by both 3 and 5 are always divisible by 15, so "FizzBuzz" will be printed
            if (i % 15 == 0) {
                System.out.println("FizzBuzz ");
            }
            //print "Fizz" for numbers divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz ");
            }
            //print "Buzz" for numbers divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz ");
            }
            //print the other numbers if conditions above are false
            else {
                System.out.println(i + " ");
            }
        }
    }
}