package learning.poladiamond;

import java.util.Scanner;

public class Poladiamond {
    public void pola(int n) {
        for(int i = 0; i < n*2; i++) {
            for (int j = 0; j < n*2; j++) {
                if( i+j>(n)-1 && j-i<n-1 && i-j < n-1 && i+j < (n-1)*3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai : ");
        int nilai = scanner.nextInt();
        Poladiamond poladiamond = new Poladiamond();
        poladiamond.pola(nilai);
    }
}
