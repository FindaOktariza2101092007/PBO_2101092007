# Modul 10 PBO TEORI finda oktariza

## Membuat Class Sendiri

### Mendefinisikan Class Anda 
Sebelum menulis class Anda, pertama pertimbangkan dimana Anda akan menggunakan 
class dan bagaimana class tersebut akan digunakan. Pertimbangkan pula nama yang tepat dan tuliskan seluruh informasi atau properti yang ingin Anda isi pada class. Jangan sampai terlupa untuk menuliskan secara urut method yang akan Anda gunakan dalam class. Dalam pendefinisian class, dituliskan : 
<modifier> class <name> { 
<attributeDeclaration>* 
<constructorDeclaration>* 
<methodDeclaration>* 
} 
dimana : 
<modifier> adalah sebuah access modifier, yang dapat dikombinasikan dengan tipe modifierlain.
Untuk mendefinisikan class, kita tuliskan : 
public class StudentRecord 
{ 
//area penulisan kode selanjutnya 
} 
dimana, 
Public - Class ini dapat diakses dari luar package 
Class - Keyword yang digunakan di pembuatan class Java 
StudentRecord - Identifier yang menjelaskan class

#### Deklarasi Atribut
Dalam pendeklarasian atribut, kita tuliskan : 
<modifier> <type> <name> [= <default_value>]; 
Langkah selanjutnya adalah mengurutkan atribut yang akan diisikan pada class. Untuk setiap informasi, urutkan juga tipe data yang yang tepat untuk digunakan. Contohnya, Anda tidak mungkin menginginkan untuk menggunakan tipe data integer untuk nama siswa, atau tipe data string pada nilai siswa.

#### Instance Variable 
Jika kita telah menuliskan seluruh atribut yang akan diisikan pada class, selanjutnya kita akan menuliskannya pada kode. Jika kita menginginkan bahwa atribut – atribut tersebut adalah unik untuk setiap object (dalam hal ini untuk setiap siswa), maka kita harus mendeklarasikannya sebagai instance variable : private disini menjelaskan bahwa variabel tersebut hanya dapat diakses oleh class itu sendiri. Object lain tidak dapat menggunakan variabel tersebut secara langsung. Kita akan membahas tentang kemampuan akses pada pembahasan selanjutnya.

#### Class Variable atau Static Variables 
Disamping instance variable, kita juga dapat mendeklarasikan class variable atau variabel yang dimiliki class sepenuhnya. Nilai pada variabel ini sama pada semua object di class yang sama. Anggaplah kita menginginkan jumlah dari siswa yang dimiliki dari seluruh kelas, kita dapat mendeklarasiakan satu static variable yang akan menampung nilai tersebut. Kita beri nama variabel tersebut dengan nama studentCount. Kita gunakan keyword : ’static’ untuk mendeklarasikan bahwa variabel tersebut adalah static. 

#### Deklarasi Methods 
Sebelum kita membahas method apa yang akan dipakai pada class, mari kita perhatikan 
penulisan method secara umum. 
Dalam pendeklarasian method, kita tuliskan : 
<modifier> <returnType> <name>(<parameter>*) { 
<statement>* 
} 
dimana, 
<modifier> dapat menggunakan beberapa modifier yang berbeda 
<returnType> dapat berupa seluruh tipe data, termasuk void 
<name> identifier atas class 
<parameter> ::= <tipe_parameter> <nama_parameter>[,]
* Accessor Methods 
Untuk mengimplementasikan enkapsulasi, kita tidak menginginkan sembarang object dapat mengakses data kapan saja. Untuk itu, kita deklarasikan atribut dari class sebagai private. Namun, ada kalanya dimana kita menginginkan object lain untuk dapat mengakses data private. Dalam hal ini kita gunakan accessor methods. 
Accessor Methods digunakan untuk membaca nilai variabel pada class, baik berupa instance maupun static. Sebuah accessor method umumnya dimulai dengan penulisan get<namaInstanceVariable>. Method ini juga mempunyai sebuah return value.
* Mutator Methods
Bagaimana jika kita menghendaki object lain untuk mengubah data? Yang dapat kita 
lakukan adalah membuat method yang dapat memberi atau mengubah nilai variable dalam 
class, baik itu berupa instance maupun static. Method semacam ini disebut dengan mutator 
methods. Sebuah mutator method umumnya tertulis set<namaInstanceVariabel>. 
Mari kita perhatikan salah satu dari implementasi mutator method : 
public class StudentRecord 
{ 
private String name; 
: 
: 
public void setName( String temp ){ 
name = temp; 
} 
} 
dimana, 
public - Menjelaskan bahwa method ini dapat dipanggil object luar kelas 
void - Method ini tidak menghasilkan return value 
setName - Nama dari method 
(String temp) - Parameter yang akan digunakan pada method 
Pernyataan berikut : 
name = temp; 
mengidentifikasi nilai dari temp sama dengan name dan mengubah data pada instance 
variable name. 
Perlu diingat bahwa mutator methods tidak menghasilkan return value. Namun berisi 
beberapa argumen dari program yang akan digunakan oleh method.
* Multiple Return Statements 
Anda dapat mempunyai banyak return values pada sebuah method selama mereka tidak 
pada blok program yang sama. Anda juga dapat menggunakan konstanta disamping 
variabel sebagai return value.
* Static Methods 
Kita menggunakan static method untuk mengakses static variable studentCount. 
public class StudentRecord 
{ 
private static int studentCount; 
public static int getStudentCount(){ 
return studentCount; 
} 
} 
dimana, 
public - Menjelaskan bahwa method ini dapat diakses object luar kelas 
static - Method ini adalah static dan pemanggilannya menggunakan 
[namaKelas].[namaMethod]. Sebagai contoh : 
studentRecord.getStudentCount 
Int - Tipe return dari method. Mengindikasikan method tersebut harus 
mempunyai return value berupa integer 
getStudentCount - Nama dari method
public - Menjelaskan bahwa method ini dapat diakses object luar kelas 
() - Method ini tidak memiliki parameter apapun 
Pada deklarasi di atas, method getStudentCount() akan selalu menghasilkan return value 0 
jika kita tidak mengubah apapun pada kode program untuk mengatur nilainya. Kita akan 
membahas pengubahan nilai dari studentCount pada pembahasan constructor.

#### Referensi this 
Referensi this digunakan untuk mengakses instance variable yang dibiaskan oleh parameter. Untuk pemahaman lebih lanjut, mari kita perhatikan contoh pada methodsetAge. Asumsikan kita mempunyai kode deklarasi berikut pada method setAge. 

#### Overloading Methods 
Dalam class yang kita buat, kadangkala kita menginginkan untuk membuat method dengan nama yang sama namun mempunyai fungsi yang berbeda menurut parameter yang digunakan. Kemampuan ini dimungkinkan dalam pemrograman Java, dan dikenal sebagai overloading method. Overloading method mengijinkan sebuah method dengan nama yang sama namun memiliki parameter yang berbeda sehingga mempunyai implementasi dan return value yang berbeda pula. Daripada memberikan nama yang berbeda pada setiap pembuatan method, 
overloading method dapat digunakan pada operasi yang sama namun berbeda dalam 
implementasinya.

#### Deklarasi Constructor 
Telah tersirat pada pembahasan sebelumnya, Constructor sangatlah penting pada 
pembentukan sebuah object. Constructor adalah method dimana seluruh inisialisasi object
ditempatkan. 
Berikut ini adalah property dari Constructor : 
1. Constructor memiliki nama yang sama dengan class 
2. Sebuah Constructor mirip dengan method pada umumnya, namun hanya informasi – 
informasi berikut yang dapat ditempatkan pada header sebuah constructor, scope
atau identifikasi pengaksesan (misal: public), nama dari konstuktor dan parameter. 
3. Constructor tidak memiliki return value 
4. Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class.

* Default Constructor 
Setiap kelas memiliki default constructor. Sebuah default constructor adalah constructor yang tidak memiliki parameter apapun. Jika sebuah class tidak memiliki constructor apapun, maka sebuah default constructor akan terbuat secara implisit : 
Sebagai contoh, pada class StudentRecord, bentuk default constructor akan terlihat seperti 
dibawah ini : 
public StudentRecord() 
{ 
//area penulisan kode 
} 
* Overloading Constructor 
Seperti telah kita bahas sebelumnya, sebuah constructor juga dapat dibentuk menjadi overloaded.
* Menggunakan Constructor
Sebelum kita lanjutkan, mari kita perhatikan kembali deklarasi static variable studentCount yang telah dibuat sebelumnya. Tujuan deklarasi studentCount adalah untuk menghitung jumlah object yang dibentuk pada class StudentRecord. Jadi, apa yang akan kita lakukan selanjutnya adalah menambahkan nilai dari studentCount setiap kali setiap pembentukan object pada class StudentRecord. Lokasi yang tepat untuk memodifikasi dan menambahkan nilai studentCount terletak pada constructor-nya, karena selalu dipanggil setiap kali objek terbentuk.
* Pemanggilan Constructor Dengan this() 
Pemanggilan constructor dapat dilakukan secara berangkai, dalam arti Anda dapat 
memanggil constructor di dalam constructor lain. Pemanggilan dapat dilakukan dengan 
referensi this(). Perhatikan contoh kode sebagai berikut : 
1: public StudentRecord(){ 
2: this("some string"); 
3: 
4: } 
5: 
6: public StudentRecord(String temp){ 
7: this.name = temp; 
8: } 
9: 
10: public static void main( String[] args ) 
11: { 
12: 
13: StudentRecord annaRecord = new StudentRecord(); 
14: } 
Dari contoh kode diatas, pada saat baris ke 13 dipanggil akan memanggil constructor dasar 
pada baris pertama. Pada saat baris kedua dijalankan, baris tersebut akan menjalankan 
constructor yang memiliki parameter String pada baris ke-6. 
Beberapa hal yang patut diperhatikan pada penggunaan this() : 
1. Harus dituliskan pada baris pertama pada sebuah constructor 
2. Hanya dapat digunakan pada satu definisi constructor. Kemudian metode ini dapat 
diikuti dengan kode – kode berikutnya yang relevan 

#### Packages 
Packages dalam JAVA berarti pengelompokan beberapa class dan interface dalam satu unit. Fitur ini menyediakan mekanisme untuk mengatur class dan interface dalam jumlah banyak dan menghindari konflik pada penamaan.
1. Mengimport Packages 
Supaya dapat meggunakan class yang berada diluar package yang sedang dikerjakan, Anda 
harus mengimport package dimana class tersebut berada. Pada dasarnya, seluruh program 
JAVA mengimport package java.lang.*, sehingga Anda dapat menggunakan class seperti 
String dan Integer dalam program meskipun belum mengimport package sama sekali. 
Penulisan import package dapat dilakukan seperti dibawah ini : 
import <namaPaket>; 
Sebagai contoh, bila Anda ingin menggunakan class Color dalam package awt, Anda harus 
menuliskan import package sebagai berikut : 
import java.awt.Color; 
import java.awt.*; 
Baris pertama menyatakan untuk mengimport class Color secara spesifik pada package, sedangkan baris kedua menyatakan mengimport seluruh class yang terkandung dalam package java.awt. 
2. Membuat Package 
Untuk membuat package, dapat dilakukan dengan menuliskan : 
package <packageName>; 
Anggaplah kita ingin membuat package dimana class StudentRecord akan ditempatkan 
bersama dengan class – class yang lain dengan nama package schoolClasses. 
3. Pengaturan CLASSPATH 
Diasumsikan package schoolClasses terdapat pada direktori C:\. Langkah selanjutnya adalah mengatur classpath untuk menunjuk direktori tersebut sehingga pada saat akan 
dijalankan, JVM dapat mengetahui dimana class tersebut tersimpan. 
Sebelum membahas cara mengatur classpath, perhatikan contoh dibawah yang 
menAndakan kejadian bila kita tidak mengatur classpath.

#### Access Modifiers 
Pada saat membuat, mengatur properties dan class methods, kita ingin untuk 
mengimplementasikan beberapa macam larangan untuk mengakses data. Sebagai contoh, 
jika Anda ingin beberapa atribut hanya dapat diubah hanya dengan method tertentu, tentu 
Anda ingin menyembunyikannya dari object lain pada class. Di JAVA, implementasi tersebut 
disebut dengan access modifiers. 
Terdapat 4 macam access modifiers di JAVA, yaitu : public, private, protected dan default. 3 
tipe akses pertama tertulis secara ekplisit pada kode untuk mengindikasikan tipe akses, 
sedangkan yang keempat yang merupakan tipe default, tidak diperlukan penulisan keyword 
atas tipe. 
* Akses Default (Package Accessibility) 
Tipe ini mempersyaratkan bahwa hanya class dalam package yang sama yang memiliki hak akses terhadap variabel dan methods dalam class. Tidak terdapat keyword pada tipe ini.
* Akses Public 
Tipe ini mengijinkan seluruh class member untuk diakses baik dari dalam dan luar class. Object apapun yang memiliki interaksi pada class memiliki akses penuh terhadap member dari tipe ini.
* Akses Protected 
Tipe ini hanya mengijinkan class member untuk diakses oleh method dalam class tersebut dan elemen – elemen subclass.
* Akses Private 
Tipe ini mengijinkan pengaksesan class hanya dapat diakses oleh class dimana tipe ini dibuat.
