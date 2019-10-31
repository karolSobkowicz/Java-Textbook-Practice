package textbookExercises.PrintfFormatting;

import java.util.Locale;

public class Formats {

    public static void main(String[] args){

        // Char formatting
        System.out.printf("%c%n", 's');     // s
        System.out.printf("%C%n", 's');     // S

        // Number formatting
        System.out.printf(Locale.US, "%,d %n", 10000);      // 10,000
        System.out.printf(Locale.ITALY, "%,d %n", 10000);   // 10.000

        // Float and Double format
        System.out.printf("%f%n", 5.1473);      // 5.147300
        System.out.printf("'%5.2f'%n", 5.1473); // 5.15

        System.out.printf("'%5.2e'%n", 5.1473);

        // Date and Time
        // TODO Complete this revision class on formatting.


    }

}
