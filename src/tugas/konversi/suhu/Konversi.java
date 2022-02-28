/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.konversi.suhu;

/**
 *
 * @author Lenovo
 */
public class Konversi {
     Konversi(double input) {
        ConvertR(input);
        ConvertK(input);
        ConvertF(input);
    }

    double ConvertR(double celcius) {
        double hasil;
        hasil = (4 * celcius) / 5;
        return hasil;
    }

    double ConvertK(double celcius) {
        double hasil;
        hasil = celcius + 273.15;
        return hasil;
    }

    double ConvertF(double celcius) {
        double hasil;
        hasil = (9 * celcius) / 5 + 32;
        return hasil;
    }

    void Kalkulasi(double input) {
        System.out.println("Suhu Air dalam Satuan Celcius     : " + input + "Âº" + "C");
        System.out.println("Suhu Air dalam Satuan Farenheit   : " + ConvertF(input) + "Âº" + "F");
        System.out.println("Suhu Air dalam Satuan Reamur      : " + ConvertR(input) + "Âº" + "R");
        System.out.println("Suhu Air dalam Satuan Kelvin      : " + ConvertK(input) + "K");
        System.out.println();
        System.out.println();
        if (input >= 100) {
            System.out.println("Kondisi Air Mendidih");
        } else if (input <= 0) {
            System.out.println("Kondisi Air Beku");
        } else {
            System.out.println("Kondisi 12Air Normal");
        }
    }

    void menu() {
        System.out.println();
        System.out.println("Opsi");
        System.out.println("----");
        System.out.println("1. Lihat Data Hasil Konversi");
        System.out.println("2. Edit Input Data Konversi");
        System.out.println("3. Exit");
    }
}
