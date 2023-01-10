/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6Finda;

/**
 *
 * @author LENOVO
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan9_finda {
     public static void main(String[]args){
        BufferedReader dataIn = new BufferedReader (new
            InputStreamReader (System.in));
        int i=0;
        int n;
        try{
                System.out.print("masukan batasan angka = ");
                n = Integer.parseInt(dataIn.readLine());
            while (i < n) {
                System.out.print("Finda Oktariza\n");
                i++; 
    }             
            }catch( IOException e ){
                System.out.print("Error!");
            }
    }
}
