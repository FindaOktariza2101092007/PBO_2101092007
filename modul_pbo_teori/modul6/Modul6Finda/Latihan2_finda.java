/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6Finda;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Latihan2_finda {
     public static void main( String[] args ) { 
      int grade =0; 
      String msg= " ";
      grade= Integer.parseInt(JOptionPane.showInputDialog("Please enter your grade"));
      
        if( grade >= 90 ){ 
            msg="Excellent!"; 
        } 
        else if( (grade < 90) && (grade >= 80)){ 
            msg="Good job!"; 
        } 
        else if( (grade < 80) && (grade >= 60)){ 
            msg="Study harder!"; 
        } 
        else{ 
            msg="Sorry, you failed."; 
        } 
        JOptionPane.showMessageDialog(null,"nilai anda "+grade+"\n"+ msg);
    } 
}
