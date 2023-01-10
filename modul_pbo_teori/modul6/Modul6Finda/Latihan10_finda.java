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

public class Latihan10_finda {
     public static void main (String[]args)
    {
        BufferedReader dataIn = new BufferedReader (new
        InputStreamReader( System.in ));
        
    int a,p,hasil=1,i;
    try
    {
    System.out.print("Angka:");
    a = Integer.parseInt(dataIn.readLine());
    System.out.print("Pangkat:");
    p = Integer.parseInt(dataIn.readLine());
    
    i=0;
    while(i<p)
    {
        hasil *=a;
        i++;
    }
    System.out.println("Hasil Pangkat = "+ hasil);
    }catch( IOException e ){
    System.out.print("Error!");
    }
    
    }
}
