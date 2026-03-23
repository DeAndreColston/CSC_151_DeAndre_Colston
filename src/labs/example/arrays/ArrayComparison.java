/*
@author: DeAndre Colston
@date: 03/22/2026
@purpose: Week 10 Lab
*/

// part 1: Week 10 Lab: pretty simple 
public class ArrayComparison {
    public static void main(String[] args) {
        int[] firstArray = {10, 20, 30, 40, 50};
        int[] secondArray = {10, 20, 30, 40, 50};

        boolean sameLength = (firstArray.length == secondArray.length);
        boolean sameValues = true;

        if(!sameLength) {
            sameValues = false;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    sameValues = false;
                    break;
                }
            }
        }
        if (sameLength) {
             System.out.println("Yes these arrays are the same length");
        } else {
            System.out.println("No these arrays are not the same length");
        }
        if (sameValues) {
            System.out.println("Yes these arrays do contain the same values");
        } else {
            System.out.println("No these arrays do not contain the same values");
        }
    }
}