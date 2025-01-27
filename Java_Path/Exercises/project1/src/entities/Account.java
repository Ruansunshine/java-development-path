package entities;
import java.util.Locale;
import java.util.Scanner;

public class Account {
    private String holder;
    private double balance;
    private int number;

    public Account(int number, String holder) {
        this.holder = holder;
        this.number = number;
    }
    public Account(String holder,int number, double initialDeposit) {
        this.holder = holder;
        this.number = number;
        Deposit(initialDeposit);
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

    public int getNumber() {
        return number;
    }
    public void Deposit(double amount) {
        balance += amount;
    }
    public void Withdraw(double amount) {
        balance -= amount + 5.0;
    }
    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $"
                + String.format("%.2f", balance);
    }
}
