/*
@author: DeAndre Colston
@date: 03/22/2026
@purpose: Week 10 Lab
*/

public class ArraySum {
    public static void main(String[] args) {
        int[] arr1 = new int[25];
        int[] arr2 = new int [25];
        int[] arr3 = new int[25];


        for(int i = 0; i < 25; i++) {
            arr1[i] = i; arr2[i] = i * 2; arr3[i] = i + 5;
        }

        long sum1 = calculateSum(arr1);
        long sum2 = calculateSum(arr2);
        long sum3 = calculateSum(arr3);

        System.out.println("Sum of arr1: " + sum1);
        System.out.println("Sum of arr2: " + sum2);
        System.out.println("Sum of arr3: " + sum3);

        if (sum1 >= sum2 && sum1 >= sum3) {
            System.out.println("arr1 has the highest value: " + sum1);
        } else if (sum2 >= sum1 && sum2 >= sum3) {
            System.out.println("arr2 has the highest value: " + sum2);
        } else {
            System.out.println("arr3 has the highest value: " + sum3);
        }
    } //took a phew attempts to understand on how to use long rather than void it was an issue when compiling.
        public static long calculateSum(int[] arr) {
            long total = 0;
            for (int i = 0; i < arr.length; i++) {
                total += arr[i];
            }
            return total;
        }
    }