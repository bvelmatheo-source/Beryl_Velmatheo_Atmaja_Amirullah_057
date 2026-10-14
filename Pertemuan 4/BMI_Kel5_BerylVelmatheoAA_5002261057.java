
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        input.useLocale(java.util.Locale.US);

        System.out.print("Masukkan Berat Badan(kg): ");
        int beratBadan = input.nextInt();

        System.out.print("Masukkan Tinggi Badan(m): ");
        double tinggiBadan = input.nextDouble();

        double bmi = beratBadan / (tinggiBadan * tinggiBadan);
        String Kategori;
        
        if (bmi < 18.5) {
            Kategori = "Berat Badan Kurang";
        } else if (bmi < 23.0) {
            Kategori = "Berat Badan Normal";
        } else if (bmi < 25.0) {
            Kategori = "Beresiko Menjadi Obes";
        } else if (bmi < 30.0) {
            Kategori = "Obes 1";
        } else {
            Kategori = "Obes 2";
        }

        System.out.println("\n==== Hasil Kalkulasi ===");
        System.out.printf("Tinggi Badan : %.1f m %n", tinggiBadan);
        System.out.printf("Berat Badan : %.1f kg %n", (double) beratBadan);
        System.out.printf("Nilai BMI : %.2f %n", bmi);
        System.out.println("Klasifikasi = "+ Kategori);
        

        input.close();
    }
}
