/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabab14no2;

/**
 *
 * @author MYBOOK 14E
 */
public class burung extends abstrakhewan {
    // Memanggil abstract class "suara"
    public void suara() {
        System.out.println(" Suara Burung mencicit");
    }
    
    public static void main(String[] args) {
        abstrakhewan objek = new burung();
        objek.suara();
        objek.sound();
    }
}