public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double AnnuityMonthlyPayment = service.calculate(1000000, 9.9, 12);
        System.out.println(AnnuityMonthlyPayment);

        CreditPaymentDifferevceService service1 = new CreditPaymentDifferevceService();
        double DifferenceMonthlyPayment = service1.calculate(1000000, 9.9, 30, 365, 12);
        System.out.println(DifferenceMonthlyPayment);
    }
}
