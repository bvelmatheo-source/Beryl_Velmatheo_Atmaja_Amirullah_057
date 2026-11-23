
import java.util.Scanner;

public class ArrayWeek9_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak data : ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Inputkan nilai : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Array : [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        boolean adaKembar = false;

        System.out.print("Nilai kembar : ");

        for (int i = 0; i < n; i++) {
            boolean sudahAda = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    sudahAda = true;
                }
            }

            if (!sudahAda) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        adaKembar = true;
                        break;
                    }
                }
            }
        }

        if (!adaKembar) {
            System.out.println("Tidak ada angka kembar terdeteksi");
        }

        input.close();
    }
}
