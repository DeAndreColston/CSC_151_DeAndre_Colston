/*
@author: DeAndre Colston
@date: 03/02/2026
@purpose: Week 8 Lab
*/

package labs.example.arrays;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //part 1
        ArrayOperations.createNewArray(10);
        
        //part 2: 50 generating 50 integers
        int[] unsortedArray = new int[50];
        Random int = new Random();
        for (int i = 0; i < 50: i++) {
            unsortedArray[i] = int.nextInt(100);
        }
        ArrayOperations.sortArray(unsortedArray);
        
        //part 3
        ArrayOperations.getDaysAndMonths();
    }
}
/*
@author: DeAndre Colston
@date: 03/02/2026
@purpose: Week 8 Lab
*/

package labs.example.arrays;

public class Main {
    public static void main(String[] args) {
        createNewArray(3);
        displayArray();
        sortArray();
        getDaysAndMonths();
    }
}