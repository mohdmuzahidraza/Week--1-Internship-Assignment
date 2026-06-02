import java.util.Scanner;

public class GradeEvaluation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks (0 - 100): ");
        int marks = sc.nextInt();

        String grade;

        if (marks >= 80) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "B";
        } else if (marks >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("Grade : " + grade);

        sc.close();
    }
}