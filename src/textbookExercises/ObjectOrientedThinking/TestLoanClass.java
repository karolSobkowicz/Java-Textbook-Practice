package textbookExercises.ObjectOrientedThinking;

import java.util.Scanner;
public class TestLoanClass {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Enter annual interest rate
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        // Enter the number of years
        System.out.print("Enter the number of years as an integer: ");
        int numberOfYears = input.nextInt();

        // Enter loan amount
        System.out.print("Enter the loan amount: ");
        double loanAmount = input.nextDouble();

        // Create a loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Display loan date, monthly payment and total payment
        System.out.printf("The loan was created on: %s\n" + "The monthly payment is: %.2f\nThe total payment is: %.2f\n",
                loan.getLoanDate().toString(),
                loan.getMonthlyPayment(),
                loan.getTotalPayment());

    }

}
