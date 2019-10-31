package textbookExercises.SingleDimensionalArrays;

import java.util.Arrays;
/**
 * Created by Karol Sobkowicz on 29/10/2019
 * The Java.util.Arrays class contains many useful static methods.
 */
public class JavaArrayClass {
    public static void main(String[] args){

        int[] numbers = {6, 4, 2, 1, 8, 3, 7};

        System.out.println("\nBefore sort");
        displayIntArray(numbers);
        System.out.println("\n================================================");
        java.util.Arrays.sort(numbers);
        System.out.println("\nAfter sort");
        displayIntArray(numbers);
        System.out.println("\n================================================");
        int keyVal = 3;
        System.out.println("\nThe key "+ keyVal + " is at index : " + binarySearch(numbers, keyVal));



    }
    public static void displayIntArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            int value = numbers[i];
            System.out.print(value + " ");
        }
    }

    public static int binarySearch(int[] numbers, int key){
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;

            if (key < numbers[mid]) {
                high = mid - 1;
            } else if (key == numbers[mid]) {
                return mid;
            } else low = mid + 1;
        }
        return -low - 1;
    }

}
