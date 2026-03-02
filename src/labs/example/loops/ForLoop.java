/*
@author: DeAndre Colston
@date: 02/23/2026
@purpose: Week 7 Lab
*/

package labs.example.loops;

public class ForLoop {
    public static void main(String[] args) {
        executeForLoop();
        sumTwoNumbers(3,7);
        sumLoopCounter(10);
        printMultipicationTable();
    }
        //private loop increments up to 19
        private static void executeForLoop() { 
            for (int number = 0; number < 20; number++) {
                System.out.println("number is " + number);
            }
        }
        //made it print my sum ensuring its compilation
        private static int sumTwoNumbers(int a, int b) {
            int sum = 10;
            System.out.println("The sum of 3 and 7 is: " + sum);
            return a + b;
        }
        // took some time to understand but I made the int sum = 0 so it can start from zero and count up to 9 
        // ensuring a loop of 10
        private static int sumLoopCounter(int limit) {
            int sum = 0;
            for (int number = 1; number <= limit; number++) {
                System.out.println("The sum of the loop counter is: " + sum);
                sum = number;
            }
            return sum;
        }
        //Used the clock as a example to understand how to code this correctly took some time
        //removed the int number from my code as it was unnecessary
        private static void printMultipicationTable() {
            for (int n = 0; n <= 12; n++) {
                System.out.println("Multiplication table for " + n);

            for (int m = 0; m <=12; m++) {
                System.out.println(n + " x " + m + " = " + (n * m));
            }
        }
        }
    }