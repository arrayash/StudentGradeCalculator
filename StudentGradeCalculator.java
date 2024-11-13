
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter total number of subjects: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter marks of Subject" + i);
            int m = sc.nextInt();
            sum = sum + m;

        }
        System.out.println("Total marks : " + sum);
        int perc = sum / num;
        System.out.println("Percentage : " + perc + "%");
        System.out.println("Grade: "+grade(perc));

    }

    public static String grade(int perc) {
        if (perc >= 90) {
            return "A+";
        } else if (perc >= 80) {
            return "A";
        } else if (perc >= 70) {
            return "B";
        } else if (perc >= 60) {
            return "C";
        } else if (perc >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}