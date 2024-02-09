/*
Question 2: Fibonacci Sequence
Write a program to generate the Fibonacci sequence up to 100.
 */



public class FibonacciSequence {
    public static void main(String[] args) {
        int first = 0, second = 1, next=0;

        //print the first two numbers
        System.out.println(first+ " " +'\n'+ second);

        while(next<=100){
            next = first + second;

            if(next<=100) {
                //print next values
                System.out.println(next + " ");
            }
            first = second;

            second = next;
        }
    }
}
