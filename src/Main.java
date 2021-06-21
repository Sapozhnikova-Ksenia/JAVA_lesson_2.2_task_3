public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double аннуитентныйЕжемесячныйПлатеж = service.calculate(1000000, 9.9, 12);
        System.out.println(аннуитентныйЕжемесячныйПлатеж);

        CreditPaymentDifferevceService service1 = new CreditPaymentDifferevceService();
        double дифференцированныйЕжемесячныйПлатеж = service1.calculate(1000000, 9.9, 30, 365, 12);
        System.out.println(дифференцированныйЕжемесячныйПлатеж);
    }
}
