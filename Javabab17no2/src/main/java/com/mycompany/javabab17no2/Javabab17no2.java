/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javabab17no2;

/**
 *
 * @author MYBOOK 14E
 */
public class Javabab17no2 {


    public static void main(String[] args) {
        String[][] negaraIbukota = {
            {"Indonesia", "jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses array dan menampilkan informasi
        for (int i = 0; i < negaraIbukota.length; i++) {
            System.out.println("Ibukota " + negaraIbukota[i][0] + " adalah " + negaraIbukota[i][1]);
        }
    }
}
