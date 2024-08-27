/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javabab8no2;

/**
 *
 * @author MYBOOK 14E
 */
import java.util.Scanner;
public class Javabab8no2 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tahun Akhir ?: ");
        int tahunAkhir = input.nextInt();

        System.out.print("Tahun Awal ?: ");
        int tahunAwal = input.nextInt();
        
        System.out.println("Hasilnya ?:");
        for (int i = tahunAkhir; i >= tahunAwal; i--) {
            System.out.println(i);
        }

        input.close();
    }
}