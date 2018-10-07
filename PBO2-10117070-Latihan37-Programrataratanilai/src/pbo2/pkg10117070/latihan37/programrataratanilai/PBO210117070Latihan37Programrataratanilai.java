/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama : Aditya Nur Iskandar 
 * Kelas : PBO2/IF 2 
 * Nim : 10117070
 * Deskripsi Program : Program ini berisi program Menghitung Nilai rata - rata 
 * Mahasiswa
 */
public class PBO210117070Latihan37Programrataratanilai {

    public static void main(String[] args) {

    int jmlhMahasiswa;
        Scanner scn = new Scanner(System.in);
        Ratarata rata = new Ratarata();

        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        jmlhMahasiswa = scn.nextInt();
        
        rata.hitungNilai(jmlhMahasiswa);
        System.out.println("Rata-rata nilai : "
                + rata.hitungRata2Nilai(rata.jmlhNilai, jmlhMahasiswa));
    }
    
}
