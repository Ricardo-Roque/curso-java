package entities.contract;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Installments {
    private LocalDate dueDate;
    private double amount;

    public Installments(LocalDate date, double amount) {
        this.dueDate = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return dueDate;
    }

    public void setDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate + " - " + String.format("%.2f", amount);
    }
}
