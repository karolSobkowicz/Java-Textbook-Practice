package textbookExercises.SingleDimensionalArrays;


/**
 * Created by Karol Sobkowicz on 29/10/2019
 */
public class SelectionSortAlgorithm {
    public static void main(String[] args){
        double[] list = {2, 9, 5, 4, 8, 1, 6};
        System.out.println("Array before sorting : ");
        displayArray(list);
        selectionSort(list);
        System.out.println();
        System.out.println("Array after sorting : ");
        displayArray(list);

    }

    /**
     * Selection Sort finds the smallest element in the array and swaps it with the first.
     *      + It then finds the next smallest elements and swaps it with the second element and so on.
     * @param list is the array to be sorted.
     */
    public static void selectionSort(double[] list){
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }


    public static void displayArray(double[] list){
        for (int i = 0; i < list.length; i++){
            double value = list[i];
            System.out.print(value + " ");
        }
    }
}
