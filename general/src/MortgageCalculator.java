import java.util.Scanner;

public class MortgageCalculator {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = getMonthlyPayments(scanner);
        System.out.println(total);
    }

    private static double getMonthlyPayments(Scanner reader) {
        // get how much requested?
        double totalAmount = getTotalRequested(reader);
        double monthlyInterest = getMonthlyInterestRate(reader);
        int numberOfPayments = getTotalYears(reader);
        // (1 + monthly interest rate) ^ total months to repay Math.pow()
        double power = Math.pow((1 + monthlyInterest), numberOfPayments);
        double top = monthlyInterest * power;
        double bottom = power - 1;
        double division = top / bottom;
        double total = totalAmount * division;
        // print result for monthly payments
        return Math.round(total * 100.0 )/100.0;
    }

    public static double getTotalRequested(Scanner reader) {
        // get how much requested?
        System.out.println("Hello, How much money do ya need?");
        double totalAmount = 0;
        try {
            String input = reader.nextLine();
            totalAmount = Double.parseDouble(input);
            System.out.println("Your input was: " + totalAmount);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return totalAmount;
    }

    public static double getMonthlyInterestRate(Scanner reader) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        // calculating the monthly interest charge
        // get how much is the interest rate? 3.0
        System.out.println("How much is the interest rate?");
        double annualInterest = 0;
        try {
            String input = reader.nextLine();
            annualInterest = Double.parseDouble(input);
            System.out.println("Interest Rate is: " + annualInterest);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        // divided by 12 months
        // and divided again by 100 as the input is in %
        return annualInterest / MONTHS_IN_YEAR / PERCENT;
    }

    public static int getTotalYears(Scanner reader) {
        // repayment in years?
        System.out.println("For how many years?");
        int years = 0;
        try {
            String input = reader.nextLine();
            years = Integer.parseInt(input);
            System.out.println("Repayment years: " + years);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        if(years > 30){
            System.out.println("Maximum is 30 years");
            getTotalYears(reader);
        }
        if(years < 5){
            System.out.println("Minimum is 5 years");
            getTotalYears(reader);
        }
        // multiply number of years * 12 to get the number of total payments
        return years * 12;
    }
}
