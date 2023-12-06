import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int nilaiN = scanner.nextInt();

        cetakSegitigaBintang(nilaiN);
    }

    static void cetakSegitigaBintang(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
