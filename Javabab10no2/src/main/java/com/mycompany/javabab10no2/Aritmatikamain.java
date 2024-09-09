/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabab10no2;

/**
 *
 * @author MYBOOK 14E
 */
public class Aritmatikamain {
    
    public static void main(String[] args) {
        Aritmatika aritmatikaku = new Aritmatika();
        aritmatikaku.setAngka(20);
        System.out.println("Hasil Pertambahan " + aritmatikaku.getAngka());
        System.out.println("Pengurangan: " + aritmatikaku.getPengurangan());
        System.out.println("Perkalian: " + aritmatikaku.getPerkalian());
        System.out.println("Pembagian: " + aritmatikaku.getPembagian());
        System.out.println("Perpangkatan: " + aritmatikaku.getPerpangkatan());
        
    }
}

