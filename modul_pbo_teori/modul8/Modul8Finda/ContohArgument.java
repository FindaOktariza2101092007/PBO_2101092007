/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul8Finda;

/**
 *
 * @author LENOVO
 */
public class ContohArgument {
    public static void main(String[] args){
        try{
            System.out.println("Argument ke --> 0 adalah "+ args[0]);
        }catch(Exception ex){
            System.out.println("Eror index ke"+ex.getMessage()+"tidak ada");
        }
    }
}
