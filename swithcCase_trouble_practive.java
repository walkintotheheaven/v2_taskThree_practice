import java.util.Scanner;

public class swithcCase_trouble_practive {
      public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Masukin IPS Luwh: ");
            float ipsSaya = input.nextFloat();

            System.out.println("IPS luwh: " + ipsSaya);

            int sksGweh;

            if (ipsSaya >= 3.5 && ipsSaya <= 4.00){
                  // System.out.println("Luwh cmn bisa ambil 24 SKS");
                  sksGweh = 24;
            } else if (ipsSaya >= 3.00 && ipsSaya <= 3.49) {
                  // System.out.println("Luwh cmn bisa ambil 22 SKS");
                  sksGweh = 22;
            } else if (ipsSaya >= 2.00 && ipsSaya <= 2.99) {
                  // System.out.println("Luwh cmn bisa ambil 20 SKS");
                  sksGweh = 20;
            } else {
                  sksGweh = 18;
                  
            }

            switch (sksGweh){
                  case 24:
                        System.out.println("Luwh cmn bisa ambil 24 SKS");
                        break;
                  case 22:   
                        System.out.println("Luwh cmn bisa ambil 22 SKS");
                        break;
                  case 20:
                        System.out.println("Luwh cmn bisa ambil 20 SKS");   
                        break;
                  case 18:
                        System.out.println("Luwh cmn bisa ambil 18 SKS");
                        break;
                  default:
                        System.out.println("Luwh tidak memenuhi syarat.");
            }
            
            
      }
      // MAH AKU MASUK GITHUB
}