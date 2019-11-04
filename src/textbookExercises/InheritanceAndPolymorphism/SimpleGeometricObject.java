package textbookExercises.InheritanceAndPolymorphism;

/**
 * Created by Karol Sobkowicz on 04.11.2019
 * Creating a general superclass 'SimpleGeonemtricObject' and showing the use for inheritance
 * when extending other classes from it.
 */

public class SimpleGeometricObject {
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // General constructor
    public SimpleGeometricObject(){
        dateCreated = new java.util.Date();
    }

    // More specific constructor with filled and colour arguments
    public SimpleGeometricObject(String colour, boolean filled){
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }

    // Return colour
    public String getColour(){
        return colour;
    }

    // Set a new colour
    public void setColour(String colour){
        this.colour = colour;
    }

    // Return filled
    public boolean isFilled(){
        return filled;
    }

    // Set a new filled
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // Get Date created
    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    // Return a string representation of this object
    public String toString(){
        return "created on: " + dateCreated + "\n colour: " + colour + " and filled: " + filled;
    }


}
