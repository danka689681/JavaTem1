package nl.inholland;

public class Student extends Person {
    String group;

    public Student(String name, String email, String group) {
        super(name,email);
        this.group = group;
    }

    public String toString() {
        return ("Student:\nname:" + this.name + "\nemail:" + this.email + "\ngroup: " + this.group);
    }
}
