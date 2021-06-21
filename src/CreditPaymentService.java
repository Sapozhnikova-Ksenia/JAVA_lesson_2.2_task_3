public class CreditPaymentService {
    public double calculate(double суммаКредита, double процентнаяСтавка, double количествоМесяцев) {
        double аннуитентныйЕжемесячныйПлатеж = (суммаКредита * (процентнаяСтавка / (1 + процентнаяСтавка) - количествоМесяцев - 1));
        return аннуитентныйЕжемесячныйПлатеж;
    }
}
