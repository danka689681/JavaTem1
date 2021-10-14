package nl.inholland;

public class Teacher extends Person {
    int salary;

    public Teacher(String name, String email, int salary) {
        super(name,email);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public String toString() {
        return ("Teacher:\nname:" + this.name + "\nemail:" + this.email + "\nsalary: " + this.salary);

    }
}
