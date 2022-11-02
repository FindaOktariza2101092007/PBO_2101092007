/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finda021122;

/**
 *
 * @author LENOVO
 */
public class StudentRecordExample {
     public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord();
        //isi object
        //set : mengisi atau memberi
        student1.SetName("Finda");
        student1.SetAddress("Padang");
        student1.SetAge(20);
        student1.SetEnglishGrade(80);
        student1.SetMathGrade(90);
        student1.SetScienceGrade(80);

        //get : menampilkan
        System.out.println("Nama : " + student1.GetName());
        System.out.println("Alamat : " + student1.GetAddress());
        System.out.println("Umur :" + student1.GetAge());
        System.out.println("Matematika :" + student1.GetMathGrade());
        System.out.println("B.inggris :" + student1.GetEnglishGrade());
        System.out.println("Pengetahuan :" + student1.GetScienceGrade());
        System.out.println("rata-rata :" + student1.GetAverage());
        System.out.println("Nilai Maximum :" + student1.getMaximum());
      
        StudentRecord student2 = new StudentRecord();
        student2.SetName("Bintang");
        student2.SetAddress("Padang");
        student2.SetAge(20);
        student2.SetEnglishGrade(70);
        student2.SetMathGrade(80);
        student2.SetScienceGrade(80);
        student2.print("");
        student2.print(student2.GetEnglishGrade(),
            student2.GetMathGrade(),student2.GetScienceGrade());
        
        
       
    }
}
