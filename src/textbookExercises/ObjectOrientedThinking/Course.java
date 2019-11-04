package textbookExercises.ObjectOrientedThinking;

public class Course {
    // Data fields
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    // Constructor
    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }

    public String getCourseName(){
        return this.courseName;
    }


    // TODO - Test method
    public void dropStudent(String student){
        int size = students.length;
        int index = 0;

        for(int i = 0; i < size; i++){
            //If student is in array, it will copy all elements but skip the student.
            if(students[i].equals(student)) {
                index = i;
            }

            for(int k = index + 1; k < size; k++){
                students[k-1] = students[k];
            } size--;
        }
    }


}
