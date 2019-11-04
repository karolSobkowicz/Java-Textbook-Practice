package textbookExercises.InheritanceAndPolymorphism;

/**
 *
 * CircleFromSimpleGeometricObject inherits all methods from the SimpleGeometricObject class.
 */
public class CircleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double radius;

    // Constructor
    public CircleFromSimpleGeometricObject(){

    }

    // Constructor with specified radius
    public CircleFromSimpleGeometricObject(double radius){
        this.radius = radius;
    }

    // Constructor with specified radius, colour and filled
    public CircleFromSimpleGeometricObject(double radius, String colour, boolean filled){
        this.radius = radius;
        setColour(colour);
        setFilled(filled);
    }

    // Return radius
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // Return area
    public double getArea(){
        return radius * radius * Math.PI;
    }

    // Return diameter
    public double getDiameter(){
        return 2 * radius;
    }

    //  Return perimeter
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    // Print the circle info
    public void printCircle(){
        System.out.println("The circle was created on: " + getDateCreated() + " and its radius is: " + getRadius());
    }
}
