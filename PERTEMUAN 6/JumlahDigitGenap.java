import java.util.Scanner;
public class JumlahDigitGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = Math.abs(input.nextInt());

        int jumlah = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                jumlah += digit;
            }
            n /= 10;
        }

        System.out.println("Jumlahan angka genap: " + jumlah);
    }
}

