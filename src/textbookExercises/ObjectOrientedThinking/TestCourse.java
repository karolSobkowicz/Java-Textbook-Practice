package textbookExercises.ObjectOrientedThinking;

public class TestCourse {
    public static void main(String[] args){
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Karol Sobkowicz");
        course1.addStudent("Owen Silvester");
        course1.addStudent("Andre Lopes");

        course2.addStudent("Karol Sobkowicz");
        course2.addStudent("Hawi Faris");

        System.out.println("Number of students in course1 is " + course1.getNumberOfStudents() + " :");
        String[] students = course1.getStudents();
        for(int i = 0; i < course1.getNumberOfStudents(); i++){
            System.out.print(students[i] + ", ");
        }

        System.out.println();
        System.out.println("Number of students in course2 is " + course2.getNumberOfStudents());
    }
}
