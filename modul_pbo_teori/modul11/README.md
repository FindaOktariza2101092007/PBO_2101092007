# Modul 11 PBO TEORI finda oktariza


## Pewarisan, Polimorfisme, dan Interface

### Pewarisan
Pewarisan adalah keuntungan besar dalam pemrograman berbasis object karena suatu sifat atau method didefinisikan dalam superclass, sifat ini secara otomatis diwariskan dari semua subclasses. Jadi, Anda dapat menuliskan kode method hanya sekali dan mereka dapat digunakan oleh semua subclass. Subclass hanya butuh mengimplementasikan perbedaannya sendiri dan induknya.
#### Mendefinisikan Superclass dan Subclass 
Untuk memperoleh suatu class, kita menggunakan kata kunci extend. Untuk 
mengilustrasikan ini, kita akan membuat contoh class induk. Dimisalkan kita mempunyai class induk yang dinamakan Person.
#### Kata Kunci Super 
Subclass juga dapat memanggil constructor secara explicit dari superclass terdekat. Hal ini dilakukan dengan pemanggil construktor super. Pemanggil constructor super dalam 
constructor dari subclass akan menghasilkan eksekusi dari superclass constructor yang 
bersangkutan, berdasar dari argumen sebelumnya. 
Sebagai contoh, pada contoh class sebelumnya. Person dan Student, kita tunjukkan contoh 
dari pemanggil constructor super. Diberikan kode berikut untuk Student, 
 
public Student(){ 
super( "SomeName", "SomeAddress" ); 
 System.out.println("Inside Student:Constructor"); 
 } 
Kode ini memanggil constructor kedua dari superclass terdekat(yaitu adalah Person) dan 
mengeksekusinya.
Kode ini memanggil default constructor dari superclass terdekat(yaitu Person) dan 
mengeksekusinya. Contoh kode lain ditunjukkan sebagai berikut, 
public Student(){ 
super(); 
 System.out.println("Inside Student:Constructor"); 
 }
Ada beberapa hal yang harus diingat ketika menggunakan pemanggil konstuktor super: 
1. Pemanggil super() HARUS DIJADIKAN PERNYATAAN PERTAMA DALAM constructor. 
2. Pemanggil super() hanya dapat digunakan dalam definisi constructor. 
3. Termasuk constructor this() dan pemanggil super() TIDAK BOLEH TERJADI DALAM 
constructor YANG SAMA.
#### Overriding Method 
Untuk beberapa pertimbangan, kadang-kadang class asal perlu mempunyai implementasi 
berbeda dari method yang khusus dari superclass tersebut. Oleh karena itulah, method 
overriding digunakan. Subclass dapat mengesampingkan method yang didefinisikan dalam 
superclass dengan menyediakan implementasi baru dari method tersebut. 
#### Method final dan class final 
Dalam Java, juga memungkinkan untuk mendeklarasikan class-class yang tidak lama 
menjadi subclass. Class ini dinamakan class final. Untuk mendeklarasikan class untuk 
menjadi final kita hanya menambahkan kata kunci final dalam deklarasi class. Untuk 
contohnya, jika kita ingin class Person untuk dideklarasikan final, kita tulis, 
 
public final class Person 
{ 
 //area kode 
 } 
 
Beberapa class dalam Java API dideklarasikan secara final untuk memastikan sifatnya tidak 
dapat di-override. Contoh-contoh dari class ini adalah Integer, Double, dan String. 
Ini memungkinkan dalam Java membuat method yang tidak dapat di-override. Method ini 
dapat kita panggil method final. Untuk mendeklarasikan method untuk menjadi final, kita 
tambahkan kata kunci final ke dalam deklarasi method.

### Polimorfisme 
Sekarang, class induk Person dan subclass Student dari contoh sebelumnya, kita 
tambahkan subclass lain dari Person yaitu Employee. Di bawah ini adalah hierarkinya, 
Person
Student Employee
 
Dalam Java, kita dapat membuat referensi yang merupakan tipe dari superclass ke sebuah object dari subclass tersebut. 

### Abstract Class 
Misalnya kita ingin membuat superclass yang mempunyai method tertentu yang berisi 
implementasi, dan juga beberapa method yang akan di-overridden oleh subclasses nya. 
Sebagai contoh, kita akan membuat superclass bernama LivingThing. class ini mempunyai 
method tertentu seperti breath, eat, sleep, dan walk. Akan tetapi, ada beberapa method di 
dalam superclass yang sifatnya tidak dapat digeneralisasi. Kita ambil contoh, method walk. 
Tidak semua kehidupan berjalan(walk) dalam cara yang sama. Ambil manusia sebagai 
misal, kita manusia berjalan dengan dua kaki, dimana kehidupan lainnya seperti anjing 
berjalan dengan empat kaki. Akan tetapi, beberapa ciri umum dalam kehidupan sudah 
biasa, itulah kenapa kita inginkan membuat superclass umum dalam hal ini. 
 
Kita dapat membuat superclass yang mempunyai beberapa method dengan implementasi 
sedangkan yang lain tidak. Class jenis ini yang disebut dengan class abstract. 
Sebuah class abstract adalah class yang tidak dapat di-instantiate. Seringkali muncul di 
atas hirarki class pemrograman berbasis object, dan mendefinisikan keseluruhan aksi yang 
mungkin pada object dari seluruh subclasses dalam class. 
Method ini dalam class abstract yang tidak mempunyai implementasi dinamakan method 
abstract. Untuk membuat method abstract, tinggal menulis deklarasi method tanpa tubuh 
class dan digunakan menggunakan kata kunci abstract. Contohnya, 
 
 public abstract void someMethod();
 
 ### Interface 
Interface adalah jenis khusus dari blok yang hanya berisi method signature(atau constant 
). Interface mendefinisikan sebuah(signature) dari sebuah kumpulan method tanpa tubuh. 
Interface mendefinisikan sebuah cara standar dan umum dalam menetapkan sifat-sifat dari 
class-class. Mereka menyediakan class-class, tanpa memperhatikan lokasinya dalam hirarki 
class, untuk mengimplementasikan sifat-sifat yang umum. Dengan catatan bahwa 
interface-interface juga menunjukkan polimorfisme, dikarenakan program dapat memanggil 
method interface dan versi yang tepat dari method yang akan dieksekusi tergantung dari 
tipe object yang melewati pemanggil method interface.
#### Kenapa Kita Memakai Interface? 
Kita akan menggunakan interface jika kita ingin class yang tidak berhubungan 
mengimplementasikan method yang sama. Melalui interface-interface, kita dapat 
menangkap kemiripan diantara class yang tidak berhubungan tanpa membuatnya seolaholah class yang berhubungan. 
Mari kita ambil contoh class Line dimana berisi method yang menghitung panjang dari 
garis dan membandingkan object Line ke object dari class yang sama. Sekarang, misalkan 
kita punya class yang lain yaitu MyInteger dimana berisi method yang membandingkan 
object MyInteger ke object dari class yang sama. Seperti yang kita lihat disini, kedua 
class-class mempunyai method yang mirip dimana membandingkan mereka dari object lain 
dalam tipe yang sama, tetapi mereka tidak berhubungan sama sekali. Supaya dapat 
menjalankan cara untuk memastikan bahwa dua class-class ini mengimplementasikan 
beberapa method dengan tanda yang sama, kita dapat menggunakan sebuah interface 
untuk hal ini. Kita dapat membuat sebuah class interface, katakanlah interface Relation
dimana mempunyai deklarasi method pembanding. Relasi interface dapat dideklarasikan 
sebagai, 
public interface Relation 
{ 
 public boolean isGreater( Object a, Object b); 
 public boolean isLess( Object a, Object b); 
 public boolean isEqual( Object a, Object b); 
} 
 
Alasan lain dalam menggunakan interface pemrograman object adalah untuk menyatakan 
sebuah interface pemrograman object tanpa menyatakan classnya. Seperti yang dapat kita 
lihat nanti dalam bagian Interface vs class, kita dapat benar-benar menggunakan interface 
sebagai tipe data. 
 
Pada akhirnya, kita perlu menggunakan interface untuk pewarisan model jamak dimana 
menyediakan class untuk mempunyai lebih dari satu superclass. Pewarisan jamak tidak 
ditunjukkan di Java, tetapi ditunjukkan di bahasa berorientasi object lain seperti C++.
#### Interface vs. Class Abstract 
Berikut ini adalah perbedaan utama antara sebuah interface dan sebuah class abstract: 
method interface tidak punya tubuh, sebuah interface hanya dapat mendefinisikan konstanta dan interface tidak langsung mewariskan hubungan dengan class istimewa lainnya, mereka didefinisikan secara independent.
#### Interface vs. Class 
 
Satu ciri umum dari sebuah interface dan class adalah pada tipe mereka berdua. Ini artinya 
bahwa sebuah interface dapat digunakan dalam tempat-tempat dimana sebuah class dapat 
digunakan. Sebagai contoh, diberikan class Person dan interface PersonInterface, berikut 
deklarasi yang benar: 
 PersonInterface pi = new Person(); 
 Person pc = new Person(); 
Bagaimanapun, Anda tidak dapat membuat instance dari sebuah interface. 
Contohnya: 
PersonInterface pi = new PersonInterface(); //COMPILE 
 //ERROR!!! 
Ciri umum lain adalah baik interface maupun class dapat mendefinisikan method. 
Bagaimanapun, sebuah interface tidak punya sebuah kode implementasi sedangkan class 
memiliki salah satunya. 
#### Membuat Interface 
Untuk membuat interface, kita tulis, 
public interface [InterfaceName] 
 { 
 //beberapa method tanpa isi 
 } 
 #### Hubungan dari Interface ke Class 
Seperti yang telah kita lihat dalam bagian sebelumnya, class dapat mengimplementasikan 
sebuah interface selama kode implementasi untuk semua method yang didefinisikan dalam 
interface tersedia. 
Hal lain yang perlu dicatat tentang hubungan antara interface ke class-class yaitu, class 
hanya dapat mengEXTEND SATU superclass, tetapi dapat mengIMPLEMENTASIkan BANYAK 
interface. Sebuah contoh dari sebuah class yang mengimplementasikan interface adalah, 
public class Person implements PersonInterface, 
 LivingThing, 
 WhateverInterface { 
 //beberapa kode di sini 
 } 
 
Contoh lain dari class yang meng-extend satu superclass dan mengimplementasikan 
sebuah interface adalah, 
public class ComputerScienceStudent extends Student 
 implements PersonInterface, 
 LivingThing { 
 //beberapa kode di sini 
 } 
Catatan bahwa sebuah interface bukan bagian dari hirarki pewarisan class. Class yang tidak 
berhubungan dapat mengimplementasikan interface yang sama.
#### Pewarisan Antar Interface 
Interface bukan bagian dari hirarki class. Bagaimanapun, interface dapat mempunyai 
hubungan pewarisan antara mereka sendiri. Contohnya, misal kita punya dua interface 
StudentInterface dan PersonInterface. Jika StudentInterface meng-extend 
PersonInterface, maka ia akan mewariskan semua deklarasi method dalam PersonInterface. 
public interface PersonInterface { 
 . . . 
} 
public interface StudentInterface extends PersonInterface { 
 . . . 
 }
