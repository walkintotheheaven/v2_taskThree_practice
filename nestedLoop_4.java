import java.util.Scanner;

public class nestedLoop_4 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // VERSION 4
            // OUTPUT LIKE:
            //       *
            //      **
            //     ***
            //    ****
            //   *****
            System.out.println("Masukkan jumlah bintang yang ingin ditampilkan: ");
            int inputan = sc.nextInt();
            for (int i = 1; i <= inputan; i++) {
                  for (int j = 1; j <= inputan - i; j++) {
                        System.out.print("=");
                  }
                  for (int star = 1; star <= i; star++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }

      }
}
