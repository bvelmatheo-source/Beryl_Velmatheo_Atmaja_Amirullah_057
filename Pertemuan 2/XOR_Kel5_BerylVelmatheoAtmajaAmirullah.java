
public class XOR_Kel5_BerylVelmatheoAtmajaAmirullah {
    public static void main(String[] args) {

        int PinAsli = 1234;
        int key = 85;

        int PinTerenkripsi = PinAsli ^ key;
        int PinSemula = PinTerenkripsi ^ key;

        System.out.println("PIN asli        = " + PinAsli);
        System.out.println("PIN terenkripsi = " + PinTerenkripsi);
        System.out.println("PIN didekripsi  = " + PinSemula);
    }
}
