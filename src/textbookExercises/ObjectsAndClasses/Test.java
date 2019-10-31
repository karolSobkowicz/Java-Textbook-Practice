package textbookExercises.ObjectsAndClasses;

/**
 * Created by Karol Sobkowicz on 30.10.2019
 */
public class Test {

    public static void main(String[] args){
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        printCircle(myCircle);      // passing an object into a method.

    }

    public static void printCircle(CircleWithPrivateDataFields c){
        System.out.println("The area of the circle with radius " + c.getRadius() + " is " + c.getArea());
    }
}
