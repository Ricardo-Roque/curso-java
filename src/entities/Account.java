package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) throws Exception {
        balance += amount;
    }

    public void withdraw(double amount) throws Exception{
        validateAmount(amount);
        balance -= amount;
    }

    public void validateAmount(double amount) throws Exception{
        if (amount > getWithdrawLimit()){
            throw new Exception("Withdraw error: The amount exceeds withdeaw limit");
        }
        if (amount > getBalance()){
            throw new Exception("Withdraw error: not enough balance");
        }
    }

}
