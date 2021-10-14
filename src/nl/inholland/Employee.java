package nl.inholland;

public class Employee implements Payable {
    double grossSalary;
    final double tax = 0.3;

    public Employee(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    @Override
    public double getPayout() {
        return grossSalary - grossSalary * tax;
    }

}
