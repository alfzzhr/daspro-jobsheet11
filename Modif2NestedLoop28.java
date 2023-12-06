
import java.util.Scanner;

public class Modif2NestedLoop28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        // Input suhu untuk setiap kota dan hari
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota: " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan suhu dan menghitung rata-rata untuk setiap kota
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota: " + i);
            double sum = 0;

            // Menampilkan suhu dan menghitung jumlah untuk setiap hari
            for (int j = 0; j < temps[0].length; j++) {
                sum += temps[i][j];
            }

            // Menghitung dan menampilkan rata-rata untuk kota tersebut
            double rataRata = sum / temps[0].length;
            System.out.println("Rata-rata: " + rataRata);
            System.out.println();
        }
    }
}
