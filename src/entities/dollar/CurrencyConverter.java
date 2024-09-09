package entities.dollar;

public class CurrencyConverter {
    public static double dollarPayment(double dollarPrice, double dollarsQuatity) {
        return (dollarPrice * dollarsQuatity) + (dollarPrice * 0.06);
    }
}
