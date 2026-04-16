import java.util.Scanner;

public class nestedLoop1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // VERSION 1
        // OUTPUT LIKE:
        // *****
        // *****
        // *****
        // *****
        // *****

        System.out.println("Masukkan jumlah bintang yang ingin ditampilkan: ");
        int inputan = sc.nextInt();
        for (int i = 1; i <= inputan; i++) {
            // System.out.print("*");
            for (int j = 1; j <= inputan; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}