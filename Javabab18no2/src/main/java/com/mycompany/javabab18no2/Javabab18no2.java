/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javabab18no2;

/**
 *
 * @author MYBOOK 14E
 */
public class Javabab18no2 {
    
 public static void main(String[] args) {
        try {
            // Kode di bawah ini tidak menghasilkan exception
            Float data = 500f / 15;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("blok finally akan selalu di eksekusi");
        }
    }
        }