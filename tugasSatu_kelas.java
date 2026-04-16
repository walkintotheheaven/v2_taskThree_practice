import java.util.Scanner;

public class tugasSatu_kelas{
    public static void main(String[] args) {

        // EXPERIMENT GWEHHH
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.println("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Alamat: ");
        String alamat = input.next();

        System.out.println("Masukkan No HP: ");
        String noHp = input.next();

        System.out.println("Masukkan Jenis Kelamin: ");
        String jenisKelamin = input.next();

        System.out.println("Masukkan Program Studi: ");
        String programStudi = input.next();

        System.out.println("Masukkan dosen Wali: ");
        String dosenWali = input.next();

        System.out.println("BOP yang perlu dibayar: ");
        Integer bopPerluDibayar = input.nextInt();

        System.out.println("Bayarkan Sisa BOP: ");
        Integer bayarBOP = input.nextInt();

        System.out.println("Sisa BOP: ");
        Integer sisaBOP = bopPerluDibayar - bayarBOP;
        // kalkulasi penjumlahan
        // int hasil = angka1 + angka2;
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("No HP: " + noHp);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("Dosen Wali: " + dosenWali);
        System.out.println("BOP yang perlu dibayar: " + bopPerluDibayar);
        System.out.println("Bayar BOP: " + bayarBOP);
        System.out.println("Sisa BOP: " + sisaBOP);

        // DATA TUGAS 1 | BU PRADITA PEMROGRAMAN DASAR
        // String nim = "25410100072";
        // String nama = "Ahmad Pasha";
        // String alamat = "Surabaya";
        // String noHp = "081234567890";
        // String jenisKelamin = "Pria";
        // String programStudi = "Sistem Informasi";
        // String dosenWali = "Alexander the Great";
        // Integer sisaBOP = 5000000;

        // System.out.println(nim);
        // System.out.println("NIM mahasiswa adalah: " + nim + " dan nama mahasiswa adalah: " + nama + " dan alamat mahasiswa adalah: " + alamat + " dan no HP mahasiswa adalah: " + noHp + " dan jenis kelamin mahasiswa adalah: " + jenisKelamin + " dan program studi mahasiswa adalah: " + programStudi + " dan dosen wali mahasiswa adalah: " + dosenWali + " dan sisa BOP mahasiswa adalah: " + sisaBOP);

        // System.out.println("NIM: " + nim + "\n Nama: " + nama + "\n Alamat: " + alamat + "\n No HP: " + noHp + "\n Jenis Kelamin: " + jenisKelamin + "\n Program Studi: " + programStudi + "\n Dosen Wali: " + dosenWali + "\n Sisa BOP: " + sisaBOP);
    }
}