package lt.vcd;

import java.util.Scanner;

public class Task1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite apskritimu skaiciu:");
        int n = in.nextInt();
        System.out.println("Iveskite apskritimu spindulius:");
        int[] radiuses = new int[n];

        for (int i=0; i<n; i++) {
            radiuses[i] = in.nextInt();
        }

        int biggestRadius = 0;

        for (int i=0; i<n; i++) {
            if (biggestRadius <= radiuses[i]) {
                biggestRadius = radiuses[i];
            }
        }

        int biggestRadiusCount = 0;

        for (int r:radiuses) {
            if (r == biggestRadius) {
                biggestRadiusCount++;
            }
        }
        System.out.println(biggestRadius + " - " + biggestRadiusCount);
    }
}
