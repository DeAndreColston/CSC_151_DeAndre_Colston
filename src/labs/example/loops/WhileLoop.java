/*
@author: DeAndre Colston
@date: 02/23/2026
@purpose: Week 7 Lab
*/

package labs.example.loops;

public class WhileLoop {

    public static void main(String[] args) {
        executeWhileLoop();
    }
    
    private static void executeWhileLoop() { 
        int counter = 0;
        
        while (counter < 10)
        {
            counter++;
        }
            System.out.println("The loop executed " + counter + "times");
            return;
    }
}