package textbookExercises.MultiDimensionalArrays;

// Imports
import org.jetbrains.annotations.NotNull;
import java.util.Scanner;


/**
 * Created by Karol Sobkowicz on 30.10.2019
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        randomValues(matrix);
        printSummary(matrix);
        randomShuffle(matrix);
        printSummary(matrix);
    }

   public static void print(@NotNull int[][] array){
       for (int row = 0; row < array.length; row++) {
           for (int column = 0; column < array[row].length; column++) {
               System.out.print(array[row][column] + " ");
           }
       }
   }


   public static void add(@NotNull int[][] array){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + array.length + " rows and " + array[0].length + " columns: ");

        for(int row = 0; row < array.length; row++){
             for(int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextInt();
            }
        }
   }

   public static void randomValues(@NotNull int[][] array){
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[0].length; column++){
                array[row][column] = (int)(Math.random() * 100);
            }
        }
   }


   public static int sumAll(@NotNull int[][] array) {
        int sum = 0;
       for(int row = 0; row < array.length; row++) {
           for (int column = 0; column < array[0].length; column++) {
               sum += array[row][column];
           }
       } return sum;
   }

   public static void sumRow(@NotNull int[][] array){
        for (int row = 0; row < array.length; row++) {
            int total = 0;
            for (int column = 0; column < array[row].length; column++){
                total += array[row][column];
            } System.out.println("The sum for row " + row + " is " + total);
        }
   }

    public static void sumColumn(@NotNull int[][] array){
        for (int column = 0; column < array[0].length; column++){
            int total = 0;
            for (int row = 0; row < array.length; row++) {
                total += array[row][column];
            } System.out.println("The sum for column " + column + " is " + total);
        }
    }

    public static void randomShuffle(int[][] array){
        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array[i].length; j++) {
                int i1 = (int)(Math.random() * array.length);
                int j1 = (int)(Math.random() * array[i].length);

                int temp = array[i][j];
                array[i][j] = array[i1][j1];
                array[i1][j1] = temp;
            }
        }
    }

    public static void printSummary(int[][] array) {
        System.out.println("\nThe current array is : ");
        print(array);
        System.out.println("\n");
        sumRow(array);
        sumColumn(array);
        System.out.println("\nThe sum of the array elements is " + sumAll(array));
    }




}
