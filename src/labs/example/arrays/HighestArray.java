/*
@author: DeAndre Colston
@date: 03/22/2026
@purpose: Week 10 Lab
*/

public class HighestArray {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        for (int i = 0; i < 50; i++) {
            myArray[i] = (int)(Math.random() * 1000);
        }
        int highest = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if (myArray[i] > highest) {
                highest = myArray[i];
            }
        }
        System.out.println("The highest value in the myArray object is: " + highest);
    }
}