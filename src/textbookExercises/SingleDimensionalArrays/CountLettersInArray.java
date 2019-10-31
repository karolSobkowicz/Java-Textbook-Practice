package textbookExercises.SingleDimensionalArrays;

/**
 * Counting letters in a random array.
 * Created by Karol Sobkowicz on 29/10/2019
 */

public class CountLettersInArray {
    public static void main(String[] args){

        char[] chars = createArray();
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);

    }

    /**
     * Create an array of size 100.
     * @return a new array.
     */
    public static char[] createArray(){
        char[] chars = new char[100];
        char ch1 = 'a';
        char ch2 = 'z';
        for (int i = 0; i < chars.length; i++) {
            chars[i] = getRandomCharacter(ch1, ch2);
        }

        return chars;
    }

    /**
     *
     * @param ch1 start of letter range
     * @param ch2 end of letter range
     * @return
     */
    private static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /**
     * Display all elements in the array.
     * @param chars array of characters
     */
    public static void displayArray(char[] chars){
        for (int i = 0; i < chars.length; i++){
            if ((i + 1) % 20 == 0){
                System.out.print(chars[i]);
            } else System.out.print(chars[i] + " ");
        }
    }

    /**
     *
     * @param chars array of characters
     * @return array of ints.
     */
    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];

        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    /**
     * Display the counts array
     * @param counts array of letter occurrences in the array.
     */
    public static void displayCounts(int[] counts) {
        for(int i = 0; i < counts.length; i++){
            if ((i + 1) % 10 == 0) {
                System.out.print(counts[i] + " " + (char)(i + 'a'));
            } else {
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
            }
        }
    }

}
