package nl.inholland;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee(1300);
    System.out.println("Salary of this employee is: " + employee.getPayout());
    Freelancer freelancer = new Freelancer(15, 60);
    System.out.println("Salary of this freelancer is: " + freelancer.getPayout());
    }

}
