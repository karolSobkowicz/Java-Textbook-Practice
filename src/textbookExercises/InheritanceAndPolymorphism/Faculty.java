package textbookExercises.InheritanceAndPolymorphism;

// Class Faculty and Main method
public class Faculty extends Employee {
    public static void main(String[] args){
        new Faculty();
    }

    public Faculty(){
        System.out.println("(3) - Faculty Class constructor");
    }
}


// Class Employee
class Employee extends Person {
    public Employee(){
        System.out.println("(2) - Employee Class - constructor");
    }
    public Employee(String s){
        System.out.println(s);
    }
}


// Class Person
class Person extends Subject{
    public Person(){
        super("String s is printed when the super keyword is used,");
        System.out.println("(1) - Person Class constructor");
    }
}


class Subject {
    public Subject(){
        System.out.println("Hello World!");
    }

    public Subject(String s){
        System.out.println(s);
    }
}