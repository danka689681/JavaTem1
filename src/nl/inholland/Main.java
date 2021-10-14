package nl.inholland;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount acountStatus = new BankAccount();
        double amount = 1;
        System.out.println(acountStatus);
        while (amount != 0) {
            System.out.print("Enter an amount to withdraw or 0 to stop: ");
            amount = scanner.nextDouble();
            acountStatus.withdraw(amount);
            System.out.println(acountStatus.toString());
        }
        System.out.println("End program.....");
    }
}
