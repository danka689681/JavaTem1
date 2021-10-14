package nl.inholland;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList student = new ArrayList();
        Student newStudent = new Student("Danka", "email@example.com", "I.C");
        student.add(newStudent);

        ArrayList teacher = new ArrayList();
        Teacher newTeacher = new Teacher("Danka", "email@example.com", "1000");
        teacher.add(newTeacher);

        ArrayList person = new ArrayList();
        Person newPerson = new Person("Danka", "email@example.com");
        person.add(newPerson);


        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).toString());
        }
        System.out.println();
        for (int i = 0; i < teacher.size(); i++) {
            System.out.println(teacher.get(i).toString());

        }
        System.out.println();
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i).toString());
        }
    }
}
