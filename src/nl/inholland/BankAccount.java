package nl.inholland;

public class BankAccount {
    public double amount;
    private double balance = 200.00;

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("It is not allowed to withdraw negative amount.");
        } else {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance..");
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return ("Balance is now: " + balance);
    }
}
