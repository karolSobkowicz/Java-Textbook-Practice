package textbookExercises.ObjectsAndClasses;

import java.util.Random;

public class CheckTheTime {

    public static void main(String[] args){

        Random random1 = new Random(3);         // Objects of type Random will generate the same values if the seed is the same.
        System.out.println("From random1: ");
        for(int i = 0; i < 10; i++){
            System.out.print(random1.nextInt(1000) + " ");
        }

        Random random2 = new Random(3);
        System.out.println("From random1: ");
        for(int i = 0; i < 10; i++){
            System.out.print(random2.nextInt(1000) + " ");
        }

    }


    public static void getTime(){
        java.util.Date date = new java.util.Date();
        System.out.println("The elapsed time since January 1, 197 is " + date.getTime() + " milliseconds");
        System.out.println(date.toString());
    }

}

