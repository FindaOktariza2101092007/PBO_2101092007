/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finda261022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Latihan4_finda {
    public static void main(String[] args) {
        int[] nilai = new int['n'];
        int max;
        int i, n;

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nilai batasan:");
            n = Integer.parseInt(dataIn.readLine());

            for (i = 0; i < n; i++) {
                System.out.print("Masukkan nomor:");
                nilai[i] = Integer.parseInt(dataIn.readLine());
            }

            max = nilai[0];
            for (i = 0; i < n; i++) {
                if (nilai[i] > max) {
                    max = nilai[i];
                }

            }
            System.out.println("Nilai Max = " + max);

        } catch (IOException e) {
            System.out.print("Error!");
        }

    }
}
