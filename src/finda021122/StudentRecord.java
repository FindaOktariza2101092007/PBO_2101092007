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
public class StudentRecord {
     private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
    
    public StudentRecord() {
        this("Alif","Padang",20);
    }

    public StudentRecord(String temp) {
        studentCount++;
        this.name = temp;
    }

    public StudentRecord(String name, String address,int age) {
        studentCount++;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public StudentRecord(double mGrade, double eGrade, double sGrade) {
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
    }
    
     public String GetName() {
        return name;
    }
      public void SetName(String temp) {
        //this berfungsi untuk menandakan variabel name public
        this.name = temp;
    }
      public String GetAddress() {
        return address;
    }

    public void SetAddress(String temp) {
        //this berfungsi untuk menandakan variabel name public
        this.address = temp;

    }
       public int GetAge() {
        return age;
    }
        public void SetAge(int temp) {
        //this berfungsi untuk menandakan variabel name public
        this.age = temp;
    }
    public double GetMathGrade() {
        return mathGrade;
    }

    public void SetMathGrade(double temp) {
        //this berfungsi untuk menandakan variabel name public
        this.mathGrade = temp;

    }

    public double GetEnglishGrade() {
        return englishGrade;
    }

    public void SetEnglishGrade(double temp) {
        //this berfungsi untuk menandakan variabel name public
        this.englishGrade = temp;

    }

    public double GetScienceGrade() {
        return scienceGrade;
    }

    public void SetScienceGrade(double temp) {
        //this berfungsi untuk menandakan variabel name public
        this.scienceGrade = temp;

    }
    public double GetAverage() {
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
     public static int getStudentCount() {
        return studentCount;
    }
      public void print( String temp ){ 
        System.out.println("Name:" + name); 
        System.out.println("Address:" + address); 
        System.out.println("Age:" + age); 
    } 
       public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:" + name); 
        System.out.println("Math Grade:" + mGrade); 
        System.out.println("English Grade:" + eGrade); 
        System.out.println("Science Grade:" + sGrade); 
    } 
       public double getMaximum(){
            double max;
            max=mathGrade;
            max=(max>englishGrade)? max:englishGrade;
            max=(max>scienceGrade)? max:scienceGrade;
            return max;
       }
}
