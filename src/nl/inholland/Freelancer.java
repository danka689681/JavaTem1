package nl.inholland;

public class Freelancer implements Payable{
    double hourlyRate;
    double workedHours;

    public Freelancer(double hourlyRate, double workedHours) {
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public double getPayout() {
        return workedHours * hourlyRate;
    }
}
