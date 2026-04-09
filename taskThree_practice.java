import java.util.Scanner;

public class taskThree_practice {

      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            Integer buku = 5000;
            Integer pensil = 2000;
            Integer penghapus = 1000;
            Integer penggaris = 3000;
            Integer spidol = 4000;

            Integer keseluruhanHarga = 0;
            String struk = "";

            int i = 1;
            while (i == 1) {

                  System.out.println("Daftar Barang: ");
                  System.out.println("1. Buku");
                  System.out.println("2. Pensil");
                  System.out.println("3. Penghapus");
                  System.out.println("4. Penggaris");
                  System.out.println("5. Spidol");

                  System.out.println("Masukan nomor barang yang ingin dibeli: ");
                  System.out.println("Ketikkan angka 0 untuk keluar dari program dan menampilkan struk.");

                  Integer beliApa = input.nextInt();

                  if (beliApa == 1) {
                        System.out.println("Anda membeli Buku seharga " + buku);
                        System.out.println("Mau beli berapa kamu? ");
                        Integer jumlahBarang = input.nextInt();
                        Integer totalHarga = buku * jumlahBarang;
                        System.out.println("Total harga: " + totalHarga);

                        keseluruhanHarga += totalHarga;
                        struk += "Buku x" + jumlahBarang + " = Rp" + totalHarga + "\n";

                        System.out.println("Keseluruhan harga sementara: " + keseluruhanHarga);

                  } else if (beliApa == 2) {
                        System.out.println("Anda membeli Pensil seharga " + pensil);
                        System.out.println("Mau beli berapa kamu? ");
                        Integer jumlahBarang = input.nextInt();
                        Integer totalHarga = pensil * jumlahBarang;
                        System.out.println("Total harga barang yang anda beli: " + totalHarga);

                        keseluruhanHarga += totalHarga;
                        struk += "Pensil x" + jumlahBarang + " = Rp" + totalHarga + "\n";;

                        System.out.println("Keseluruhan harga sementara: " + keseluruhanHarga);

                  } else if (beliApa == 3) {
                        System.out.println("Anda membeli Penghapus seharga " + penghapus);
                        System.out.println("Mau beli berapa kamu? ");
                        Integer jumlahBarang = input.nextInt();
                        Integer totalHarga = penghapus * jumlahBarang;
                        System.out.println("Total harga barang yang anda beli: " + totalHarga);

                        keseluruhanHarga += totalHarga;
                        struk += "Penghapus x" + jumlahBarang + " = Rp" + totalHarga + "\n";

                        System.out.println("Keseluruhan harga sementara: " + keseluruhanHarga );

                  } else if (beliApa == 4) {
                        System.out.println("Anda membeli Penggaris seharga " + penggaris);
                        System.out.println("Mau beli berapa kamu? ");
                        Integer jumlahBarang = input.nextInt();
                        Integer totalHarga = penggaris * jumlahBarang;
                        System.out.println("Total harga barang yang anda beli: " + totalHarga);

                        keseluruhanHarga += totalHarga;
                        struk += "Penggaris x" + jumlahBarang + " = Rp" + totalHarga + "\n";

                        System.out.println("Keseluruhan harga sementara: " + keseluruhanHarga);

                  } else if (beliApa == 5) {
                        System.out.println("Anda membeli Spidol seharga " + spidol);
                        System.out.println("Mau beli berapa kamu? ");
                        Integer jumlahBarang = input.nextInt();
                        Integer totalHarga = spidol * jumlahBarang;
                        System.out.println("Total harga barang yang anda beli: " + totalHarga);

                        keseluruhanHarga += totalHarga;
                        struk += "Spidol x" + jumlahBarang + " = Rp" + totalHarga + "\n";

                        System.out.println("Keseluruhan harga sementara: " + keseluruhanHarga);

                  } else {
                        break;
                  }
            }

            System.out.println("=== STRUK BELANJA === + \n");
            System.out.println(struk + "\n");
            System.out.println("Total akhir: Rp" + keseluruhanHarga);
      }
}