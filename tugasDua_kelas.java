import java.util.Scanner;

public class tugasDua_kelas {

      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Masukkan IPS Anda: ");
            Float ipsSaya = input.nextFloat();

            System.out.println("IPS Anda adalah: " + ipsSaya);

            if (ipsSaya >= 3.5) {
                  System.out.println("Anda bisa mengambil SKS sebanyak 24 SKS");
            } else if (ipsSaya >= 3.00 && ipsSaya <= 3.49) {
                  System.out.println("Anda bisa mengambil SKS sebanyak 22 SKS");
            } else if (ipsSaya >= 2.00 && ipsSaya <= 2.99) {
                  System.out.println("Anda bisa mengambil SKS sebanyak 20 SKS");
            } else if (ipsSaya < 2.00) {
                  System.out.println("Anda bisa mengambil SKS sebanyak 18 SKS");
            }

      }

}
