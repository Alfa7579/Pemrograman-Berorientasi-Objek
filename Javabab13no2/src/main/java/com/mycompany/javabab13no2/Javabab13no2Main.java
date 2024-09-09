/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabab13no2;

/**
 *
 * @author MYBOOK 14E
 */
import java.util.Scanner;
public class Javabab13no2Main {
   /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Javabab13no2 objek = new Javabab13no2();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan alas segitiganya : ");
        int alas = input.nextInt();
        
        System.out.print("Masukkan tinggi segitiga : ");
        int tinggi = input.nextInt();
        
        System.out.println("Luas segitiganya adalah : " + objek.luasSegitiga(alas, tinggi));
    }
}
