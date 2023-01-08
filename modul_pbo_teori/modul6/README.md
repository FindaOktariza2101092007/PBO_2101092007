# Modul 6 PBO TEORI finda oktariza

## Struktur Kontrol 

### Struktur Kontrol Keputusan
#### Statement if 
Statement-if menentukan sebuah statement (atau blok kode) yang akan dieksekusi jika dan hanya jika persyaratan boolean (boolean statement) bernilai true. dimana, boolean_expression adalah sebuah persyaratan boolean (boolean statement) atau boolean variabel.
Bentuk dari statement if, 
if( boolean_expression ) 
 statement; 
contoh pada program latihan1_finda.java

#### Statement if-else
Statement if-else digunakan apabila kita ingin mengeksekusi sebuah statement dengan kondisi true dan statement yang lain dengan kondisi false. 
Bentuk statement if-else, 
if( boolean_expression ) 
 statement; 
else 
 statement; 
 
#### Statement if-else-if 
Statement pada bagian else dari blok if-else dapat menjadi struktur if-else yang lain. Struktur seperti ini mengijinkan kita untuk membuat seleksi persyaratan yang lebih kompleks. 
Bentuk statement if-else if, 
if( boolean_expression1 ) 
 statement1; 
else if( boolean_expression2 ) 
 statement2; 
else 
 statement3;
 kita dapat memiliki banyak blok else-if sesudah statement if. Blok else 
bersifat optional dan dapat dihilangkan.
 
### Kesalahan umum ketika menggunakan statement if-else: 
* Kondisi pada statement if bukan merupakan nilai boolean
* Using = instead of == for comparison. For example, 
* Menggunakan = daripada == untuk operator perbandingan
* Menulis elseif daripada else if.


#### Statement switch 
Cara lain untuk membuat percabangan adalah dengan menggunakan kata kunci switch. Dengan menggunakan switch kita bisa melakukan percabangan dengan persyaratan yang beragam.
Bentuk statement switch, 
switch( switch_expression ){ 
 case case_selector1: 
 statement1; // 
 statement2; //block 1 
 . . . // 
 break; 
 case case_selector2: 
 statement1; // 
 statement2; //block 2 
 . . . // 
 break; 
 . . . 
 default: 
 statement1; // 
 statement2; //block n 
 . . . // 
 break; 
} 
dimana, switch_expression adalah persyaratan integer atau character dan 
case_selector1, case_selector2 dan seterusnya adalah konstanta nilai integer yang unique (unik). Ketika statement switch ditemukan, pertama kali Java memeriksa switch_expression, dan meloncat ke case dan mencocokkan nilai yang sama dengan persyaratannya. Program mengeksekusi statement dari awal sampai menemui statement break, dan melewati statement yang lain sampai akhir struktur switch. 

### Struktur Kontrol Perulangan 
Struktur kontrol pengulangan adalah statement dari Java dimana kita bisa mengeksekusi blok code berulang-ulang dalam kurun nilai tertentu.
#### while loop 
Statement while loop adalah statement atau blok statement yang diulang-ulang sampai mencapai kondisi yang cocok. 
Bentuk statement while, 
while( boolean_expression ){ 
 statement1; 
 statement2; 
 . . . 
} 
Statement di dalam while loop akan dieksekusi berulang-ulang selama boolean_expression bernilai true. 

####  do-while loop 
Do-while loop mirip dengan while-loop. Statement di dalam do-while loop akan 
dieksekusi beberapa kali selama kondisi bernilai true. Perbedaan antara while dan do-while loop adalah dimana statement di dalam do-while loop dieksekusi sedikitnya satu kali. 
Bentuk statement do-while, 
do{ 
 statement1; 
 statement2; 
 . . . 
}while( boolean_expression ); 
Statement di dalam do-while loop akan dieksekusi pertama kali, dan dilakukan 
pengecekan kondisi dari boolean_expression. Jika nilai tersebut belum mencapai nilai yang diinginkan, statement akan dieksekusi lagi.

#### for loop 
Seperti pada struktur pengulangan sebelumnya yaitu melakukan pengulangan eksekusi code beberapa kali. 
Bentuk dari for loop, 
for (InitializationExpression; LoopCondition; StepExpression){ 
 statement1; 
 statement2; 
 . . . 
} 
dimana, 
 InitializationExpression – inisialisasi dari variabel loop. 
 LoopCondition - membandingkan variabel loop pada nilai batas. 
 StepExpression - melakukan update pada variabel loop.
 
 ### Branching Statements 
Branching statements mengijinkan kita untuk mengatur jalannya eksekusi program.
* break statement 
Statement break memiliki dua bentuk: unlabeled dan labeled. 
* Unlabeled break statement 
Unlabeled menghentikan jalannya statement switch. Anda bisa juga menggunakan 
bentuk unlabeled untuk menghentikan for, while atau do-while loop.
* Labeled break statement 
Bentuk labeled form dari statement break akan menghentikan statement luar, dimana diidentifikasikan berupa label pada statement break. Program berikut ini akan mencari nilai dalam array dua dimensi. Terdapat dua pengulangan bersarang (nested loop). Ketika sebuah nilai ditemukan, labeled break akan menghentikan statement yang diberi label searchLabel, dimana label ini berada di luar. 
* Continue statement 
Statement continue memiliki dua bentuk: unlabeled dan labeled. Anda dapat 
menggunakan statement continue untuk melewati pengulangan dari for, while, atau dowhile loop yang sedang berjalan. 
** Unlabeled continue statement 
Bentuk unlabeled akan melewati akhir statement pada bagian yang dalam dan 
memeriksa boolean expression yang mengkontrol loop, pada dasarnya akan melewati bagian pengulangan pada loop.
** Labeled continue statement 
Bentuk labeled akan melanjutkan sebuah statement dengan melewati pengulangan yang sedang berjalan dari loop terluar yang diberi label (tanda).

* Return statement 
Statement return digunakan untuk keluar dari sebuah fungsi (method). Statement return memiliki dua bentuk: menggunakan sebuah nilai, dan tidak memberikan nilai. 
Untuk memberikan sebuah nilai, cukup berikan nilai (atau ekspresi yang menghasilkan sebuah nilai) sesudah return. Contohnya, 
return ++count; 
atau 
return "Hello"; 

Tipe data dari nilai yang diberikan harus sama dengan tipe dari fungsi yang 
dideklarasikan. Ketika sebuah method void dideklariskan, gunakan bentuk return yang tidak memberikan nilai. Contohnya, 
return; 
Kita akan membahas lebih lanjut tentang statement return ketika mempelajari tentang fungsi.
