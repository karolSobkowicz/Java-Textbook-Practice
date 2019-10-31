package textbookExercises.ObjectsAndClasses;


// Often referred to as the client of the class.
public class TestSimpleCircle{
    public static void main(String[] args) {
        // Create circle with radius = 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        // Create circle with radius = 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // Create circle with radius = 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        // Modify circle radius
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}


class SimpleCircle {
    // Data fields
    double radius = 1;

    // Constructor with standard data fields.
    SimpleCircle(){
    }

    // Constructor with a custom data field.
    SimpleCircle(double newRadius){
        radius = newRadius;
    }

    // Methods
    double getArea(){
        return radius * radius * Math.PI;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }
}
