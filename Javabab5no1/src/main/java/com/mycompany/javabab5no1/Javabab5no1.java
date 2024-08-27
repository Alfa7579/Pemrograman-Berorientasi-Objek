/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javabab5no1;

/**
 *
 * @author MYBOOK 14E
 */
import java.util.Scanner;

public class Javabab5no1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        
        System.out.print("Usia: ");
        int usia = input.nextInt();
        
        System.out.print("Gaji: ");
        int gaji = input.nextInt();
        
        System.out.println("### Pendataan Karyawan PT. Petani Kode ###:");
        System.out.println("Nama Karyawan: " + nama);       
        System.out.println("Alamat: " + alamat);       
        System.out.println("Usia: " + usia);  
        System.out.println("Gaji: " + gaji);     
    }
}
