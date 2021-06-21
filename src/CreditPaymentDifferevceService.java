public class CreditPaymentDifferevceService {
    public double calculate(double размерТелаКредитаНаДатуРасчетаПроцентнойЧастиПоОчередномуПлатежу, double размерГодовойПроцентнойСтавки, double количествоДнейВРассчетномПериоде, double количествоДнейВТекущемГоду, double числоОставшихсяПроцентныхПериодовМесяцев) {
        double дифференцированныйЕжемесячныйПлатеж = ((размерТелаКредитаНаДатуРасчетаПроцентнойЧастиПоОчередномуПлатежу/числоОставшихсяПроцентныхПериодовМесяцев) + (размерТелаКредитаНаДатуРасчетаПроцентнойЧастиПоОчередномуПлатежу*размерГодовойПроцентнойСтавки*количествоДнейВРассчетномПериоде/количествоДнейВТекущемГоду/100));
        return дифференцированныйЕжемесячныйПлатеж;
    }
}