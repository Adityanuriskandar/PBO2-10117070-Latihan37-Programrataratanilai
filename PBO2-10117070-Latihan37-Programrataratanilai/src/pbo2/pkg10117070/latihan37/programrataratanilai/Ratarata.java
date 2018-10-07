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
 * Deskripsi Program : Program ini berisi program Nilai rata - rata 
 * Mahasiswa
 */
public class Ratarata {
    public double rata2;
    public double jmlhNilai = 0;
    
    public void hitungNilai(int jmlhMahasiswa) {
        int i;
        double nilai;
        Scanner scn = new Scanner(System.in);
        
        for(i = 1; i <= jmlhMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scn.nextDouble();
            jmlhNilai = jmlhNilai + nilai;
        }
    }
    
    public double hitungRata2Nilai(double jmlhNilai, int jmlhMahasiswa) {
        rata2 = jmlhNilai / jmlhMahasiswa;
        return rata2;
    }
    
}
