public class CreditPaymentDifferevceService {
    public double calculate(double sizeOfTheLoanBodyAsOfTheDateOfCalculatingThePercentageOfTheNextPayment, double annualInterestRate, double numberOfDaysInTheBillingPeriod, double numberOfDaysInTheCurrentYear, double numberOfRemainingInterestPeriodsMonths) {
        double DifferenceMonthlyPayment = ((sizeOfTheLoanBodyAsOfTheDateOfCalculatingThePercentageOfTheNextPayment/numberOfRemainingInterestPeriodsMonths) + (sizeOfTheLoanBodyAsOfTheDateOfCalculatingThePercentageOfTheNextPayment*annualInterestRate*numberOfDaysInTheBillingPeriod/numberOfDaysInTheCurrentYear/100));
        return DifferenceMonthlyPayment;
    }
}