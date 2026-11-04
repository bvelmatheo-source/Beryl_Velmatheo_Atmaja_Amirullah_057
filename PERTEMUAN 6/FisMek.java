
import java.util.*;

public class FisMek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double g = 9.8;
        double h = 50;
        double m = 0.210;

        System.out.print("Masukkan nilai perubahan waktu (dalam detik): ");
        double dt = input.nextDouble();

        double t = 0;
        double Em = m * g * h;

        System.out.println("\nt\tv\tEk\tEp\tEm\tht");
        System.out.println("--------------------------------------------------");

        while (true) {
            double v = g * t;
            double ht = h - (0.5 * g * t * t);

            if (ht < 0) {
                ht = 0;
                v = Math.sqrt(2 * g * h);
            }

            double Ek = 0.5 * m * v * v;
            double Ep = m * g * ht;

            if (ht == 0) {
                Ek = Em;
            }

            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n",
                    t, v, Ek, Ep, Em, ht);

             t += dt;
            if (h - (0.5 * g * t * t) < 0) {
                t = Math.sqrt(2 * h / g);
            }
            
            if (ht == 0) {
                break;
            }

           
        }

        input.close();
    }
}
