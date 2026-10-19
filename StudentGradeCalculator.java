import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Invalid number of subjects.");
            sc.close();
            return;
        }

        int total = 0;

        for (int i = 1; i <= subjects; i++) {

            System.out.print("Enter marks for subject "
                             + i + " (0-100): ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks!");
                sc.close();
                return;
            }

            total = total + marks;
        }

        double average = (double) total / subjects;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: "
                           + average + "%");

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}