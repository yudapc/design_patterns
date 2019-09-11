package learning.polasegitiga;

import java.util.Scanner;

public class Polasegitiga {
    public void pola(int n) {
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <=n; j++) {
                if(i > j) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan nilai :");
        int nilai = scanner.nextInt();
        Polasegitiga polasegitiga = new Polasegitiga();
        polasegitiga.pola(nilai);
    }
}
