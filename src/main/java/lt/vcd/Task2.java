package lt.vcd;

import java.util.Scanner;

public class Task2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite namu skaciu: ");
        int n = in.nextInt();

        System.out.println("Iveskite gyventoju skaiciu kiekviename name: ");
        int[] residents = new int[n];

        for (int i=0; i<n; i++) {
            residents[i] = in.nextInt();
        }

        int totalResidents = 0;

        for (int r:residents) {
            totalResidents+=r;
        }

        int leftResidents = 0;
        int rightResidents = 0;


        for (int i=0; i<n; i+=2) {
            leftResidents+=residents[i];
        }

        for (int i=1; i<n; i+=2) {
            rightResidents+=residents[i];
        }

        int leftHouses = 0;
        int rightHouses = 0;

        for (int i=0; i<n; i++) {
            if (i % 2 == 0) {
                leftHouses++;
            } else {
                rightHouses++;
            }
        }

        double avgResidentsLeft = 0;
        double avgResidentsRight = 0;

        if (leftHouses > 0) {
            avgResidentsLeft = (double) leftResidents / leftHouses;
        }

        if (rightHouses > 0) {
            avgResidentsRight = (double) rightResidents / rightHouses;
        }

        System.out.println("Total residents: " + totalResidents);
        System.out.println("Residents on the left: " + leftResidents);
        System.out.println("Residents on the right: " + rightResidents);
        System.out.println("Average per house on the left: " + (leftHouses == 0 ? "N/A" : avgResidentsLeft));
        System.out.println("Average per house on the right: " + (rightHouses == 0 ? "N/A" : avgResidentsRight));
    }
}
