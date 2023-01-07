# Modul 2 PBO Teori_Finda Oktariza

## Pengenalan Bahasa JAVA



### Sejarah Singkat Java
Java telah mengakomodasi hampir seluruh fitur penting bahasa – bahasa 
pemrograman yang ada semenjak perkembangan komputasi modern manusia : 
* Dari SIMULA, bahasa pada tahun 65-an, bahasa yang paling mempengaruhi 
Java sekaligus C++. Dari bahasa ini diadopsi bentukan – bentukan dasar dari 
pemrograman berorientasi objek. 
* Dari LISP – bahasa tahun 55-an. Diadopsi fasilitas garbage collection, serta 
kemampuan untuk meniru generic list processing, meski fasilitas ini jarang 
yang memanfaatkannya. 
* Dari Algol – bahasa pada tahun 60-an, diambil struktur kendali yang 
dimilikinya. 
* Dari C++, diadopsi sintaks, sebagian semantiks dan exception handling 
* Dari bahasa Ada, diambil strongly type, dan exception handling. 
* Dari Objective C, diambil fasilitas interface. 
* Dari bahasa SmallTalk, diambil pendekatan single-root class hiérarchie,
dimana objek adalah satu kesatuan hirarki pewarisan 
* Dari bahasa Eiffel, fasilitas assertion yang mulai diterapkan di sebagian JDK 
1.4

### Teknologi Java
A. Sebuah Bahasa Pemrograman
Java adalah bahasa pemrograman yang berorientasi objek (OOP) dan dapat 
dijalankan pada berbagai platform sistem operasi. Perkembangan Java tidak hanya 
terfokus oada satu sistem operasi, tetapi dikembangkan untuk berbagai sistem 
operasi dan bersifat open source.

B. Sebuah Development Environment 
Sebagai sebuah peralatan pembangun, teknologi Java menyediakan banyak tools : 
compiler, interpreter, penyusun dokumentasi, paket kelas dan sebagainya. 

C. Sebuah Aplikasi 
Aplikasi dengan teknologi Java secara umum adalah aplikasi serbt a guna yang dapat 
dijalankan pada seluruh mesin yang memiliki Java Runtime Environment (JRE). 

D. Sebuah Deployment Environment 
Terdapat dua komponen utama dari Deployment Environment. Yang pertama adalah 
JRE, yang terdapat pada paket J2SDK, mengandung kelas – kelas untuk semua 
paket teknologi Java yang meliputi kelas dasar dari Java, komponen GUI dan 
sebagainya. Komponen yang lain terdapat pada Web Browser. Hampir seluruh Web 
Browser komersial menyediakan interpreter dan runtime environment dari teknologi 
Java.

### Mengapa Mempelajari JAVA? 
Berdasarkan white paper resmi dari SUN, Java memiliki karakteristik berikut : 
1. Sederhana (Simple) 
Bahasa pemrograman Java menggunakan Sintaks mirip dengan C++ namun 
sintaks pada Java telah banyak diperbaiki terutama menghilangkan 
penggunaan pointer yang rumit dan multiple inheritance. Java juga 
menggunakan automatic memory allocation dan memory garbage collection. 
2. Berorientasi objek (Object Oriented) 
Java mengunakan pemrograman berorientasi objek yang membuat program 
dapat dibuat secara modular dan dapat dipergunakan kembali. Pemrograman 
berorientasi objek memodelkan dunia nyata kedalam objek dan melakukan 
interaksi antar objek-objek tersebut. 
3. Terdistribusi (Distributed) 
Java dibuat untuk membuat aplikasi terdistribusi secara mudah dengan adanya 
libraries networking yang terintegrasi pada Java. 
4. Interpreted 
Program Java dijalankan menggunakan interpreter yaitu Java Virtual Machine 
(JVM). Hal ini menyebabkan source code Java yang telah dikompilasi menjadi
Java bytecodes dapat dijalankan pada platform yang berbeda-beda. 
5. Robust 
Java mempuyai reliabilitas yang tinggi. Compiler pada Java mempunyai 
kemampuan mendeteksi error secara lebih teliti dibandingkan bahasa 
pemrograman lain. Java mempunyai runtime-Exception handling untuk 
membantu mengatasi error pada pemrograman. 
6. Secure 
Sebagai bahasa pemrograman untuk aplikasi internet dan terdistribusi, Java 
memiliki beberapa mekanisme keamanan untuk menjaga aplikasi tidak 
digunakan untuk merusak sistem komputer yang menjalankan aplikasi 
tersebut. 
7. Architecture Neutral 
Program Java merupakan platform independent. Program cukup mempunyai 
satu buah versi yang dapat dijalankan pada platform berbeda dengan Java 
Virtual Machine. 
8. Portable 
Source code maupun program Java dapat dengan mudah dibawa ke platform 
yang berbeda-beda tanpa harus dikompilasi ulang. 
9. Performance 
Performance pada Java sering dikatakan kurang tinggi. Namun performance 
Java dapat ditingkatkan menggunakan kompilasi Java lain seperti buatan Inprise, Microsoft ataupun Symantec yang menggunakan Just In Time 
Compilers (JIT). 
10. Multithreaded 
Java mempunyai kemampuan untuk membuat suatu program yang dapat 
melakukan beberapa pekerjaan secara sekaligus dan simultan. 
11. Dynamic 
Java didesain untuk dapat dijalankan pada lingkungan yang dinamis. Perubahan 
pada suatu class dengan menambahkan properties ataupun method dapat 
dilakukan tanpa menggangu program yang menggunakan class tersebut. 

### Fitur Dari Java
* Java Virtual Machine (JVM) 
* Garbage Collection
* Code Security

### Fase-fase Pemrograman Java
1. dalam pembuatan sebuah program berbasis Java adalah 
menuliskan kode program pada text editor. Contoh text editor yang dapat digunakan antara lain : notepad, vi, emacs dan lain sebagainya. Kode program yang dibuat 
2 kemudian tersimpan dalam sebuah berkas berekstensi .java. 
3. Setelah membuat dan menyimpan kode program, kompilasi file yang berisi kode program tersebut dengan menggunakan Java Compiler. Hasil dari adalah berupa berkas bytecode dengan ekstensi .class. 
4. Berkas yang mengandung bytecode tersebut kemudian akan dikonversikan oleh Java Interpreter menjadi bahasa mesin sesuai dengan jenis dan platform yang digunakan.
