package Tugas_UKL;

import java.util.Scanner;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // 1 Input ukuran matriks dulu
        System.out.println("Masukkan jumlah baris Matriks: ");
        int baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom Matriks: ");
        int kolom = input.nextInt();

        // 2 Baru buat array sesuai ukuran yang dimasukkan
        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil = new int [baris][kolom];

        // 3 Input elemen matriks pertama
        System.out.println("\nMasukkan elemen metriks pertama:");
        for(int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.println("Matriks1[" + i +"][" + j + "] = ");
                matriks1[i][j] = input.nextInt();

    
            }    
        }
        
        // 4 Input elemen matriks kedua
        System.out.println("/nMasukkan elemen matriks kedua:");
        for(int i = 0; i < baris; i++) {
            for(int j = 0; j < kolom; j++) {
                System.out.println("Matriks2[" + i + "][" + j + "] = " );
                matriks2[i][j] = input.nextInt();
            
            }
        }
        
        // 5 Hitung hasil penjumlahan
        for (int i = 0;  i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];

            }
        }
        
        // 6 Tampilkan hasil 
        System.out.println("\n=== HASIL PENJUMLAHAN MATRIKS ===");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; i < kolom; j++) {

            }
            System.out.println();
        }

        input.close();
    }                
    
    
}
