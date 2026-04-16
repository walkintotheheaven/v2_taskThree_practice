// Toko Smart berencana akan membuka cabang di daerah Merr Surabaya. Toko tersebut membutuhkan sebuah aplikasi penjualan sederhana untuk mencatat nama barang, harga barang, jumlah yang dibeli, dan total bayar belanja pelanggan. 

import java.util.Scanner;

public class tugasSatu_praktikum {
      public static void main(String[] args) {

            // Tugas Praktikum 1 | Bu Edwin (by bu Pr)
            Scanner input = new Scanner(System.in);
            
            System.out.println("Masukkan Nama Barang: ");
            String namaBarang = input.next();

            System.out.println("Masukkan Harga Barang: ");
            Double hargaBarang = input.nextDouble();

            System.out.println("Masukkan Jumlah Barang: ");
            Integer jumlahBarang = input.nextInt();

            Double totalBayar = hargaBarang * jumlahBarang;
            System.out.println("Total Bayar barang: " + totalBayar);

            // Space Baris Kosong
            System.out.println();

            // Data Penjualan Toko Smart
            System.out.println("\u001B[32mData Penjualan Toko Smart\u001B[0m");

            System.out.println("Nama Barang: " + namaBarang);
            System.out.println("Harga Barang: " + hargaBarang);
            System.out.println("Jumlah Barang: " + jumlahBarang);
            System.out.println("Total Bayar: " + totalBayar);
      }
}