package textbookExercises.ObjectsAndClasses;

/**
 * Created by Karol Sobkowicz on 30.10.2019
 */
public class TestCircleWithPrivateDataFields {

    public static void main(String[] args) {
        CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("The are of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The are of the circle of radius " + myCircle.getRadius() + " is " + myCircle.getArea());

        CircleWithPrivateDataFields mySecondCircle = new CircleWithPrivateDataFields(5.0);
        System.out.println("The are of the circle of radius " + mySecondCircle.getRadius() + " is " + mySecondCircle.getArea());

        System.out.println("The number of objects created is " + CircleWithPrivateDataFields.getNumberOfObjects());
    }
}
