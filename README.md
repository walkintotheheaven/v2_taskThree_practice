# Sistem Kasir Sederhana Berbasis Java

## Abstrak

Program ini merupakan implementasi sederhana dari sistem kasir berbasis bahasa pemrograman Java. Tujuan utama dari pengembangan program ini adalah untuk memahami konsep dasar pemrograman seperti percabangan, perulangan, serta pengolahan input dan output. Sistem ini memungkinkan pengguna untuk melakukan transaksi pembelian dengan menghitung total harga berdasarkan barang yang dipilih.

---

## Latar Belakang

Dalam pengembangan awal, program kasir dibuat menggunakan struktur percabangan (`if-else`) untuk menentukan jenis barang yang dipilih. Meskipun metode ini cukup efektif untuk skala kecil, pendekatan tersebut memiliki keterbatasan dalam hal efisiensi dan skalabilitas.
Seiring bertambahnya jumlah data atau kebutuhan fleksibilitas, diperlukan pendekatan yang lebih dinamis, yaitu dengan memanfaatkan perulangan (looping) serta input data secara langsung dari pengguna.

---

## Permasalahan

Beberapa permasalahan yang ditemukan pada implementasi awal antara lain:

1. Struktur kode yang repetitif akibat penggunaan banyak percabangan.
2. Sulit dalam melakukan penambahan jenis barang baru.
3. Kurangnya fleksibilitas karena data barang bersifat statis.
4. Efisiensi kode yang rendah untuk pengembangan jangka panjang.

---

## Metodologi Pengembangan

Untuk mengatasi permasalahan tersebut, dilakukan pengembangan sistem dengan pendekatan sebagai berikut:

* Menggunakan struktur perulangan (`while`) untuk memungkinkan input berulang.
* Mengizinkan pengguna memasukkan data barang secara dinamis (nama, harga, jumlah).
* Menggunakan variabel akumulatif untuk menghitung total keseluruhan.
* Menyimpan data transaksi dalam bentuk teks sebagai representasi struk pembelian.

---

## Implementasi Sistem

Pada versi pengembangan, sistem bekerja dengan alur sebagai berikut:

1. Pengguna memasukkan nama barang.
2. Pengguna memasukkan harga barang.
3. Pengguna memasukkan jumlah pembelian.
4. Sistem menghitung subtotal (harga × jumlah).
5. Nilai subtotal ditambahkan ke total keseluruhan.
6. Data transaksi disimpan dalam variabel string sebagai struk.
7. Proses diulang hingga pengguna memilih untuk berhenti.
8. Sistem menampilkan seluruh transaksi beserta total akhir.

---

## Hasil dan Pembahasan

Hasil implementasi menunjukkan bahwa pendekatan berbasis perulangan lebih efisien dibandingkan metode percabangan statis. Sistem menjadi lebih fleksibel dan mampu menangani berbagai jenis input tanpa perlu modifikasi struktur kode secara signifikan.
Selain itu, fitur pencatatan transaksi (struk) memberikan nilai tambah dalam hal keterbacaan dan dokumentasi hasil pembelian.

---

## Contoh Output

```
Buku x2 = Rp10000
Pulpen x1 = Rp3000

Total akhir: Rp13000
```

---

## Kesimpulan

Penggunaan struktur perulangan dan input dinamis terbukti meningkatkan efisiensi dan fleksibilitas program kasir sederhana. Pendekatan ini lebih direkomendasikan untuk pengembangan sistem yang membutuhkan skalabilitas dan kemudahan dalam pengelolaan data.

---

## Saran Pengembangan

Untuk pengembangan lebih lanjut, sistem ini dapat ditingkatkan dengan:

* Penambahan fitur diskon dan pajak
* Perhitungan kembalian
* Penyimpanan data menggunakan struktur data seperti ArrayList
* Implementasi antarmuka grafis (GUI)
* Integrasi dengan database

---

## Teknologi yang Digunakan

* Bahasa Pemrograman: Java
* Library: `java.util.Scanner`
* Konsep: Percabangan, Perulangan, Input/Output

---
