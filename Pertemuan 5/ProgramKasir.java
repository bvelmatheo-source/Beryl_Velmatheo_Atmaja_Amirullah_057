import java.util.Scanner;
public class ProgramKasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU CAFE ===");
        System.out.println("1. Kopi ( Rp18000 )");
        System.out.println("2. Teh ( Rp12000 )");
        System.out.println("3. Roti ( Rp15000 )");
        System.out.println("4. Jus ( Rp20000 )");

    
        System.out.println("Pilih menu : ");
        int menu = input.nextInt();
        int hargaDasar ;
        switch (menu) {
            case 1:
                hargaDasar = 18000;
                break;
            case 2:
                hargaDasar = 12000;
                break;
            case 3:
                hargaDasar = 15000;
                break;
            case 4:
                hargaDasar = 20000;
                break;
            default:
                System.out.println("Menu tidak tersedia");
                return;
        }

        
        System.out.print("Ukuran ( S / M / L ) : ");
        String ukuran = input.next();
        int tambahan;
        switch (ukuran) {
            case "S":
            case "s":
                tambahan = 0;
                break;
            case "M":
            case "m":
                tambahan = 3000;
                break;
            case "L":
            case "l":
                tambahan = 6000;
                break;
            default:
                System.out.println("Ukuran tidak tersedia");
                return;
        }

        System.out.print("Jumlah porsi : ");
        int porsi = input.nextInt();

       
        System.out.print("Kode member ( G / P / N) : ");
        String kode = input.next();
        int persenDiskon;
        switch (kode) {
            case "G":
            case "g":
                persenDiskon = 15;
                break;
            case "P":
            case "p":
                persenDiskon = 10;
                break;
            case "N":
            case "n":
            default:           
                persenDiskon = 0;
                break;
        }

       
        double subtotal = (double) (hargaDasar + tambahan) * porsi;
        double diskon = subtotal * persenDiskon / 100.0;
        double setelahDiskon = subtotal - diskon;
        double ppn = setelahDiskon * 0.11;
        int total = (int) (setelahDiskon + ppn);   

        System.out.printf("Subtotal : %.2f \n", subtotal);
        System.out.printf("Potongan (%d%%) : %.2f \n", persenDiskon, diskon);
        System.out.printf("PPN (11%%) : %.2f \n", ppn);
        System.out.println("Total bayar : " + total);

        input.close();
    }
}
