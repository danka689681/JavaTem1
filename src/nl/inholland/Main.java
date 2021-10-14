package nl.inholland;
import java.util.*;

public class Main {

    public static void createStudent(Map students, String lastName, String firstName) {
        Student student = new Student(lastName, firstName);
        students.put(student.getFirstName(), student.getLastName());
    }

    public static void main(String[] args) {
        Map<String, String> students = new TreeMap<>();
        createStudent(students, "Laz", "Tim");
        createStudent(students, "Surname", "Al");
        createStudent(students, "Lopez", "Luke");
        createStudent(students, "Moore", "Diana");
        createStudent(students, "Schack", "Vina");
        createStudent(students, "Schack", "Vina");

        System.out.println(students);
    }
}
