/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.konversi.suhu;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TugasKonversiSuhu {

   public static void main(String[] args) {
        int pilihan;
        System.out.println("|-------------------------|");
        System.out.println("|Program Konversi Suhu Air|");
        System.out.println("|-------------------------|");
        System.out.println("Masukkan Data");
        System.out.println("------------");

        // Bagian Input pertama menggunakan constructor
        Double inputAwal;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Suhu Air dalam Celcius : ");
            inputAwal = input.nextDouble();

            var perhitungan = new Konversi(inputAwal);

            // tampilan Opsi
            while (true) {
                perhitungan.menu();
                System.out.print("Pilih : ");
                pilihan = input.nextInt();
                System.out.println();
                switch (pilihan) {
                    case 1:
                        perhitungan.Kalkulasi(inputAwal);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Input Data");
                        System.out.println("----------");
                        System.out.print("Suhu Air dalam Celcius : ");
                        inputAwal = input.nextDouble();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opsi Tidak Ada, Mohon Masukkan Opsi dengan Benar");
                        break;
                }
            }
        }
    }
    
}
