package application;

import entities.Bank;

import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Enter account number: ");
        double account = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        Bank b = new Bank(name, account);

        System.out.print("Is there a initial deposit (y/n)? ");
        String response = sc.nextLine();

        if (response.equals("y")) {
            System.out.print("Enter a initial deposit value: ");
            double balance = sc.nextDouble();

            b.setBalance(balance);

            System.out.println("Account data:");
            System.out.println(b);
        } else {
            System.out.println("Account data:");
            System.out.println(b);
        }

        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();

        b.deposit(depositAmount);
        System.out.println(b);

        System.out.print("Enter a withdraw value: ");
        double withdrawalAmount = sc.nextDouble();

        b.withdraw(withdrawalAmount);
        System.out.println(b);

        sc.close();
    }
}