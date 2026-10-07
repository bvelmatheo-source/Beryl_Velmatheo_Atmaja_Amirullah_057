import java.util.Scanner;

public class DiskonPPN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int harga;
        int diskon;

        System.out.print("Masukkan harga barang : ");
        harga = input.nextInt();

        System.out.print("Masukkan diskon (%) : ");
        diskon = input.nextInt();

        double potongan = harga * (double) diskon / 100;
        double hargaAfterDiskon = harga - potongan;
        double ppn = hargaAfterDiskon * 11 / 100;

        int totalBayar = (int) (hargaAfterDiskon + ppn);

        System.out.printf("Potongan harga : %.2f%n", potongan);
        System.out.printf("PPN (11%%) : %.2f%n", ppn);
        System.out.println("Total bayar : " + totalBayar);
    }
}