import java.util.Scanner;

public class MethodTokoKelontong {

    public static boolean CekStok(int StokTersedia, int JumlahBeli) {
        return JumlahBeli <= StokTersedia;
    }

    public static int HitungHarga(int JumlahBeli, int HargaPerSatuan) {
        return JumlahBeli * HargaPerSatuan;
    }

    public static int HitungKembalian(int TotalBelanja, int UangBayar) {
        if (UangBayar < TotalBelanja) {
            System.out.println("Peringatan: Uang pembayaran Anda tidak mencukupi!");
            return 0;
        }
        return UangBayar - TotalBelanja;
    }

    public static void main(String[] args) {
        int StokBeras = 50;
        int HargaBeras = 12000;
        int StokMinyak = 20;
        int HargaMinyak = 15000;
        int StokGula = 30;
        int HargaGula = 10000;
        int TotalBelanja = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("=== Toko Kelontong Maju Jaya ===");
        System.out.println("Stok Awal: Beras(50kg), Minyak(20L), Gula(30kg)");

        System.out.print("Masukkan jumlah Beras (kg) dibeli : ");
        int BeliBeras = input.nextInt();
        System.out.print("Masukkan jumlah Minyak (L) dibeli : ");
        int BeliMinyak = input.nextInt();
        System.out.print("Masukkan jumlah Gula (kg) dibeli : ");
        int BeliGula = input.nextInt();

        System.out.println("--- Struk Belanja ---");

        if (CekStok(StokBeras, BeliBeras)) {
            int TotalBeras = HitungHarga(BeliBeras, HargaBeras);
            TotalBelanja += TotalBeras;
            StokBeras -= BeliBeras;
            System.out.println("> Beras berhasil ditambahkan: Rp " + TotalBeras);
        } else {
            System.out.println("> Maaf, Stok Beras tidak mencukupi!");
        }

        if (CekStok(StokMinyak, BeliMinyak)) {
            int TotalMinyak = HitungHarga(BeliMinyak, HargaMinyak);
            TotalBelanja += TotalMinyak;
            StokMinyak -= BeliMinyak;
            System.out.println("> Minyak berhasil ditambahkan: Rp " + TotalMinyak);
        } else {
            System.out.println("> Maaf, Stok Minyak tidak mencukupi!");
        }

        if (CekStok(StokGula, BeliGula)) {
            int TotalGula = HitungHarga(BeliGula, HargaGula);
            TotalBelanja += TotalGula;
            StokGula -= BeliGula;
            System.out.println("> Gula berhasil ditambahkan: Rp " + TotalGula);
        } else {
            System.out.println("> Maaf, Stok Gula tidak mencukupi!");
        }

        System.out.println("---------------------");
        System.out.println("Total Belanja: Rp " + TotalBelanja);

        System.out.print("Masukkan uang bayar: ");
        int UangBayar = input.nextInt();

        int Kembalian = HitungKembalian(TotalBelanja, UangBayar);
        System.out.println("Uang Kembalian Anda: Rp " + Kembalian);

        if (UangBayar >= TotalBelanja) {
            System.out.println("Terima kasih telah berbelanja!");
        }
    }
}