package lt.vcd;

import java.util.Scanner;

public class Task4 {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Iveskite eiluciu skaiciu: ");
        int n = in.nextInt();
        System.out.println("Iveskite vienazenklius skaicius: ");

        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++) {
            System.out.println("Eile: " + (i+1));
            for (int k=0; k<n; k++) {
                arr[i][k] = in.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int k=0; k<n; k++) {
                if (i == k || i + k == n - 1) {
                    arr[i][k] = 0;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int k=0; k<n; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
    }
}
