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
        printMultipicationTable(5);
    }
        //private loop increments up to 20
        private void executeForLoop() { 
            for (int number = 0; number < 20; number++) {
                System.out.println("number is " + number);
            }
        }
        private int sumTwoNumbers(int a, int b) {
            return a + b;
        }

        private int sumLoopCounter(int limit) {
            int sum = 0;
            for (int number = 0; number <= limit; number++) {
                System.out.println("The sum of the loop counter is: ");
                sum = sum + number
            }
            return sum;
        }
        private void printMultipicationTable(int value) {
            for (int m = 0; m <=12; m++) {
                System.out.println(value + " x " + m + " = " + (value * m));
            }
        }
        }