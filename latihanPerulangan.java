import java.util.Scanner;

public class latihanPerulangan {

      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Selamat datang di Indoapril silahkan menikmati belanja anda");

            int keseluruhanHarga = 0;
            String struk = "";

            int i = 1;
            while (i == 1) {
                  System.out.println("Masukkan nama barang: ");
                  String namaBarang = input.next();
                  System.out.println("Masukkan harga barang: ");
                  int harga = input.nextInt();
                  System.out.println("Masukkan jumlah barang: ");
                  int jumlah = input.nextInt();

                  int totalHarga = harga * jumlah;
                  System.out.println("Total Harganya yakni: Rp" + totalHarga);


                  keseluruhanHarga += totalHarga;
                  struk += namaBarang + ", jumlah barang: " + jumlah + " = Rp" + totalHarga + "\n";
                  System.out.println("Total sementara: Rp" + keseluruhanHarga);

                  System.out.println("Pilih 1 untuk lanjut nginput, dan pilih 0 untuk keluar dari program: ");
                  i = input.nextInt();
            }

            System.out.println("\nSTRUK BELANJA");
            System.out.println(struk);
            System.out.println("Total barang belanja: Rp" + keseluruhanHarga);
      }
}