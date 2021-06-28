public class CreditPaymentService {
    public double calculate(double creditAmount, double annualInterestRate, double loadTermInMonths) {

        double monthlyInterestRate = annualInterestRate / 12;
        double calculateVariable = Math.pow(1 + monthlyInterestRate, loadTermInMonths);
        double annuityCoefficient;
        annuityCoefficient = monthlyInterestRate * (calculateVariable / (calculateVariable - 1));
        double AnnuityMonthlyPayment = annuityCoefficient * creditAmount;
        return AnnuityMonthlyPayment;
    }
}