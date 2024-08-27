/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javabab6no1;

/**
 *
 * @author MYBOOK 14E
 */
import java.util.Scanner;

public class Javabab6no1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Masukan NIM : ");
       int NIM = input.nextInt();
       input.nextLine();
       
        System.out.print("Masukan Nama :");
        String nama = input.nextLine();
        
        System.out.print("Masukan Nilai :");
        int nilai = input.nextInt();
        
        if(nilai>=85 && nilai<100) {
            System.out.println("grade A");
        } else if (nilai>=75 && nilai<85) {
            System.out.println("grade B");
        } else if (nilai>=65 && nilai<75){
            System.out.println("grade C");
        } else if (nilai > 100) {
            System.out.println("Maksimal hanya 100");
        } else { 
            System.out.println("Mohon maaf, anda dinyatakan tidak lulus.");
        }
}
}