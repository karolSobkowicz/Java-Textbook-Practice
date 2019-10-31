package textbookExercises.ObjectsAndClasses;

public class ThisKeyword {
    private double radius;

    public ThisKeyword(double radius){
        this.radius = radius;
    }

    // another constructor which invokes another constructor
    public ThisKeyword(){
        this(1.0);
    }
}
