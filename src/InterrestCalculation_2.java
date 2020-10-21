/*
Maria
This program about...

First ask the user for the initial investment and number of years
 and interest rate in % , increment of investment per year(scanner)
Print headings for your method
for the number years
    Method to calculate the interest (AmountInvested*interestRate/100)
    Amount = amount +interest+ increment
    print table method
 */
import java.util.*;

public class InterrestCalculation_2 {
    public static void main(String[] args) {
        // to create the object of scanner
        Scanner input= new Scanner(System.in); //to ask user information
        System.out.print(" How much money would you like to invest? ");
        double amount= input.nextDouble();
        System.out.print(" for how many years? ");
        int Years = input.nextInt();
        // add two more: for the interest rate, the increment both doubles
        System.out.println("Year  Amount   Interest Increment Total");
        System.out.println("=========================================");
        double intRate=6.5;
        double yearlyInc=100;
        for (int year = 1; year <= Years; year++) {
            double interest = calculateIterest(amount, intRate);//call the method that calculates interest
            //amount is the inital of the user
            System.out.printf("%d\t %.2f\t %.2f\t %.2f\t %.2f \n", year, amount, interest, yearlyInc, (amount + interest + yearlyInc));
            amount = amount + interest + yearlyInc;
        }
    }

    public static double calculateIterest(double amt, double intRate) {

        amt = (amt * intRate / 100);// 1000 x 6/100
        return amt;
    }
}

