# Modul 5 PBO TEORI finda oktariza


## Mendapatkan Input dari Keyboard 

### Menggunakan BufferedReader untuk mendapatkan input
 langkah-langkah yang diperlukan untuk mendapatkan input dari 
keyboard: 
1. Tambahkan di bagian paling atas code anda: 
       import java.io.*; 
2. Tambahkan statement ini: 
     BufferedReader dataIn = new BufferedReader(new InputStreamReader(    System.in) ); 
3. Deklarasikan variabel String temporer untuk mendapatkan input, dan gunakan fungsi readLine() untuk mendapatkan input dari keyboard. Anda harus mengetikkannya di dalam blok try-catch: 
      try{ 
       String temp = dataIn.readLine(); 
       } 
       catch( IOException e ){ 
       System.out.println(“Error in getting input”); 
       }
  pada program Latihan3_finda menjelaskan :
  Statement, 
     import java.io.BufferedReader; 
     import java.io.InputStreamReader; 
     import java.io.IOException; 
     
menjelaskan bahwa kita akan menggunakan kelas BufferedReader, InputStreamReader dan IOException yang berada di java.io package. Java Application Programming Interface (API) sudah berisi ratusan kelas yang bisa digunakan untuk program anda. Kelas-kelas tersebut dikumpulkan ke dalam packages. 
Packages memiliki kelas yang mempunyai fungsi yang saling berhubungan. Seperti pada contoh di atas, java.io package mengandung kelas-kelas yang memungkinkan program untuk melakukan input dan output data. Statement diatas juga dapat ditulis, 
     import java.io.*; 
yang akan mengeluarkan semua kelas yang berada pada paket, dan selanjutnya kita bisa menggunakan kelas-kelas tersebut pada program kita. 

Dua statement selanjutnya, 
     public class Latihan3_finda 
     { 
      public static void main( String[] args ){ 
      
Statement ini menyatakan bahwa kita mendeklarasikan sebuah class bernama GetInputFromKeyboard dan kita mendeklarasikan main method. 

Pada statement, 
       BufferedReader dataIn = new BufferedReader(new 
                      InputStreamReader( System.in) ); 
                      
kita mendeklarasikan sebuah variabel bernama dataIn dengan tipe kelas 
BufferedReader. Jangan mengkhawatirkan tentang maksud dari syntax saat ini. 

Sekarang, kita akan mendeklarasikan variabel String dengan identifier name, 
      String name = ""; 
      
Statement diatas merupakan tempat untuk menyimpan input dari user. Variabel name 
diinisialisasi sebagai String kosong "". Sebaiknya kita selalu menginisialisasi sebuah variabel setelah kita mendeklarasikannya. 

Baris berikutnya adalah memberikan output string pada layar menanyakan nama user. 
       System.out.print("Please Enter Your Name:");
       
Sekarang, block di bawah ini merupakan try-catch block, 
       try{ 
        name = dataIn.readLine(); 
       }catch( IOException e ){ 
        System.out.println("Error!"); 
       } 
       
Pada baris ini menjelaskan bahwa kemungkinan terjadi error pada statement 
       name = dataIn.readLine(); 
       
menambahkan kode ini untuk menggunakan readLine() method dari BufferedReader 
untuk mendapatkan input dari user. 

Selanjutnya statement, 
      name = dataIn.readLine(); 
      
method diatas memanggil dataIn.readLine(), mendapatkan input dari user dan 
memberikan sebuah nilai String. Nilai ini akan disimpan ke dalam variabel name, yang akan kita gunakan pada statement akhir untuk menyambut user, 
     System.out.println("Hello " + name + "!");
             
### Menggunakan JOptionPane untuk mendapatkan input
Cara lain untuk mendapatkan input dari user adalah dengan menggunakan kelas 
JoptionPane yang didapatkan dari javax.swing package. JoptionPane membuat 
kemudahan dengan memunculkan dialog box standar yang memberikan kepada user 
sebuah nilai atau menginformasikan sesuatu.
contoh : program Latihan3_finda.java

Statement pertama, 
    import javax.swing.JOptionPane; 
Menjelaskan bahwa kita mengimport kelas JoptionPane dari javax.swing package. 
Bisa juga ditulis, 
     import javax.swing.*;
     
statement selanjutnya, 
    name = JOptionPane.showInputDialog("Please enter your name"); 
membuat sebuah JOptionPane input dialog, yang akan menampilkan dialog dengan 
sebuah pesan, sebuah textfield dan tombol OK. Hasil dari dialog tersebut adalah String dan disimpan ke dalam variabel name. 

membuat pesan selamat datang, yang akan disimpan ke dalam variabe 
msg, 
    String msg = "Hello " + name + "!";
    
Baris selanjutnya adalah menampilkan sebuah dialog yang memilki sebuah pesan dan tombol OK, 
     JOptionPane.showMessageDialog(null, msg);

