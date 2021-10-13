package nl.inholland;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int IndexOf(int[] array, int value, int indexOfValue) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                indexOfValue = i;
            }
        }
        return indexOfValue;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.print("Enter course name: ");
        String courseName = sc.next();
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        String students[] = new String[numberOfStudents];
        int grades[] = new int[numberOfStudents];
        double sum = 0;
        System.out.println();

        for (int index = 0; index < numberOfStudents; index++) {
            System.out.print("Enter name of student " + (index + 1) + ": ");
            String student = sc.next();
            students[index] = student;
        }

        System.out.println();

        for (int index = 0; index < numberOfStudents; index++) {
            System.out.print("Enter grade of " + students[index] + ": ");
            int grade = sc.nextInt();
            grades[index] = grade;
            sum += grade;
        }

        System.out.println("Avarage grade: " + df.format(sum / numberOfStudents));
        int max = Arrays.stream(grades).max().getAsInt();
        int indexOfValue = 0;
        int index = IndexOf(grades, max, indexOfValue);
        System.out.println("Student " + students[IndexOf(grades, max, index)] + " has maximum grade: " + max);
    }

}
