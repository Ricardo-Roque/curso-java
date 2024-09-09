package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDollar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarsQuatity = sc.nextDouble();

        System.out.print("Amount to be paid in reais = " + CurrencyConverter.dollarPayment(dollarPrice, dollarsQuatity));

        sc.close();
    }
}
