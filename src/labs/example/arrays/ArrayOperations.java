/*
@author: DeAndre Colston
@date: 03/02/2026
@purpose: Week 8 Lab
*/

package labs.example.arrays;

public class ArrayOperations {
//part one of the lab
    public static void createNewArray() {
        int[] newArray = new int[size];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        displayArray(newArray);
    }

    public static void displayArray(int[] array) {
        System.out.println("I created a new array and it now has " + array.length + "items in it");
        System.out.println("The array items and their values are listed below:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("index " + i + ": " + array(i));
        }
        System.out.println("\n");
    }
//part 2 of the lab : Bubble sort 
    public static void sortArray() {
        int n = unsortedArray.lenth;

        for (int i = 0; i < n - 1; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                if (unsortedArray[l] > unsortedArray[k + 1]) (
                    
                    int temp = unsortArray[k];
                    unsortedArray[k] = unsortedArray[k + 1];
                    unsortArray[k + 1] = temp;
                )
            }
        }
        System.out.println("Sorted Array Output (Bubble Sort):");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortArray[i] + " ");
        }
        System.out.println("\n");
    }
//part 3 of the lab: printing the number of days within each month
    public static void getDaysAndMonths() {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        
        int[] days = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};
        System.out.println("Days in each month:")

        for (int i = 0; i < months.length; i++)
        {
            System.out.println("There are " + days[i] + " days in " + months[i]);
        }
    }
}