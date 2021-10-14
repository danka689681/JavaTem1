package nl.inholland;

public class Teacher extends Person {
    String salary;

    public Teacher(String name, String email, String salary) {
        super(name,email);
        this.salary = salary;
    }

    public String toString() {
        return ("Teacher:\nname:" + this.name + "\nemail:" + this.email + "\nsalary: " + this.salary);

    }
}
