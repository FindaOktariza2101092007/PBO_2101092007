# Modul 3 PBO Teori_Finda Oktariza 


## Pendahuluan
IDE adalah sebuah peralatan dalam pemrograman yang diintegrasikan kedalam aplikasi software yang mendukung pembangunan GUI, text atau penulisan kode, compiler dan debugger.
Tutorial ini menggunakan Ubuntu Dapper sebagai sistem operasinya. Sebelum
menggunakan tutorial ini, pastikan bahwa telah menginstal Java dan NetBeans dalamsistem yang anda gunakan. Untuk instruksi dalam bagaimana cara menginstal Java danNetBeans, dapat dilihat pada Appendix A. Untuk versi Windows Xp dalam sesi ini, dapatdilihat pada Appendix B.
Sebelum membahas lebih detail, pada awalnya akan kita lihat program Java pertama
yang akan anda tulis.

### Program Java Pertama
public class Hello 
{ 
 /**
 * My first java program
 */
 public static void main(String[] args) {
//Menampilkan kata "Hello world" dilayar
 System.out.println("Hello world!"); 
 } 
}

### Error
1. Syntax Errors
Syntax errors biasanya terjadi karena kesalahan penulisan. Mungkin Anda kekurangan sebuah perintah di Java atau lupa untuk menulis tanda titik-koma pada akhir pernyataan. Java mencoba untuk mengisolasi error tersebut dengan cara menunjukkan baris dari kode dan terlebih dahulu menunjuk karakter yang salah dalam baris tersebut. Bagaimanapun juga, error belum tentu berada pada titik yang ditunjuk.
Kesalahan umum lainnya adalah dalam kapitalisasi, ejaan, penggunaan dari karakter khusus yang tidak benar, dan penghilangan dari pemberian tanda baca yang sebenarnya.

2. Run-time Errors
Run-time error merupakan error yang tidak akan ditampilkan sampai anda menjalankan program anda. Bahkan program yang dicompile dengan sukses dapat menampilkan jawaban yang salah jika programmer belum berpikir sampai struktur dan proses logis dari program tersebut.
