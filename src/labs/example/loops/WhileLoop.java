/*
@author: DeAndre Colston
@date: 02/23/2026
@purpose: Week 7 Lab
*/

package labs.example.loops;

public class WhileLoop {

    public static void main(String[] args) {
        WhileLoop wl = new WhileLoop();
        wl.executeWhileLoop();
    }
    // done in class by for the simplest of the three, Main.java, ForLoop.java, and this.
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