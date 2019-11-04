package textbookExcercises.ObjectOrientedThinking;

import textbookExercises.ObjectOrientedThinking.BMI;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {

    @org.junit.jupiter.api.Test
    void getBMI() {
        BMI bmiOwen = new BMI("Owen Silvester", 19, 160, 80);
        assertEquals(17.58, bmiOwen.getBMI());
    }
}