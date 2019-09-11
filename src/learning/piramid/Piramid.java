package learning.piramid;

import java.util.Scanner;

public class Piramid {
    public void pola(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n*2; j++) {
                if(i+j > (n)-1 && j-i < n-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("masukkan nilai :");
        int nilai = scan.nextInt();
        Piramid piramid = new Piramid();
        piramid.pola(nilai);
    }
}
