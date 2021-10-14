package nl.inholland;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void displayPayment(Payable payable, String person) {
        System.out.println("Salary of " + person + " is: " + payable.getPayout());
    }
    public static void main(String[] args) {
    Employee employee = new Employee(3000);
    displayPayment(employee, "employee");
    Freelancer freelancer = new Freelancer(60, 140);
    displayPayment(freelancer, "freelancer");
    }

}
