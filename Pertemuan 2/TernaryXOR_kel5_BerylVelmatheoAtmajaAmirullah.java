
public class TernaryXOR_kel5_BerylVelmatheoAtmajaAmirullah {
    public static void main(String[] args) {
           
        //kode penentuan diskon
        double HargaSatuan = 70000;
        int JumlahBeli = 5;

        double TotalBelanja = HargaSatuan * JumlahBeli;

        double diskon = (TotalBelanja > 250000) ? TotalBelanja * 0.15 : 0;

        double totalBayar = TotalBelanja - diskon;

        System.out.println("Harga Satuan  = " + HargaSatuan);
        System.out.println("Jumlah Beli   = " + JumlahBeli);
        System.out.println("Total Belanja = " + TotalBelanja);
        System.out.println("Status Diskon = " + diskon);
        System.out.println("Total Bayar   = " + totalBayar);
        
        
        //kode enkripsi pin
        int PinAsli = 1234;
        int key = 85;

        int PinTerenkripsi = PinAsli ^ key;
        int PinSemula = PinTerenkripsi ^ key;

        System.out.println("PIN asli        = " + PinAsli);
        System.out.println("PIN terenkripsi = " + PinTerenkripsi);
        System.out.println("PIN didekripsi  = " + PinSemula);
        
        
        
        
        
        
    
    }
}
