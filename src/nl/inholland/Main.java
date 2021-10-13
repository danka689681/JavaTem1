package nl.inholland;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    boolean absence;
    int studentOrder;

    public Student(String name, boolean absence, int studentOrder) {
            this.name = name;
            this.absence = absence;
            this.studentOrder = studentOrder;
    }

    public String toString() {
        return ("Student #" + this.studentOrder + ": " + this.name + '\t' + "| Present: " + this.absence);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the size of your group and press [ENTER]: ");
        int groupSize = sc.nextInt();

        String students[] = new String[groupSize];
        ArrayList newStudent = new ArrayList();

        System.out.println();

        for (int index = 0; index < groupSize; index++) {
                System.out.print("Please enter the name of student #" + (index + 1) + "  and press [ENTER]: ");
                String student = sc.next();
                students[index] = student;
        }

        System.out.println();

        for (int index = 0; index < groupSize; index++) {
                System.out.println("Student #" + (index + 1) + ": " + students[index]);
        }

        System.out.println();

        for (int index = 0; index < groupSize; index++) {
            System.out.print("Is student #" + (index + 1) + "(" + students[index] + ") present? [Y/N + ENTER] ");
            String absence = sc.next();
            if (absence.equals("Y") || absence.equals("y")) {
                Student student = new Student(students[index], true, index);
                newStudent.add(student);
            } else {
                Student student = new Student(students[index], false, index);
                newStudent.add(student);
            }
        }

        System.out.println();

        for (int i = 0; i < newStudent.size(); i++) {
            System.out.println(newStudent.get(i).toString());
        }
    }
}