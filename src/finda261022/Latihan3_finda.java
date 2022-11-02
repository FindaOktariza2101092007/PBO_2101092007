/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finda261022;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Latihan3_finda {
     public static void main(String[] args) {
        int[] nilai = new int['n'];
        int max;
        int i, n;

        String angka = JOptionPane.showInputDialog("Masukkan Batasan: ");
        n = Integer.parseInt(angka);
        System.out.println("Input Angka: " + angka);

        for (i = 0; i < n; i++) {
            String bilangan = JOptionPane.showInputDialog("Masukkan Nomor: ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println("Input Angka: " + bilangan);
        }

        max = nilai[0];

        for (i = 0; i < n; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        System.out.println("Nilai Max = " + max);
    }
}
