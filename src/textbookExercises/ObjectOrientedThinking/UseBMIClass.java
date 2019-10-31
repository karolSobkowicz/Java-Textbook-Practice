package textbookExercises.ObjectOrientedThinking;

public class UseBMIClass {
    public static void main(String[] args){
        BMI bmiOwen = new BMI("Owen Silvester", 19, 160, 80);
        System.out.println("The BMI for " + bmiOwen.getName() + " is " + bmiOwen.getBMI() + " " + bmiOwen.getStatus());

        BMI bmiKarol = new BMI("Karol Sobkowicz", 150, 80);
        System.out.println("The BMI for " + bmiKarol.getName() + " is " + bmiKarol.getBMI() + " " + bmiKarol.getStatus());
    }
}
