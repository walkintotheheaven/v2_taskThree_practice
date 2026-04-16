import java.util.Scanner;

public class nestedLoop3 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // VERSION 3
            // OUTPUT LIKE:
            // *****
            // ****
            // ***
            // **
            // *

            System.out.println("Masukkan jumlah bintang yang ingin ditampilkan: ");
            int inputan = sc.nextInt();
            for (int i = inputan; i >= 1; i--) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }
}
