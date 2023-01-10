/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7Finda;

/**
 *
 * @author LENOVO
 */
public class Latihan5_finda {
    public static void main(String[] args){
      String entry[][] = {{"Florence", "735-1234", "Manila"},
    {"Joyce", "983-3333", "Quezon City"},
    {"Becca", "456-3322", "Manila"}};

        for ( int i=0;i<3;i++)
        {
            System.out.println("name :"+entry[i][0]);
            System.out.println("telp. :"+entry[i][1]);
            System.out.println("address :"+entry[i][2]);
            System.out.println(" ");
        }
}
}
