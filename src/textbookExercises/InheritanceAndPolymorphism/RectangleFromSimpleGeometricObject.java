package textbookExercises.InheritanceAndPolymorphism;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject{
    private double height;
    private double width;

    // Constructor
    public RectangleFromSimpleGeometricObject(){
    }

    // Constructor with width and height arguments
    public RectangleFromSimpleGeometricObject(double height, double width){
        this.height = height;
        this.width = width;
    }

    // Constructor with width, height, colour and filled arguments.
    public RectangleFromSimpleGeometricObject(double height, double width, boolean filled, String colour){
        this.height = height;
        this.width = width;
        setFilled(filled);
        setColour(colour);
    }

    // Return width
    public double getWidth(){
        return width;
    }

    // Set a new width
    public void setWidth(double width){
        this.width = width;
    }

    // Return height
    public double getHeight(){
        return height;
    }

    // Set a new Height
    public void setHeight(double height){
        this.height = height;
    }

    // Get area
    public double getArea(){
        return width * height;
    }

    // Return perimeter
    public double getPerimeter(){
        return (2 * height) + (2 * width);
    }

}
