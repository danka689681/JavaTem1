package nl.inholland;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void createStudent(List people, String name, String email, String group) {
        Person newPerson = new Student(name, email, group);
        people.add(newPerson);
    }

    public static void createTeacher(List people, String name, String email, int salary) {
        Person newPerson = new Teacher(name, email, salary);
        people.add(newPerson);
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        createStudent(people, "Sasa", "student@example.com", "I.C");
        createStudent(people, "Lucy", "student2@example.com", "I.B");

        createTeacher(people, "Emil", "teacher@example.com", 1200);
        createTeacher(people, "David", "teacher2@example.com", 1250);


        System.out.println();
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
            if (people.get(i) instanceof Teacher) {
                int monthlySalary = ((Teacher) people.get(i)).getSalary();
                System.out.println("Yearly salary of teacher " + people.get(i).getName() + " is: " + (monthlySalary*12));
            }
            System.out.println();
        }
    }
}
