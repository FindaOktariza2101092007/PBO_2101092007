# Modul 4 PBO TEORI finda oktariza

## Dasar-Dasar Pemrograman

### Menganalisa program Java pertama saya

[Img 1](images/1.png)
Baris pertama kode : 
         public class HelloFinda 
mengindikasikan nama class yaitu HelloFinda. Pada java semua kode seharusnya ditempatkan didalam deklarasi class. Kita melakukannya dengan menggunakan kata kunci class. Sebagai tambahan, class menggunakan akses khusus public, yang mengindikasikan bahwa class kita mempunyai akses bebas ke class yang lain dari package yang lain pula (package merupakan kumpulan class-class).

Baris berikutnya yaitu yang terdiri atas kurung kurawal { mengindikasikan awal blok. Pada kode ini, kita menempatkan kurung kurawal pada baris selanjutnya setelah deklarasi class, bagaimanapun, kita dapat juga meletakkan kurung kurawal ini setelah baris pertama dari kode yang kita tulis. Jadi, kita dapat menulis kode kita sebagai berikut : 
         public class HelloFinda 
         { 
         atau 
          public class HelloFinda { 
          
Tiga baris selanjutnya mengindikasikan adanya komentar dalam bahasa java. Komentar adalah sesuatu yang digunakan untuk mendokumentasikan setiap bagian dari kode yang ditulis. Komentar bukan merupakan bagian dari program itu sendiri, tetapi digunakan untuk tujuan dokumentasi. Komentar itu sendiri dapat ditambahkan pada kode yang anda tulis sebagai petunjuk yang dapat membantu proses pembelajaran pemrograman yang baik. 
         /** 
         * My first java program 
         */ 
         
Komentar diindikasikan oleh tanda “/*” dan “*/”. Segala sesuatu yang ada diantara tanda tersebut diabaikan oleh compiler java, dan mereka hanya dianggap sebagai komentar. 

Baris selanjutnya, 
        public static void main(String[] args) { 
        
 atau dapat juga ditulis sebagai berikut, 
 
        public static void main(String[] args) { 
        
mengindikasikan nama suatu method dalam class Hello yang bertindak sebagai method utama. Method utama adalah titik awal dari suatu program java. Semua proram kecuali applet yang ditulis dalam bahasa java dimulai dengan method utama. Yakinkan untuk mengikuti kaidah penulisan tanda yang benar. 

Baris selanjutnya juga merupakan komentar, 
   //prints the string "Hello world" on screen 
Sekarang kita mempelajari 2 cara untuk membuat komentar. Cara pertama adalah dengan menempatkan komentar dalam /* dan */, dan cara yang lain adalah dengan menuliskan tanda // pada awal komentar 

Baris selanjutnya, 
    System.out.println("Hello world!"); 
menampilkan teks “Hello World!” pada layar. Perintah System.out.println(), menampilkan teks yang diapit oleh tanda double pute (“ ”) pada layar. 
Dua baris terakhir yang terdiri atas dua kurung kurawal digunakan untuk menutup method utama dan masing-masing class secara berurutan.


### Komentar pada Java
Komentar adalah catatan yang ditulis pada kode dengan tujuan sebagai bahan 
dokumentasi. teks ini bukan bagian dari program dan tidak mempengaruhi jalannya program. 
Java mendukung tiga jenis komentar : C++ style komentar satu baris, C style beberapa baris, dan komentar javadoc khusus 
* Penulisan Komentar pada C++ 
komentar C++Style diawali dengan //. Semua teks setelah // dianggap sebagai komentar. 
Sebagi contoh, 
      // This is a C++ style or single line comments 
      
* Penulisan Komentar pada C 
Komentar C-style atau juga disebut komentar beberapa baris diawali dengan /* dan diakhiri dengan */. Semua teks yang ada diantara dua tanda tersebut dianggap sebagai komentar. Tidak seperti komentar C++ style, itu dapat menjangkau beberapa baris. Sebagai contoh, 
     /* this is an exmaple of a 
      C style or multiline comments */ 
 * Komentar Khusus javadoc 
Komentar javadoc khusus digunakan untuk generatisasi dokumentasi HTML untuk program java anda. Anda dapat menciptakan komentar javadoc dengan memulai baris dengan /** dan mengakhirinya dengan */. Seperti Komentar C_style, ini dapat juga menjangkau beberapa baris. Ini juga dapat terdiri atas tag-tag untuk menambahkan lebih banyak informasi pada komentar anda. Sebagai contoh, 
     /** 
      This is an example of special java doc comments used 
     for \n 
      generating an html documentation. It uses tags like: 
      @author Florence Balagtas 
      @version 1.2 
     */

### Pernyataan dalamJava dan Block 
pernyataan adalah satu atau lebih baris kode yang diakhiri dengan semicolon. sebagai contoh untuk pernyataan tunggal adalah 
     System.out.println(“Hello world”); 
     
Block adalah satu atau lebih pernyataan yang terbentang antara kurung kurawal buka dan kurung kurawal tutup yaitu sekumpulan pernyataan sebagai satu unit kesatuan. Block pernyataan dapat dikumpulkan akan tetapi tidak secara pasti mempunyai keterkaitan fungsi. beberapa jumlah spasi kosong diijinkan terdapat didalamnya, sebagai contoh dari suatu block adalah : 
      public static void main( String[] args ){ 
       System.out.println("Hello"); 
       System.out.println("world"); 
      }

###  Java Identifier
* Tidak bisa dipungkiri, saat ini Spring adalah satu-satunya framework paling populer di Java
* Belum ada yang bisa menandingi popularitasnya di Java
* Saking populernya, bahkan banyak perusahaan pindah ke JVM karena ingin menggunakan Spring-nya, bukan Java
* Dengan banyaknya bahasa yang bisa berjalan di atas JVM, seperti Kotlin, Groovy dan Scala, maka secara programmer punya banyak pilihan bahasa pemrograman ketika menggunakan Spring Spring juga sudah banyak sekali diadopsi di banyak perusahaan, baik itu skala besar atau kecil
 
### Ekosistem Pendukung
Java Identifier adalah suatu tanda yang mewakili nama-nama vaiabel, method, class dsb. Pendeklarasian Java adalah case-sensitive. Hal ini berarti bahwa pengidentifikasi : Hello tidak sama dengan hello. Pengidentifikasi harus dimulai dengan salah satu huruf, underscore “_”, atau tanda dollar “$”. Hurufnya dapat berupa huruf besar maupun huruf kecil. Karakter selanjutnya dapat menggunakan nomor 0 smpai 9.  Pengidentifikasi tidak dapat menggunakan kata kunci dalam java seperti class, public, void, dsb. Selanjutnya kita akan berdiskusi lebih banyak tentang kata kunci dalam java. 

### Variable
Variabel adalah item yang digunakan data untuk menyimpan pernyataan object. 
variabel memiliki tipe data dan nama. tipe data mengindikasikan tipe dari nilai yang dapat dibentuk oleh variabel itu sendiri. nama variabel harus mengikuti aturan untuk pengidentifikasian.

### Deklarasi dan Inisialisasi Variabel 
Untuk deklarasi variabel adalah sebagai berikut,, 
     <data tipe> <name> [=initial value]; 
     
Catatan: Nilainya berada diantara <> adalah nilai yang disyaratkan, sementara nilai dalam 
tanda [] bersifat optional.
contoh :
![Img 1](image/2.png)

### Menampilkan data variable
contoh program :
![Img 1](image/3.png)


### Operators 
Dalam Java, ada beberapa tipe operator. Ada operator arithmatika, operator relasi, operator logika, dan operator kondisi. Operator ini mengikuti macam-macam prioritas yang pasti jadi compilernya akan tahu yang mana operator untuk dijalankan lebih dulu dalam kasus beberapa operator yang dipakai bersama-sama dalam satu pernyataan. 
* Operator aritmatika
![Img 1](image/4.png)
Ketika integer dan floating-point number digunakan sebagai operand untuk 
operasi aritmatika tunggal (a single aritmatika operation), hasilnya berupa floating point. 
integer adalah converter secara implisit ke bentuk angka floating-point sebelum operasi 
berperan mengambil tempat. 

*  Operator Increment dan Decrement 
Dari sisi operator dasar aritmatika, java juga terdiri atas operator unary increment (++) dan operator unary decrement (--). operator increment dan decrement menambah dah mengurangi nilai yang tersimpan dalm bentuk variabel angka terhadap nilai 1. 
Sebagai contoh, pernyataan, 
     count = count + 1; //increment nilai count dengan 
     nilai 1 
pernyataan tersebut ekivalen dengan, 
      count++;
 * Operator Relasi
 Operator Relasi membandingkan dua nilai dan menentukan keterhubungan diantara nilainilai tersebut.
 
* Operator logika 
Operator logika memiliki satu atau lebih operand boolean yang menghasilkan nilai boolean.Ada enam operator logika yaitu: && (logika AND), & (boolean logika AND), || (logika OR), | (boolean logika inclusive OR), ^ (boolean logika exclusive OR), dan ! (logika NOT). 
Pernyataan dasar untuk operasi logika adalah, 
      x1 op x2 
      
Dimana x1, x2 dapat menjadi pernyataan boolean.Variabel atau konstanta, dan op adalah salah satu dari operator &&, &, ||, | atau ^. Tabel kebenaran yang akan ditunjukkan selanjutnya, merupakan kesimpulan dari hasil dari setiap operasi untuk semua kombinasi yang mungkin dari x1 dan x2.

* && (logika AND) dan & (boolean logika AND)
Perbedaan dasar antara operator && dan & adalah bahwa && mensupports short-circuit evaluations (atau evaluasi perbagian), sementara operator & tidak.  
    exp1 && exp2 
&& akan mengevaluasi pernyataan exp1, dan segera mengembalikan nilai false dan menyatakan bahwa exp1 bernilai false. Jika exp1 bernilai false, operator tidak akan pernah mengevaluasi exp2 karena hasil operasi operator akan menjadi false tanpa memperhatikan nilai dari exp2. Sebaliknya, operator & selalu mengevaluasi kedua nilai dari exp1 dan exp2 sebelum mengembalikan suatu nilai jawaban.

* || (logika OR) dan | (boolean logika inclusive OR)
Perbedaan dasar antara operator || dan | adalah bahwa || mendukung short-circuit evaluations (atau proses evaluasi sebagian),sementara | tidak. || akan mengevaluasi pernyataan exp1, dan segera mengembalikan nilai true dan 
menyatakan bahwa exp1 bernilai true. Jika exp1 bernilai true, operator tidak akan pernah mengevaluasi exp2 karena hasil dari operasi operator akan bernilai true tanpa memperhatikan nilai dari exp2. Sebaliknya,operator | selalu mengevaluasi kedua nilai dari exp1 and exp2 sebelum mengembalikan suatu jawaban suatu nilai.

*  ^ (boolean logika ExclusiveOR ) 
Hasil operasi operator exclusive OR adalah TRUE, jika dan hanya jika satu operand bernilai TRUE dan yang lain bernilai False. Catatan jika kedua operand harus selalu dievaluasi untuk menjumlahkan hasil dari suatu exclusive OR.

* ! (logika NOT) 
logika NOT digunakan dalam satu argumen, dimana argumen tersebut dapat menjadi suatu pernyataan, variabel atau konstanta.

* Operator Kondisi(?:) 
operator kondisi ?: adalah operator ternary. Hal ini berarti bahwa operator ini digunakan dalam tiga bentuk pernyataan condisional argumen yang digunakan bersama-sama. 
     exp1?exp2:exp3 
Dimana nilai exp1 adalah suatu pernyataan boolean yang memiliki hasil yang salah satunya harus berupa nilai true atau false. 
Jika exp1 bernilai true, exp2 merupakan hasil operasi . Jika bernilai false, kemudian exp3 merupakan hasil operasinya. 

* Operator Precedence 
Operator precedence didefinisikan sebagai perintah yang dilakukan compiler ketika melakukan evaluasi terhadap operator, untuk mengajukan perintah dengan hasil yang tidak ambigu/ hasil yag jelas.
