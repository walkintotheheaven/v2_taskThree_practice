import java.util.Scanner;
public class nestedLoop_2 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // VERSION 2
        // OUTPUT LIKE:
        // *
        // **
        // ***
        // ****
        // *****

        System.out.println("Masukkan jumlah bintang yang ingin ditampilkan: ");
        int inputan = sc.nextInt();
        for (int i = 1; i <= inputan; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      }
}
