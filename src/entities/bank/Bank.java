package entities.bank;

public class Bank {

    private String name;
    private double account;
    private double balance;

    public Bank(String name, double account) {
        this.name = name;
        this.account = account;
    }

    public Bank(String name, double account, double balance) {
        this.name = name;
        this.account = account;
        deposit(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account: " + account +
                ", Holder: " + name +
                ", Balance: $" + balance;
    }

    public void withdraw(double withdrawalAmount) {
        balance -= withdrawalAmount + 5.0;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}
