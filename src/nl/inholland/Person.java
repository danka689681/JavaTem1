package nl.inholland;

public class Person {
    protected String name;
    protected String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
    public String toString() {
        return ("name: " + this.name + "\nemail: " + this.email);
    }
}
