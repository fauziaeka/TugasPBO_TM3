Pada pertemuan ketiga ini merupakan contoh sederhana untuk menggambarkan penggunaan konsep-konsep pemrograman berorientasi objek dalam Java, seperti abstract, override, dan overload. 
Kode ini mencakup kelas utama Utama yang mendemonstrasikan penggunaan dua jenis pasar: PasarTradisional dan PasarModern.

Class utama berisi metode main yang digunakan untuk menjalankan program.
Di dalam metode main, dibuat objek dari PasarTradisional dan PasarModern untuk menampilkan informasi mengenai kedua jenis pasar tersebut.
Kelas PasarTradisional dan Kelas PasarModern. Keduanya adalah kelas turunan dari kelas Pasar (yang tidak ditampilkan dalam kode ini).
Kelas-kelas ini mengimplementasikan metode tampilkanJenisBarang dan tampilkanInformasiPasar yang menunjukkan penggunaan override dan overload

Konsep-Konsep yang Digunakan
abstract : mendefinisikan metode abstrak seperti tampilkanJenisBarang yang harus diimplementasikan oleh kelas-kelas turunannya (PasarTradisional dan PasarModern).
override : Metode tampilkanJenisBarang di kelas PasarTradisional dan PasarModern adalah contoh dari method overriding. Artinya, kedua kelas turunan ini menyediakan implementasi spesifik mereka sendiri untuk metode yang diwarisi dari kelas induk Pasar.
overload : Metode tampilkanInformasiPasar adalah contoh dari method overloading. Metode ini didefinisikan dengan dua varian: satu tanpa parameter dan satu dengan parameter int. Overloading memungkinkan kita untuk menggunakan nama metode yang sama dengan parameter yang berbeda.
