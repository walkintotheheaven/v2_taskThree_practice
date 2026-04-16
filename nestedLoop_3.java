import java.util.Scanner;
public class nestedLoop_3 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // VERSION 3
        // OUTPUT LIKE:
        // ******
        // *****
        // ****
        // ***
        // *

        System.out.println("Masukkan jumlah bintang yang ingin ditampilkan: ");
        int inputan = sc.nextInt();
        for (int i = 1; i <= inputan; i++){
            for (int j = inputan; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
      }
}
