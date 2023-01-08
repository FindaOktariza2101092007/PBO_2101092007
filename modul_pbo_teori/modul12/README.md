# Modul 12 PBO TEORI Finda Oktariza

## Dasar Exception Handling

### Pengertian Exception
Exception adalah sebuah peristiwa yang menjalankan alur proses normal pada program. Peristiwa ini biasanya berupa kesalahan(error) dari beberapa bentuk. Ini disebabkan program kita berakhir tidak normal.
Beberapa contoh dari exception yang Anda mungkin jumpai pada latihan-latihan sebelumnya adalah: exception ArrayIndexOutOfBounds, yang terjadi jika kita mencoba mengakses elemen array yang tidak ada, atau NumberFormatException, yang terjadi ketika kita mencoba melalui parameter bukan angka dalam method Integer.parseInt.

### Menangani Exception
Berikut ini adalah aspek kunci tentang sintak dari konstruksi try-catch-finally:
* Notasi blok bersifat perintah
* Setiap blok try, terdapat satu atau lebih blok catch, tetapi hanya satu blok finally.
* Blok catch dan blok finally harus selalu muncul dalam konjungsi dengan blok try, dan diatas urutan
* Blok try harus diikuti oleh paling sedikit satu blok catch ATAU satu blok finally, atau keduanya.
* Setiap blok catch mendefinisikan sebuah penanganan exception. Header dari blok catch harus membawa satu argumen, dimana exception pada blok tersebut akan ditangani. Exception harus menjadi class pelempar atau satu dari subclassesnya.

