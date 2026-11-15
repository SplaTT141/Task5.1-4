package lt.vcd;

import java.util.Scanner;

public class Task3 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite dalyku skaciu: ");
        int subjects = in.nextInt();
        System.out.println("Iveskite studentu skaciu: ");
        int students = in.nextInt();

        int[][] grades = new int[students][subjects];

        for (int i=0; i<students; i++ ){
            System.out.println(i+1 + " studento pazymiai: ");
            for (int k=0; k<subjects; k++) {
                grades[i][k] = in.nextInt();
            }
        }

        int[] studentGrades = new int[students];

        for (int i=0; i<grades.length ; i++) {
            for (int k=0; k<subjects ; k++) {
                studentGrades[i] += grades[i][k];
            }
        }

        int[] studentAvg = new int[students];

        System.out.println("Student averages: ");

        for (int i=0; i<students; i++) {
            studentAvg[i] = studentGrades[i] / subjects;
            System.out.println(studentAvg[i]);
        }

        double studentsAvg = 0;

        for (int s:studentAvg) {
            studentsAvg += s;
        }

        System.out.println("Group average: ");
        System.out.println(studentsAvg / students);

        System.out.println("Highest-performing student: ");

        int highestAvg = studentAvg[0];
        for (int i=0; i<students; i++) {
            if (studentAvg[i] > highestAvg) {
                highestAvg = studentAvg[i];
            }
        }

        int bestStudent = 0;
        for (int i=0; i<studentAvg.length; i++) {
            if (studentAvg[i] == highestAvg) {
                bestStudent = i + 1;
            }
        }

        System.out.println(bestStudent);

        System.out.println("Students with at least one grade below 5:");

        int studentsWithLowGrades = 0;

        for (int i=0; i<grades.length; i++) {
            for (int k=0; k<subjects; k++) {
                if (grades[i][k] < 5) {
                    studentsWithLowGrades++;
                    break;
                }
            }
        }

        System.out.println(studentsWithLowGrades == 0 ? "None" : studentsWithLowGrades);
    }
}
