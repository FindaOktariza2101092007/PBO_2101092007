# Modul 8 PBO TEORI finda oktariza


## Argumen dari Command-line

### Argumen Command-line
Sebuah aplikasi Java dapat menerima berbagai argumen dari command-line. Argumen dari command line memberikan kesempatan bagi user untuk mempengaruhi operasi dari sebuah aplikasi dalam sekali invokasi. User memasukkan argumen command line pada saat meng-invoke aplikasi dan memberikan spesifikasi kepada aplikasi tersebut setelah nama kelas untuk dijalankan.

Argumen yang diberikan kepada program Anda akan disimpan kedalam sebuah array 
String dengan identifier args. 
Pada contoh sebelumnya, argumen dari command-line yang akan diberikan kepada 
aplikasi sort command adalah lima buah String yaitu “5”,”4”,”3”,”2”, dan “1”. Anda dapat mengetahaui berapa banyak argumen dari command-line dengan cara melihat 
panjang dari attribute array. 
Sebagai contoh, 
int numberOfArgs = args.length; 
Jika program Anda membutuhkan support sebuah argumen command-line yang 
numeric. Anda harus mengkonversi String argumen tersebut untuk merepresantasikan 
sebuah nomor, misalnya “34” menjadi sebuah nomor. Kode dibawah ini adalah sebuah 
potongan untuk mengkonversi sebuah argumen command-line menjadi integer. 
int firstArg = 0; 
if (args.length > 0){
firstArg = Integer.parseInt(args[0]); 
} 
parseInt akan mendapatkan NumberFormatException (ERROR) jika format args[0] tidak 
valid (bukan sebuah nomor).

### Argument Command-line di NetBeans 
Untuk menggambarkan bagaimana sebuah argumen diberikan pada program di 
NetBeans, marilah kita membuat sebuah program Java yang akan mencetak jumlah 
argumen dimana argumen pertama yang telah diberikan pada program tersebut. 
public class CommandLineExample 
{ 
 public static void main( String[] args ){ 
 
 System.out.println("Number of arguments=" + 
 args.length); 
 System.out.println("First Argument="+ args[0]); 
 } 
} 
Sekarang, jalankan NetBeans, buat sebuah project yang baru, dan beri nama project ini 
CommanLineExample. Copy kode yang telah dituliskan diatas, kemudian compile. 
Setelah itu, ikutilah langkah-langkan berikut ini untuk memberikan argumen kepada 
program Anda dengan menggunakan NetBeans. 
